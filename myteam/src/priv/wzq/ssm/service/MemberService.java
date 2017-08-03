package priv.wzq.ssm.service;

import java.util.List;

import priv.wzq.ssm.po.Member;

public interface MemberService  extends BaseService{
	void insertMember(Member member) throws Exception;

	void deleteMemberById(int id) throws Exception;

	void deleteMemberByOpenid(String openid) throws Exception;
	
	int getMemberCount() throws Exception ;
	
	/**
	 * 查看成员信息根据姓名
	 */
	
	List<Member> getInfoByNameAndSchoolNumber(String nameornumber) throws Exception;
	/**
	 * 根据性别查询人数
	 * @param sex
	 * @return
	 */
	int getCountBySex(String sex);
	/**
	 * 查看所有的成员
	 */
	List<Member> getAllMember() ;
	/**
	 * 修改信息
	 * @param member
	 */
	void updateInfoById(Member member);

	
	Member getInfoByOpenid(String openid);

	void setOpenId(Member member);

	void deleteBySchoolNumber(String schoolNumber);
	/**
	 * 根据学号查看信息
	 * @param schoolNumber
	 * @return
	 */
	Member getInfoBySchoolNumber(String schoolNumber);
	 /**
	  * 查看所有人的qq
	  * @return
	  */
	 List<String> getAllQQ ();
	 
	 /**
	  * 查询所有人的学号
	  */
	 List<String> getAllSchoolNumber();
	 
	 List<Member> getAllQQAndSchoolNumber();

	List<Member> getMembersByMember(Member member);
}
