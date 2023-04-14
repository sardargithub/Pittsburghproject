package OperationsAppTasks;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class LogintoordercreationwithHeadless {
	public static WebDriver driver;
	public static Properties p1;
//Testcase-1
	@Test(priority = 1, enabled=true)
	public void Testcase1LoginFunctionality() throws IOException, Exception {
		String	Testname="Login";
        System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","headless","--window-size=1366,768");
		options.addArguments("--allow-insecure-localhost");
	    options.addArguments("--disable-gpu");
	    options.addArguments("--no-sandbox");
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability(ChromeOptions.CAPABILITY, options);
	    caps.setCapability("acceptInsecureCerts", caps);
	    driver = new ChromeDriver(options); //"headless"
		FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
		p1 = new Properties();
		p1.load(fis);
		driver.get(p1.getProperty("URL"));
		options.setHeadless(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login=driver.findElement(By.xpath("//*[text()='Login']"));
		Commonclass.Click(driver, login);
		WebElement Email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
		String un=p1.getProperty("Username");
		//Commonclass.clear(driver, un);
		Commonclass.SendKeys(driver, Email, un);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pwd=p1.getProperty("Password");
		Commonclass.SendKeys(driver, password, pwd);
		WebElement Loginbutton=driver.findElement(By.xpath("//ion-button[@type='submit']"));
		Commonclass.Click(driver, Loginbutton);
		boolean Checkout = driver.findElement(By.xpath("//ion-button[@type='submit']")).isEnabled();
		if(Checkout){
			System.out.println("Login was done successfully");
		} else {
			System.out.println("Login was not done successfully");
		}
}
	@Test(priority = 2, enabled=true)
	public void BarcodeScanning() throws Exception {
		String	Testname="BarcodeScanning";
		Thread.sleep(3000);
		WebElement barcodeelement = driver.findElement(By.xpath("(/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-home/ion-header/ion-toolbar/ion-buttons[2]/ion-icon)[2]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", barcodeelement);
		WebElement barcodenum=driver.findElement(By.xpath("(//*[@placeholder='UPC'])[2]"));
		String barcodenumber=p1.getProperty("BarcodeNumber");
		Commonclass.SendKeys(driver, barcodenum, barcodenumber);
		Commonclass.Threadtime2sec(driver, barcodenum);
	    WebElement search=	driver.findElement(By.xpath("(//ion-button[@class='search-btn md button button-solid ion-activatable ion-focusable hydrated'])[1]"));
	    Commonclass.Click(driver, search);
	    boolean Checkout = driver.findElement(By.xpath("(//ion-button[@class='search-btn md button button-solid ion-activatable ion-focusable hydrated'])[1]")).isEnabled();
		if(Checkout){
			System.out.println("Barcode scanning  was done successfully");
		} else {
			System.out.println("Barcode scanning  was not done successfully");
		}
		String productname = driver.findElement(By.xpath("//*[text()=' SIDE-PKT POLYESTER TROUSERS']")).getText();
		 System.out.println(productname);
		 Reporter.log("Method Executed" + Testname);
	}	 
	@Test(priority=3, enabled=true)
	public void POSmodule() throws Exception
	{
		String	Testname="POSmodule";
		Thread.sleep(3000);
		WebElement clickonpos= driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-5\"]/span[1]/mat-panel-title"));
	    JavascriptExecutor moveuptopos = (JavascriptExecutor) driver;
	    moveuptopos.executeScript("arguments[0].click();", clickonpos);
		WebElement viewelement= driver.findElement(By.xpath("//*[text()=' View ']"));
		//Commonclass.scrolluptoElement(driver, viewelement);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", viewelement);
	//	Commonclass.Click(driver, viewelement);
	    WebElement	selectlocation=driver.findElement(By.xpath("//*[text()='Neville Island']"));
	    Commonclass.Click(driver, selectlocation);
		WebElement Okay=driver.findElement(By.xpath("//*[text()='Okay']"));
		Commonclass.Click(driver, Okay);
	/*	boolean b=Okay.isDisplayed();
		System.out.println("Boolean  : "+b);
		if (b==true) {
			Okay.click();
			System.out.println("True________"+b+"______Clicked");
		}
		else {
			System.out.println("If failed");
		}  */
		WebElement PosName=driver.findElement(By.xpath("//*[@class=\'form-control ng-untouched ng-pristine ng-invalid\']"));
		PosName.click();
		PosName.sendKeys("sardar");
	    WebElement submitbutton=driver.findElement(By.xpath("//*[@type='Submit']"));
	    Commonclass.Click(driver, submitbutton);
		WebElement selectneworder=driver.findElement(By.xpath("//*[text()='Start New Order']"));
		Commonclass.Click(driver, selectneworder);
		Reporter.log("Clicked on Started New Order");
	    WebElement selectsearchcustomer	=driver.findElement(By.xpath("//*[text()='Search For Customer']"));
		Commonclass.Click(driver, selectsearchcustomer);
		WebElement cusomername=driver.findElement(By.xpath("//*[@id='form-group-input-1']"));
		String storecustomername="sardar";
		Commonclass.SendKeys(driver, cusomername, storecustomername);
	    WebElement submitbutton2=	driver.findElement(By.xpath("//*[@type='submit']"));
	    Commonclass.Click(driver, submitbutton2);
	    WebElement clickoncustomer= driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]"));
		JavascriptExecutor moveuptocustomer = (JavascriptExecutor) driver;
		moveuptocustomer.executeScript("arguments[0].click();", clickoncustomer);
	 //  WebElement selectYes1=	driver.findElement(By.xpath("//*[text()='Yes']"));
	 //  Commonclass.Click(driver, selectYes1);
		WebElement clickonyes1= driver.findElement(By.xpath("//*[text()='Yes']"));
		JavascriptExecutor moveuptoyes1 = (JavascriptExecutor) driver;
		moveuptoyes1.executeScript("arguments[0].click();", clickonyes1);    
		WebElement clickontest= driver.findElement(By.xpath("(//*[text()='Rank:'])"));
	    JavascriptExecutor moveuptotestclient = (JavascriptExecutor) driver;
	    moveuptotestclient.executeScript("arguments[0].click();", clickontest);
	//	WebElement selectyes2=	driver.findElement(By.xpath("//*[text()='Yes']"));
	 //   Commonclass.Click(driver, selectyes2);
	    WebElement clickonyes2= driver.findElement(By.xpath("//*[text()='Yes']"));
		JavascriptExecutor moveuptoyes2 = (JavascriptExecutor) driver;  
		moveuptoyes2.executeScript("arguments[0].click();", clickonyes2);  
		WebElement clickonskip= driver.findElement(By.xpath("//*[text()='Skip']"));
	    JavascriptExecutor moveuptoskip = (JavascriptExecutor) driver;
	    moveuptoskip.executeScript("arguments[0].click();", clickonskip);
	    WebElement clickonpayment= driver.findElement(By.xpath("//*[text()='Agency Order ']"));
	    JavascriptExecutor moveuptopayment = (JavascriptExecutor) driver;
	    moveuptopayment.executeScript("arguments[0].click();", clickonpayment);
	    boolean checkokbutton = driver.findElement(By.xpath("//*[text()='OK']")).isDisplayed();
		if(checkokbutton){
			System.out.println("Entering Order page successfully");
		} else {
			System.out.println("Entering Order page failing");
		}
	    WebElement clickonOkwithclient=driver.findElement(By.xpath("//*[text()='OK']"));
	    Commonclass.Click(driver, clickonOkwithclient);
		
	}
	@Test(priority=4, enabled=true)
	public void  AddProductNeedsPicked() throws Exception
	{
		String	Testname="AddProductNeedsPicked";
		Thread.sleep(3000);
		WebElement selectaddproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
		 Commonclass.Click(driver, selectaddproduct);
		WebElement searchproduct=driver.findElement(By.xpath("//*[text()='Search Product to Add']"));
		Commonclass.Click(driver, searchproduct);
		WebElement clickonblaurfield=driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		 Commonclass.Click(driver, clickonblaurfield);
	    WebElement clickonblaur=	driver.findElement(By.xpath("//*[text()=' Blauer ']"));
		Commonclass.Click(driver, clickonblaur);
		WebElement clickonsizefield =driver.findElement(By.xpath("//*[@formcontrolname='manufacturerNum']"));
		Commonclass.Click(driver, clickonsizefield);
	    WebElement clickonsize=  driver.findElement(By.xpath("//*[text()=' 101 ']"));
	    Commonclass.Click(driver, clickonsize);
		WebElement clickonsearch =driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));
		Commonclass.Click(driver, clickonsearch);
		WebElement clickonbag=driver.findElement(By.xpath("(//*[text()=' SILENT PARTNER BAG '])"));
		Commonclass.Click(driver, clickonbag);
		WebElement clickonshowrelated=driver.findElement(By.xpath("(//ion-button[text()='Show Related '])[4]"));
		Commonclass.Click(driver, clickonshowrelated);
		WebElement clickonblack= driver.findElement(By.xpath("//*[text()=' BLACK ']"));
	    JavascriptExecutor moveuptoblack = (JavascriptExecutor) driver;
	    moveuptoblack.executeScript("arguments[0].click();", clickonblack);
	    WebElement addtoproductorder=	driver.findElement(By.xpath("//*[text()=' Add product to Order']"));
		Commonclass.Click(driver, addtoproductorder);
		WebElement clickneedsrevied=driver.findElement(By.xpath("//div[contains(text(),'Needs Picked')]"));
		Commonclass.Click(driver, clickneedsrevied);
	    WebElement clickonsuccessbutton=	driver.findElement(By.xpath("(//*[@color='success'])[6]"));
		Commonclass.Click(driver, clickonsuccessbutton);
		boolean Needspickedproduct = driver.findElement(By.xpath("(//*[@color='success'])[6]")).isEnabled();
		if(Needspickedproduct){
			System.out.println("Added Needspicked product successfuly");
		} else {
			System.out.println("Not Added Needspicked product successfuly");
		}
		 Reporter.log("Method Executed" + Testname);
//		 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
	}
	@Test(priority=5, enabled=true)
	public void AddProductNeedsPicked2() throws Exception
	{
		String	Testname="AddProductNeedsPicked2";
//		Thread.sleep(3000);
//		WebElement addproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
//		JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
//		moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
		  WebElement element= driver.findElement(By.xpath("//*[text()='Add Product ']"));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].click();", element);
	       WebElement clicksearch2=driver.findElement(By.xpath("//*[text()='Search Product to Add']"));
	       Commonclass.Click(driver, clicksearch2);
	      WebElement clickonblaurfield2=  driver.findElement(By.xpath("(//input[@type='text'])[7]"));
	      Commonclass.Click(driver, clickonblaurfield2);
	      WebElement clickonblaur2=driver.findElement(By.xpath("//span[text()=' Blauer ']"));
	      Commonclass.Click(driver, clickonblaur2);
	      WebElement clickonmanufacture = driver.findElement(By.xpath("//*[@formcontrolname='manufacturerNum']"));
	      Commonclass.Click(driver, clickonmanufacture);
	      WebElement clickonsize2=  driver.findElement(By.xpath("//span[text()=' 8600-Z ']"));
	       Commonclass.Click(driver, clickonsize2);
	      WebElement clickonsearch2= driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));
	       Commonclass.Click(driver, clickonsearch2);
	       WebElement clickonbalur2=driver.findElement(By.xpath("(//*[text()=' Blauer '])[2]"));
	       Commonclass.Click(driver, clickonbalur2);
	       WebElement showrelated2=driver.findElement(By.xpath("(//ion-button[text()='Show Related '])[2]"));
	       Commonclass.Click(driver, showrelated2);
	       Thread.sleep(3000);
	       WebElement selectvalue3=driver.findElement(By.xpath("(//div[@class='mat-select-value'])[3]"));
	       Commonclass.Click(driver, selectvalue3);
	     /*  WebElement selectvalue3 = driver.findElement(By.xpath("(//div[@class='mat-select-value'])[3]"));
		      JavascriptExecutor moveuptovalue3 = (JavascriptExecutor) driver;
		      moveuptovalue3.executeScript("arguments[0].click();", selectvalue3);   */
	       WebElement clickodarknavy=driver.findElement(By.xpath("//span[text()=' DARK NAVY ']"));
	      Commonclass.Click(driver, clickodarknavy);
	       WebElement clickonvalue4=driver.findElement(By.xpath("(//div[@class='mat-select-value'])[4]"));
	       Commonclass.Click(driver, clickonvalue4);
	      WebElement clickonsize= driver.findElement(By.xpath("//span[text()=' 15.5 ']"));
	       Commonclass.Click(driver, clickonsize);
	       WebElement selectvalue5=driver.findElement(By.xpath("(//div[@class='mat-select-value'])[5]"));
	       Commonclass.Click(driver, selectvalue5);
	       WebElement clickonsize3=driver.findElement(By.xpath("//span[text()=' 35 ']"));
	       Commonclass.Click(driver, clickonsize3);
	       WebElement cliconok=driver.findElement(By.xpath("//ion-button[text()='Ok']"));
	       Commonclass.Click(driver, cliconok);
	       Commonclass.Threadtime3sec(driver, cliconok);
	       WebElement product3=driver.findElement(By.xpath("(//tbody[@role='rowgroup'])[3]"));
	       Commonclass.Click(driver, product3);
	      WebElement clickonaddproduct2=driver.findElement(By.xpath("//*[text()=' Add product to Order']"));
	       Commonclass.Click(driver, clickonaddproduct2);
	       Commonclass.Threadtime2sec(driver, clickonaddproduct2);
	       WebElement selectcustomersize=  driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
	       Commonclass.Click(driver, selectcustomersize);
	       WebElement  selectneedsreviewed= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[4]")); 
	       Commonclass.Click(driver, selectneedsreviewed);
	       WebElement clickonsuccess2=driver.findElement(By.xpath("(//*[@color='success'])[6]"));
	       Commonclass.Click(driver, clickonsuccess2);
	       boolean Needspickedproduct2 = driver.findElement(By.xpath("(//*[@color='success'])[6]")).isEnabled();
			if(Needspickedproduct2){
				System.out.println("Added Needspicked product2 successfuly");
			} else {
				System.out.println("Not Added Needspicked product2 successfuly");
			}
	       Reporter.log("Method Executed" + Testname);
			// Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
		//Thread.sleep(3000);
		
	}	
	@Test(priority=6,enabled=true)
	public void AddProductNeedsPicked3() throws Exception
	{
		   String	Testname="AddProductNeedsPicked3";
	       WebElement element= driver.findElement(By.xpath("//*[text()='Add Product ']"));
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].click();", element);
	       WebElement clickonsearchproduct= driver.findElement(By.xpath("//*[text()='Search Product to Add']"));
	       Commonclass.Click(driver, clickonsearchproduct);
	       WebElement clickontext=  driver.findElement(By.xpath("(//input[@type='text'])[7]"));
	       Commonclass.Click(driver, clickontext);
	       WebElement clickonsavebutton=driver.findElement(By.xpath("//*[text()='Save']"));
	       Commonclass.Click(driver, clickonsavebutton);
	       Commonclass.Threadtime2sec(driver, clickonsavebutton);
	       WebElement clickontext2=  driver.findElement(By.xpath("(//input[@type='text'])[7]"));
	       Commonclass.Click(driver, clickontext2);
	       WebElement clickonblaur=driver.findElement(By.xpath("//span[text()=' Blauer ']"));
	       Commonclass.Click(driver, clickonblaur);
	       WebElement clickonmanufacture=driver.findElement(By.xpath("//*[@formcontrolname='manufacturerNum']"));
	       Commonclass.Click(driver, clickonmanufacture);
	       WebElement blaursize=   driver.findElement(By.xpath("//span[text()=' 8372 ']"));
	       Commonclass.Click(driver, blaursize);
	       WebElement clickonsearchbutton= driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));
	       Commonclass.Click(driver, clickonsearchbutton);
	       WebElement select1stone= driver.findElement(By.xpath("(//td[text()=' Blauer '])[1]"));
	       Commonclass.Click(driver, select1stone);
	       WebElement showrelatedproduct=  driver.findElement(By.xpath("(//ion-button[text()='Show Related '])[1]"));
	       Commonclass.Click(driver, showrelatedproduct);
	       Commonclass.Threadtime3sec(driver, showrelatedproduct);
	       WebElement  selectdarknavyfield= driver.findElement(By.xpath("(//div[@class='mat-select-value'])[3]")); 
	       Commonclass.Click(driver, selectdarknavyfield);
	       WebElement selectdarknavy= driver.findElement(By.xpath("//span[text()=' DARK NAVY ']"));
	       Commonclass.Click(driver, selectdarknavy);
	       WebElement smfiled=  driver.findElement(By.xpath("(//div[@class='mat-select-value'])[4]"));
	       Commonclass.Click(driver, smfiled);
	       WebElement clickonsm=driver.findElement(By.xpath("//span[text()=' SM ']"));
	       Commonclass.Click(driver, clickonsm);
	       WebElement Regfield=driver.findElement(By.xpath("(//div[@class='mat-select-value'])[5]"));
	       Commonclass.Click(driver, Regfield);
	       WebElement clickonreg=driver.findElement(By.xpath("//span[text()=' REG ']"));
	       Commonclass.Click(driver, clickonreg);
	       WebElement clickonOkbutton= driver.findElement(By.xpath("//ion-button[text()='Ok']"));
	       Commonclass.Click(driver, clickonOkbutton);
	       WebElement clickondarknavy1=driver.findElement(By.xpath("//td[text()=' DARK NAVY ']"));
	       Commonclass.Click(driver, clickondarknavy1);
	       WebElement clickonaddproduct=driver.findElement(By.xpath("//*[text()=' Add product to Order']"));
	       Commonclass.Click(driver, clickonaddproduct);
	       WebElement selectcustomersize=driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[2]"));
	       Commonclass.Click(driver, selectcustomersize);
	       WebElement clickonsuccess= driver.findElement(By.xpath("(//*[@color='success'])[6]"));
	       Commonclass.Click(driver, clickonsuccess);
	       boolean Needspickedproduct3 = driver.findElement(By.xpath("(//*[@color='success'])[6]")).isEnabled();
			if(Needspickedproduct3){
				System.out.println("Added Needspicked3 product successfuly");
			} else {
				System.out.println("Not Added Needspicked3 product successfuly");
			}
	       Thread.sleep(4000);
	       WebElement onecompletedproduct= driver.findElement(By.xpath("//*[text()='SS POLYESTER ARMORSKIN  BASE SHIRT ']"));
	       Commonclass.Click(driver, onecompletedproduct);
	       Commonclass.Threadtime2sec(driver, onecompletedproduct);
	       WebElement clickoncustomization=driver.findElement(By.xpath("//ion-button[text()='Customization']"));
	       Commonclass.Click(driver, clickoncustomization);
	       WebElement clickonAltration=driver.findElement(By.xpath("//ion-button[text()='Alteration']"));
	       Commonclass.Click(driver, clickonAltration);
	       WebElement alterationdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='alterationType']"));
	       String storealtratindropdown="Add Patch";
			Commonclass.Dropdown(driver, alterationdropdown, storealtratindropdown);
			Commonclass.Threadtime2sec(driver, alterationdropdown);
	    WebElement clicknext1= driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]"));
	    Commonclass.Click(driver, clicknext1);
	     WebElement patchdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchLocation']"));
	     String storepatchlocdropdown="Left Shoulder";
			Commonclass.Dropdown(driver, patchdropdown, storepatchlocdropdown);
	   WebElement clickonnext2=  driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]"));
	     Commonclass.Click(driver, clickonnext2);
	     WebElement clientpatchdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchType']"));
	     String storepatchtypendropdown="Client Patch";
	     Commonclass.Dropdown(driver, clientpatchdropdown, storepatchtypendropdown);
	    WebElement clickonnext3= driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]"));
	    Commonclass.Click(driver, clickonnext3);
	    WebElement selectembellishmentcode= driver.findElement(By.xpath("//input[@formcontrolname='embellishmentName']"));
	     Commonclass.Click(driver, selectembellishmentcode);
	    WebElement select1mage=driver.findElement(By.xpath("//span[text()=' Test Patch - ( CP000000772 ) ']"));
	     Commonclass.Click(driver, select1mage);
	   // WebElement clickonnext4=  driver.findElement(By.xpath("(//ion-button[text()='Next'])[4]"));
	    // Commonclass.Click(driver, clickonnext4);
	     WebElement clickonnext4buttoninalration=driver.findElement(By.xpath("(//ion-button[text()='Next'])[4]"));
	      	JavascriptExecutor moveuptonext4inaltration= (JavascriptExecutor) driver;
	      	moveuptonext4inaltration.executeScript("arguments[0].click();", clickonnext4buttoninalration);
	    WebElement clickonnotes= driver.findElement(By.xpath("//input[@formcontrolname='notes']"));
	     Commonclass.Click(driver, clickonnotes);
	     Commonclass.Threadtime2sec(driver, clickonnotes);
	    WebElement clickonFinish1= driver.findElement(By.xpath("//ion-button[text()='Finish']"));
	     Commonclass.Click(driver, clickonFinish1);
	    WebElement clickonembroidery= driver.findElement(By.xpath("//ion-button[text()=' Embroidery']"));
	     Commonclass.Click(driver, clickonembroidery);
	     WebElement Embroiderylocdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='embroideryLocation']"));
	     String storeembroideryloc="Left Chest";
	     Commonclass.Dropdown(driver, Embroiderylocdropdown, storeembroideryloc);
	     Commonclass.Threadtime2sec(driver, Embroiderylocdropdown);
	    WebElement Embroiderynext1=   driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]"));
	    Commonclass.Click(driver, Embroiderynext1);
	     WebElement Embroiderytypedropdown=   driver.findElement(By.xpath("//select[@formcontrolname='embroideryType']"));
	     String storeembroidertype="Client Embroidery";
	     Commonclass.Dropdown(driver, Embroiderytypedropdown, storeembroidertype);
	    WebElement Embroiderynext2= driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]"));
	    Commonclass.Click(driver, Embroiderynext2);
	    WebElement Embellishmentcode2= driver.findElement(By.xpath("//input[@formcontrolname='embellishmentName']"));
	    Commonclass.Click(driver, Embellishmentcode2);
	    WebElement click1image= driver.findElement(By.xpath("//span[text()=' Test Embroidery Name - ( EMB000000414 ) ']"));
	    Commonclass.Click(driver, click1image);
	    WebElement Embroiderynext3= driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]"));
	    Commonclass.Click(driver, Embroiderynext3);
	    WebElement clickonnotes2= driver.findElement(By.xpath("//input[@formcontrolname='notes']"));
	    Commonclass.Click(driver, clickonnotes2);
	    Commonclass.Threadtime2sec(driver, clickonnotes2);
	    WebElement clickonFinish2=driver.findElement(By.xpath("//ion-button[text()='Finish']"));
	    Commonclass.Click(driver, clickonFinish2);
	   WebElement clickonPrint=  driver.findElement(By.xpath("//ion-button[text()='Print']"));
	   Commonclass.Click(driver, clickonPrint);
	     WebElement printlocdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchLocation']"));
	     String storeprintpatchloc="Both Shoulders";
	     Commonclass.Dropdown(driver, printlocdropdown, storeprintpatchloc);
	     Commonclass.Threadtime2sec(driver, printlocdropdown);
	   WebElement clickonprintnext1=  driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]"));
	   Commonclass.Click(driver, clickonprintnext1);
	     WebElement printtypedropdown=   driver.findElement(By.xpath("//select[@formcontrolname='printType']"));
	     String storeprinttype="Client Print";
	     Commonclass.Dropdown(driver, printtypedropdown, storeprinttype);
	    WebElement clickonprintnext2 =driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]"));
	     Commonclass.Click(driver, clickonprintnext2);
	    WebElement selectembellishmentcode3= driver.findElement(By.xpath("//input[@formcontrolname='embellishmentName']"));
	     Commonclass.Click(driver, selectembellishmentcode3);
	    WebElement selectprintimage1= driver.findElement(By.xpath("//span[text()=' Test Client Print 1 - ( CPR000000004 ) ']"));
	     Commonclass.Click(driver, selectprintimage1);
	     WebElement elementt= driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]"));
	     JavascriptExecutor jss = (JavascriptExecutor) driver;
	     jss.executeScript("arguments[0].click();", elementt);
	    WebElement selectnotes3= driver.findElement(By.xpath("//input[@formcontrolname='notes']"));
	    Commonclass.Click(driver, selectnotes3);
	    Commonclass.Threadtime2sec(driver, selectnotes3);
	    WebElement Finish3= driver.findElement(By.xpath("//ion-button[text()='Finish']"));
	    Commonclass.Click(driver, Finish3);
	    Commonclass.Threadtime2sec(driver, Finish3);
	     WebElement clickVinylbutton=   driver.findElement(By.xpath("//ion-button[text()='Vinyl']"));
	     Commonclass.Click(driver, clickVinylbutton);
	     WebElement vinyllocdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchLocation']"));
	     String storevinylpatch="Both Shoulders";
	     Commonclass.Dropdown(driver, vinyllocdropdown, storevinylpatch);
	  WebElement clickonvinylnext1=   driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]"));
	  Commonclass.Click(driver, clickonvinylnext1);
	     WebElement vinyltypedropdown=   driver.findElement(By.xpath("//select[@formcontrolname='printType']"));
	     String storevinylprinttype="Client Vinyl";
	     Commonclass.Dropdown(driver, vinyltypedropdown, storevinylprinttype);
	  WebElement clickonvinylnext2= driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]"));
	  Commonclass.Click(driver, clickonvinylnext2);
	    WebElement Embellishmentcode3= driver.findElement(By.xpath("//input[@formcontrolname='embellishmentName']"));
	    Commonclass.Click(driver, Embellishmentcode3);
	 WebElement clickonaddnew=   driver.findElement(By.xpath("//*[text()='<ADD NEW> ']"));
	 Commonclass.Click(driver, clickonaddnew);
      WebElement clickonvinylnext3= driver.findElement(By.xpath("(//ion-button[text()='Next '])"));
	   Commonclass.Click(driver, clickonvinylnext3);
	   WebElement clickonuploadimage= driver.findElement(By.xpath("//*[text()='Upload Image']"));
	   Commonclass.Click(driver, clickonuploadimage);
	    Thread.sleep(2000);
	   	StringSelection ss = new StringSelection("C:\\Users\\ss21056\\eclipse-workspace\\PittisburghpublicsafetysupplyAutomation\\Lib\\Imagess\\Ce que j'aime de l'automne -  Natureimage B.jpg");
	       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	       Robot robot = new Robot();
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_ENTER);
	       robot.keyRelease(KeyEvent.VK_ENTER);
	       robot.keyPress(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_V);
	       robot.keyRelease(KeyEvent.VK_V);
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_ENTER);
	       Thread.sleep(2000);
	       robot.keyRelease(KeyEvent.VK_ENTER);
	       Thread.sleep(5000);
	     WebElement writeprintername1= driver.findElement(By.xpath("//*[@placeholder='Print Name']"));
	       String store1stname="testing";
			Commonclass.SendKeys(driver, writeprintername1, store1stname);
	      WebElement clickonok= driver.findElement(By.xpath("//*[text()='Ok']"));
	      Commonclass.Click(driver, clickonok);
	      Commonclass.Threadtime2sec(driver, clickonok);
	      WebElement clickonnextfinal =driver.findElement(By.xpath("//ion-button[text()='Next ']"));
	       Commonclass.Click(driver, clickonnextfinal);
	      WebElement writename2ndtime= driver.findElement(By.xpath("//*[@placeholder='Print Name']"));
	      String store2ndname="testing";
			Commonclass.SendKeys(driver, writename2ndtime, store2ndname);
	      WebElement clickonokfinal= driver.findElement(By.xpath("//*[text()='Ok']"));    
	       Commonclass.Click(driver, clickonokfinal);
	      // driver.findElement(By.xpath("(//*[text()='Cancel'])")).click();
	       WebElement clickoncancelbbutton=driver.findElement(By.xpath("(//*[text()='Cancel'])"));
	      	JavascriptExecutor moveuptocancel= (JavascriptExecutor) driver;
	      	moveuptocancel.executeScript("arguments[0].click();", clickoncancelbbutton);
	      	Commonclass.Threadtime2sec(driver, clickoncancelbbutton);
	      	 boolean Customization = driver.findElement(By.xpath("//*[text()='Done']")).isDisplayed();
  			if(Customization){
  				System.out.println("Customizatin done successfuly");
  			} else {
  				System.out.println("Customixzation not done successfuly");
  			}
	       WebElement clickondone=    driver.findElement(By.xpath("//*[text()='Done']"));
	       Commonclass.Click(driver, clickondone);
	       
	}
}
