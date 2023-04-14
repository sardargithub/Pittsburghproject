package com.pittsburgh.testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pittsburgh.base.Baseclass;
import com.pittsburgh.genericlib.Commonclass;
import com.pittsburgh.genericlib.Commonclasschecking;
import com.pittsburgh.genericlib.OperationsAppHomepage;



public class Posbutttonchecking extends Baseclass
{
@Test
public void test() throws Exception
{
		OperationsAppHomepage oph=new OperationsAppHomepage();
	//	Commonclasschecking ccc=new Commonclasschecking();
	//	ccc.Threadtime7sec(driver, element);
		oph.clickonHomepagebutton();
		oph.clcikonPosbutton();
		oph.ClickonViewbutton();
}
}
