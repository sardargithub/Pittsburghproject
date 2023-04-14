package com.pittsburgh.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class Baseclass {
	public static WebDriver driver;
	public static Properties p1;
	@BeforeTest
	public void OpenBrowseer() throws IOException, Exception
	{
	System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);  
	driver.get("https://int-operations.firebaseapp.com/home");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	@BeforeClass
	public void Login() throws Exception
	{
		FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
		p1 = new Properties();
		p1.load(fis);
	//driver = new HtmlUnitDriver();
	WebElement login=driver.findElement(By.xpath("//*[text()='Login']"));
	Commonclass.Click(driver, login);
	//Commonclass.WaitForElementVisibility(driver, login);
	WebElement Email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
	String un=p1.getProperty("Username");
	Commonclass.SendKeys(driver, Email, un);
	WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	String pwd=p1.getProperty("Password");
	Commonclass.SendKeys(driver, password, pwd);
	WebElement Loginbutton=driver.findElement(By.xpath("//ion-button[@type='submit']"));
	Commonclass.Click(driver, Loginbutton);
}
    @AfterClass
	public void Logout()
    {
    	
    }
    @AfterTest
    public void Closebrowser()
    {
    	driver.close();
    }
}
