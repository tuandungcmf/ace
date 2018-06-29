package jp.co.ace.controller;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.ace.dao.HomeDAO;
import jp.co.ace.entities.Home;

@Controller
@Component
@RequestMapping("thread")
public class GetDataThreadController {
				
	@Autowired
	private HomeDAO homeDAO;
	
	@RequestMapping(value="detail", method= RequestMethod.GET)
	@ResponseBody
	public String newThread(@RequestParam String link, Model model) {
		
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get(link);
		List<WebElement> title = driver.findElements(By.className("section_title"));
		
		Date now = new Date();
		
		model.addAttribute("house_detail", new Home());
		
		Home homeDB = new Home();
		homeDB.setHouseName("ABC");
		homeDB.setHousePrice(50000);
		homeDAO.persist(homeDB);
		
//			house.setTitle(title.get(0).getText());
		driver.quit();
//			house.setContent("ABC");
//			house.setPrice(50000);
//			house.setAddress("渋谷");
//			house.setCreateDate(now);
//			house.setUpdateDate(now);
//			house.setAccountInputId(1);
		
//			houseInfoMapper.insert(house);			
		
		return link;
	}	
		
	}

