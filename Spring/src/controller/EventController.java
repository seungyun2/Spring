package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class EventController {
	
	@RequestMapping("/event/list.do")
	public String list(){
		System.out.println("2");
		return "event/list";
	}
	
	@RequestMapping("/event/eventExpired.do")
	public String expired(){
		System.out.println("1");
		return "event/eventExpired";
	}

}
