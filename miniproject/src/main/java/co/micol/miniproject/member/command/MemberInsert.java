package co.micol.miniproject.member.command;


import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.miniproject.common.Command;
import co.micol.miniproject.common.FileUpload;
import co.micol.miniproject.common.Sha256;
import co.micol.miniproject.member.service.MemberService;
import co.micol.miniproject.member.service.MemberVO;
import co.micol.miniproject.member.serviceImpl.MemberServiceImpl;

public class MemberInsert implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService ms = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HashMap<String,String> map = new HashMap<String, String>();
		Sha256 sp = new Sha256();
		
		FileUpload fileUpload = new FileUpload();  //파일 업로드 
		String dir = "attech";
		map = fileUpload.upload(request, response, dir);  //multipart 객체를 처리해서 map객체로 리턴
		vo.setMemberId(map.get("memberId"));
		vo.setMemberPassword(sp.sha256(map.get("memberPassword")));
		vo.setMemberName(map.get("memberName"));
		vo.setMemberTel(map.get("memberTel"));
		vo.setMemberAge(Integer.valueOf(map.get("memberAge")));
		vo.setMemberGender(map.get("memberGender"));
		vo.setMemberAuthor("USER");  //default USER  권한
		vo.setMemberImage(map.get("ofile"));
		vo.setMemberImgDir(map.get("pfile"));
		int n = ms.memberInsert(vo);
		if (n != 0) {
			request.setAttribute("join", vo);
		}else {
			request.setAttribute("message", "회원가입 실패!!!!!");
		}
		return "member/memberImage";
	}

}
