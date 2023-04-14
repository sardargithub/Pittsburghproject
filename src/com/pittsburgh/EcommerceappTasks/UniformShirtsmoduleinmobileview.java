package com.pittsburgh.EcommerceappTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class UniformShirtsmoduleinmobileview extends EcommerceLoginmobileview{
	
	@Test(priority=1,enabled=true)
	public void testuniformshirtsmodule() throws Exception
	{
		WebElement clickonmenuoption=driver.findElement(By.xpath("(//*[@aria-label='Open Menu'])[2]"));
		Commonclass.Click(driver, clickonmenuoption);
		WebElement clickonCategories=driver.findElement(By.xpath("(//a[text()=' Categories '])[1]"));
		Commonclass.Click(driver, clickonCategories);
		WebElement Clickonunifirmshirt= driver.findElement(By.xpath("(//h5[text()='Uniform Shirts'])[1]"));
		JavascriptExecutor moveuptouniformshirts = (JavascriptExecutor) driver;
		moveuptouniformshirts.executeScript("arguments[0].click();", Clickonunifirmshirt);
		WebElement Clickonblockshirt= driver.findElement(By.xpath("//h4[text()='Blauer 8600-Z ']"));
		JavascriptExecutor moveuptoblockshirt = (JavascriptExecutor) driver;
		moveuptoblockshirt.executeScript("arguments[0].click();", Clickonblockshirt);
		WebElement storecolour=	driver.findElement(By.xpath("(//select[@id='variant-field'])[1]"));
	    String colourofshirt="DARK NAVY";
	    Commonclass.Dropdown(driver, storecolour, colourofshirt);
	    Commonclass.Threadtime2sec(driver, storecolour);
		WebElement storesize=	driver.findElement(By.xpath("(//select[@id='variant-field'])[2]"));
	    String shirtsize="15.5";
		Commonclass.Dropdown(driver, storesize, shirtsize);
		Commonclass.Threadtime2sec(driver, storesize);
		WebElement storelength=	driver.findElement(By.xpath("(//select[@id='variant-field'])[3]"));
		String shirtlength="33";
		Commonclass.Dropdown(driver, storelength, shirtlength);
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
	}
}
