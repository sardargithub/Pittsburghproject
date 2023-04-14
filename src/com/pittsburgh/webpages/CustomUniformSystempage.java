package com.pittsburgh.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pittsburgh.base.Baseclass;

public class CustomUniformSystempage
{
@FindBy(xpath="//*[text()='Start New Order']")
public WebElement Startnewcustomerbutton;
@FindBy(xpath="//*[text()='Search For Customer']")
public WebElement Searchforcustomerbutton;
@FindBy(xpath="//*[@id='form-group-input-4']")
public WebElement  Emailfield;
@FindBy(xpath="//*[@type='submit']")
public WebElement Searchbutton;
@FindBy(xpath="(//*[text()='SardarTest '])[2]")
public WebElement customerfounddata;
@FindBy(xpath="//*[text()='Yes']")
public WebElement Yesbuttoninsearchcustomerpage;
@FindBy(xpath="(//*[text()='Rank:'])")
public WebElement Organizationlink;
@FindBy(xpath="//*[text()='Yes']")
public WebElement Yesbuttoninverifypage;
@FindBy(xpath="//*[text()='Skip']")
public WebElement Skipbuttoninverifypage;
@FindBy(xpath="//*[text()='Agency Order ']")
public WebElement Agencyorderinverifypage;

public CustomUniformSystempage()
{
	PageFactory.initElements(Baseclass.driver,this);
}
public void clicknewcustomerbutton()
{
	Startnewcustomerbutton.click();
}
public void clickonSearchforcustomerbutton()
{
	Searchforcustomerbutton.click();
}
public void senddatainemailfield(String Email)
{
	Emailfield.sendKeys(Email);
}
public void clickonsubmitbutton()
{
	Searchbutton.click();
}
public void clickoncustomerfounddata()
{
	customerfounddata.click();
}
public void clickonYesbuttoninsearchcustomerpage()
{
	Yesbuttoninsearchcustomerpage.click();
}
public void clickonorganizationlink()
}
