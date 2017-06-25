package com.nun.wjq.project.mapper;

import com.nun.wjq.project.model.Parentmeun;
import com.nun.wjq.project.model.ParentmeunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParentmeunMapper {
    int countByExample(ParentmeunExample example);

    int deleteByExample(ParentmeunExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Parentmeun record);

    int insertSelective(Parentmeun record);

    List<Parentmeun> selectByExample(ParentmeunExample example);

    Parentmeun selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Parentmeun record, @Param("example") ParentmeunExample example);

    int updateByExample(@Param("record") Parentmeun record, @Param("example") ParentmeunExample example);

    int updateByPrimaryKeySelective(Parentmeun record);

    int updateByPrimaryKey(Parentmeun record);

	List<Parentmeun> getParentMeuns4();
	List<Parentmeun> getParentMeuns3();
	List<Parentmeun> getParentMeuns2();
	List<Parentmeun> getParentMeuns1();
}