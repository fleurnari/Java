package co.micol.miniproject.member.service;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
	@Select("select * from member")
	List<MemberVO> memberSelectAll();  
	
	List<Object> memberSelectList(MemberVO vo);
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	List<MemberVO> memberSearchSelect(@Param("key") String key, @Param("val") String val);
	List<MemberVO> memberSearchSelect(@Param("key") String key, @Param("val") int val);
	List<MemberVO> memberSearchSelect(@Param("key") String key, 
									@Param("start") Date start,
									@Param("end") Date end);
}
