package OperationsAppTasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pittsburgh.base.Baseclass;

//import com.pittsburgh.genericlib.Screenshotclass;

public class Logintoordercreation {
	public static WebDriver driver;
	public static Properties p1;
//Testcase-1
	@Test(priority = 1, enabled=true)
	public void Testcase1LoginFunctionality() throws IOException, Exception {
		String	Testname="Login";
     System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");
		//Baseclass.setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
		p1 = new Properties();
		p1.load(fis);
		driver.get(p1.getProperty("URL"));
		options.setHeadless(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(p1.getProperty("Username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(p1.getProperty("Password"));
		driver.findElement(By.xpath("//ion-button[@type='submit']")).click();
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		 Reporter.log("Method Executed" + Testname);
	//	 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
	}
	//Testcase-2
	@Test(priority = 2, enabled=true)
	public void BarcodeScanning() throws Exception {
		String	Testname="BarcodeScanning";
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("(/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-home/ion-header/ion-toolbar/ion-buttons[2]/ion-icon)[2]"));
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("(//*[@placeholder='UPC'])[2]")).sendKeys(p1.getProperty("BarcodeNumber"));
		driver.findElement(By.xpath("(//ion-button[@class='search-btn md button button-solid ion-activatable ion-focusable hydrated'])[1]")).click();
	//	String ProductnameExpected = p1.getProperty("Product Name");
	//	System.out.println(ProductnameExpected);
		String productname = driver.findElement(By.xpath("//*[text()=' SIDE-PKT POLYESTER TROUSERS']")).getText();
		 System.out.println(productname);
		 Reporter.log("Method Executed" + Testname);
	//	 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);

	}
	//Testcase-3
@Test(priority=3, enabled=true)
public void POSmodule() throws Exception
{
	String	Testname="POSmodule";
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-5\"]/span[1]/mat-panel-title")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[text()=' View ']")).click();
	WebElement element= driver.findElement(By.xpath("//*[text()=' View ']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", element);
	driver.findElement(By.xpath("//*[@id='mat-dialog-0']/app-pos-view-screen/div/ion-button[3]")).click();
	Thread.sleep(3000);
	WebElement Okay=driver.findElement(By.xpath("//*[text()='Okay']"));
	boolean b=Okay.isDisplayed();
	System.out.println("Boolean  : "+b);
	if (b==true) {
		Okay.click();
		System.out.println("True________"+b+"______Clicked");
	}
	else {
		System.out.println("If failed");
	}
	WebElement PosName=driver.findElement(By.xpath("//*[@class=\'form-control ng-untouched ng-pristine ng-invalid\']"));
	PosName.click();
	PosName.sendKeys("sardar");
	driver.findElement(By.xpath("//*[@type='Submit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Start New Order']")).click();
	Reporter.log("Clicked on Started New Order");
	driver.findElement(By.xpath("//*[text()='Search For Customer']")).click();
	driver.findElement(By.xpath("//*[@id='form-group-input-1']")).sendKeys("sardar");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	//driver.findElement(By.xpath("//*[text()='sardar ']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]")).click();
    WebElement clickoncustomer= driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]"));
		JavascriptExecutor moveuptocustomer = (JavascriptExecutor) driver;
		moveuptocustomer.executeScript("arguments[0].click();", clickoncustomer);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Yes']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]")).click();
	    WebElement clickoncustomerorganization= driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]"));
			JavascriptExecutor moveuptocustomerorganization = (JavascriptExecutor) driver;
			moveuptocustomerorganization.executeScript("arguments[0].click();", clickoncustomerorganization);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Yes']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-verify-organization/ion-content/ion-card[2]/ion-card-content/div/div[1]/ion-button")).click();
	WebElement clickpaymentordertype= driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-verify-organization/ion-content/ion-card[2]/ion-card-content/div/div[1]/ion-button"));
	JavascriptExecutor moveuptopaymentordertype = (JavascriptExecutor) driver;
	moveuptopaymentordertype.executeScript("arguments[0].click();", clickpaymentordertype);
	Reporter.log("Method Executed" + Testname);
	// Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
}
@Test(priority=4, enabled=true)
public void  AddProductNeedsPicked() throws Exception
{
	String	Testname="AddProductNeedsPicked";
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Add Product ']")).click();
	driver.findElement(By.xpath("//*[text()='Search Product to Add']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).click();
	driver.findElement(By.xpath("//*[text()=' Blauer ']")).click();
	driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).click();
    driver.findElement(By.xpath("//*[text()=' 101 ']")).click();
	driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[text()=' SILENT PARTNER BAG '])")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Show Related '])[4]")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[text()=' BLACK ']")).click();
	 WebElement clickonblack= driver.findElement(By.xpath("//*[text()=' BLACK ']"));
     JavascriptExecutor moveuptoblack = (JavascriptExecutor) driver;
     moveuptoblack.executeScript("arguments[0].click();", clickonblack);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()=' Add product to Order']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Needs Picked')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@color='success'])[6]")).click();
	 Reporter.log("Method Executed" + Testname);
//	 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
}
@Test(priority=5, enabled=true)
public void AddProductNeedsPicked2() throws Exception
{
	String	Testname="AddProductNeedsPicked2";
/*	Actions act= new Actions(driver);
    act.moveToElement(driver.findElement(By.xpath("//*[text()='Add Product ']"))).click().perform();  */
	Thread.sleep(3000);
	WebElement addproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
	JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
	moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
	Thread.sleep(3000);
	  WebElement element= driver.findElement(By.xpath("//*[text()='Add Product ']"));
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].click();", element);
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[text()='Search Product to Add']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text()=' Blauer ']")).click();
       driver.findElement(By.xpath("//*[@formcontrolname='manufacturerNum']")).click();
       driver.findElement(By.xpath("//span[text()=' 8600-Z ']")).click();
       driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click();
       driver.findElement(By.xpath("(//*[text()=' Blauer '])[2]")).click();
       driver.findElement(By.xpath("(//ion-button[text()='Show Related '])[2]")).click();
       Thread.sleep(5000);
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//div[@class='mat-select-value'])[3]")).click();
     // driver.findElement(By.xpath("(//*[@class='mat-radio-container'])[2]")).click();//xpath changes 
  /*     WebElement clickonblack= driver.findElement(By.xpath("//*[text()=' BLACK ']"));
       JavascriptExecutor moveuptoblack = (JavascriptExecutor) driver;
       moveuptoblack.executeScript("arguments[0].click();", clickonblack);
       Thread.sleep(3000);
   	driver.findElement(By.xpath("//*[text()=' Add product to Order']")).click();   */
      Thread.sleep(3000);
      driver.findElement(By.xpath("//span[text()=' DARK NAVY ']")).click();
      Thread.sleep(3000);
   //   driver.findElement(By.xpath("//span[text()=' DARK NAVY ']")).click();
      
       driver.findElement(By.xpath("(//div[@class='mat-select-value'])[4]")).click(); //xpath changes
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text()=' 15.5 ']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//div[@class='mat-select-value'])[5]")).click(); //xpath changes
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text()=' 35 ']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//ion-button[text()='Ok']")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("(//tbody[@role='rowgroup'])[3]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[text()=' Add product to Order']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[2]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//*[@color='success'])[6]")).click();
       Reporter.log("Method Executed" + Testname);
		// Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
	//Thread.sleep(3000);
	
}
@Test(priority=6,enabled=true)
public void AddProductNeedsPicked3() throws Exception
{
	String	Testname="AddProductNeedsPicked3";
//	JavascriptExecutor je=(JavascriptExecutor)driver;
	//je.executeScript("window.scrollBy(0,-450)", "");
//	Actions act= new Actions(driver);
//    act.moveToElement(driver.findElement(By.xpath("//*[text()='Add Product ']"))).click().perform();
//       Thread.sleep(3000);
	Thread.sleep(3000);
	WebElement addproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
	JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
	moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
	Thread.sleep(3000);
      WebElement element= driver.findElement(By.xpath("//*[text()='Add Product ']"));
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();", element);
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[text()='Search Product to Add']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text()=' Blauer ']")).click();
       driver.findElement(By.xpath("//*[@formcontrolname='manufacturerNum']")).click();
       driver.findElement(By.xpath("//span[text()=' 8372 ']")).click();
       driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click();
       driver.findElement(By.xpath("(//td[text()=' Blauer '])[1]")).click();
       driver.findElement(By.xpath("(//ion-button[text()='Show Related '])[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//div[@class='mat-select-value'])[3]")).click();//xpath changes 
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text()=' DARK NAVY ']")).click();
       Thread.sleep(3000);
    //   driver.findElement(By.xpath("//span[text()=' DARK NAVY ']")).click();
       
        driver.findElement(By.xpath("(//div[@class='mat-select-value'])[4]")).click(); //xpath changes
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()=' SM ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='mat-select-value'])[5]")).click(); //xpath changes
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()=' REG ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ion-button[text()='Ok']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[text()=' DARK NAVY ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()=' Add product to Order']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@color='success'])[6]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//tr[@class='highlight-row']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ion-button[text()='Customization']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ion-button[text()='Alteration']")).click();
        Thread.sleep(3000);
     WebElement alterationdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='alterationType']"));
     Select selectalterationdropdown=new Select(alterationdropdown);
     selectalterationdropdown.selectByVisibleText("Add Patch");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]")).click();
     Thread.sleep(3000);
     WebElement patchdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchLocation']"));
     Select selectpatchdropdown=new Select(patchdropdown);
     selectpatchdropdown.selectByVisibleText("Both Shoulders");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]")).click();
     Thread.sleep(3000);
     WebElement clientpatchdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchType']"));
     Select selectclientpatchdropdown=new Select(clientpatchdropdown);
     selectclientpatchdropdown.selectByVisibleText("Client Patch");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@formcontrolname='embellishmentName']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//span[text()=' test - ( CP000000071 ) ']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[4]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@formcontrolname='notes']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//ion-button[text()='Finish']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//ion-button[text()=' Embroidery']")).click();
     Thread.sleep(3000);
     WebElement Embroiderylocdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='embroideryLocation']"));
     Select selectEmbroiderylocdropdown=new Select(Embroiderylocdropdown);
     selectEmbroiderylocdropdown.selectByVisibleText("Left Chest");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]")).click();
     Thread.sleep(3000);
     WebElement Embroiderytypedropdown=   driver.findElement(By.xpath("//select[@formcontrolname='embroideryType']"));
     Select selectEmbroiderytypedropdown=new Select(Embroiderytypedropdown);
     selectEmbroiderytypedropdown.selectByVisibleText("Client Embroidery");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@formcontrolname='embellishmentName']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//span[text()=' test - ( EMB000000085 ) ']")).click();
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@formcontrolname='notes']")).click();
     driver.findElement(By.xpath("//ion-button[text()='Finish']")).click();
 //    driver.findElement(By.xpath("//ion-button[text()='Finish']")).click();
  //   driver.findElement(By.xpath("//ion-button[text()=' Embroidery']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//ion-button[text()='Print']")).click();
     WebElement printlocdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchLocation']"));
     Select selectprintlocdropdown=new Select(printlocdropdown);
     selectprintlocdropdown.selectByVisibleText("Both Shoulders");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]")).click();
     Thread.sleep(3000);
     WebElement printtypedropdown=   driver.findElement(By.xpath("//select[@formcontrolname='printType']"));
     Select selectprinttypedropdown=new Select(printtypedropdown);
     selectprinttypedropdown.selectByVisibleText("Client Print");// done
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@formcontrolname='embellishmentName']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//span[text()=' Print test 1 - ( CPR000000027 ) ']")).click();
     Thread.sleep(3000);
     WebElement elementt= driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]"));
     JavascriptExecutor jss = (JavascriptExecutor) driver;
     jss.executeScript("arguments[0].click();", elementt);
  //   driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@formcontrolname='notes']")).click();
     driver.findElement(By.xpath("//ion-button[text()='Finish']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//ion-button[text()='Vinyl']")).click();
     WebElement vinyllocdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchLocation']"));
     Select selectvinyllocdropdown=new Select(vinyllocdropdown);
     selectvinyllocdropdown.selectByVisibleText("Both Shoulders");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]")).click();
     Thread.sleep(3000);
     WebElement vinyltypedropdown=   driver.findElement(By.xpath("//select[@formcontrolname='printType']"));
     Select selectvinyltypedropdown=new Select(vinyltypedropdown);
     selectvinyltypedropdown.selectByVisibleText("Client Vinyl");// done
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]")).click();
  /*   Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@formcontrolname='embellishmentName']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@formcontrolname='notes']")).click();
     driver.findElement(By.xpath("//ion-button[text()='Finish']")).click();  */
     Reporter.log("Method Executed" + Testname);
	// Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
     Thread.sleep(3000);
     // driver.findElement(By.xpath("(//*[text()='Cancel'])")).click();
      WebElement clickoncancelbbutton=driver.findElement(By.xpath("(//*[text()='Cancel'])"));
     	JavascriptExecutor moveuptocancel= (JavascriptExecutor) driver;
     	moveuptocancel.executeScript("arguments[0].click();", clickoncancelbbutton);
   Thread.sleep(3000);
   driver.findElement(By.xpath("//*[text()='Done']")).click();
       
}
}