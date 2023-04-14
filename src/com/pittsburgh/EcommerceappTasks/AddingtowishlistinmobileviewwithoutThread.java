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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class AddingtowishlistinmobileviewwithoutThread {
	public static WebDriver driver;
	public static Properties p1;
	public String cardNumber="4561 2378 9565 8897";
	@Test(priority=1,enabled=true)
	public void Login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","--window-size=414,736");
		driver = new ChromeDriver(options);
		FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
		p1 = new Properties();
		p1.load(fis);
		driver.get(p1.getProperty("EcommerceURL"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Clickonlogin1sttime= driver.findElement(By.xpath("//a[text()=' Login']"));
		JavascriptExecutor moveuptologinfirsttime = (JavascriptExecutor) driver;
		moveuptologinfirsttime.executeScript("arguments[0].click();", Clickonlogin1sttime);
		WebElement sendusername=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		String username=p1.getProperty("Ecommercenewun");
		Commonclass.SendKeys(driver, sendusername, username);
		WebElement sendpassword=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		String password=p1.getProperty("Ecommercenewpwd");
		Commonclass.SendKeys(driver, sendpassword, password);
		boolean Login = driver.findElement(By.xpath("//button[text()='Login']")).isDisplayed();
		if(Login){
			System.out.println("Login was done with new user");
		} else {
			System.out.println("Login was not done with new user ");
		}
		WebElement loginbutton2nd=driver.findElement(By.xpath("//button[text()='Login']"));
		Commonclass.Click(driver, loginbutton2nd);
		Commonclass.Threadtime3sec(driver, loginbutton2nd);
	}
	@Test(priority=2,enabled=true)
	public void SelectingOrder() throws Exception
	{
		WebElement clickonmenuoption1=driver.findElement(By.xpath("(//*[@aria-label='Open Menu'])[2]"));
		Commonclass.Click(driver, clickonmenuoption1);
		WebElement clickoncategories=driver.findElement(By.xpath("(//a[text()=' Categories '])[1]"));
		Commonclass.Click(driver, clickoncategories);
		WebElement clickonboots=driver.findElement(By.xpath("//div[text()='Boots']"));
		Commonclass.Click(driver, clickonboots);
		WebElement Clickwhiteboot1= driver.findElement(By.xpath("(//h4[text()='Blauer FW016LT '])[1]"));
		JavascriptExecutor moveuptowhiteboot1 = (JavascriptExecutor) driver;
		moveuptowhiteboot1.executeScript("arguments[0].click();", Clickwhiteboot1);
		 WebElement storecolour=	driver.findElement(By.xpath("(//select[@id='variant-field'])[1]"));
		    String colourofboot="BLACK";
		    Commonclass.Dropdown(driver, storecolour, colourofboot);
		    Commonclass.Threadtime2sec(driver, storecolour);
			WebElement storesize=	driver.findElement(By.xpath("(//select[@id='variant-field'])[2]"));
		    String bootsize="14";
			Commonclass.Dropdown(driver, storesize, bootsize);
			Commonclass.Threadtime2sec(driver, storesize);
			WebElement storelength=	driver.findElement(By.xpath("(//select[@id='variant-field'])[3]"));
			String bootlength="WIDE";
			Commonclass.Dropdown(driver, storelength, bootlength);
			WebElement Clickshippingoption= driver.findElement(By.xpath("(//input[@name='shipping'])[1]"));
			JavascriptExecutor moveuptoshippingoption = (JavascriptExecutor) driver;
			moveuptoshippingoption.executeScript("arguments[0].click();", Clickshippingoption);
			Commonclass.Threadtime2sec(driver, Clickshippingoption);
			WebElement clickonaddtowishlist=driver.findElement(By.xpath("//span[text()=' Add To WishList']"));
			Commonclass.Click(driver, clickonaddtowishlist);
			WebElement sendwishlistname=driver.findElement(By.xpath("//input[@formcontrolname='wishlistName']"));
			String storewishlistname="testing";
			Commonclass.SendKeys(driver, sendwishlistname, storewishlistname);;
			WebElement clickoncreatenewlist=driver.findElement(By.xpath("//a[text()='CREATE NEW LIST']"));
			Commonclass.Click(driver, clickoncreatenewlist);
			Commonclass.Threadtime2sec(driver, clickoncreatenewlist);
			WebElement clickonAddbutton=driver.findElement(By.xpath("(//*[text()=' ADD '])[1]"));
			Commonclass.Click(driver, clickonAddbutton);
			Commonclass.Threadtime2sec(driver, clickonAddbutton);
			WebElement Clickmenuoption= driver.findElement(By.xpath("//*[@class='header-menu']"));
			JavascriptExecutor moveuptomenuoption = (JavascriptExecutor) driver;
			moveuptomenuoption.executeScript("arguments[0].click();", Clickmenuoption);
			WebElement clickonaccount=driver.findElement(By.xpath("(//*[@id='hide-burger-menu'])"));
			Commonclass.Click(driver, clickonaccount);
			WebElement clickonwishlist=driver.findElement(By.xpath("(//*[text()='My Wish List'])[1]"));
			Commonclass.Click(driver, clickonwishlist);
			boolean wishlist = driver.findElement(By.xpath("(//a[text()='View Products'])[1]")).isDisplayed();
			if(wishlist){
				System.out.println("Added product in wish list");
			} else {
				System.out.println("product was not added wish list");
			}
			WebElement Clickonviewproducts= driver.findElement(By.xpath("(//a[text()='View Products'])[1]"));
			JavascriptExecutor moveuptoviewproducts = (JavascriptExecutor) driver;
			moveuptoviewproducts.executeScript("arguments[0].click();", Clickonviewproducts);
}
}