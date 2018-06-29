package jp.co.ace.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Component
@RequestMapping("search")
public class SearchController {
	
	@RequestMapping("result")
	public String listHouses(Model model, @RequestParam String condition) {	
		WebDriver driver = new HtmlUnitDriver();
		driver.get(condition);		
		List<WebElement> title = driver.findElements(By.className("js-cassetLinkHref"));
        List<WebElement> body = driver.findElements(By.className("property-body-element"));
        List<WebElement> imgs = driver.findElements(By.className("cassette_carrousel-item"));        
        List<WebElement> link = driver.findElements(By.cssSelector(".js-cassetLinkHref"));
        List<WebElement> countResult = driver.findElements(By.className("paginate_set-hit"));
        
        List<HashMap<String,String>> rows = new ArrayList<HashMap<String,String>>();
        
        for(int i=0; i < title.size()-1; i++) {
        	HashMap<String,String> lists = new HashMap<String,String>();
        	lists.put("title",title.get(i).getText());
        	lists.put("img",imgs.get(i).getAttribute("innerHTML"));
        	lists.put("body",body.get(i).getAttribute("innerHTML"));
        	lists.put("link", link.get(i).getAttribute("href"));
        	rows.add(lists);
        }
        String results = countResult.get(0).getText();
        String searchdetail = driver.getTitle();
        //Close the browser
        driver.quit();
        
		model.addAttribute("condition",condition);
		model.addAttribute("rows",rows);
		model.addAttribute("results",results);
		model.addAttribute("searchdetail",searchdetail);
		model.addAttribute("title","Resut search");
		return "search/searchList"; 
	}
	
}
