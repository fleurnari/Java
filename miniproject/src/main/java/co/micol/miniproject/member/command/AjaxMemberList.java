package co.micol.miniproject.member.command;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.micol.miniproject.common.Command;
import co.micol.miniproject.member.service.MemberService;
import co.micol.miniproject.member.service.MemberVO;
import co.micol.miniproject.member.serviceImpl.MemberServiceImpl;

public class AjaxMemberList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 멤버리스트를 Json객체를 통해 Ajax로 리턴
		String str="Ajax:";
		MemberService ms = new MemberServiceImpl();
		List<MemberVO> list = new ArrayList<MemberVO>();
		String key = request.getParameter("key");
		if(key.equals("age")) {
			int val = Integer.valueOf(request.getParameter("val"));
			list = ms.memberSearchSelect(key,val);
		}else if(key.equals("date")) {
			Date start = Date.valueOf(request.getParameter("val")) ;
			Date end = Date.valueOf(request.getParameter("end"));
			list = ms.memberSearchSelect(key,start,end);
		}else {
			String val = request.getParameter("val");
			list = ms.memberSearchSelect(key,val);
		}
				
		ObjectMapper mapper = new ObjectMapper();  //json 변환객체
		try {
			str += mapper.writeValueAsString(list);  //리스트를 스트링으로 변환
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return str;
	}

}
