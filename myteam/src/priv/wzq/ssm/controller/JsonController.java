package priv.wzq.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import priv.wzq.ssm.po.Member;
import priv.wzq.ssm.service.MemberService;
@Controller
public class JsonController {
	@Autowired MemberService memberService;
	@RequestMapping(value = "getInfoBySchoolNumber.action",method = RequestMethod.GET)
	public @ResponseBody Member getInfoBySchoolNumber(String  schoolnumber){
		return memberService.getInfoBySchoolNumber(schoolnumber);
	}
}
      