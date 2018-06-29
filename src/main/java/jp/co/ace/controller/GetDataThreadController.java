package jp.co.ace.controller;

import java.util.Date;
import java.util.HashMap;
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

import jp.co.ace.entity.HouseDetail;
import jp.co.ace.service.HouseDetailService;

@Controller
@Component
@RequestMapping("thread")
public class GetDataThreadController {
	
	@Autowired			
	HouseDetailService houseService;
	
	@RequestMapping(value="detail", method= RequestMethod.GET)
	@ResponseBody
	public String newThread(@RequestParam String link, Model model) {
		
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get(link);
		List<WebElement> title = driver.findElements(By.className("section_title"));
		List<WebElement> address = driver.findElements(By.className("data_around"));
		List<WebElement> price = driver.findElements(By.className("detailvalue"));
		List<WebElement> detail = driver.findElements(By.className("section"));
		
		
		HouseDetail houses = new HouseDetail();
		houses.setHouseName(title.get(0).getText());
		houses.setHousePrice(price.get(0).getText());
		houses.setHousePrice(price.get(0).getText());
		houses.setHouseDetail(detail.get(1).getText());
		houses.setHouseAddress(address.get(0).getText());
		houseService.insert(houses);
		
		driver.quit();		
		
		return link;
	}	
		
}