package jp.co.ace.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        if(countResult != null) {
        	String results = countResult.get(0).getText();
        	model.addAttribute("results",results);
        }
        
        String searchdetail = driver.getTitle();
        //Close the browser
        driver.quit();
        
		model.addAttribute("condition",condition);
		model.addAttribute("rows",rows);		
		model.addAttribute("searchdetail",searchdetail);
		model.addAttribute("title","Resut search");
		return "search/searchList"; 
	}
	
	@RequestMapping(value="more", method= RequestMethod.GET)
	public String list(HttpServletRequest request, Model model) {
		Enumeration enumeration = request.getParameterNames();
		String url="https://suumo.jp/jj/chintai/ichiran/FR301FC005/?ar=030&bs=040&ra=013&srch_navi=1",
				mdUrl="",rnUrl="",tsUrl="";
		String[] cb = request.getParameterValues("cb");
		String[] ct = request.getParameterValues("ct");
		String[] rns = request.getParameterValues("rn");
		String[] mds = request.getParameterValues("md");	
		String[] tss = request.getParameterValues("ts");
		for(int i=0; i<mds.length;i++) {
			mdUrl+="&md="+mds[i];
		}
		for(int j=0; j<rns.length;j++) {
			rnUrl+="&rn="+rns[j];
		}
		for(int z=0; z<tss.length;z++) {
			tsUrl+="&ts="+tss[z];
		}
		url=url+"&cb="+cb[0]+"&ct="+ct[0]+mdUrl+rnUrl+tsUrl+"&pc=100";
		System.out.println(url);
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get(url);		
		
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
        if(!countResult.equals(null)) {
        	String results = countResult.get(0).getText();
        	String str = results.replaceAll("\\D+","");
        	Integer pageNo = Integer.parseInt(str)/100;
        	
        	model.addAttribute("page",pageNo);
        	model.addAttribute("results",str);
        }
        
        
        String searchdetail = driver.getTitle();
        //Close the browser
        driver.quit();
        
        model.addAttribute("params",url);
		model.addAttribute("rows",rows);		
		model.addAttribute("searchdetail",searchdetail);
		model.addAttribute("title","Resut search");
		
		return "admin/adminSearch"; 
	}
	
}
