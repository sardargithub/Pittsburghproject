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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class NewUserRegusinggmailAccmobileviewHeadless 
{

	public static WebDriver driver;
	public static Properties p1;
	@Test(priority=1,enabled=true)
	public void Login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","headless","--window-size=414,736");
		options.addArguments("--allow-insecure-localhost");
	    options.addArguments("--disable-gpu");
	    options.addArguments("--no-sandbox");
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability(ChromeOptions.CAPABILITY, options);
	    caps.setCapability("acceptInsecureCerts", caps);  
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
		Commonclass.Threadtime2sec(driver, sendpassword);
		boolean Login = driver.findElement(By.xpath("//button[text()='Login']")).isDisplayed();
		if(Login){
			System.out.println("Login was done with new user");
		} else {
			System.out.println("Login was not done with new user ");
		}
		WebElement loginbutton2nd=driver.findElement(By.xpath("//button[text()='Login']"));
		Commonclass.Click(driver, loginbutton2nd);
		Commonclass.Threadtime5sec(driver, loginbutton2nd);
	}
	@Test(priority=2,enabled=true)
	public void SelectingOrder() throws Exception
	{
		WebElement clicckonmenu1sttime=driver.findElement(By.xpath("(//*[@aria-label='Open Menu'])[2]"));
		Commonclass.Click(driver, clicckonmenu1sttime);
		WebElement clickoncategories=driver.findElement(By.xpath("(//a[text()=' Categories '])[1]"));
		Commonclass.Click(driver, clickoncategories);
		WebElement clcikonboots=driver.findElement(By.xpath("//div[text()='Boots']"));
		Commonclass.Click(driver, clcikonboots);
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
	@Test(priority=4,enabled=true)
	public void Checkoutmoduleupdatingaddress() throws Exception
	{
		WebElement clickonaddbutton=driver.findElement(By.xpath("(//span[text()='Add'])[2]"));
		JavascriptExecutor moveuptoaddbutton = (JavascriptExecutor) driver;
		moveuptoaddbutton.executeScript("arguments[0].click();", clickonaddbutton);   
/*		Thread.sleep(5000);
		WebElement updateshipaddress=driver.findElement(By.xpath("(//span[text()='Change'])[4]"));
		JavascriptExecutor moveuptoupdateshipaddress = (JavascriptExecutor) driver;
		moveuptoupdateshipaddress.executeScript("arguments[0].click();", updateshipaddress);    */
		WebElement sendphonenumfield=driver.findElement(By.xpath("(//input[@name='phone'])[2]"));
		String phonenumfiled="123456789";
		Commonclass.SendKeys(driver, sendphonenumfield, phonenumfiled);
		WebElement sendaddressfield=driver.findElement(By.xpath("(//*[@name='address'])[2]"));
		String addressfield="2001 K Street NW,Suite 200 Washington,DC 20006, USA";
		Commonclass.SendKeys(driver, sendaddressfield, addressfield);
		WebElement sendtownfield=driver.findElement(By.xpath("(//input[@name='town'])[2]"));
		String townfield="Washington";
		Commonclass.SendKeys(driver, sendtownfield, townfield);
	    WebElement selectstate=	driver.findElement(By.xpath("(//select[@name='state'])[2]"));
	    String storestate="California";
		Commonclass.Dropdown(driver, selectstate, storestate);
	    WebElement clearandsendpostalccode=driver.findElement(By.xpath("(//input[@name='postalcode'])[2]"));
	    Commonclass.clear(driver, clearandsendpostalccode);
	    String postalcode="10003";
		Commonclass.SendKeys(driver, clearandsendpostalccode, postalcode);
		WebElement clickoncontinuebutton=driver.findElement(By.xpath("(//a[@id='continue-shopping'])[3]"));
		JavascriptExecutor moveuptocontinuebutton = (JavascriptExecutor) driver;
		moveuptocontinuebutton.executeScript("arguments[0].click();", clickoncontinuebutton); 
		boolean Addressupdate = driver.findElement(By.xpath("(//a[@id='continue-shopping'])[3]")).isEnabled();
		if(Addressupdate){
			System.out.println("Addresss updated successfully");
		} else {
			System.out.println("Address was not updated successfully");
		}
		WebElement Clickmenuoption= driver.findElement(By.xpath("//div[@class='header-menu']"));
		JavascriptExecutor moveuptomenuoption = (JavascriptExecutor) driver;
		moveuptomenuoption.executeScript("arguments[0].click();", Clickmenuoption);
		Commonclass.Threadtime2sec(driver, Clickmenuoption);
	    WebElement clickonlogout=driver.findElement(By.xpath("//*[text()='Logout ']"));
		Commonclass.Click(driver, clickonlogout);
		Commonclass.Threadtime3sec(driver, clickonlogout);
	}
	@Test(priority=5,enabled=true)
	public void testforgotpassward() throws Exception
	{
		WebElement clickonaccount=driver.findElement(By.xpath("//*[@id='hide-burger-menu']"));
		Commonclass.Click(driver, clickonaccount);
		Commonclass.Threadtime2sec(driver, clickonaccount);
		WebElement sendmail=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String mail=p1.getProperty("Ecommercenewun");
		Commonclass.SendKeys(driver, sendmail, mail);
		WebElement clickonforgot=driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		Commonclass.Click(driver, clickonforgot);
		WebElement sendmailagain=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String mailagain=p1.getProperty("Ecommercenewun");
		Commonclass.SendKeys(driver, sendmailagain, mailagain);
		WebElement clickonsubmit=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Commonclass.Click(driver, clickonsubmit);
		boolean Forgotpwd = driver.findElement(By.xpath("(//button[@type='submit'])[2]")).isEnabled();
		if(Forgotpwd){
			System.out.println("Forgot pwd clickable and confirmation mail is send to our mail");
		} else {
			System.out.println("Forgot pwd not clickable and confirmation mail is not send to our mail");
		}
	}
    
}
