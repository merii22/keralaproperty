package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseclass {
	
	 public WebDriver driver;
	  
	  @BeforeMethod
	   public void start()
	   {
		  driver=new ChromeDriver();
		  driver.get("https://keralaproperty.in/member/login/");
	   }
	  @AfterMethod
	  public void afterr()
	  {
		  driver.quit();
	  }
	

}
