package priv.wzq.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import priv.wzq.ssm.mapper.MemberMapper;
import priv.wzq.ssm.mapper.OpenidMapper;
import priv.wzq.ssm.po.Member;
import priv.wzq.ssm.service.MemberService;

public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper memberMapper;
	@Autowired OpenidMapper openidMapper;
	@Override
	public void insertMember(Member member) throws Exception {
		
		memberMapper.insert(member);
	}
	@Override
	public void deleteMemberById(int id) throws Exception {
		memberMapper.deleteByPrimaryKey(id);
	}
	@Override
	public void deleteMemberByOpenid(String openid) throws Exception {
		memberMapper.deleteByOpenid(openid);
	}
	@Override
	public int getMemberCount() {
		return memberMapper.getMemberCount();
	}
	@Override
	public List<Member> getInfoByNameAndSchoolNumber(String nameornumber)
			throws Exception {
		char []  n=  nameornumber.toCharArray();
		if(Character.isDigit(n[0])){
			Member member = memberMapper.getInfoBySchoolNumber(nameornumber);
			List<Member> memberList = new ArrayList<Member>();
			if(member!=null){
				memberList.add(member);
			}
			return memberList;
		}else{
			return memberMapper.getInfoByName(nameornumber);
		}
	}
	@Override
	public int getCountBySex(String sex) {
		return memberMapper.getCountBySex(sex);
	}
	@Override
	public List<Member> getAllMember() {
		return memberMapper.getAllMember();
	}
	
	@Override
	public void updateInfoById(Member member) {
		memberMapper.updateByPrimaryKeySelective(member);
	}
	@Override
	public Member getInfoByOpenid(String openid) {
		return memberMapper.getInfoByOpenid(openid);
	}
	@Override
	public void setOpenId(Member member) {
		memberMapper.setOpenId(member);
	}
	@Override
	public void deleteBySchoolNumber(String schoolNumber) {
		memberMapper.deleteBySchoolNumber(schoolNumber);
	}
	
	public Member getInfoBySchoolNumber(String schoolNumber){
		return memberMapper.getInfoBySchoolNumber(schoolNumber);
	}
	@Override
	public List<String> getAllQQ() {
		return memberMapper.getAllQQ();
	}
	@Override
	public List<String> getAllSchoolNumber() {
		// TODO Auto-generated method stub
		return memberMapper.getAllSchoolNumber();
	}
	@Override
	public List<Member> getAllQQAndSchoolNumber() {
		// TODO Auto-generated method stub
		return memberMapper.getAllQQAndSchoolNumber();
	}
}
