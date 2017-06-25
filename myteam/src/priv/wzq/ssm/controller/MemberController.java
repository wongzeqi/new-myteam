package priv.wzq.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import priv.wzq.ssm.exception.CustomException;
import priv.wzq.ssm.po.Member;
import priv.wzq.ssm.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired MemberService memberService;
	@RequestMapping("addMember.html")
	public ModelAndView addMember(Member member) throws Exception{
		System.out.println(member.getNation());
		if(memberService.getInfoBySchoolNumber(member.getSchoolnumber())!=null){
			throw new CustomException("你已经报名了，请查看你的学号是否正确！");
		}
		
		if(member.getSchoolnumber()==""||member.getNation()==""||member.getAcademy()==""
				||member.getSchoolnumber()==""){
			throw new CustomException("信息没有填写完整，请继续完善！");
		}
		ModelAndView modelAndView = new ModelAndView();
		memberService.insertMember(member);
		//加入团队后
		modelAndView.setViewName("/WEB-INF/error/error.jsp");
		modelAndView.addObject("message", "添加成功");
		return modelAndView;
	}
	
	
	@RequestMapping("deleteMemberById.html")
	public String deleteMemberById(int id) throws Exception{
		if(id==0){
			throw new CustomException("参数错误！");
		}
		memberService.deleteMemberById(id);
		return "/WEB-INF/error/error.jsp";
	}
	
	@RequestMapping("deleteMemberByOpenid.html")
	public String deleteMemberByOpenid(String openid) throws Exception{
		if(openid==null||openid==""){
			throw new CustomException("参数错误！");
		}
		memberService.deleteMemberByOpenid(openid);
		return "/WEB-INF/error/error.jsp";
	}
	
	
}
