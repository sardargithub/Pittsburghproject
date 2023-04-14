package com.pittsburgh.EcommerceappTasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class Task1767Item2withoutThread 
{
public static WebDriver driver;
public static Properties p1;
@Test(priority=1,enabled=true)
public void Login() throws Exception
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
	boolean Login = driver.findElement(By.xpath("//button[text()='Login']")).isDisplayed();
	if(Login){
		System.out.println("Login was done successfully");
	} else {
		System.out.println("Login was not done successfully");
	}
	Commonclass.Threadtime2sec(driver, sendpassword);
	WebElement loginbutton2nd=driver.findElement(By.xpath("//button[text()='Login']"));
	Commonclass.Click(driver, loginbutton2nd);
	Commonclass.Threadtime3sec(driver, loginbutton2nd);
}
@Test(priority=2,enabled=true)
public void SelectingOrder() throws Exception
{
	WebElement clcikoncategories=driver.findElement(By.xpath("(//a[text()=' Categories '])[3]"));
	Commonclass.Click(driver, clcikoncategories);
	Commonclass.Threadtime2sec(driver, clcikoncategories);
	WebElement clickonboots=driver.findElement(By.xpath("(//h5[text()='Boots'])[1]"));
	Commonclass.Click(driver, clickonboots);
	Commonclass.Threadtime3sec(driver, clickonboots);
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
	Commonclass.Threadtime2sec(driver, storelength);
	WebElement Clickbilloption= driver.findElement(By.xpath("(//input[@name='billing'])[1]"));
	JavascriptExecutor moveuptomoveotion = (JavascriptExecutor) driver;
	moveuptomoveotion.executeScript("arguments[0].click();", Clickbilloption);   
	WebElement Clickshippingoption= driver.findElement(By.xpath("(//input[@name='shipping'])[1]"));
	JavascriptExecutor moveuptoshippingoption = (JavascriptExecutor) driver;
	moveuptoshippingoption.executeScript("arguments[0].click();", Clickshippingoption);
	Commonclass.Threadtime2sec(driver, Clickshippingoption);
	boolean selectingorder = driver.findElement(By.xpath("//button[@id='btn-cart']")).isDisplayed();
	if(selectingorder){
		System.out.println("Order was added successfully");
	} else {
		System.out.println("Order was not added successfully");
	}
	WebElement Clickonaddtocartbutton= driver.findElement(By.xpath("//button[@id='btn-cart']"));
	JavascriptExecutor moveuptoaddtocartbutton = (JavascriptExecutor) driver;
	moveuptoaddtocartbutton.executeScript("arguments[0].click();", Clickonaddtocartbutton);
	WebElement Clickaddtocartitem= driver.findElement(By.xpath("(//img[@class='img-fluid'])[1]"));
	JavascriptExecutor moveuptoitemcart = (JavascriptExecutor) driver;
	moveuptoitemcart.executeScript("arguments[0].click();", Clickaddtocartitem);
	WebElement Clickoncheckout= driver.findElement(By.xpath("//a[contains(text(),'m Ready to Checkout')]"));
	JavascriptExecutor moveuptocheckout = (JavascriptExecutor) driver;
	moveuptocheckout.executeScript("arguments[0].click();", Clickoncheckout);
	Commonclass.Threadtime3sec(driver, Clickoncheckout);
}

@Test(priority=3,enabled=true)
public void Checkoutmodule() throws Exception
{
	WebElement w1=driver.findElement(By.xpath("//h4[text()='Payment']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", w1); 
	Commonclass.Threadtime2sec(driver, w1);
	driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")).sendKeys("4242 4242 4242 4242");;
	driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")).sendKeys("02 / 25");
	driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")).sendKeys("587");
	driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")).sendKeys("15879",Keys.RETURN);
	    
}
}

	

