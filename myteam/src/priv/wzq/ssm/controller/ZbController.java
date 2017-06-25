package priv.wzq.ssm.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import priv.wzq.ssm.service.ZbService;
import priv.wzq.ssm.util.ImportUtil;

@Controller
@RequestMapping("/excel")
public class ZbController {
	@Autowired ZbService zbService;
	@RequestMapping("/upload")
	public ModelAndView excelUpload(File file) throws FileNotFoundException  {
		FileInputStream fileInputStream;
		fileInputStream = new FileInputStream(file);
		ImportUtil.importZbExcel(zbService, fileInputStream);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/error/error.jsp");
		modelAndView.addObject("message", "导入成功！");
		return modelAndView;
	}
}
