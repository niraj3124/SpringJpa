package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.RechargeBean;
import com.cg.service.IRechargeService;



@Controller
public class RechargeController {

	
	@RequestMapping("home")
	public String getHome(Model m)
	{
		m.addAttribute("rechargeObj",new RechargeBean());
		return "home";
	}
	
	@Autowired
	IRechargeService irs;
	
	@RequestMapping("recharge")
	public String recharge(Model m,@ModelAttribute("rechargeObj") RechargeBean r)
	{
		m.addAttribute("rechargeObj",r);
		return "recharge";
	}
	
	@RequestMapping(value="store",method=RequestMethod.POST)
	public String rechargeInfo(Model m,@ModelAttribute("rechargeObj") RechargeBean r){
		String target=null;
		int rid=irs.rechargeInfo(r);
		if(rid>0){
			
			m.addAttribute("msg","Recharge successfully");
			m.addAttribute("rid", rid);
			target="success";
		}
		else{
			target="home";
		}
		return target;
	}

	
	
}
