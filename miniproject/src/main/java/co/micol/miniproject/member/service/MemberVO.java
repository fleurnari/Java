package co.micol.miniproject.member.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	private String memberId;
	private String memberPassword;
	private String memberName;
	private int memberAge;
	private String memberTel;
	private String memberGender;
	private String memberAuthor;
	private String memberImage;
	private String memberImgDir;
	
	private String memberDate;  //등록일
	
	private Date startDay;  //날짜 검색시 활용
	private Date endDay;  //날짜 검색시 활용
}
