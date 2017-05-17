package controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	public ModelAndView hello(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("greeting",getGreeting());
		return mav;
	}
	
	private String getGreeting(){
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour >= 6 && hour <=10){
			return "���� ��ħ �Դϴ�";
		}else if(hour >= 12 && hour<=15){
			return "���� �Ļ�� �ϼ̳���?";
		}else if(hour >= 18 && hour <=22){
			return "���� �� �Ǽ���";
		}
		return "Hi";
	}
	
	private int getTime(){
		int hour = Calendar.getInstance().get(Calendar.MILLISECOND);
		return hour;
	}
	
	@RequestMapping("/bye.do")
	public ModelAndView bye(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("time",getTime());
		return mav;
		
	}
	
	

}
