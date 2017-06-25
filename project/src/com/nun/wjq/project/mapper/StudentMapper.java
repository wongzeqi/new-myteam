package com.nun.wjq.project.mapper;

import com.nun.wjq.project.model.Student;
import com.nun.wjq.project.model.StudentExample;
import com.nun.wjq.project.parameter.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

	Student login(User user);

	Student selectByTnumber(String snumber);
}