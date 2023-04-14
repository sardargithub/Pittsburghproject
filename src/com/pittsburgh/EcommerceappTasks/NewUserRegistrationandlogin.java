package com.pittsburgh.EcommerceappTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewUserRegistrationandlogin 
{
public static WebDriver driver;
@Test(priority=1,enabled=true)
public void testnewuserregistration() throws Exception
{
	System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	options.setHeadless(true);
	driver.get("https://integration-e-commerce.firebaseapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("(//a[text()=' pages '])[3]")).click();
	WebElement clickonpages=driver.findElement(By.xpath("(//a[text()=' pages '])[3]"));
	JavascriptExecutor moveuptopages = (JavascriptExecutor) driver;
	moveuptopages.executeScript("arguments[0].click();", clickonpages);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//a[text()=' register '])[1]")).click();
	WebElement clickonregister=driver.findElement(By.xpath("(//a[text()=' register '])[1]"));
	JavascriptExecutor moveuptoregister = (JavascriptExecutor) driver;
	moveuptoregister.executeScript("arguments[0].click();", clickonregister);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sardar");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("hussain");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pittsburgh");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='Confirm_Password']")).sendKeys("pittsburgh");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sardar.hussain@mail.valuecoders.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='mobile_no']")).sendKeys("9876543210");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[text()='Create Account']")).click();
	WebElement clickonregisterbutton=driver.findElement(By.xpath("//*[text()='Create Account']"));
	JavascriptExecutor moveuptoregisterbutton = (JavascriptExecutor) driver;
	moveuptoregisterbutton.executeScript("arguments[0].click();", clickonregisterbutton);
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("pittsburgh");
}
@Test(priority=2,enabled=true)
public void loginwithnewuser() throws Exception
{
	System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	options.setHeadless(true);
	driver.get("https://integration-e-commerce.firebaseapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(4000); //3366466@gmail.com and pwd:pittsburgh
	driver.findElement(By.xpath("//a[text()=' Login']")).click();
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sardar.hussain@mail.valuecoders.com");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("pittsburgh");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
}
@Test(priority=3,enabled=true)
public void SelectingOrderinboots()  throws Exception
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[text()=' Categories '])[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//h5[text()='Boots'])[1]")).click();
	Thread.sleep(3000);
	WebElement Clickwhiteboot1= driver.findElement(By.xpath("(//h4[text()='Blauer FW016LT '])[1]"));
	JavascriptExecutor moveuptowhiteboot1 = (JavascriptExecutor) driver;
	moveuptowhiteboot1.executeScript("arguments[0].click();", Clickwhiteboot1);
	Thread.sleep(3000);
WebElement storecolour=	driver.findElement(By.xpath("(//select[@id='variant-field'])[1]"));
Select colourofboot= new Select(storecolour);
colourofboot.selectByVisibleText("BLACK");
	Thread.sleep(3000);
	WebElement storesize=	driver.findElement(By.xpath("(//select[@id='variant-field'])[2]"));
	Select sizeofboot= new Select(storesize);
	sizeofboot.selectByIndex(14);
	Thread.sleep(3000);
	WebElement storelength=	driver.findElement(By.xpath("(//select[@id='variant-field'])[3]"));
	Select lengthofboot= new Select(storelength);
	lengthofboot.selectByVisibleText("WIDE");
/*	Thread.sleep(3000);
	WebElement Clickbilloption= driver.findElement(By.xpath("(//input[@name='billing'])[1]"));
	JavascriptExecutor moveuptomoveotion = (JavascriptExecutor) driver;
	moveuptomoveotion.executeScript("arguments[0].click();", Clickbilloption);  */
	Thread.sleep(3000);
	WebElement Clickshippingoption= driver.findElement(By.xpath("(//input[@name='shipping'])[1]"));
	JavascriptExecutor moveuptoshippingoption = (JavascriptExecutor) driver;
	moveuptoshippingoption.executeScript("arguments[0].click();", Clickshippingoption);
	Thread.sleep(5000);
	WebElement Clickonaddbutton= driver.findElement(By.xpath("//button[@id='btn-cart']"));
	JavascriptExecutor moveuptoaddbutton = (JavascriptExecutor) driver;
	moveuptoaddbutton.executeScript("arguments[0].click();", Clickonaddbutton);
	Thread.sleep(5000);
	WebElement Clickaddtocartitem= driver.findElement(By.xpath("(//img[@class='img-fluid'])[1]"));
	JavascriptExecutor moveuptoitemcart = (JavascriptExecutor) driver;
	moveuptoitemcart.executeScript("arguments[0].click();", Clickaddtocartitem);
	Thread.sleep(3000);
	WebElement Clickoncheckout= driver.findElement(By.xpath("//a[contains(text(),'m Ready to Checkout')]"));
	JavascriptExecutor moveuptocheckout = (JavascriptExecutor) driver;
	moveuptocheckout.executeScript("arguments[0].click();", Clickoncheckout);
}
@Test(priority=4,enabled=true)
public void Checkoutmoduleupdatingaddress() throws Exception
{
//142 Highway, Klickitat, WA 98628 
	//Washington
	Thread.sleep(3000);
	WebElement storeshipaddress=driver.findElement(By.xpath("//strong[text()=' Delivery Locations']"));
	JavascriptExecutor moveuptoshipaddress = (JavascriptExecutor) driver;
	moveuptoshipaddress.executeScript("arguments[0].scrollIntoView();", storeshipaddress);  
/*	Thread.sleep(3000);
	WebElement clickonaddbutton=driver.findElement(By.xpath("(//span[text()='Add'])[2]"));
	JavascriptExecutor moveuptoaddbutton = (JavascriptExecutor) driver;
	moveuptoaddbutton.executeScript("arguments[0].click();", clickonaddbutton);   */
	Thread.sleep(5000);
	WebElement updateshipaddress=driver.findElement(By.xpath("(//span[text()='Change'])[4]"));
	JavascriptExecutor moveuptoupdateshipaddress = (JavascriptExecutor) driver;
	moveuptoupdateshipaddress.executeScript("arguments[0].click();", updateshipaddress);    
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@name='phone'])[2]")).sendKeys("123456789");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@name='address'])[2]")).sendKeys("2001 K Street NW,Suite 200 Washington,DC 20006, USA");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@name='town'])[2]")).sendKeys("Washington");
	Thread.sleep(3000);
WebElement storecolour=	driver.findElement(By.xpath("(//select[@name='state'])[2]"));
Select colourofboot= new Select(storecolour);
colourofboot.selectByVisibleText("California");
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@name='postalcode'])[2]")).clear();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@name='postalcode'])[2]")).sendKeys("10003");
	Thread.sleep(3000);
	WebElement clickoncontinuebutton=driver.findElement(By.xpath("(//a[@id='continue-shopping'])[3]"));
	JavascriptExecutor moveuptocontinuebutton = (JavascriptExecutor) driver;
	moveuptocontinuebutton.executeScript("arguments[0].click();", clickoncontinuebutton); 
	Thread.sleep(3000);
	WebElement Clickmenuoption= driver.findElement(By.xpath("//div[@class='header-menu']"));
	JavascriptExecutor moveuptomenuoption = (JavascriptExecutor) driver;
	moveuptomenuoption.executeScript("arguments[0].click();", Clickmenuoption);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Log Out']")).click();
}
@Test(priority=5,enabled=true)
public void testforgotpassward() throws Exception
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()=' Login']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sardar.hussain@mail.vinove.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sardar.hussain@mail.vinove.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
}
}
