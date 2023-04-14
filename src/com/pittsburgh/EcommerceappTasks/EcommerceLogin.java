package com.pittsburgh.EcommerceappTasks;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class EcommerceLogin {
public static WebDriver driver;
public static Properties p1;
@Test
public void testlogin() throws Exception
{
	System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
	p1 = new Properties();
	p1.load(fis);
	driver.get(p1.getProperty("EcommerceURL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement Clickonlogin1sttime= driver.findElement(By.xpath("//a[text()=' Login']"));
	JavascriptExecutor moveuptologinfirsttime = (JavascriptExecutor) driver;
	moveuptologinfirsttime.executeScript("arguments[0].click();", Clickonlogin1sttime);
	WebElement sendusername=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	String username=p1.getProperty("EcommerceUn");
	Commonclass.SendKeys(driver, sendusername, username);
	WebElement sendpassword=driver.findElement(By.xpath("//input[@id=\"password\"]"));
	String password=p1.getProperty("Ecommercepwd");
	Commonclass.SendKeys(driver, sendpassword, password);
	Commonclass.Threadtime2sec(driver, sendpassword);
	boolean Login = driver.findElement(By.xpath("//button[text()='Login']")).isDisplayed();
	if(Login){
		System.out.println("Login was done");
	} else {
		System.out.println("Login was not done");
	}
	WebElement loginbutton2nd=driver.findElement(By.xpath("//button[text()='Login']"));
	Commonclass.Click(driver, loginbutton2nd);
	Commonclass.Threadtime3sec(driver, loginbutton2nd);
}
}
