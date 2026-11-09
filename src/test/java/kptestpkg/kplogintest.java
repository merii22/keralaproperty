package kptestpkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepkg.baseclass;
import kppagepkg.kploginpage;


public class kplogintest extends baseclass {
	
	@Test
	public void lp()
	{
		kploginpage ob=new kploginpage(driver);
		ob.logoverification();
		ob.loginsignup();
		ob.values("sara12345@gmail.com", "Sara12345");
		ob.button();
		

	}
}
