package kppagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kploginpage {

	WebDriver driver;
	@FindBy(xpath = "/html/body/header/div[2]/div/a[1]")
	WebElement logo;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/a[1]")
	WebElement login;
	
	 @FindBy(name = "ulogin")
	 WebElement username;
	 
	 @FindBy(name = "upass")
	 WebElement password;
	 
	 @FindBy(id = "sub_logbtn")
	 WebElement loginbutton;
	 
	 
	
		 public kploginpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		 public  boolean logoverification()
		 {
			 return logo.isDisplayed();
		 }
		public void loginsignup()
		{
			login.click();
		}
		public void values(String usernamee,String passwordd)
		{
			username.sendKeys(usernamee);
			password.sendKeys(passwordd);
		}
		public void button()
		{
			loginbutton.click();
		}
		
		

	 }



