package kr.PintoK.beer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class ArticleController {
	
	
	@RequestMapping("/review")
	public String review() {
		
		log.info("review 확인!!");
		
		return "/article/review";
	}
	
	
	@RequestMapping("/articleView")
	public String articleView() {
		
		log.info("articleView 확인!!");
		
		return "/article/articleView";
	}
	
	@RequestMapping("/articleWrite")
	public String articleWrite() {
		
		log.info("articleWrite 확인!!");
		
		return "/article/articleWrite";
	}
}
