package com.gyojincompany.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
//	@RequestMapping("/loginOk")
//	public String loginOk(HttpServletRequest request, Model model) {
//		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//		
//		return "loginOk";
//	}
	
	@RequestMapping("/loginOk")
	public String loginOk(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "loginOk";
	}
	
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
//	@RequestMapping("/joinOk")
//	public String joinOk(@RequestParam("name") String name, 
//			@RequestParam("id") String id, @RequestParam("pw") String pw,
//			@RequestParam("email") String email, Model model) {
//		return "joinOk";
//	}
	
	@RequestMapping("/joinOk")
	public String joinOk(MemberDto memberDto) {
		
		//model.addAttribute("memberDto", memberDto);
		
		return "joinOk";
	}
	
	@RequestMapping("/member/{memberNum}")
	public String memberNumber(@PathVariable String memberNum, Model model) {
		model.addAttribute("membernum", memberNum);
		
		return "memberNumber";
	}
	

}
