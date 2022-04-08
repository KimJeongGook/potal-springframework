package co.homework.potal.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.homework.potal.member.service.MemberMapper;
import co.homework.potal.member.service.MemberService;
import co.homework.potal.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {

	@Autowired //자동주입 member-map.xml 
	MemberMapper map;
	
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO Auto-generated method stub
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberDelete(vo);
	}

	@Override
	public boolean memberIdCheck(String id) {
		// TODO Auto-generated method stub
		return map.memberIdCheck(id);
	}

}
