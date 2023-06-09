package co.micol.notice.serviceImpl;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.notice.common.DataSource;
import co.micol.notice.service.NoticeMapper;
import co.micol.notice.service.NoticeService;
import co.micol.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	NoticeMapper map = sqlSession.getMapper(NoticeMapper.class);
//	private DataSource dao = DataSource.getInstance();
//	private Connection conn;
//	private PreparedStatement pstmt;
//	private ResultSet rs;
	
	@Override
	public List<NoticeVO> noticeSelectList() {
		
//		String sql = "SELECT * FROM NOTICE";
//		List<NoticeVO> notices = new ArrayList<NoticeVO>();
//		NoticeVO vo;
//		try {
//			conn = dao.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				vo = new NoticeVO();
//				vo.setNoticeId(rs.getInt("notice_id"));
//				vo.setNoticeWriter(rs.getString("notice_writer"));
//				vo.setNoticeTitle(rs.getString("notice_title"));
//				vo.setNoticeWdate(rs.getDate("notice_wdate"));
//				vo.setNoticeHit(rs.getInt("notice_hit"));
//				notices.add(vo);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return notices;
		return map.noticeSelectList();
	}

//	private void close() {
//		try {
//			if (rs != null) rs.close();
//			if (pstmt != null) pstmt.close();
//			if (conn != null) conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeDelete(vo);
	}

	@Override
	public int noticeHitUpdate(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeHitUpdate(vo);
	}
	
}
