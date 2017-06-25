package priv.wzq.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import priv.wzq.ssm.po.Member;
import priv.wzq.ssm.po.MemberExample;

public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

	void deleteByOpenid(String openid);
	/**
	 * WJQ
	 * 查看所有成员信息
	 * @return
	 */
	int getMemberCount();
	/**
	 * 根据学号查询用户信息
	 * @param nameornumber
	 * @return
	 */
	Member getInfoBySchoolNumber(String nameornumber);
	/**
	 * 根据姓名查询用户信息
	 * @param nameornumber
	 * @return
	 */
	List<Member> getInfoByName(String nameornumber);
	/**
	 * 根据性别查看人数
	 * @param sex
	 * @return
	 */
	int getCountBySex(String sex);
	/**
	 * 查看所有用户信息
	 * @return
	 */
	List<Member> getAllMember();

	Member getInfoByOpenid(String openid);


	void setOpenId(Member member);
	
	
	void deleteBySchoolNumber(String schoolnumber);
	/**
	 * 查询所有人的qq号
	 * @return
	 */
	List<String> getAllQQ ();
	
	 List<String> getAllSchoolNumber();
	 
	 
	 /**
	  * 获取所有的qq和学号
	  */
	 List<Member> getAllQQAndSchoolNumber();
}