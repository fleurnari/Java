package co.micol.miniproject.member.service;

import java.sql.Date;
import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelectAll();
	
	List<Object> memberSelectList(MemberVO vo);
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	List<MemberVO> memberSearchSelect(String key, String val);
	List<MemberVO> memberSearchSelect(String key, Date start, Date end);
	List<MemberVO> memberSearchSelect(String key, int val);
}
