package kr.PintoK.beer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MemberController {
	
	
	@GetMapping("/register")
	public String register() {
			
		log.info("reregister 확인!!");
		
		return"/member/register";
	}
	
	@GetMapping("/login")
	public String login() {
			
		log.info("login 확인!!");
		
		return"/member/login";
	}
	@GetMapping("/myPage")
	public String myPage() {
			
		log.info("myPage 확인!!");
		
		return"/member/myPage";
	}
}
