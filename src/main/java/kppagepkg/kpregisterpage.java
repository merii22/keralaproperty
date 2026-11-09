package kppagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class kpregisterpage {
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/a[1]")
	WebElement login;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[2]/a")
	WebElement newuser;
	
	
	@FindBy(xpath = "//*[@id=\"listowner\"]")
	WebElement dropdown;
		
	@FindBy(name = "utitle")
	WebElement name;

	@FindBy(name = "umail")
	WebElement email;

	@FindBy(name = "memberpass")
	WebElement password;

	@FindBy(name = "repass")
	WebElement cpassword;

	@FindBy(name = "umobile")
	WebElement mobile;

	@FindBy(name = "sub_regbutton")
	WebElement button;


	
	public kpregisterpage(WebDriver driver) {
	 this.driver=driver;
	  PageFactory.initElements(driver,this);
	}
	
	public void loginn()
	{
		login.click();
	}
	public void newuserr()
	{
		newuser.click();
	}
	public void dropdwn(String type) throws InterruptedException
	{
		Thread.sleep(5000);
		Select s=new Select(dropdown);
		s.selectByVisibleText(type);
	}
	public void registerr(String username,String emaill,String passwordd,String cpasswordd,String mobilee)
	{
		
		name.sendKeys(username);
		email.sendKeys(emaill);
		password.sendKeys(passwordd);
		cpassword.sendKeys(cpasswordd);
		mobile.sendKeys(mobilee);
	}

	public void regbutton()
	{
		button.click();
	}

}
