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
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
		} else {
			response.sendRedirect(viewPage); // 결과가 *.do 이면 위임한다
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}
