package OperationsAppTasks;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pittsburgh.genericlib.Commonclass;

public class Task1732MainwithoutThread {
	public static WebDriver driver;
	public static Properties p1;
	@Test(priority=1,enabled=true)
	public void RecreateOrder() throws Exception
	{
	String	Testname="Login";
    System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
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
		boolean Loginbutton1 = driver.findElement(By.xpath("//ion-button[@type='submit']")).isEnabled();
		if(Loginbutton1){
			System.out.println("Login was done successfully");
		} else {
			System.out.println("Login was not done successfully");
		}
		String	Testname1="POSmodule";
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
		} */
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
		WebElement addproduct= driver.findElement(By.xpath("//*[contains(text(),'Add Product ')]"));
	    JavascriptExecutor jsee = (JavascriptExecutor) driver;
	    jsee.executeScript("arguments[0].click();", addproduct);
	    WebElement clickonsearchproduct2=driver.findElement(By.xpath("//*[text()='Search Product to Add']"));
	    Commonclass.Click(driver, clickonsearchproduct2);
	    WebElement clickonblaurfiled= driver.findElement(By.xpath("(//input[@type='text'])[7]"));
	    Commonclass.Click(driver, clickonblaurfiled);
	    WebElement ClickonBlaur=driver.findElement(By.xpath("//span[text()=' Blauer ']"));
	    Commonclass.Click(driver, ClickonBlaur);
	    WebElement clickonfanufacture= driver.findElement(By.xpath("//*[@formcontrolname='manufacturerNum']"));
	    Commonclass.Click(driver, clickonfanufacture);
	    WebElement Clickon8600shirt=driver.findElement(By.xpath("//span[text()=' 8600-Z ']"));
	    Commonclass.Click(driver, Clickon8600shirt);
	    WebElement Clickonsearch2= driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));
	    Commonclass.Click(driver, Clickonsearch2);
	    WebElement ClickonLSshirt= driver.findElement(By.xpath("//td[text()=' LS ZIPPERED POLYESTER SHIRT ']"));
	    Commonclass.Click(driver, ClickonLSshirt);
	    WebElement related2=driver.findElement(By.xpath("(//ion-button[text()='Show Related '])[2]"));
	    Commonclass.Click(driver, related2);
		WebElement clickonBlack=driver.findElement(By.xpath("//td[text()=' BLACK ']"));
		Commonclass.Click(driver, clickonBlack);
		WebElement clickonaddproduct=driver.findElement(By.xpath("//*[text()=' Add product to Order']"));
		Commonclass.Click(driver, clickonaddproduct);
		WebElement clickoncontainer1=driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
		Commonclass.Click(driver, clickoncontainer1);
		WebElement clickoncontainer3=driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[3]"));
		Commonclass.Click(driver, clickoncontainer3);
	    WebElement addproduct5= driver.findElement(By.xpath("//ion-button[text()='Use Other Printer']"));
		JavascriptExecutor jsee5 = (JavascriptExecutor) driver;
		jsee5.executeScript("arguments[0].click();", addproduct5);
	    WebElement addproduct4= driver.findElement(By.xpath("//*[text()='Microsoft Print to PDF']"));
		JavascriptExecutor jsee4 = (JavascriptExecutor) driver;
		jsee4.executeScript("arguments[0].click();", addproduct4);	
		WebElement addproduct3= driver.findElement(By.xpath("(//*[@color='success'])[6]"));
	    JavascriptExecutor jsee3 = (JavascriptExecutor) driver;
	    jsee3.executeScript("arguments[0].click();", addproduct3);   
        WebElement hiddenDiv = driver.findElement(By.xpath("//span[@name='ppssBarcode']"));
        String n = hiddenDiv.getText(); // does not work (returns "" as expected)
        String script = "return arguments[0].innerText";
        n= (String) ((JavascriptExecutor) driver).executeScript(script, hiddenDiv);
        System.out.println(n);
        WebElement ppsscode=driver.findElement(By.xpath("//input[@name='upc']"));
        String hiddenppssccode=n;
        Commonclass.SendKeys(driver, ppsscode, hiddenppssccode);
        WebElement clickonsearch2ndtime=driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));
        Commonclass.Click(driver, clickonsearch2ndtime);
        Commonclass.Threadtime3sec(driver, clickonsearch2ndtime);
        WebElement passhiddenpicbincode=driver.findElement(By.xpath("//input[@name='upc']"));
        String hiddenpicbincodeenter=nnn;
        Commonclass.SendKeys(driver, passhiddenpicbincode, hiddenpicbincodeenter);
        Commonclass.Threadtime3sec(driver, passhiddenpicbincode);
        WebElement clickonsearch3rdtime=driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));  
        Commonclass.Click(driver, clickonsearch3rdtime);
        WebElement clickonsave1st=driver.findElement(By.xpath("//ion-button[text()='Save']")); 
        Commonclass.Click(driver, clickonsave1st);
        Commonclass.Threadtime3sec(driver, clickonsave1st);
        WebElement ClickCheckout= driver.findElement(By.xpath("//ion-button[text()=' Checkout']"));
        JavascriptExecutor clickanylocation = (JavascriptExecutor) driver;
        clickanylocation.executeScript("arguments[0].click();", ClickCheckout);
        WebElement Clickverify= driver.findElement(By.xpath("//ion-button[text()='Verify']"));
        JavascriptExecutor clickany = (JavascriptExecutor) driver;
        clickany.executeScript("arguments[0].click();", Clickverify);
        Thread.sleep(5000);
        WebElement clickonnext1st=driver.findElement(By.xpath("//ion-button[text()='Next']")); 
        Commonclass.Click(driver, clickonnext1st);
        WebElement customerpickuporder=driver.findElement(By.xpath("//ion-button[text()='Customer will pickup the order']")); 
        Commonclass.Click(driver, customerpickuporder);
        WebElement clickonneville=driver.findElement(By.xpath("//ion-button[text()='Neville Island Store']")); 
        Commonclass.Click(driver, clickonneville);
        Commonclass.Threadtime2sec(driver, clickonneville);
        WebElement clickonagencybill=driver.findElement(By.xpath("//ion-button[text()='Agency Bill']")); 
        Commonclass.Click(driver, clickonagencybill);
        WebElement sendagencybillnum=driver.findElement(By.xpath("(//input[@type='text'])[7]"));
        String Agencybillnum="12345";
        Commonclass.SendKeys(driver, sendagencybillnum, Agencybillnum);
        WebElement clickonsave2=driver.findElement(By.xpath("//ion-button[text()='Save']")); 
        Commonclass.Click(driver, clickonsave2);
        Commonclass.Threadtime3sec(driver, clickonsave2);
        WebElement clickonback1=driver.findElement(By.xpath("//ion-button[text()='back']"));    
        Commonclass.Click(driver, clickonback1);
        Commonclass.Threadtime2sec(driver, clickonback1);
        WebElement exitposmode=driver.findElement(By.xpath("//ion-button[text()='Exit POS Mode']"));
        Commonclass.Click(driver, exitposmode);  
        boolean status = driver.findElement(By.xpath("//ion-button[text()='Exit POS Mode']")).isEnabled();
		if(status){
			System.out.println("Exit POS Mode button clicked");
		} else {
			System.out.println("Exit POS Mode button not clicked");
		}
        Commonclass.Threadtime3sec(driver, exitposmode);
}
	@Test(priority=2,enabled=true)
	public void Releaseorder() throws Exception
	{
		
		WebElement clickonorderneeds=driver.findElement(By.xpath("//div[text()='Orders Need Reviewed']"));
		Commonclass.Click(driver, clickonorderneeds);
		WebElement clickon1stproduct=driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]"));
		Commonclass.Click(driver, clickon1stproduct);
		WebElement clickon1stbox=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[1]"));
		Commonclass.Click(driver, clickon1stbox);
		WebElement clickonsecondbox=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[2]"));
		Commonclass.Click(driver, clickonsecondbox);
		WebElement clickon3rdbox=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[3]"));
		Commonclass.Click(driver, clickon3rdbox);
		WebElement clickon4thbox=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[4]"));
		Commonclass.Click(driver, clickon4thbox);
		Commonclass.Threadtime3sec(driver, clickon4thbox);
		WebElement clickon5thbox=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[5]"));
		Commonclass.Click(driver, clickon5thbox);
		WebElement clickonrrelease=driver.findElement(By.xpath("//ion-button[text()='RELEASE ORDER']"));
		Commonclass.Click(driver, clickonrrelease);
		  boolean status = driver.findElement(By.xpath("//ion-button[text()='RELEASE ORDER']")).isEnabled();
			if(status){
				System.out.println("Releasedorder successfully");
			} else {
				System.out.println("Not Released order");
			}
		WebElement clickonokinorderrelease=driver.findElement(By.xpath("//span[text()='OK']"));
		Commonclass.Click(driver, clickonokinorderrelease);
		Commonclass.Threadtime3sec(driver, clickonokinorderrelease);
	}
@Test(priority=3,enabled=true)
public void Processorder() throws Exception {
	WebElement clickonhome=driver.findElement(By.xpath("//mat-panel-title[text()=' Home ']"));
	Commonclass.Click(driver, clickonhome);
	WebElement clickonghome2=driver.findElement(By.xpath("//ion-label[text()=' Home ']"));
	Commonclass.Click(driver, clickonghome2);
	WebElement clickonpicbinneedsprocess= driver.findElement(By.xpath("//div[text()='Pick Bins Need Processed']"));  
	Commonclass.Click(driver, clickonpicbinneedsprocess); 
	WebElement element2= driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]"));
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("arguments[0].click();", element2);
	WebElement clickonviewpicbin=driver.findElement(By.xpath("//span[text()='View Pick Bin']"));
	Commonclass.Click(driver, clickonviewpicbin);
	WebElement clickonscan=driver.findElement(By.xpath("//ion-button[text()='Scan']"));
	Commonclass.Click(driver, clickonscan);
	Commonclass.Threadtime3sec(driver, clickonscan);
	WebElement picbinbarcode = driver.findElement(By.xpath("//li[@class='ng-star-inserted']"));
    String storeinstring = picbinbarcode.getText(); // does not work (returns "" as expected)
	String getinnerscript = "return arguments[0].innerText";
    storeinstring= (String) ((JavascriptExecutor) driver).executeScript(getinnerscript, picbinbarcode);
	System.out.println(getinnerscript);
	WebElement eneterpicbinbarcode=driver.findElement(By.xpath("//input[@placeholder='UPC']"));
	String storepicbinbarcode=storeinstring;
    Commonclass.SendKeys(driver, eneterpicbinbarcode, storepicbinbarcode);
	WebElement clickonsearch1=driver.findElement(By.xpath("//ion-button[text()='Search']"));
	Commonclass.Click(driver, clickonsearch1);
	Commonclass.Threadtime2sec(driver, clickonsearch1);
	WebElement clcikonnext1=driver.findElement(By.xpath("//ion-button[text()='Next']"));
	Commonclass.Click(driver, clcikonnext1);
	WebElement clickonnext2=driver.findElement(By.xpath("//ion-button[text()='Next']"));
	Commonclass.Click(driver, clickonnext2);
	WebElement cleardataandenterdata=driver.findElement(By.xpath("//input[@type='number']"));
	Commonclass.clear(driver, cleardataandenterdata);
	String eneternum="1";
	Commonclass.SendKeys(driver, cleardataandenterdata, eneternum);
	//driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1");
	//Commonclass.Click(driver, clickonokinorderrelease);
	WebElement clickonprint1=driver.findElement(By.xpath("//ion-button[text()='Print']"));
	Commonclass.Click(driver, clickonprint1);
	WebElement clickonnext3=driver.findElement(By.xpath("//ion-button[text()='Next']"));
	Commonclass.Click(driver, clickonnext3);;
	WebElement clickonscanbarcode=driver.findElement(By.xpath("//ion-button[text()='Scan Container Barcode']"));
	Commonclass.Click(driver, clickonscanbarcode);
	Commonclass.Threadtime3sec(driver, clickonscanbarcode);
	WebElement Storecontainerbarcode = driver.findElement(By.xpath("//span[@name='containerLabelBarcode']"));
	String getcontainerbarcode = Storecontainerbarcode.getText(); // does not work (returns "" as expected)
	String getinnertext = "return arguments[0].innerText";
	getcontainerbarcode= (String) ((JavascriptExecutor) driver).executeScript(getinnertext, Storecontainerbarcode);
	System.out.println(getcontainerbarcode);
	WebElement containbarcode=driver.findElement(By.xpath("//input[@placeholder='UPC']"));
	String gettingcontainerbarcode=getcontainerbarcode;
	Commonclass.SendKeys(driver, containbarcode, gettingcontainerbarcode);
	WebElement clickonsearch2=driver.findElement(By.xpath("//ion-button[text()='Search']"));
    Commonclass.Click(driver, clickonsearch2);
	WebElement clickonscan2=driver.findElement(By.xpath("//ion-button[text()='Scan']"));
	Commonclass.Click(driver, clickonscan2);
	Commonclass.Threadtime3sec(driver, clickonscan2);
	WebElement Storeppssbarcode1 = driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])[2]"));
	String getppssbarcode1 = Storeppssbarcode1.getText(); // does not work (returns "" as expected)
	String getinnertextppss1 = "return arguments[0].innerText";
	getppssbarcode1= (String) ((JavascriptExecutor) driver).executeScript(getinnertextppss1, Storeppssbarcode1);
	WebElement sendppssbarcode1=driver.findElement(By.xpath("//input[@placeholder='UPC']"));
	String gettingppssbarcode1=getppssbarcode1;
	Commonclass.SendKeys(driver, sendppssbarcode1, gettingppssbarcode1);
	WebElement clickonserach3=driver.findElement(By.xpath("//ion-button[text()='Search']"));
	Commonclass.Click(driver, clickonserach3);
	WebElement clickonokay1=driver.findElement(By.xpath("//span[text()='Okay']"));
	Commonclass.Click(driver, clickonokay1);
	WebElement clickscannncontainer=driver.findElement(By.xpath("//ion-button[text()='Scan Container ']"));
	Commonclass.Click(driver, clickscannncontainer);
	Commonclass.Threadtime3sec(driver, clickscannncontainer);
	WebElement Storecontainerbarcode2 = driver.findElement(By.xpath("//span[@name='containerLabelBarcode']"));
	String getcontainerbarcode2 = Storecontainerbarcode2.getText(); // does not work (returns "" as expected)
	String getinnertextcontainer2 = "return arguments[0].innerText";
	getcontainerbarcode2= (String) ((JavascriptExecutor) driver).executeScript(getinnertextcontainer2, Storecontainerbarcode2);
	System.out.println(getcontainerbarcode2);
	WebElement sendcontainerbarcode2= driver.findElement(By.xpath("//input[@placeholder='UPC']"));
	String gettingcontainerbarcode2=getcontainerbarcode2;
	Commonclass.SendKeys(driver, sendcontainerbarcode2, gettingcontainerbarcode2);
	WebElement clickonsearch3=driver.findElement(By.xpath("//ion-button[text()='Search']"));
	Commonclass.Click(driver, clickonsearch3);
	WebElement clickonscanslot=driver.findElement(By.xpath("//ion-button[text()='Scan Slot ']"));
	Commonclass.Click(driver, clickonscanslot);
	WebElement sendslotbarcode=driver.findElement(By.xpath("//input[@placeholder='UPC']"));
	String storeslotbarcode=p1.getProperty("Slotbarcodeinorderprocess");
	Commonclass.SendKeys(driver, sendslotbarcode, storeslotbarcode);
	WebElement clcikonsearch4=driver.findElement(By.xpath("//ion-button[text()='Search']"));
	Commonclass.Click(driver, clcikonsearch4);
	WebElement clickonfinish=driver.findElement(By.xpath("//ion-button[text()='Finish']")); 
	Commonclass.Click(driver, clickonfinish);
	Commonclass.Threadtime5sec(driver, clickonfinish);
	boolean status = driver.findElement(By.xpath("//span[text()='Okay']")).isDisplayed();
	if(status){
		System.out.println("Processing Order done successfully");
	} else {
		System.out.println("Processing Order not done successfully");
	}
	WebElement clickprocessfinalokay=driver.findElement(By.xpath("//span[text()='Okay']"));
	Commonclass.Click(driver, clickprocessfinalokay);
	Commonclass.Threadtime3sec(driver, clickprocessfinalokay);
}
@Test(priority=4,enabled=true)
public void Transfertocontainer() throws Exception
{
	WebElement clickonorders= driver.findElement(By.xpath("//mat-panel-title[text()=' Orders ']"));
	JavascriptExecutor moveuptoorders = (JavascriptExecutor) driver;
	moveuptoorders.executeScript("arguments[0].click();", clickonorders);
	WebElement clickonvieworders= driver.findElement(By.xpath("//ion-label[text()=' View Orders ']"));
	JavascriptExecutor moveuptovieworders = (JavascriptExecutor) driver;
	moveuptovieworders.executeScript("arguments[0].click();", clickonvieworders);
	Commonclass.Threadtime3sec(driver, clickonvieworders);
	WebElement clickon1stproduct=driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[11]")); 
	Commonclass.Click(driver, clickon1stproduct); 
	WebElement clickonpicbinandtracker= driver.findElement(By.xpath("//strong[text()='Pick Bins & Container Tracking ']"));
	JavascriptExecutor moveuptotracker = (JavascriptExecutor) driver;
	moveuptotracker.executeScript("arguments[0].click();", clickonpicbinandtracker);
	Commonclass.Threadtime3sec(driver, clickonpicbinandtracker);
	WebElement clickarrow= driver.findElement(By.xpath("(//img[@src='./assets/images/back-arrow.png'])[1]"));
	JavascriptExecutor clickbelowarrow = (JavascriptExecutor) driver;
	clickbelowarrow.executeScript("arguments[0].click();", clickarrow);
	WebElement clcikonTransfer=driver.findElement(By.xpath("//ion-button[text()=' TRANSFER ']")); 	
	Commonclass.Click(driver, clcikonTransfer);
	WebElement clickonscanintransfer=driver.findElement(By.xpath("//ion-button[text()=' SCAN ']")); 
	Commonclass.Click(driver, clickonscanintransfer);
	WebElement sendtransfercontainerbarcode=driver.findElement(By.xpath("//input[@placeholder='UPC']")); 
	String storetransfercontainerbarcode=p1.getProperty("Transfercontainerbarcode");
	Commonclass.SendKeys(driver, sendtransfercontainerbarcode, storetransfercontainerbarcode);
	WebElement clcikonsearchintransfer=driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")); 
	Commonclass.Click(driver, clcikonsearchintransfer);
	WebElement clickoncomplete=driver.findElement(By.xpath("//ion-button[text()=' COMPLETE ']")); 
	Commonclass.Click(driver, clickoncomplete);
	boolean status = driver.findElement(By.xpath("//ion-button[text()=' COMPLETE ']")).isEnabled();
	if(status){
		System.out.println("Transfering was done successfully");
	} else {
		System.out.println("Transfering was not done successfully");
	}
	Commonclass.Threadtime3sec(driver, clickoncomplete);
	WebElement clickondashboards=driver.findElement(By.xpath("//mat-panel-title[text()=' Dashboards ']"));
	Commonclass.Click(driver, clickondashboards);
}
@Test(priority=5,enabled=true)
public void Tailoring() throws Exception
{
	WebElement clickontailaring= driver.findElement(By.xpath("//ion-label[text()=' Tailoring ']"));
	JavascriptExecutor moveuptotailoring = (JavascriptExecutor) driver;
	moveuptotailoring.executeScript("arguments[0].click();", clickontailaring);
	Commonclass.Threadtime5sec(driver, clickontailaring);
	WebElement clicknewproduct=driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[23]"));
	Commonclass.Click(driver, clicknewproduct);
	WebElement clickassignme=driver.findElement(By.xpath("//span[text()='Assign to Me']"));
	Commonclass.Click(driver, clickassignme);
	Commonclass.Threadtime5sec(driver, clickassignme);
	WebElement clicknewassignedproduct=driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[28]"));
	Commonclass.Click(driver, clicknewassignedproduct);
	Commonclass.Threadtime2sec(driver, clicknewassignedproduct);
	WebElement clcikshirt=driver.findElement(By.xpath("(//div[text()='LS ZIPPERED POLYESTER SHIRT'])[2]"));
	Commonclass.Click(driver, clcikshirt);
	WebElement clickbegin=driver.findElement(By.xpath("//ion-button[text()='Begin']"));
	Commonclass.Click(driver, clickbegin);
	WebElement clickcomplete=driver.findElement(By.xpath("//ion-button[text()='Complete']"));
	Commonclass.Click(driver, clickcomplete);
	WebElement backarrow= driver.findElement(By.xpath("(//ion-icon[@aria-label='arrow back'])[5]"));
	JavascriptExecutor clickbackarrow = (JavascriptExecutor) driver;
	clickbackarrow.executeScript("arguments[0].click();", backarrow);
	Commonclass.Threadtime3sec(driver, backarrow);
	WebElement clicktransfer=driver.findElement(By.xpath("//ion-button[text()='TRANSFER']"));
	Commonclass.Click(driver, clicktransfer);
	WebElement clickonscan=driver.findElement(By.xpath("//ion-button[text()='Scan']"));
	Commonclass.Click(driver, clickonscan);
	WebElement sendtransferbarnum=driver.findElement(By.xpath("(//input[@placeholder='UPC'])[2]"));
	String storetailoringbarcode=p1.getProperty("Tailoringbarcodenum");
	Commonclass.SendKeys(driver, sendtransferbarnum, storetailoringbarcode);
	WebElement clickonserach3=driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]"));
	Commonclass.Click(driver, clickonserach3);
	WebElement clickoncomplete=driver.findElement(By.xpath("//ion-button[text()='Complete']")); 
	Commonclass.Click(driver, clickoncomplete);
	boolean status = driver.findElement(By.xpath("//ion-button[text()='Complete']")).isEnabled();
	if(status){
		System.out.println("Tailoring was done successfully");
	} else {
		System.out.println("Tailoring was not done successfully");
	}
	Commonclass.Threadtime5sec(driver, clickoncomplete);
}
@Test(priority=6,enabled=true)
public void QualityAsurance() throws Exception
{
	WebElement clickQA= driver.findElement(By.xpath("//ion-label[text()=' Quality Assurance ']"));
	JavascriptExecutor clickanywhere = (JavascriptExecutor) driver;
	clickanywhere.executeScript("arguments[0].click();", clickQA);
	Commonclass.Threadtime5sec(driver, clickQA);
	WebElement clcik1stone=driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[35]"));
	Commonclass.Click(driver, clcik1stone);
	Commonclass.Threadtime2sec(driver, clcik1stone);
	WebElement clickshirt=driver.findElement(By.xpath("(//div[text()='LS ZIPPERED POLYESTER SHIRT'])[3]"));
	Commonclass.Click(driver, clickshirt);
	Commonclass.Threadtime5sec(driver, clickshirt);
	WebElement clcikonYes1=driver.findElement(By.xpath("//ion-button[text()='Yes']")); 
	Commonclass.Click(driver, clcikonYes1);
	//Commonclass.Threadtime3sec(driver, clickonYes1);
	WebElement clickonYes2=driver.findElement(By.xpath("//ion-button[text()='Yes']")); 
	Commonclass.Click(driver, clickonYes2);   
	WebElement clickonpass=driver.findElement(By.xpath("(//ion-button[text()='Pass'])[1]"));
	Commonclass.Click(driver, clickonpass);
	WebElement clickontakepicture=driver.findElement(By.xpath("//ion-button[text()='Take Picture']"));
	Commonclass.Click(driver, clickontakepicture);
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
	Thread.sleep(3000);
	WebElement Clickcomplete= driver.findElement(By.xpath("//*[text()='QC Complete']"));
	JavascriptExecutor Clickanyloc = (JavascriptExecutor) driver;
	Clickanyloc.executeScript("arguments[0].click();", Clickcomplete);
	boolean status = driver.findElement(By.xpath("//*[text()='QC Complete']")).isEnabled();
	if(status){
		System.out.println("QC was done successfully");
	} else {
		System.out.println("QC was not done successfully");
	}
}
}