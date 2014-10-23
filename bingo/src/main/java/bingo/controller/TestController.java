package bingo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	  int count = 0;
	
	
	public static void main(String[] args) {
		logger.info("Processing trade with id: {} and symbol : {} ", "para1", "para2");
	}
	
	@ResponseBody
	@RequestMapping("/")
//	http://lqw-pc:8080/bingo/golfing/test/
	public String f1(){
		logger.info("Processing trade with id: {} and symbol : {} ", "5", "symbol");
		logger.info("count : {}", count++);
		return "fa";
	}
}