package OperationsAppTasks;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class Task1828POSmoduleinMobileviewwithoutThread {

	public static WebDriver driver;
	public static Properties p1;
	@Test(priority=1,enabled=true)
	public void Createanorderwithpickedproducts() throws Exception
	{
	String	Testname="Createanorderwithpickedproducts";
    System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","--window-size=414,736");
		driver = new ChromeDriver(options); //"headless"
		FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
		p1 = new Properties();
		p1.load(fis);
		driver.get(p1.getProperty("URL"));
		options.setHeadless(true);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login=driver.findElement(By.xpath("//*[text()='Login']"));
		Commonclass.Click(driver, login);
		WebElement Email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
		String un=p1.getProperty("Username");
		Commonclass.SendKeys(driver, Email, un);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pwd=p1.getProperty("Password");
		Commonclass.SendKeys(driver, password, pwd);
		WebElement Loginbutton=driver.findElement(By.xpath("//ion-button[@type='submit']"));
		Commonclass.Click(driver, Loginbutton);
		boolean Loginbutton1 = driver.findElement(By.xpath("//ion-button[@type='submit']")).isEnabled();
		if(Loginbutton1){
			System.out.println("Login was done successfully");
		} else {
			System.out.println("Login was not done successfully");
		}
		Commonclass.Threadtime5sec(driver, Loginbutton);
		WebElement clickonIcon=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-home/ion-header/ion-toolbar/ion-buttons[1]"));
		Commonclass.Click(driver, clickonIcon);
		WebElement element= driver.findElement(By.xpath("//*[text()=' POS ']"));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].click();", element);
	        Commonclass.Threadtime2sec(driver, element);
	        WebElement viewelement= driver.findElement(By.xpath("//*[text()=' View ']"));
		    JavascriptExecutor moveuptoview = (JavascriptExecutor) driver;
		    moveuptoview.executeScript("arguments[0].click();", viewelement);
		    WebElement	selectlocation=driver.findElement(By.xpath("//*[text()='Neville Island']"));
		    Commonclass.Click(driver, selectlocation);
			WebElement Okay=driver.findElement(By.xpath("//*[text()='Okay']"));
			Commonclass.Click(driver, Okay);
	/*		boolean b=Okay.isDisplayed();
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
		    WebElement searchemail=	driver.findElement(By.xpath("//*[@id='form-group-input-4']"));
		    String email="01132021";
			Commonclass.SendKeys(driver, searchemail, email);
			WebElement submitbutton2=	driver.findElement(By.xpath("//*[@type='submit']"));
		    Commonclass.Click(driver, submitbutton2);
			WebElement clickonmatthew= driver.findElement(By.xpath("//*[text()='Sardar12345 ']"));
			//Commonclass.clickusingJavascript(driver, clickonmatthew);
			//Commonclass.WaitForElementclickable(driver, clickonmatthew);
		   JavascriptExecutor moveuptomatthew = (JavascriptExecutor) driver;
		   moveuptomatthew.executeScript("arguments[0].click();", clickonmatthew);
			WebElement clickonyes1= driver.findElement(By.xpath("//*[text()='Yes']"));
			JavascriptExecutor moveuptoyes1 = (JavascriptExecutor) driver;
			moveuptoyes1.executeScript("arguments[0].click();", clickonyes1); 
			Commonclass.Threadtime3sec(driver, clickonyes1);
			WebElement clickontest= driver.findElement(By.xpath("(//*[text()='Rank:'])"));
		    JavascriptExecutor moveuptotestclient = (JavascriptExecutor) driver;
		    moveuptotestclient.executeScript("arguments[0].click();", clickontest);
		    WebElement clickonyes2= driver.findElement(By.xpath("//*[text()='Yes']"));
			JavascriptExecutor moveuptoyes2 = (JavascriptExecutor) driver;  
			moveuptoyes2.executeScript("arguments[0].click();", clickonyes2);  
			WebElement clickonskip= driver.findElement(By.xpath("//*[text()='Skip']"));
		    JavascriptExecutor moveuptoskip = (JavascriptExecutor) driver;
		    moveuptoskip.executeScript("arguments[0].click();", clickonskip);
		    WebElement clickonpayment= driver.findElement(By.xpath("//*[text()='Agency Order ']"));
		    JavascriptExecutor moveuptopayment = (JavascriptExecutor) driver;
		    moveuptopayment.executeScript("arguments[0].click();", clickonpayment);
		    boolean Orderpage = driver.findElement(By.xpath("//*[text()='Agency Order ']")).isEnabled();
			if(Orderpage){
				System.out.println("Successfully Entered Orderpage");
			} else {
				System.out.println("Not Entered Orderpage");
			}
			WebElement clickonOkwithclient=driver.findElement(By.xpath("//*[text()='OK']"));
		    Commonclass.Click(driver, clickonOkwithclient);
			WebElement clickonislandbutton=driver.findElement(By.xpath("(//ion-icon[@aria-label='create'])[4]"));
			Commonclass.Click(driver, clickonislandbutton);
			WebElement ClickonIsland=driver.findElement(By.xpath("//ion-button[text()='Neville Island']"));
			Commonclass.Click(driver, ClickonIsland);
			WebElement Clickonpicbinlabel=driver.findElement(By.xpath("//*[text()='Pick BIN Label ']"));
			Commonclass.Click(driver, Clickonpicbinlabel);
			WebElement addproduct2= driver.findElement(By.xpath("//*[text()='Microsoft Print to PDF']"));
		    JavascriptExecutor jsee2 = (JavascriptExecutor) driver;
		    jsee2.executeScript("arguments[0].click();", addproduct2);
		    WebElement clickonprint=driver.findElement(By.xpath("//*[text()='Print ']"));
		    Commonclass.Click(driver, clickonprint);
		    Commonclass.Threadtime3sec(driver, clickonprint);
		    WebElement hiddenDivtag = driver.findElement(By.xpath("//span[@name='pickBinLabel']"));
		  	String nnn = hiddenDivtag.getText(); 
		  	String scripttt = "return arguments[0].innerText";
		  	nnn= (String) ((JavascriptExecutor) driver).executeScript(scripttt, hiddenDivtag);
		  	System.out.println(nnn);
	  	WebElement clickonAddpantsmodule=driver.findElement(By.xpath("//*[text()='Add Pants']"));
	  	Commonclass.Click(driver, clickonAddpantsmodule);
	  	Commonclass.Threadtime3sec(driver, clickonAddpantsmodule);
		//WebElement clickon1stcontaoiner=driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
		//Commonclass.Click(driver, clickon1stcontaoiner);
	  	WebElement clcikonradioyes1= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
	    JavascriptExecutor moveuptoradioyes = (JavascriptExecutor) driver;
	    moveuptoradioyes.executeScript("arguments[0].click();", clcikonradioyes1);
	    WebElement clickon3rdcontaoiner=driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[3]"));
		Commonclass.Click(driver, clickon3rdcontaoiner);
		WebElement clickonsuccessbutton=driver.findElement(By.xpath("(//ion-button[@color='success'])[6]"));
		Commonclass.Click(driver, clickonsuccessbutton);
		WebElement sendsomeprice=driver.findElement(By.xpath("//input[@type='number']"));
		String manualprice="12";
		Commonclass.SendKeys(driver, sendsomeprice, manualprice);
		WebElement clickonok3=driver.findElement(By.xpath("//span[text()='Ok']"));
		Commonclass.Click(driver, clickonok3);
		WebElement hiddenDiv = driver.findElement(By.xpath("//span[@name='ppssBarcode']"));
		String n = hiddenDiv.getText(); // does not work (returns "" as expected)
		String script = "return arguments[0].innerText";
		n= (String) ((JavascriptExecutor) driver).executeScript(script, hiddenDiv);
		System.out.println(n);
		WebElement sendppssbarcode=driver.findElement(By.xpath("//input[@name='upc']"));
		String storeppssbarcodenum=n;
		Commonclass.SendKeys(driver, sendppssbarcode, storeppssbarcodenum);
		WebElement clicksearchforppssscaning=driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));
		Commonclass.Click(driver, clicksearchforppssscaning);
		WebElement sendpicbinbarcode=driver.findElement(By.xpath("//input[@name='upc']"));
		String storepicbinbarcodeforscanning=nnn;
		Commonclass.SendKeys(driver, sendpicbinbarcode, storepicbinbarcodeforscanning);
		WebElement clcikonsearchforpicbin=driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));  
		Commonclass.Click(driver, clcikonsearchforpicbin);
		//Reporter.log("Method Executed" + Testname);
		//Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname); 
		 boolean status = driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).isEnabled();
			if(status){
				System.out.println("Added picked product successfully");
			} else {
				System.out.println("picked product was failing");
			}
			Commonclass.Threadtime5sec(driver, clcikonsearchforpicbin);
}
	@Test(priority=2,enabled=true)
	public void testAddproductmodule() throws Exception
	{
		WebElement addproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
		JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
		moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
		Commonclass.Threadtime3sec(driver, addproduct);
	    WebElement clickonaddproduct= driver.findElement(By.xpath("//*[text()='Add Product ']"));
		JavascriptExecutor moveuptoaddproduct = (JavascriptExecutor) driver;
		moveuptoaddproduct.executeScript("arguments[0].click();", clickonaddproduct);
		WebElement clickonsearchproduct=driver.findElement(By.xpath("//ion-button[text()='Search Product to Add']")); 
		Commonclass.Click(driver, clickonsearchproduct);
		WebElement clickontacticalfield=driver.findElement(By.xpath("(//div[@class='custom-select'])[1]"));
		Commonclass.Click(driver, clickontacticalfield);
		WebElement clickonTactical=driver.findElement(By.xpath("//*[text()=' 5.11 Tactical ']"));
		Commonclass.Click(driver, clickonTactical);
		WebElement clcikponnumfield=driver.findElement(By.xpath("(//div[@class='custom-select'])[2]"));
		Commonclass.Click(driver, clcikponnumfield);
		WebElement clcikonnum=driver.findElement(By.xpath("//*[text()=' 10011 ']"));
		Commonclass.Click(driver, clcikonnum);
		WebElement clcikonsubmit=driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
		Commonclass.Click(driver, clcikonsubmit);
		WebElement clickontactical=driver.findElement(By.xpath("//td[text()=' 5.11 Tactical ']"));
		Commonclass.Click(driver, clickontactical);
		WebElement clickonshowrelated=driver.findElement(By.xpath("//*[text()='Show Related ']"));
		Commonclass.Click(driver, clickonshowrelated);
//		driver.findElement(By.xpath("(//*[text()=' FOLIAGE '])[1]")).click();
		WebElement clickonproduct1= driver.findElement(By.xpath("(//*[text()=' FOLIAGE '])[1]"));
		JavascriptExecutor moveuptoproduct1 = (JavascriptExecutor) driver;
		moveuptoproduct1.executeScript("arguments[0].click();", clickonproduct1);
		WebElement clcikonaddproduct1=driver.findElement(By.xpath("(//*[text()=' Add product to Order'])[1]"));
		Commonclass.Click(driver, clcikonaddproduct1);
		WebElement clickonradiobuttoon3=driver.findElement(By.xpath("(//*[@class='mat-radio-container'])[3]"));
		Commonclass.Click(driver, clickonradiobuttoon3);
		WebElement clcikonsuccessbutton=driver.findElement(By.xpath("(//*[@color='success'])[6]"));
		Commonclass.Click(driver, clcikonsuccessbutton);
		boolean status = driver.findElement(By.xpath("(//*[@color='success'])[6]")).isEnabled();
		if(status){
			System.out.println("By Using Addproduct button product added successfully");
		} else {
			System.out.println("By Using Addproduct button product was not added successfully");
		}
		Commonclass.Threadtime5sec(driver, clcikonsuccessbutton);
	}
	@Test(priority=3,enabled=true)
	public void testAddshirtmodule() throws Exception
	{
		WebElement addproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
		JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
		moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
		Commonclass.Threadtime3sec(driver, addproduct);
	    WebElement clickonaddshirt= driver.findElement(By.xpath("//*[text()='Add Shirt']"));
		JavascriptExecutor moveuptoaddshirt = (JavascriptExecutor) driver;
		moveuptoaddshirt.executeScript("arguments[0].click();", clickonaddshirt);
		Commonclass.Threadtime3sec(driver, clickonaddshirt);
		//WebElement clickondropshipbutton=driver.findElement(By.xpath("(//*[@class='mat-radio-container'])[3]"));
		//Commonclass.Click(driver, clickondropshipbutton);
		WebElement clickoncontainer3= driver.findElement(By.xpath("(//*[@class='mat-radio-container'])[3]"));
		JavascriptExecutor moveuptocontainer3 = (JavascriptExecutor) driver;
		moveuptocontainer3.executeScript("arguments[0].click();", clickoncontainer3);
		WebElement clickonsuccess=driver.findElement(By.xpath("(//*[@color='success'])[6]"));
		Commonclass.Click(driver, clickonsuccess);
		boolean status = driver.findElement(By.xpath("(//*[@color='success'])[6]")).isEnabled();
		if(status){
			System.out.println("By Using Addshirt button product added successfully");
		} else {
			System.out.println("By Using Addshirt button product was not added successfully");
		}
		Commonclass.Threadtime5sec(driver, clickonsuccess);
	}
	@Test(priority=4,enabled=true)
	public void Testmodule() throws Exception
	{
		WebElement addproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
		JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
		moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
	    Commonclass.Threadtime3sec(driver, addproduct);
		WebElement clcikonTestbutton=driver.findElement(By.xpath("//*[text()='test']"));
		Commonclass.Click(driver, clcikonTestbutton);
		Commonclass.Threadtime3sec(driver, clcikonTestbutton);
		WebElement droptocustomerbutton=driver.findElement(By.xpath("(//*[@class='mat-radio-container'])[3]"));
		JavascriptExecutor moveuptodropcustomer = (JavascriptExecutor) driver;
		moveuptodropcustomer.executeScript("arguments[0].click();", droptocustomerbutton);
		WebElement clickonsuccessfottestmodule=driver.findElement(By.xpath("(//*[@color='success'])[6]"));
		Commonclass.Click(driver, clickonsuccessfottestmodule);
		boolean status = driver.findElement(By.xpath("(//*[@color='success'])[6]")).isEnabled();
		if(status){
			System.out.println("By Using Test button product added successfully");
		} else {
			System.out.println("By Using Test button product was not added successfully");
		}
		Commonclass.Threadtime5sec(driver, clickonsuccessfottestmodule);
	}
	@Test(priority=5,enabled=true)
	public void testFlashlightmodule() throws Exception
	{
		WebElement addproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
		JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
		moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
		Commonclass.Threadtime3sec(driver, addproduct);
		WebElement clickonflashlight=driver.findElement(By.xpath("//*[text()='Add Flashlight']"));
		JavascriptExecutor moveuptoflashlight = (JavascriptExecutor) driver;
		moveuptoflashlight.executeScript("arguments[0].click();", clickonflashlight);
		Commonclass.Threadtime3sec(driver, clickonflashlight);
		WebElement droptocustomerbutton=driver.findElement(By.xpath("(//*[@class='mat-radio-container'])[3]"));
		JavascriptExecutor moveuptodropcustomer = (JavascriptExecutor) driver;
		moveuptodropcustomer.executeScript("arguments[0].click();", droptocustomerbutton);
		WebElement clcikonsuccessforflashlight=driver.findElement(By.xpath("(//*[@color='success'])[6]"));
		Commonclass.Click(driver, clcikonsuccessforflashlight);
		boolean status = driver.findElement(By.xpath("(//*[@color='success'])[6]")).isEnabled();
		if(status){
			System.out.println("By Using Flashlight button product added successfully");
		} else {
			System.out.println("By Using Flashlight button product was not added successfully");
		}
		Commonclass.Threadtime5sec(driver, clcikonsuccessforflashlight);
	}
	@Test(priority=6,enabled=true)
	public void Testcustomization() throws Exception
	{
		WebElement select1stone=driver.findElement(By.xpath("(//*[@class='product'])[5]"));
		JavascriptExecutor moveupto1stproduct = (JavascriptExecutor) driver;
		moveupto1stproduct.executeScript("arguments[0].click();", select1stone);
		Commonclass.Threadtime3sec(driver, select1stone);
		WebElement clickoncustomization=driver.findElement(By.xpath("//ion-button[text()='Customization']"));
	    Commonclass.Click(driver, clickoncustomization);
	    Commonclass.Threadtime3sec(driver, clickoncustomization);
	    WebElement clickonAltration=driver.findElement(By.xpath("//*[text()='Alteration']"));
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
	   // WebElement select1mage=driver.findElement(By.xpath("//span[text()=' UPMC Police Emblem - ( CP000000012 ) ']"));
	   // Commonclass.Click(driver, select1mage);  // Test Patch - ( CP000000772 ) 
	    WebElement select1mage=driver.findElement(By.xpath("//span[text()=' Test Patch - ( CP000000772 ) ']"));
		Commonclass.Click(driver, select1mage);
	    WebElement clickonnext4= driver.findElement(By.xpath("(//ion-button[text()='Next'])[4]"));
	    JavascriptExecutor moveuptonext4 = (JavascriptExecutor) driver;
	    moveuptonext4.executeScript("arguments[0].click();", clickonnext4);
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
	   // WebElement Embroiderynext3= driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]"));
	   // Commonclass.Click(driver, Embroiderynext3);
	    WebElement selectonEmbroiderynext3=driver.findElement(By.xpath("(//ion-button[text()='Next'])[3]"));
		JavascriptExecutor moveuptoEmbroiderynext3 = (JavascriptExecutor) driver;
		moveuptoEmbroiderynext3.executeScript("arguments[0].click();", selectonEmbroiderynext3);
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
	    WebElement clcikonvinyl= driver.findElement(By.xpath("//*[text()='Vinyl']"));
	    JavascriptExecutor moveuptovinyl = (JavascriptExecutor) driver;
	    moveuptovinyl.executeScript("arguments[0].click();", clcikonvinyl);
	    WebElement vinyllocdropdown=   driver.findElement(By.xpath("//select[@formcontrolname='patchLocation']"));
	    String storevinylpatch="Both Shoulders";
	    Commonclass.Dropdown(driver, vinyllocdropdown, storevinylpatch);
	    Commonclass.Threadtime2sec(driver, vinyllocdropdown);
	    WebElement clickonvinylnext1=   driver.findElement(By.xpath("(//ion-button[text()='Next'])[1]"));
	    Commonclass.Click(driver, clickonvinylnext1);
	    WebElement vinyltypedropdown=   driver.findElement(By.xpath("//select[@formcontrolname='printType']"));
	    String storevinylprinttype="Client Vinyl";
	    Commonclass.Dropdown(driver, vinyltypedropdown, storevinylprinttype);
	    WebElement clickonvinylnext2= driver.findElement(By.xpath("(//ion-button[text()='Next'])[2]"));
	    Commonclass.Click(driver, clickonvinylnext2);
	    WebElement Embellishmentcode3= driver.findElement(By.xpath("//*[@formcontrolname='embellishmentName']"));
	    Commonclass.Click(driver, Embellishmentcode3);
	    WebElement clcikonimageforvinyl=driver.findElement(By.xpath("//*[text()=' Test Client Vinyl 1 - ( CV000000009 ) ']"));
	    Commonclass.Click(driver, clcikonimageforvinyl);
	    Commonclass.Threadtime3sec(driver, clcikonimageforvinyl);
	   // driver.findElement(By.xpath("(//*[text()='Next'])[3]")).click();
	    WebElement clickonnext3invinyl=driver.findElement(By.xpath("(//*[text()='Next'])[3]"));
	    JavascriptExecutor moveuptonext3invinyl= (JavascriptExecutor) driver;
	    moveuptonext3invinyl.executeScript("arguments[0].click();", clickonnext3invinyl);
	    WebElement clickoncancelbbutton=driver.findElement(By.xpath("(//*[text()='Cancel'])"));
	    JavascriptExecutor moveuptocancel= (JavascriptExecutor) driver;
	    moveuptocancel.executeScript("arguments[0].click();", clickoncancelbbutton);
	    Commonclass.Threadtime2sec(driver, clickoncancelbbutton);
	    WebElement selectdone=driver.findElement(By.xpath("//*[text()='Done']"));
		JavascriptExecutor moveuptodonebutton = (JavascriptExecutor) driver;
		moveuptodonebutton.executeScript("arguments[0].scrollIntoView();", selectdone);
		boolean customizatinbutton = driver.findElement(By.xpath("//*[text()='Done']")).isDisplayed();
		if(customizatinbutton){
			System.out.println("Customization done successfully");
		} else {
			System.out.println("Customization not done successfully");
		} 
		Commonclass.Threadtime2sec(driver, selectdone);
	    WebElement clickondone=    driver.findElement(By.xpath("//*[text()='Done']"));
	    Commonclass.Click(driver, clickondone);   
	    Commonclass.Threadtime5sec(driver, clickondone);
	 /* WebElement selectcustomizedproduct=driver.findElement(By.xpath("(//*[@class='product'])[5]"));
		JavascriptExecutor moveuptocustomizedproduct = (JavascriptExecutor) driver;
		moveuptocustomizedproduct.executeScript("arguments[0].scrollIntoView();", selectcustomizedproduct);  */
	    WebElement selectproduct2ndtime=driver.findElement(By.xpath("(//*[@class='product'])[5]"));
		JavascriptExecutor moveuptoproduct2ndtime = (JavascriptExecutor) driver;
		moveuptoproduct2ndtime.executeScript("arguments[0].click();", selectproduct2ndtime);
		Commonclass.Threadtime3sec(driver, selectproduct2ndtime);
		WebElement clickonround=driver.findElement(By.xpath("//*[@class='slider round']"));
		Commonclass.Click(driver, clickonround);
		WebElement taxpurposedropdown=   driver.findElement(By.xpath("//select[@class='form-control custom-select ng-untouched ng-pristine ng-valid']"));
		String storetaxpurposedropdown="test123";
		Commonclass.Dropdown(driver, taxpurposedropdown, storetaxpurposedropdown);
		Commonclass.Threadtime2sec(driver, taxpurposedropdown);
	    WebElement selectclose=driver.findElement(By.xpath("//*[text()='Close']"));
		JavascriptExecutor moveuptoclosebutton = (JavascriptExecutor) driver;
		moveuptoclosebutton.executeScript("arguments[0].scrollIntoView();", selectclose);
		Commonclass.Threadtime3sec(driver, taxpurposedropdown);
		WebElement select3rdradiobutton=driver.findElement(By.xpath("(//*[@class='mat-radio-outer-circle'])[3]"));
	    JavascriptExecutor moveupto3rdradiobutton = (JavascriptExecutor) driver;
		moveupto3rdradiobutton.executeScript("arguments[0].click();", select3rdradiobutton);
		WebElement clickonopeencalender=driver.findElement(By.xpath("//*[@aria-label='Open calendar']"));
		Commonclass.Click(driver, clickonopeencalender);
		WebElement clickon13thdate=driver.findElement(By.xpath("//*[text()='31']"));
		Commonclass.Click(driver, clickon13thdate);
		WebElement clickonUpdate=driver.findElement(By.xpath("//*[text()='UPDATE']"));
		Commonclass.Click(driver, clickonUpdate);
		boolean Selecteddate = driver.findElement(By.xpath("//*[text()='UPDATE']")).isEnabled();
		if(Selecteddate){
			System.out.println("For Delivering selected particular date");
		} else {
			System.out.println("For Delivering not selected particular date");
		}       
		Commonclass.Threadtime5sec(driver, clickonUpdate);     
}
	@Test(priority=7,enabled=true)
	public void testOrderActions() throws Exception
	{
		WebElement addproduct=driver.findElement(By.xpath("//*[text()='Add Product ']"));
		JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
		moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
		Commonclass.Threadtime3sec(driver, addproduct);
		WebElement clickonOrderActions=driver.findElement(By.xpath("//*[text()=' Order Actions']"));
		Commonclass.Click(driver, clickonOrderActions);
		WebElement clickonchangeordertype=driver.findElement(By.xpath("//*[text()=' Change Order Type']"));
		Commonclass.Click(driver, clickonchangeordertype);
		WebElement clickonAgencyorder=driver.findElement(By.xpath("//*[text()='Agency Order']"));
		Commonclass.Click(driver, clickonAgencyorder);
		WebElement clcikonCancel=driver.findElement(By.xpath("//*[text()='Cancel']"));
		Commonclass.Click(driver, clcikonCancel);
		WebElement clickonPoinfo=driver.findElement(By.xpath("//*[text()='PO Info']"));
		Commonclass.Click(driver, clickonPoinfo);
		WebElement sendpoinfonum= driver.findElement(By.xpath("(//*[@type='text'])[7]"));
		String storevinylpatch="123";
	    Commonclass.SendKeys(driver, sendpoinfonum, storevinylpatch);
		WebElement clickonsave=driver.findElement(By.xpath("//*[text()='Save']"));
		Commonclass.Click(driver, clickonsave);
		Commonclass.Threadtime2sec(driver, clickonsave);
		WebElement clickonnotes=driver.findElement(By.xpath("//*[text()='Order Notes']"));
		Commonclass.Click(driver, clickonnotes);
		WebElement sendsomenotes=driver.findElement(By.xpath("//*[@data-placeholder='Insert text here ...']"));
		String storesomenotes="Doing Testing";
	    Commonclass.SendKeys(driver, sendsomenotes, storesomenotes);
		boolean Orderactions = driver.findElement(By.xpath("//*[text()='Ok']")).isDisplayed();
		if(Orderactions){
			System.out.println("Order Actions done successfully");
		} else {
			System.out.println("Order Actions done successfully");
		}
		WebElement clickonok=driver.findElement(By.xpath("//*[text()='Ok']"));
		Commonclass.Click(driver, clickonok);
		Commonclass.Threadtime5sec(driver, clickonok);
	}
	@Test(priority=8,enabled=true)
	public void testuploaddocument() throws Exception
	{
		 driver.findElement(By.xpath("//*[text()='Upload Image or Document']")).click();
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
		    System.out.println("Uploading was done successfully");
	}
	@Test(priority=9,enabled=true)
	public void testUserActions() throws Exception
	{
		Thread.sleep(5000);
		WebElement selectUseractions=driver.findElement(By.xpath("(//*[text()='Edit'])[1]"));
		JavascriptExecutor moveuptoUserActions = (JavascriptExecutor) driver;
		moveuptoUserActions.executeScript("arguments[0].scrollIntoView();", selectUseractions);
		Commonclass.Threadtime3sec(driver, selectUseractions);
		WebElement clcikonEdit1=driver.findElement(By.xpath("(//*[text()='Edit'])[1]"));
		Commonclass.Click(driver, clcikonEdit1);
		Commonclass.Threadtime2sec(driver, clcikonEdit1);
		WebElement clearfirstname=driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
		Commonclass.clear(driver, clearfirstname);
    	String enternewname="Sardar12345";
    	Commonclass.SendKeys(driver, clearfirstname, enternewname); 
	    WebElement clickonupdatebutton=driver.findElement(By.xpath("//*[text()='Update']"));
		JavascriptExecutor moveuptoupdatebutton= (JavascriptExecutor) driver;
		moveuptoupdatebutton.executeScript("arguments[0].click();", clickonupdatebutton);
		Commonclass.Threadtime3sec(driver, clickonupdatebutton);
		WebElement storeuseractions=driver.findElement(By.xpath("//*[text()='User Actions ']"));
		JavascriptExecutor moveuptoUserActions3 = (JavascriptExecutor) driver;
		moveuptoUserActions3.executeScript("arguments[0].scrollIntoView();", storeuseractions);
		Commonclass.Threadtime2sec(driver, storeuseractions);
		WebElement storeuseractions4=driver.findElement(By.xpath("//*[text()='User Actions ']"));
		JavascriptExecutor moveuptoUserActions4 = (JavascriptExecutor) driver;
		moveuptoUserActions4.executeScript("arguments[0].click();", storeuseractions4);
		WebElement clickonviewAuthorizeditems=driver.findElement(By.xpath("//*[text()='View Authorized Items']"));
		Commonclass.Click(driver, clickonviewAuthorizeditems);
		WebElement clickonUniformspecproduct=driver.findElement(By.xpath("(//*[text()='Uniform Spec Products'])[1]"));
		Commonclass.Click(driver, clickonUniformspecproduct);
		WebElement clickonadd1=driver.findElement(By.xpath("(//*[@name='add'])[1]"));
		Commonclass.Click(driver, clickonadd1);
		Commonclass.Threadtime2sec(driver, clickonadd1);
		WebElement clickonlszipped=driver.findElement(By.xpath("(//*[text()=' LS ZIPPERED POLYESTER SHIRT (15/39, dark navy) 8600-Z '])"));
		Commonclass.Click(driver, clickonlszipped);
		Commonclass.Threadtime3sec(driver, clickonlszipped);
		WebElement clickonshowrelated=driver.findElement(By.xpath("(//*[text()='Show Related '])[1]"));
		Commonclass.Click(driver, clickonshowrelated);
		Commonclass.Threadtime3sec(driver, clickonshowrelated);
		WebElement store1stprooduct=driver.findElement(By.xpath("//*[text()=' BLACK ']"));
		JavascriptExecutor moveupto1stproduct = (JavascriptExecutor) driver;
		moveupto1stproduct.executeScript("arguments[0].click();", store1stprooduct);
		WebElement clickonAddproducttoorder=driver.findElement(By.xpath("(//*[text()=' Add product to Order'])[1]"));
		Commonclass.Click(driver, clickonAddproducttoorder);
		Commonclass.Threadtime2sec(driver, clickonAddproducttoorder);
		WebElement clickonradiobutton3=driver.findElement(By.xpath("(//*[@class='mat-radio-container'])[3]"));
		Commonclass.Click(driver, clickonradiobutton3);
		WebElement clickonsuccess=driver.findElement(By.xpath("(//*[@color='success'])[3]"));
		Commonclass.Click(driver, clickonsuccess);
		boolean Useractions = driver.findElement(By.xpath("(//*[@color='success'])[3]")).isEnabled();
		if(Useractions){
			System.out.println("User Actions done successfully");
		} else {
			System.out.println("User Actions not done successfully");
		}
		Commonclass.Threadtime5sec(driver, clickonsuccess);
		WebElement select2ndUseractions=driver.findElement(By.xpath("//*[text()='User Actions ']"));
		JavascriptExecutor moveuptoUserActions2 = (JavascriptExecutor) driver;
		moveuptoUserActions2.executeScript("arguments[0].scrollIntoView();", select2ndUseractions);
		Commonclass.Threadtime3sec(driver, select2ndUseractions);
		WebElement select2ndUseractionsedits=driver.findElement(By.xpath("(//*[text()='Edit'])[2]"));
		JavascriptExecutor moveuptoUserActionsedit22 = (JavascriptExecutor) driver;
		moveuptoUserActionsedit22.executeScript("arguments[0].click();", select2ndUseractionsedits);
		Commonclass.Threadtime2sec(driver, select2ndUseractionsedits);
		WebElement clickonAddnewrank=driver.findElement(By.xpath("//*[text()='Add New Rank Or Title']"));
		Commonclass.Click(driver, clickonAddnewrank);
		WebElement clickontext1=driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		Commonclass.Click(driver, clickontext1);
		WebElement clickoncheckbox2=driver.findElement(By.xpath("(//*[@role='checkbox'])[2]"));
		Commonclass.Click(driver, clickoncheckbox2);
		Commonclass.Threadtime3sec(driver, clickoncheckbox2);
		WebElement selectassignment=driver.findElement(By.xpath("//*[text()='Add New Assignment']"));
		JavascriptExecutor moveuptoassignment = (JavascriptExecutor) driver;
		moveuptoassignment.executeScript("arguments[0].scrollIntoView();", selectassignment);
		Commonclass.Threadtime2sec(driver, selectassignment);
		WebElement clickonaddnewassignement=driver.findElement(By.xpath("//*[text()='Add New Assignment']"));
		Commonclass.Click(driver, clickonaddnewassignement);
		WebElement clickontext2=driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		Commonclass.Click(driver, clickontext2);
		WebElement clickoncheckbox28=driver.findElement(By.xpath("(//*[@role='checkbox'])[6]"));
		Commonclass.Click(driver, clickoncheckbox28);
		WebElement Clickonsavebutton= driver.findElement(By.xpath("//*[text()='Save']"));
		JavascriptExecutor moveuptosave = (JavascriptExecutor) driver;
		moveuptosave.executeScript("arguments[0].click();", Clickonsavebutton);
		boolean Clientactions = driver.findElement(By.xpath("//*[text()='Save']")).isEnabled();
		if(Clientactions){
			System.out.println("Client Actions done successfully");
		} else {
			System.out.println("Client Actions not done successfully");
		}
		Commonclass.Threadtime3sec(driver, Clickonsavebutton);
		WebElement selectclientactions=driver.findElement(By.xpath("//*[text()='Client Actions ']"));
		JavascriptExecutor moveuptoclientactions = (JavascriptExecutor) driver;
		moveuptoclientactions.executeScript("arguments[0].scrollIntoView();", selectclientactions);
		Commonclass.Threadtime2sec(driver, selectclientactions);
		WebElement clickoncreate2=driver.findElement(By.xpath("(//*[@name='create'])[2]"));
		Commonclass.Click(driver, clickoncreate2);
	    WebElement Clickonradiobutton= driver.findElement(By.xpath("//*[@class='mat-radio-outer-circle']"));
		JavascriptExecutor moveuptoradio = (JavascriptExecutor) driver;
		moveuptoradio.executeScript("arguments[0].click();", Clickonradiobutton);
		WebElement clickonupdatebutton2=driver.findElement(By.xpath("//*[text()='Update']"));
		Commonclass.Click(driver, clickonupdatebutton2);
		Commonclass.Threadtime5sec(driver, clickonupdatebutton2);
	}
	@Test(priority=10,enabled=true)
	public void testCheckoutmodule() throws Exception
	{
		WebElement ClickCheckout= driver.findElement(By.xpath("//ion-button[text()=' Checkout']"));
		JavascriptExecutor clickanylocation = (JavascriptExecutor) driver;
		clickanylocation.executeScript("arguments[0].click();", ClickCheckout);
		Commonclass.Threadtime3sec(driver, ClickCheckout);
		WebElement clickonmore1=driver.findElement(By.xpath("(//*[text()='more_vert'])[1]"));
		Commonclass.Click(driver, clickonmore1);
	    WebElement Edit3=driver.findElement(By.xpath("(//*[text()='Edit'])[3]"));
		Commonclass.Click(driver, Edit3);
		WebElement clickontext7=driver.findElement(By.xpath("(//*[@type='number'])[7]"));
		Commonclass.clear(driver, clickontext7);
    	String enternewnum="2";
    	Commonclass.SendKeys(driver, clickontext7, enternewnum); 
		WebElement clcikonupdate2=driver.findElement(By.xpath("//*[text()='Update']"));
		Commonclass.Click(driver, clcikonupdate2);
		WebElement clickontext7for2nd=driver.findElement(By.xpath("(//*[@type='number'])[7]"));
		Commonclass.clear(driver, clickontext7);
    	String enternewnumm="1";
    	Commonclass.SendKeys(driver, clickontext7for2nd, enternewnumm); 
		WebElement clcikonupdate3=driver.findElement(By.xpath("//*[text()='Update']"));
		Commonclass.Click(driver, clcikonupdate3);
		Commonclass.Threadtime3sec(driver, clcikonupdate3);
		WebElement Clickverify= driver.findElement(By.xpath("//ion-button[text()='Verify']"));
		JavascriptExecutor clickany = (JavascriptExecutor) driver;
		clickany.executeScript("arguments[0].click();", Clickverify);
		Commonclass.Threadtime5sec(driver, Clickverify);
		WebElement clickonarrow1=driver.findElement(By.xpath("(//*[@name='arrow-round-forward'])[1]")); 
		Commonclass.Click(driver, clickonarrow1);
		WebElement clickonarrow2=driver.findElement(By.xpath("(//*[@name='arrow-round-forward'])[1]"));
		Commonclass.Click(driver, clickonarrow2);
		WebElement clickonarrow3=driver.findElement(By.xpath("(//*[@name='arrow-round-forward'])[1]"));
		Commonclass.Click(driver, clickonarrow3);
		//WebElement clickonNext1=driver.findElement(By.xpath("//ion-button[text()='Next']"));
		//Commonclass.Click(driver, clickonNext1);
		WebElement Clickonnextaftermovingrightside= driver.findElement(By.xpath("//ion-button[text()='Next']"));
		JavascriptExecutor moveuptonextafteraddingrightside = (JavascriptExecutor) driver;
		moveuptonextafteraddingrightside.executeScript("arguments[0].click();", Clickonnextaftermovingrightside);
		WebElement clcikonDeliverorder=driver.findElement(By.xpath("//*[text()='Deliver the order to the customer']"));
		Commonclass.Click(driver, clcikonDeliverorder);
		WebElement moverightside=driver.findElement(By.xpath("(//*[@class='mat-tab-label-content'])[2]"));
		Commonclass.Click(driver, moverightside);
		WebElement moveleftside=driver.findElement(By.xpath("(//*[@class='mat-tab-label-content'])[1]"));
		Commonclass.Click(driver, moveleftside);
		WebElement Edit4=driver.findElement(By.xpath("(//*[text()='Edit'])[3]"));
		Commonclass.Click(driver, Edit4);
		Commonclass.Threadtime2sec(driver, Edit4);
		WebElement storesave=driver.findElement(By.xpath("(//*[text()='Back'])[2]"));
		JavascriptExecutor moveuptoSavebutton = (JavascriptExecutor) driver;
		moveuptoSavebutton.executeScript("arguments[0].scrollIntoView();", storesave);
		Commonclass.Threadtime3sec(driver, storesave);
		WebElement sendaddressline1=driver.findElement(By.xpath("//*[@placeholder='Address Line 1']"));
		Commonclass.clear(driver, sendaddressline1);
    	String storeaddressline1="Automation";
    	Commonclass.SendKeys(driver, sendaddressline1, storeaddressline1); 
		WebElement sendaddressline2=driver.findElement(By.xpath("//*[@placeholder='Address Line 2']"));
		Commonclass.clear(driver, sendaddressline2);
    	String storeaddressline2="Testing";
    	Commonclass.SendKeys(driver, sendaddressline2, storeaddressline2); 
		WebElement clickoncity=driver.findElement(By.xpath("//*[@placeholder='City']"));
		Commonclass.clear(driver, clickoncity);
    	String storecity="Integrationtesting";
    	Commonclass.SendKeys(driver, clickoncity, storecity); 
		WebElement clcikonstate=driver.findElement(By.xpath("//*[@placeholder='State']"));
		Commonclass.clear(driver, clcikonstate);
    	String storestate=" Alabama ";
    	Commonclass.SendKeys(driver, clcikonstate, storestate); 
		WebElement sendphonenum=driver.findElement(By.xpath("//*[@placeholder='Phone']"));
		Commonclass.clear(driver, sendphonenum);
    	String storephone="1234567890";
    	Commonclass.SendKeys(driver, sendphonenum, storephone);
    	WebElement selectcheckbox1formoving=driver.findElement(By.xpath("(//*[@role='checkbox'])[1]"));
		JavascriptExecutor moveuptocheckbox1 = (JavascriptExecutor) driver;
		moveuptocheckbox1.executeScript("arguments[0].scrollIntoView();", selectcheckbox1formoving);
		WebElement sendzipcode=driver.findElement(By.xpath("//*[@placeholder='Zip Code']"));
		Commonclass.clear(driver, sendzipcode);
    	String storezipcode="10003";
    	Commonclass.SendKeys(driver, sendzipcode, storezipcode); 
		WebElement clickoncheckbox1time=driver.findElement(By.xpath("(//*[@role='checkbox'])[1]"));
		Commonclass.Click(driver, clickoncheckbox1time);
		WebElement clickoncheckbox2time=driver.findElement(By.xpath("(//*[@role='checkbox'])[1]"));
		Commonclass.Click(driver, clickoncheckbox2time);
		WebElement clickonupdate4=driver.findElement(By.xpath("(//*[text()='Update'])"));
		Commonclass.Click(driver, clickonupdate4);
		Commonclass.Threadtime5sec(driver, clickonupdate4);
		WebElement selectedit3=driver.findElement(By.xpath("(//*[text()='Edit'])[3]"));
		JavascriptExecutor moveuptoedit3 = (JavascriptExecutor) driver;
		moveuptoedit3.executeScript("arguments[0].scrollIntoView();", selectedit3);
		Commonclass.Threadtime2sec(driver, selectedit3);
		WebElement clickonIntegration=driver.findElement(By.xpath("//*[text()=' Integrationtesting ']"));
		Commonclass.Click(driver, clickonIntegration);
		Commonclass.Threadtime3sec(driver, clickonIntegration);
		WebElement clickoncreditcard=driver.findElement(By.xpath("//*[text()='Credit Card']"));
		Commonclass.Click(driver, clickoncreditcard);
		WebElement clickonPaywithstripe=driver.findElement(By.xpath("//*[text()='Pay With Stripe']"));
		Commonclass.Click(driver, clickonPaywithstripe);
		WebElement clickanderasetodaldata=driver.findElement(By.xpath("//*[@placeholder='Total']"));
		Commonclass.clear(driver, clickanderasetodaldata);
		String storetotaldata="150";
    	Commonclass.SendKeys(driver, clickanderasetodaldata, storetotaldata); 
    	Commonclass.Threadtime3sec(driver, clickanderasetodaldata);
	/*	WebElement clickoncreditfield=driver.findElement(By.xpath("//*[@title='Secure card payment input frame']"));
		String storecreditdata="4242 4242 4242 4242";
    	Commonclass.SendKeys(driver, clickoncreditfield, storecreditdata); 
		WebElement sendexpdate=driver.findElement(By.xpath("//*[@id='card-element']/div/iframe"));
		String storeexpdate="02 / 25";
    	Commonclass.SendKeys(driver, sendexpdate, storeexpdate); 
		WebElement sendcvvnum=driver.findElement(By.xpath("//*[@id='card-element']/div/iframe"));
		String storecvvnum="584";
    	Commonclass.SendKeys(driver, sendcvvnum, storecvvnum); 
		WebElement clickareacode=driver.findElement(By.xpath("//*[@id='card-element']/div/iframe"));
		String storeareacode="10003";
    	Commonclass.SendKeys(driver, clickareacode, storeareacode); 
			//driver.findElement(By.xpath("//*[text()='Pay Now']")).click();    */
    	WebElement selectpaynowformoving= driver.findElement(By.xpath("//*[text()='Pay Now']"));
		JavascriptExecutor moveuptopaynow = (JavascriptExecutor) driver;
		moveuptopaynow.executeScript("arguments[0].scrollIntoView();", selectpaynowformoving);
    	driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")).sendKeys("4242 4242 4242 4242");
    	driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")).sendKeys("02 / 25");
    	driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")).sendKeys("584");
    	driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")).sendKeys("10003");  
		//driver.findElement(By.xpath("//*[text()='Pay Now']")).click();
		WebElement ClickonPaynowbutton= driver.findElement(By.xpath("//*[text()='Pay Now']"));
		JavascriptExecutor moveuptoPosbutton = (JavascriptExecutor) driver;
		moveuptoPosbutton.executeScript("arguments[0].click();", ClickonPaynowbutton); 
		WebElement storebalancedue=driver.findElement(By.xpath("//*[text()='Balance Due :']"));
		JavascriptExecutor moveuptobalancedue = (JavascriptExecutor) driver;
		moveuptobalancedue.executeScript("arguments[0].scrollIntoView();", storebalancedue);   
		Commonclass.Threadtime3sec(driver, storebalancedue);
		WebElement Clickoncash= driver.findElement(By.xpath("//*[text()='Cash']"));
		JavascriptExecutor moveuptocash = (JavascriptExecutor) driver;
		moveuptocash.executeScript("arguments[0].click();", Clickoncash);
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("10");
		WebElement clickonok1=driver.findElement(By.xpath("//*[text()='Ok']"));
		Commonclass.Click(driver, clickonok1);
		Commonclass.Threadtime2sec(driver, clickonok1);
		WebElement clickongiftcard=driver.findElement(By.xpath("//*[text()='Gift Card']"));
		Commonclass.Click(driver, clickongiftcard);
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("15");
		boolean Checkout = driver.findElement(By.xpath("//*[text()='Ok']")).isDisplayed();
		if(Checkout){
			System.out.println("Checkout done successfully");
		} else {
			System.out.println("Checkout not done successfully");
		}
		WebElement clickonok2=driver.findElement(By.xpath("//*[text()='Ok']"));
		Commonclass.Click(driver, clickonok2);
		Commonclass.Threadtime3sec(driver, clickonok2);
		WebElement store2ndbalancedue=driver.findElement(By.xpath("//*[text()='Balance Due :']"));
		JavascriptExecutor moveupto2ndtimebalancedue = (JavascriptExecutor) driver;
		moveupto2ndtimebalancedue.executeScript("arguments[0].scrollIntoView();", store2ndbalancedue);
	}
}
