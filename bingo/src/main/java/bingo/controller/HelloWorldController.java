package bingo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {


	/*http://lqw-pc:8080/bingo/hello/?name=JavaHash*/
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		System.out.println(this);
		return "HelloWorld";
	}
	
	@RequestMapping("/hello2")
	@ResponseBody
	public String hello(){
		return "xxx";
	}
	
	
//    @RequestMapping("/json1")
//    @ResponseBody
//    public Object testJson1(@RequestBody User u){
//        return "hello";
//}

}