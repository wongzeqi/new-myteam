package com.nun.wjq.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nun.wjq.project.model.Project;
import com.nun.wjq.project.model.ProjectExample;
import com.nun.wjq.project.model.ProjectWithBLOBs;
import com.nun.wjq.project.model.Student;
import com.nun.wjq.project.parameter.AcademySelectProject;
import com.nun.wjq.project.result.Pst;

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

	List<Project> selectProjectBySid(Project p);
	//根据老师查询他所指导的项目(条件查询)
	List<Pst> selectProjectByTid(Project p);
	//根据
	List<Pst> selectProjectByAcademyadmin(AcademySelectProject asp);

	List<Pst> selectCheckedProjectByAcademyadmin(AcademySelectProject asp);

	List<Pst> selectChangeCheckedProjectByAcademyadmin(AcademySelectProject asp);

	List<Pst> selectRemoveProjectCheckedByAcademyadmin(AcademySelectProject asp);

	List<Pst> schoolSelectProject(ProjectWithBLOBs p);

	List<Pst> schooladminSelectProject(ProjectWithBLOBs p);
	
	
    
}