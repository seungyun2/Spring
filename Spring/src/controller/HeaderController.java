package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class HeaderController {
	@RequestMapping("/header/check.do")
	public String check(@RequestHeader("accept-Language")String languageHeader){
		System.out.println(languageHeader);
		return "header/pass";
	}
}
