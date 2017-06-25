package com.nun.wjq.project.mapper;

import com.nun.wjq.project.model.Project;
import com.nun.wjq.project.model.ProjectExample;
import com.nun.wjq.project.model.ProjectWithBLOBs;
import com.nun.wjq.project.model.Student;
import com.nun.wjq.project.result.Pst;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(ProjectWithBLOBs record);

    int insertSelective(ProjectWithBLOBs record);

    List<ProjectWithBLOBs> selectByExampleWithBLOBs(ProjectExample example);

    List<Project> selectByExample(ProjectExample example);

    ProjectWithBLOBs selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") ProjectWithBLOBs record, @Param("example") ProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") ProjectWithBLOBs record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(ProjectWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProjectWithBLOBs record);

    int updateByPrimaryKey(Project record);

	List<Pst> selectBySidOrStu(Student s);

	List<Project> selectBySidAndPrank(Project p);
}