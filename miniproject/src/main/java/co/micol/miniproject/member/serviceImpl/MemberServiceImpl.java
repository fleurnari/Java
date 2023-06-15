package co.micol.miniproject.member.serviceImpl;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.miniproject.common.DataSource;
import co.micol.miniproject.member.service.MemberMapper;
import co.micol.miniproject.member.service.MemberService;
import co.micol.miniproject.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSqssion = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSqssion.getMapper(MemberMapper.class);
	
	@Override
	public List<Object> memberSelectList(MemberVO vo) {
		return map.memberSelectList(vo);
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

	@Override
	public List<MemberVO> memberSearchSelect(String key, String val) {
		// TODO Auto-generated method stub
		return map.memberSearchSelect(key, val);
	}

	@Override
	public List<MemberVO> memberSelectAll() {
		// TODO Auto-generated method stub
		return map.memberSelectAll();
	}

	@Override
	public List<MemberVO> memberSearchSelect(String key, int val) {
		// TODO 나이를 검색
		return map.memberSearchSelect(key, val);
	}

	@Override
	public List<MemberVO> memberSearchSelect(String key, Date start, Date end) {
		// TODO Auto-generated method stub
		return map.memberSearchSelect(key, start, end);
	}
}
