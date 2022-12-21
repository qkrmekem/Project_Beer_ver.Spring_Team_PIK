package kr.PintoK.beer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class BeerController {

	
	@RequestMapping("/search")
	public String search() {
		
		log.info("search 확인!!");
		
		return "/aboutBeer/search";
	}
	
	@RequestMapping("/recommend")
	public String recommend() {
		
		log.info("recommend 확인!!");
		
		return "/aboutBeer/recommend";
	}
}
