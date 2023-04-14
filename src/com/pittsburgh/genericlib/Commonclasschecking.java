package com.pittsburgh.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Commonclasschecking {

    public static int DELAY = 30;
 //   public static int DELAY2=10;

	public static void WaitForElementVisibility(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,DELAY);
        wait.until(ExpectedConditions.visibilityOf(element));
       
    }
	public static void WaitForElementclickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,DELAY);
        wait.until(ExpectedConditions.elementToBeClickable(element));
       
    }
	
	public static void Click(WebDriver driver, WebElement element) {
		WaitForElementclickable( driver,  element);
		element.click();
		     
    }
	public static void SendKeys(WebDriver driver, WebElement element,String data) {
		WaitForElementclickable( driver, element);
		element.clear();
		 element.sendKeys(data);
	}
	public static void clear(WebDriver driver, WebElement element) {
	       WaitForElementVisibility( driver,  element);
			
	       element.clear();
		}
	public static void clickusingJavascript(WebDriver driver, WebElement element)
	{
		WaitForElementclickable( driver,  element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", element);
	}
	public static void scrolluptoElement(WebDriver driver, WebElement element)
	{
		WaitForElementVisibility( driver,  element);
		JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
		moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static  void Dropdown(WebDriver driver,WebElement element,String text) {
		WaitForElementclickable( driver,  element);
        Select drop = new Select(element );
        drop.selectByVisibleText(text);  
  }
  public static void Threadtime3sec(WebDriver driver, WebElement element) throws Exception
  {
	  Thread.sleep(3000);
  }
  public static void Threadtime2sec(WebDriver driver, WebElement element) throws Exception
  {
	  Thread.sleep(2000);
  }
  public static void Threadtime1sec(WebDriver driver, WebElement element) throws Exception
  {
	  Thread.sleep(1000);
  }
  public static void Threadtime5sec(WebDriver driver, WebElement element) throws Exception
  {
	  Thread.sleep(5000);
  }
  public static void Threadtime7sec(WebDriver driver, WebElement element) throws Exception
  {
	  Thread.sleep(7000);
  }
  public static void Threadtime10sec(WebDriver driver, WebElement element) throws Exception
  {
	  Thread.sleep(10000);
  }
  public static void Threadtime12sec(WebDriver driver, WebElement element) throws Exception
  {
	  Thread.sleep(12000);
  }
  public static void Threadtime20sec(WebDriver driver, WebElement element) throws Exception
  {
	  Thread.sleep(20000);
  }

}
