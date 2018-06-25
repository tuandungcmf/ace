package jp.co.ace.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("home")
public class HouseController {

//	@Autowired
//	private SendGridClient sendGridClient;
	
	@RequestMapping("list")
	public String listHouses(Model model) {			
		model.addAttribute("title","House list");
		return "home/list"; 
	}
	
//	@RequestMapping(value="list", method = RequestMethod.GET)
//	@ResponseBody
//	public String sendMailContact(String name, String personName, String[] mail, String tel, Integer type, String body ) {
//		
//		String answer = "sended";
//		return answer;
//	}	
	
	@RequestMapping("detail")
	public String detailHome(Model model,@RequestParam Long id) {	
		String x = "Testing Detail !";
		model.addAttribute("test",x);
		model.addAttribute("title","House Detail");
		return "home/homeDetail"; 
	}
}
