package priv.wzq.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import priv.wzq.ssm.po.Qjitem;
import priv.wzq.ssm.service.QjItemService;

@Controller
@RequestMapping("/qingjia")
public class QjitemController {
	
	@Autowired QjItemService qjItemService;
	
	@RequestMapping("/qingjia.action")
	public ModelAndView doQingjia(Qjitem qjitem){
		qjItemService.insert(qjitem);
		ModelAndView m = new ModelAndView();
		m.setViewName("/jsp/qingjia.jsp");
		m.addObject("message", "请假成功");
		return m;
	}
	
	
	
	
}
