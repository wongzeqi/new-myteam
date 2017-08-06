package com.nun.wjq.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nun.wjq.project.mapper.MajorMapper;
import com.nun.wjq.project.model.Major;


@Controller
@RequestMapping("/major")
public class MajorController {
	/////依赖注入
	@Autowired MajorMapper majorMapper;
	
	
	
	
	//json数据
	/**
	 * 根据aid(学院的id获取专业的id)
	 * @param aid
	 * @return
	 */
	@RequestMapping("/getMajorByaid.action")
	public @ResponseBody List <Major> getMajorByAcademyid(int aid){
		return   majorMapper.getAllMajorByAid(aid);
	}
}
