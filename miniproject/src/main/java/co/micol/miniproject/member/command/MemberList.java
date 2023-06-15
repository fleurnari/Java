package co.micol.miniproject.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.miniproject.common.Command;
import co.micol.miniproject.member.service.MemberService;
import co.micol.miniproject.member.service.MemberVO;
import co.micol.miniproject.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 멤버목록
		MemberService ms = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<MemberVO>();
//		List<Object> members = new ArrayList<Object>();
//		MemberVO vo = new MemberVO();
//		vo.setStartDay(Date.valueOf("2023-06-14"));
//		vo.setEndDay(Date.valueOf("2023-06-15"));
//		
//		members = ms.memberSelectList(vo);
		members = ms.memberSelectAll();
		request.setAttribute("members", members);
		
		return "member/memberList";
	}

}
