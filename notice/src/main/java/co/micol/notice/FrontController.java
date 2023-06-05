package co.micol.notice;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.notice.common.Command;
import co.micol.notice.main.command.MainCommand;
import co.micol.notice.main.command.NoticeList;
import co.micol.notice.member.command.AjaxCheckId;
import co.micol.notice.member.command.MemberInsert;
import co.micol.notice.member.command.MemberJoin;
import co.micol.notice.member.command.MemberList;
import co.micol.notice.member.command.MemberLogin;
import co.micol.notice.member.command.MemberLoginForm;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// 처음 시작될 때 동작하는 메소드, 요청을 담아 두는 곳
		map.put("/main.do", new MainCommand()); // 처음 들어오는 페이지 돌려주기
		map.put("/noticeList.do", new NoticeList()); // 게시글 목록
		map.put("/memberList.do", new MemberList()); // 회원 목록
		map.put("/memberJoin.do", new MemberJoin()); // 회원 가입 화면
		map.put("/memberInsert.do", new MemberInsert()); // 회원 가입 수행
		map.put("/ajaxCheckId.do", new AjaxCheckId()); // 아이디 중복 체크
		map.put("/memberLoginForm.do", new MemberLoginForm()); // 로그인 폼 호출
		map.put("/memberLogin.do", new MemberLogin());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 분석, 수행할 Command 찾아서 수행, 결과 돌려주기
		request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지
		String uri = request.getRequestURI(); // 호출한 URI 구하기
		String contextPath = request.getContextPath(); // root 구하기
		String page = uri.substring(contextPath.length()); // 실제 요청한 페이지 구하기
		
		Command command = map.get(page); // 수행할 command 가져오기
		String viewPage = command.exec(request, response);
		
		if (!viewPage.endsWith(".do")) {
			if (viewPage.startsWith("Ajax:")) {
				response.setContentType("text/html; charset=UTF-8");
				response.getWriter().append(viewPage.substring(5));
				return;
			}
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else {
			response.sendRedirect(viewPage); // 결과가 *.do 이면 위임한다
		}
		
	}

}
