package co.homework.potal.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelectList(); //전체 리스트 조회
	MemberVO memberSelect(MemberVO vo); //한명의 정보 조회(로그인 체크)
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	boolean memberIdCheck(String id); //아이디 중복 체크
	
}
