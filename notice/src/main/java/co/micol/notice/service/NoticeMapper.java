package co.micol.notice.service;

import java.util.List;
// Mybatis 사용 위한 인터페이스
public interface NoticeMapper {
	List<NoticeVO> noticeSelectList(); // 목록 조회
	NoticeVO noticeSelect(NoticeVO vo); // 상세 조회
	int noticeInsert(NoticeVO vo); // 게시물 작성
	int noticeUpdate(NoticeVO vo); // 게시물 수정
	int noticeDelete(NoticeVO vo); // 게시물 삭제
	int noticeHitUpdate(NoticeVO vo); // 조회수 증가
}
