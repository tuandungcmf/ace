package jp.co.ace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HouseController {
	
	@RequestMapping(value= {"home","/"})
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
}
