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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class NewUserRegistrationusinggmailAcountHeadless {

	public static WebDriver driver;
	public static Properties p1;
	@Test(priority=1,enabled=false)
public void testnewuserregistration() throws Exception
{
		System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","headless","--window-size=1366,768");
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement clickonpages=driver.findElement(By.xpath("(//a[text()=' pages '])[3]"));
		JavascriptExecutor moveuptopages = (JavascriptExecutor) driver;
		moveuptopages.executeScript("arguments[0].click();", clickonpages);
		WebElement clickonregister=driver.findElement(By.xpath("(//a[text()=' register '])[1]"));
		JavascriptExecutor moveuptoregister = (JavascriptExecutor) driver;
		moveuptoregister.executeScript("arguments[0].click();", clickonregister);
		WebElement sendfirstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		String username="hussainn";
		Commonclass.SendKeys(driver, sendfirstname, username);
		WebElement sendlastname=driver.findElement(By.xpath("//input[@id='lname']"));
		String lastname="boltt";
		Commonclass.SendKeys(driver, sendlastname, lastname);
		WebElement sendpassword=driver.findElement(By.xpath("//input[@id='Password']"));
		String password="pittsburgh";
		Commonclass.SendKeys(driver, sendpassword, password);
		WebElement sendconfirmpassword=driver.findElement(By.xpath("//input[@id='Confirm_Password']"));
		String confirmpassword="pittsburgh";
		Commonclass.SendKeys(driver, sendconfirmpassword, confirmpassword);
		WebElement sendmail=driver.findElement(By.xpath("//input[@id='email']"));
		String mail="pittsburghprojecttesting@gmail.com";
		Commonclass.SendKeys(driver, sendmail, mail);
		WebElement sendmobilenum=driver.findElement(By.xpath("//input[@id='mobile_no']"));
		String mobilenum="9876543210";
		Commonclass.SendKeys(driver, sendmobilenum, mobilenum);
		WebElement clickonregisterbutton=driver.findElement(By.xpath("//*[text()='Create Account']"));
		JavascriptExecutor moveuptoregisterbutton = (JavascriptExecutor) driver;
		moveuptoregisterbutton.executeScript("arguments[0].click();", clickonregisterbutton);
	}
	@Test(priority=2,enabled=true)
	public void loginwithnewuser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","headless","--window-size=1366,768");
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
		driver.manage().window().maximize();
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
		Commonclass.Threadtime5sec(driver, loginbutton2nd);
	}
	@Test(priority=3,enabled=true)
	public void SelectingOrderinboots()  throws Exception
	{
		WebElement Clickoncategories= driver.findElement(By.xpath("(//a[text()=' Categories '])[3]"));
		JavascriptExecutor moveuptocategories = (JavascriptExecutor) driver;
		moveuptocategories.executeScript("arguments[0].click();", Clickoncategories);
		Commonclass.Threadtime2sec(driver, Clickoncategories);
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
	    WebElement clickonlogout=driver.findElement(By.xpath("//*[text()='Log Out']"));
		Commonclass.Click(driver, clickonlogout);
		Commonclass.Threadtime3sec(driver, clickonlogout);
	}
	@Test(priority=5,enabled=true)
	public void testforgotpassward() throws Exception
	{
		WebElement clickonlogin=driver.findElement(By.xpath("//a[text()=' Login']"));
		Commonclass.Click(driver, clickonlogin);
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
	@Test(priority=6,enabled=false)
	public void gmaillogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		options.setHeadless(true);
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement sendgmailun=driver.findElement(By.xpath("//input[@id='identifierId']"));
		String gmailunfiled="pittsburghprojecttesting@gmail.com";
		Commonclass.SendKeys(driver, sendgmailun, gmailunfiled);
		WebElement clickonnextbutton=driver.findElement(By.xpath("//*[text()='Next']"));
		JavascriptExecutor moveuptonextbutton = (JavascriptExecutor) driver;
		moveuptonextbutton.executeScript("arguments[0].click();", clickonnextbutton); 
		WebElement sendgmailpwd=driver.findElement(By.xpath("//*[@name='password']"));
		String gmailpwdfiled="pittsburgh123";
		Commonclass.SendKeys(driver, sendgmailpwd, gmailpwdfiled);
		WebElement clickonnextbutton2=driver.findElement(By.xpath("//*[text()='Next']"));
		JavascriptExecutor moveuptonextbutton2 = (JavascriptExecutor) driver;
		moveuptonextbutton2.executeScript("arguments[0].click();", clickonnextbutton2);
		WebElement clickgooglemapsmenu=driver.findElement(By.xpath("//*[@aria-label='Google apps']"));
		Commonclass.Click(driver, clickgooglemapsmenu);
		//Thread.sleep(4000);
	    /*//	driver.findElement(By.xpath("//*[text()='Gmail']")).click();
		WebElement clickongmail=driver.findElement(By.xpath("//*[text()='Gmail']"));
		JavascriptExecutor moveuptogmail = (JavascriptExecutor) driver;
		moveuptogmail.executeScript("arguments[0].click();", clickongmail); 
		//Sub Menu  */
		WebElement subMenu = driver.findElement(By.xpath("//*[text()='Gmail']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		WebElement clcikon1stone=driver.findElement(By.xpath("(//div[@role='tabpanel'])[1]"));
		Commonclass.Click(driver, clcikon1stone);
	}

}
