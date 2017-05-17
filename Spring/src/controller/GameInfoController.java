package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameInfoController {
	

	
	@RequestMapping("/game/info")
	public ModelAndView gameInfo(@RequestParam(value="userId", required=false) String userId){
		System.out.println(userId);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("game/users/info");
		mav.addObject("userId",userId);
		
		return mav;
	}
	
	@RequestMapping("/game/list")
	public String gameList(){
		return "game/list";
	}
}



