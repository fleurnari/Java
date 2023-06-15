package co.micol.miniproject.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.miniproject.common.Command;
import co.micol.miniproject.common.Sha256;
import co.micol.miniproject.member.service.MemberService;
import co.micol.miniproject.member.service.MemberVO;
import co.micol.miniproject.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService ms = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		Sha256 s = new Sha256();
		String password = s.sha256(request.getParameter("memberPassword"));
		
		vo.setMemberId(request.getParameter("memberId"));
		vo.setMemberPassword(password);
		vo = ms.memberSelect(vo);
		if(vo != null) {
			request.setAttribute("message", vo.getMemberName()+"님 환영합니다.");
		}else {
			request.setAttribute("message", "아이디 또는 패스워드가 일치하지 않습니다.");
		}

		return "member/memberMessage";
	}

}
