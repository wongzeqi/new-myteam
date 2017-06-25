package com.nun.wjq.project.mapper;

import com.nun.wjq.project.model.Schooladmin;
import com.nun.wjq.project.model.SchooladminExample;
import com.nun.wjq.project.parameter.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SchooladminMapper {
    int countByExample(SchooladminExample example);

    int deleteByExample(SchooladminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Schooladmin record);

    int insertSelective(Schooladmin record);

    List<Schooladmin> selectByExample(SchooladminExample example);

    Schooladmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Schooladmin record, @Param("example") SchooladminExample example);

    int updateByExample(@Param("record") Schooladmin record, @Param("example") SchooladminExample example);

    int updateByPrimaryKeySelective(Schooladmin record);

    int updateByPrimaryKey(Schooladmin record);

	Schooladmin login(User user);
}