package com.pittsburgh.EcommerceappTasks;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class Uniformpantsmoduleinmobileview extends EcommerceLoginmobileview
{
@Test(priority=1,enabled=true)
public void testUniformpantsmodule() throws Exception
{
	WebElement clickonmenuoption=driver.findElement(By.xpath("(//*[@aria-label='Open Menu'])[2]"));
	Commonclass.Click(driver, clickonmenuoption);
	WebElement clickonCategories=driver.findElement(By.xpath("(//a[text()=' Categories '])[1]"));
	Commonclass.Click(driver, clickonCategories);
	WebElement Clickonunifirmpant= driver.findElement(By.xpath("//h5[text()='Uniform Pants']"));
	JavascriptExecutor moveuptouniformpant = (JavascriptExecutor) driver;
	moveuptouniformpant.executeScript("arguments[0].click();", Clickonunifirmpant);
	WebElement Clickonsomepant= driver.findElement(By.xpath("//h4[text()='Flying Cross F1 47780 ']"));
	JavascriptExecutor moveuptosomepant = (JavascriptExecutor) driver;
	moveuptosomepant.executeScript("arguments[0].click();", Clickonsomepant);
	WebElement storecolour=	driver.findElement(By.xpath("(//select[@id='variant-field'])[1]"));
    String colourofpant="LAPD Navy";
    Commonclass.Dropdown(driver, storecolour, colourofpant);
    Commonclass.Threadtime2sec(driver, storecolour);
	WebElement storesize=	driver.findElement(By.xpath("(//select[@id='variant-field'])[2]"));
    String pantsize="34";
	Commonclass.Dropdown(driver, storesize, pantsize);
	Commonclass.Threadtime2sec(driver, storesize);
	WebElement storelength=	driver.findElement(By.xpath("(//select[@id='variant-field'])[3]"));
	String pantlength="LONG";
	Commonclass.Dropdown(driver, storelength, pantlength);
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
@Test(priority=2,enabled=true)
public void Checkoutmodule() throws Exception
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement w1=driver.findElement(By.xpath("//h4[text()='Billing Address']"));
	js.executeScript("arguments[0].scrollIntoView();", w1); 
	Commonclass.Threadtime2sec(driver, w1);
	WebElement clickonpaypal=driver.findElement(By.xpath("//input[@id='paypal']"));
	JavascriptExecutor moveuptopaypal = (JavascriptExecutor) driver;
	moveuptopaypal.executeScript("arguments[0].click();", clickonpaypal);
	WebElement paypaliniframe=driver.findElement(By.xpath("//iframe[@title='PayPal']"));
	Commonclass.Click(driver, paypaliniframe);
	String Parent=driver.getWindowHandle();
	Set<String>s=driver.getWindowHandles();

	// Now iterate using Iterator
	Iterator<String> I1= s.iterator();

	while(I1.hasNext())
	{

	String child_window=I1.next();


	if(!Parent.equals(child_window))
	{
	driver.switchTo().window(child_window);
	WebElement ClickonEmailfield= driver.findElement(By.xpath("//*[@id='createAccount']"));
	JavascriptExecutor moveuptoemailfield = (JavascriptExecutor) driver;
	moveuptoemailfield.executeScript("arguments[0].click();", ClickonEmailfield);
	Commonclass.Threadtime5sec(driver, ClickonEmailfield);
	WebElement sendcountry=	driver.findElement(By.xpath("//select[@id='country']"));
	String storelcountry="United States";
	Commonclass.Dropdown(driver, sendcountry, storelcountry);
	JavascriptExecutor moveuptocardnum = (JavascriptExecutor) driver;
	WebElement cardnumber=driver.findElement(By.xpath("//input[@id='cardNumber']"));
	moveuptocardnum.executeScript("arguments[0].value='4242424242424242'",cardnumber); 
	WebElement sendExpdate=driver.findElement(By.xpath("//input[@id='cardExpiry']"));
	String storeexpdate="02 / 25";
	Commonclass.SendKeys(driver, sendExpdate, storeexpdate);
	WebElement sendcvvnum=driver.findElement(By.xpath("//input[@id='cardCvv']"));
	String storecvvnum="587";
	Commonclass.SendKeys(driver, sendcvvnum, storecvvnum);
	WebElement sendfirstname=driver.findElement(By.xpath("//input[@id='firstName']"));
	String storefirstname="evdgve";
	Commonclass.SendKeys(driver, sendfirstname, storefirstname);
	WebElement sendlastname=driver.findElement(By.xpath("//input[@id='lastName']"));
	String storelastname="hgdjcvc";
	Commonclass.SendKeys(driver, sendlastname, storelastname);
	WebElement sendbillingline=driver.findElement(By.xpath("//input[@id='billingLine1']"));
	String storebillingline="gdwcfvbhjc";
	Commonclass.SendKeys(driver, sendbillingline, storebillingline);
	WebElement sendbillingline2=driver.findElement(By.xpath("//input[@id='billingLine2']"));
	String storebillingline2="utwgducugbgcw";
	Commonclass.SendKeys(driver, sendbillingline2, storebillingline2);
	WebElement sendbillingcity=driver.findElement(By.xpath("//input[@id='billingCity']"));
	String storebillingcity="Pittsburgh";
	Commonclass.SendKeys(driver, sendbillingcity, storebillingcity);
	WebElement sendbillingstate=	driver.findElement(By.xpath("//select[@id='billingState']"));
    String storebillingstate="Colorado";
    Commonclass.Dropdown(driver, sendbillingstate, storebillingstate);
	WebElement sendbillingpostalcode=driver.findElement(By.xpath("//input[@id='billingPostalCode']"));
	String storebillingpostalcode="02765";
	Commonclass.SendKeys(driver, sendbillingpostalcode, storebillingpostalcode);
/*WebElement givephonenum= driver.findElement(By.xpath("//*[@id='phone']"));
JavascriptExecutor moveuptophonenum = (JavascriptExecutor) driver;
moveuptophonenum.executeScript("arguments[0].value='6367273676'",givephonenum);  */
WebElement Clickonphonenumfield= driver.findElement(By.xpath("//*[text()='Contact Information']"));
JavascriptExecutor moveuptophonefield = (JavascriptExecutor) driver;
moveuptophonefield.executeScript("arguments[0].scrollIntoView();", Clickonphonenumfield);
WebElement sendphonenum=driver.findElement(By.xpath("//*[@id='phone']"));
String storephonenum="057895745";
Commonclass.SendKeys(driver, sendphonenum, storephonenum);
WebElement sendgmail=driver.findElement(By.xpath("//input[@id='email']"));
String storegmail="dgfcsgcd@gmail.com";
Commonclass.SendKeys(driver, sendgmail, storegmail);
JavascriptExecutor moveuptocontinue = (JavascriptExecutor) driver;
WebElement clickoncontinue=driver.findElement(By.xpath("//*[text()='Continue']"));
moveuptocontinue.executeScript("arguments[0].click();", clickoncontinue);
boolean detailsfill = driver.findElement(By.xpath("//*[text()='Continue']")).isEnabled();
if(detailsfill){
System.out.println("Card details entered successfully");
} else {
System.out.println("Card details not entered successfully");
}
}
	}
}

}

