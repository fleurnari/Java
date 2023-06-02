package co.micol.notice.service;

import java.util.List;
// Model 구현할 때 사용하는 인터페이스
public interface NoticeService {
	List<NoticeVO> noticeSelectList(); // 목록 조회
	NoticeVO noticeSelect(NoticeVO vo); // 상세 조회
	int noticeInsert(NoticeVO vo); // 게시물 작성
	int noticeUpdate(NoticeVO vo); // 게시물 수정
	int noticeDelete(NoticeVO vo); // 게시물 삭제
}
