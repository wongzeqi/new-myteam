package priv.wzq.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import priv.wzq.ssm.po.Qditem;
import priv.wzq.ssm.service.QdItemService;

@Controller
@RequestMapping("qiandao")
public class QditemController {
	@Autowired QdItemService itemService;
	@RequestMapping("qd.action")
	public ModelAndView qiandao(Qditem qditem){
		itemService.addQditem(qditem);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/error/error.jsp");
		modelAndView.addObject("message", "添加成功");
		return modelAndView;
	}
}
