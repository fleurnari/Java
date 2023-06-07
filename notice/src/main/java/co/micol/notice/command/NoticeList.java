package co.micol.notice.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.notice.common.Command;
import co.micol.notice.service.NoticeService;
import co.micol.notice.service.NoticeVO;
import co.micol.notice.serviceImpl.NoticeServiceImpl;

public class NoticeList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 목록 가져오기
		NoticeService ns = new NoticeServiceImpl(); // 모델 생성
		List<NoticeVO> notices = new ArrayList<NoticeVO>(); // 결과 담기
		notices = ns.noticeSelectList();
		
		request.setAttribute("notices", notices); // JSP에 보내기 위해 결과 객체 담기
		
		return "notice/noticeList";
	}

}
