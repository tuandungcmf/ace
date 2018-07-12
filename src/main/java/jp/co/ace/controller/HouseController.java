package jp.co.ace.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HouseController {
	
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	
	@RequestMapping(value= {"login","/"})
	public String login(@RequestParam(value = "error", required = false) final String error, final Model model) {
		if (error != null) {
	      model.addAttribute("message", "Login Failed!");
	    }
		return "login";
	}
	
	@RequestMapping(value= {"home"})
	public String listHouses(Model model) {
		model.addAttribute("title","House list");
		return "home/homeList";
	}
		
	@RequestMapping("detail")
	public String detailHome(Model model,@RequestParam Long id) {	
		String x = "Testing Detail !";
		model.addAttribute("test",x);
		model.addAttribute("title","House Detail");
		return "home/homeDetail"; 
	}
	
	@RequestMapping("/logout")
	public String logout(final Model model) {
		model.addAttribute("message", "Logged out!");
		return "login";
	}
}
