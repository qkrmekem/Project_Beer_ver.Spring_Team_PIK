package kr.PintoK.beer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class NoticeController {
	
	@RequestMapping("/notice")
	public String notice() {
		
		log.info("notice 확인!!");
		
		return "/notice/notice";
	}
}
