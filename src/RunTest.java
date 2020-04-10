import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RunTest {
	  static WebDriver webDriver;
  		
	    /**
	     * @param args
	     * @throws InterruptedException
	     */
	    public static void main(final String[] args) throws InterruptedException {
	    	//baseURL
	    	String baseURL = "https://www.amazon.com/gp/browse.html?node=172282&ref_=nav_em_T1_0_1_0_4_hmenu_top_categories";
	    	//email random
	    	String email = "youremail@provider.com";
			String pw = "yourpw";
	    	
	    	
	        // Telling the system where to find the chrome driver
	        System.setProperty(
	                "webdriver.chrome.driver",
	                "C:\\WebDriver\\bin\\chromedriver.exe");

	        // Open the Chrome browser
	        webDriver = new ChromeDriver();
	        webDriver.manage().window().maximize();
	        
	        webDriver.get(baseURL);
	        webDriver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/US-hq/2018/img/Consumer_Electronics/ce_showcase/cat-tile/ce_showcase_cat-tile_desktop_tv.jpg']")).click();
	        webDriver.findElement(By.xpath("//a[@href='/s/ref=tv_nav_sz_0_32?ie=UTF8&bbn=172659&rh=i%3Aelectronics%2Cn%3A172282%2Cn%3A%21493964%2Cn%3A1266092011%2Cn%3A172659%2Cp_n_size_browse-bin%3A1232879011&pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-leftnav&pf_rd_r=Y0W0FDDJYQA92GKXXQ5Y&pf_rd_r=Y0W0FDDJYQA92GKXXQ5Y&pf_rd_t=101&pf_rd_p=c124428d-2df0-4d19-b38e-496142579ab3&pf_rd_p=c124428d-2df0-4d19-b38e-496142579ab3&pf_rd_i=1266092011']")).click();
//	        webDriver.findElement(By.linkText("32 Inches and Under")).click();
	        webDriver.findElement(By.id("p_n_feature_nine_browse-bin/16591230011")).click();
	        webDriver.findElement(By.id("high-price")).sendKeys("150");
	        webDriver.findElement(By.className("a-button-inner")).click();
	        
	        // select the first item in search result
	        webDriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")).click();
	        webDriver.findElement(By.id("wishListMainButton-announce")).click();
	        
	        //login to site
	        webDriver.findElement(By.id("ap_email")).sendKeys(email);
	        webDriver.findElement(By.id("continue")).click();
	        
	        

	        // Waiting a bit before closing
	        Thread.sleep(7000);

	        // Closing the browser and WebDriver
	        webDriver.close();
	        webDriver.quit();
	    }
}
