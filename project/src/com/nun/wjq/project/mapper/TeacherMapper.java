package com.nun.wjq.project.mapper;

import com.nun.wjq.project.model.Teacher;
import com.nun.wjq.project.model.TeacherExample;
import com.nun.wjq.project.parameter.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

	Teacher login(User user);
	//根据老师的教工号获取对象
	Teacher selectByTnumber(String tnumber);
}