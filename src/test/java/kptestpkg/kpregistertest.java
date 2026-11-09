package kptestpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.baseclass;
import kppagepkg.kpregisterpage;
import kptestpkg.kpregistertest;

public class kpregistertest extends baseclass{
	


	@Test
	public void regpage() throws InterruptedException
	{
		kpregisterpage ob=new kpregisterpage(driver);
		ob.newuserr();
		ob.dropdwn("Builder");
		ob.registerr("meriii", "meri123456@gmail.com", "merin12345", "merin12345", "9876345627");
		ob.regbutton();
	}


}
