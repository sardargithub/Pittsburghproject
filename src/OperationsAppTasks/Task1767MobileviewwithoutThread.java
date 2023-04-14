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

public class Task1767MobileviewwithoutThread {
	public static WebDriver driver;
	public static Properties p1;
	@Test(priority=1, enabled=true)
	 public  void mobiletest() throws Exception{
		  System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications","--window-size=414,736");
			driver = new ChromeDriver(options);
			FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
			p1 = new Properties();
			p1.load(fis);
			driver.get(p1.getProperty("URL"));
			options.setHeadless(true);
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
			    Commonclass.Threadtime2sec(driver, selectlocation);
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
				WebElement clickoncontainer3= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[3]"));
			    JavascriptExecutor moveuptocontainer3 = (JavascriptExecutor) driver;
			    moveuptocontainer3.executeScript("arguments[0].click();", clickoncontainer3);
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
		        String n = hiddenDiv.getText(); 
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
		       Commonclass.Threadtime5sec(driver, Clickverify);
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
		        WebElement Clickorderneedsreviewed= driver.findElement(By.xpath("//div[text()='Orders Need Reviewed']"));
		        JavascriptExecutor moveneedsreviewedanywhre = (JavascriptExecutor) driver;
		        moveneedsreviewedanywhre.executeScript("arguments[0].click();", Clickorderneedsreviewed);
		        WebElement Clickoncreatedorder= driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]"));
		        JavascriptExecutor movenewcreatedorder = (JavascriptExecutor) driver;
		        movenewcreatedorder.executeScript("arguments[0].click();", Clickoncreatedorder);
		        Commonclass.Threadtime3sec(driver, Clickoncreatedorder);
		    	WebElement ReviewOrder=driver.findElement(By.xpath("//*[text()='Review Order']"));
		    	JavascriptExecutor moveuptorevieworder = (JavascriptExecutor) driver;
		    	moveuptorevieworder.executeScript("arguments[0].scrollIntoView();", ReviewOrder);
		    	Commonclass.Threadtime2sec(driver, ReviewOrder);
		        WebElement Clickonfirstbox= driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[1]"));
		        JavascriptExecutor moveuotofirstbox = (JavascriptExecutor) driver;
		        moveuotofirstbox.executeScript("arguments[0].click();", Clickonfirstbox);  
		        WebElement clickonsecondbox=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[2]"));
				Commonclass.Click(driver, clickonsecondbox);
				WebElement clickon3rdbox=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[3]"));
				Commonclass.Click(driver, clickon3rdbox);
				WebElement clickon4thbox=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[4]"));
				Commonclass.Click(driver, clickon4thbox);
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
					Commonclass.Threadtime5sec(driver, clickonrrelease);
				WebElement clickonokinorderrelease=driver.findElement(By.xpath("//span[text()='OK']"));
				Commonclass.Click(driver, clickonokinorderrelease);
				Commonclass.Threadtime3sec(driver, clickonokinorderrelease);
		        }
		        @Test(priority=3,enabled=true)
		        public void Processorder() throws Exception {
		        WebElement ClickonIcon2=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-orders-need-reviewed/ion-header/ion-toolbar/ion-buttons[1]"));
		        Commonclass.Click(driver, ClickonIcon2);
		        WebElement ClickonIcon3=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-orders-need-reviewed/ion-header/ion-toolbar/ion-buttons[1]"));
		        Commonclass.Click(driver, ClickonIcon3);
		        Commonclass.Threadtime2sec(driver, ClickonIcon3);
		        WebElement clickonHome1=driver.findElement(By.xpath("//mat-panel-title[text()=' Home ']"));
		        Commonclass.Click(driver, clickonHome1);
		        WebElement clickonHome2=driver.findElement(By.xpath("//ion-label[text()=' Home ']"));
		        Commonclass.Click(driver, clickonHome2); 
		        WebElement Clickonpicbinneedsreviewed= driver.findElement(By.xpath("//div[text()='Pick Bins Need Processed']"));
		        JavascriptExecutor movepicbinbinneedsreviewed = (JavascriptExecutor) driver;
		        movepicbinbinneedsreviewed.executeScript("arguments[0].click();", Clickonpicbinneedsreviewed);  
		        WebElement element2= driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]"));
		        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		        js2.executeScript("arguments[0].click();", element2);
		        WebElement clickonViewpicbin=driver.findElement(By.xpath("//span[text()='View Pick Bin']"));
		        Commonclass.Click(driver, clickonViewpicbin);
		        WebElement clickonscan1= driver.findElement(By.xpath("//ion-button[text()='Scan']"));
		        Commonclass.Click(driver, clickonscan1);
		        Commonclass.Threadtime3sec(driver, clickonscan1);
		        WebElement picbinbarcode = driver.findElement(By.xpath("//li[@class='ng-star-inserted']"));
		        String storeinstring = picbinbarcode.getText(); 
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
		    	WebElement clickonprint1=driver.findElement(By.xpath("//ion-button[text()='Print']"));
		    	Commonclass.Click(driver, clickonprint1);
		    	WebElement clickonnext3=driver.findElement(By.xpath("//ion-button[text()='Next']"));
		    	Commonclass.Click(driver, clickonnext3);;
		    	WebElement clickonscanbarcode=driver.findElement(By.xpath("//ion-button[text()='Scan Container Barcode']"));
		    	Commonclass.Click(driver, clickonscanbarcode);
		        WebElement Storecontainerbarcode = driver.findElement(By.xpath("//span[@name='containerLabelBarcode']"));
		        String getcontainerbarcode = Storecontainerbarcode.getText();
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
		    	//Commonclass.Threadtime3sec(driver, clickonscan2);
		        WebElement clickonsearchbutton= driver.findElement(By.xpath("//ion-button[text()='Scan']"));
		        JavascriptExecutor moveuptosearchbutton = (JavascriptExecutor) driver;
		        moveuptosearchbutton.executeScript("arguments[0].click();", clickonsearchbutton);
		        Commonclass.Threadtime3sec(driver, clickonsearchbutton);
		        WebElement Storeppssbarcode1 = driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])[2]"));
		        String getppssbarcode1 = Storeppssbarcode1.getText(); // does not work (returns "" as expected)
		        String getinnertextppss1 = "return arguments[0].innerText";
		        getppssbarcode1= (String) ((JavascriptExecutor) driver).executeScript(getinnertextppss1, Storeppssbarcode1);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        WebElement w1=driver.findElement(By.xpath("//input[@placeholder='UPC']"));
		        js.executeScript("arguments[0].scrollIntoView();", w1);
		        Commonclass.Threadtime2sec(driver, w1);
		        WebElement sendppssbarcode1=driver.findElement(By.xpath("//input[@placeholder='UPC']"));
		    	String gettingppssbarcode1=getppssbarcode1;
		    	Commonclass.SendKeys(driver, sendppssbarcode1, gettingppssbarcode1);
		        WebElement clickonsearchbutton2= driver.findElement(By.xpath("//ion-button[text()='Search']"));
		        JavascriptExecutor moveuptosearchbutton2 = (JavascriptExecutor) driver;
		        moveuptosearchbutton2.executeScript("arguments[0].click();", clickonsearchbutton2);
		        WebElement clickonokay1=driver.findElement(By.xpath("//span[text()='Okay']"));
		    	Commonclass.Click(driver, clickonokay1);
		    	WebElement clickscannncontainer=driver.findElement(By.xpath("//ion-button[text()='Scan Container ']"));
		    	Commonclass.Click(driver, clickscannncontainer);
		    	//Commonclass.Threadtime3sec(driver, clickscannncontainer);
		        WebElement Storecontainerbarcode2 = driver.findElement(By.xpath("//span[@name='containerLabelBarcode']"));
		        String getcontainerbarcode2 = Storecontainerbarcode2.getText(); 
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
		    	boolean status = driver.findElement(By.xpath("//*[text()='Okay']")).isDisplayed();
		    	if(status){
		    		System.out.println("Processing Order done successfully");
		    	} else {
		    		System.out.println("Processing Order not done successfully");
		    	}
		    	WebElement clickprocessfinalokay=driver.findElement(By.xpath("//*[text()='Okay']"));
		    	Commonclass.Click(driver, clickprocessfinalokay);
		    	Commonclass.Threadtime3sec(driver, clickprocessfinalokay);
		    }
		        @Test(priority=4,enabled=true)
		        public void Transfertocontainer() throws Exception
		        {
		        WebElement clickbackarrow1time= driver.findElement(By.xpath("//button[@class='button-native sc-ion-back-button-md']"));
		        JavascriptExecutor movebackarrow1time = (JavascriptExecutor) driver;
		        movebackarrow1time.executeScript("arguments[0].click();", clickbackarrow1time);
		        Commonclass.Threadtime3sec(driver, clickbackarrow1time);
		        WebElement ClickonMenubutton1=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-home/ion-header/ion-toolbar/ion-buttons[1]"));
		        Commonclass.Click(driver, ClickonMenubutton1);
		        WebElement clickonorders= driver.findElement(By.xpath("//mat-panel-title[text()=' Orders ']"));
		    	JavascriptExecutor moveuptoorders = (JavascriptExecutor) driver;
		    	moveuptoorders.executeScript("arguments[0].click();", clickonorders);
		    	Commonclass.Threadtime3sec(driver, clickonorders);
		    	WebElement clickonvieworders= driver.findElement(By.xpath("//ion-label[text()=' View Orders ']"));
		    	JavascriptExecutor moveuptovieworders = (JavascriptExecutor) driver;
		    	moveuptovieworders.executeScript("arguments[0].click();", clickonvieworders);
		    	Commonclass.Threadtime3sec(driver, clickonvieworders);
		    	WebElement clickon1stproduct=driver.findElement(By.xpath("(//*[@name='arrow-forward'])[1]")); 
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
		    	WebElement clickonbac2=driver.findElement(By.xpath("(//button[@class='button-native sc-ion-back-button-md'])[2]"));
		    	Commonclass.Click(driver, clickonbac2);
		    	Commonclass.Threadtime3sec(driver, clickonbac2);
		    	WebElement ClickonMenuIcon2=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-order-details/ion-header/ion-toolbar/ion-buttons/ion-menu-button"));
		    	Commonclass.Click(driver, ClickonMenuIcon2);
		    	Commonclass.Threadtime2sec(driver, clickoncomplete);
		    	WebElement clickondashboards=driver.findElement(By.xpath("//mat-panel-title[text()=' Dashboards ']"));
		    	Commonclass.Click(driver, clickondashboards);
}
		        @Test(priority=5,enabled=true)
		        public void Tailoring() throws Exception
		        {
		        WebElement clickonTailoring=driver.findElement(By.xpath("//ion-label[text()=' Tailoring ']"));
		        Commonclass.Click(driver, clickonTailoring);
		        Commonclass.Threadtime5sec(driver, clickonTailoring);
		    //    WebElement clickonavailablework=driver.findElement(By.xpath("//ion-button[text()='Available work']"));
		     //   Commonclass.Click(driver, clickonavailablework);
		        WebElement clickonAllwork=driver.findElement(By.xpath("//ion-button[text()='All work']"));
		        Commonclass.Click(driver, clickonAllwork);
		        WebElement clickonsortingoptions= driver.findElement(By.xpath("(//ion-icon[@name='options'])[3]"));
		        JavascriptExecutor moveuptosortingoptionsicon = (JavascriptExecutor) driver;
		        moveuptosortingoptionsicon.executeScript("arguments[0].click();", clickonsortingoptions);
		        Commonclass.Threadtime5sec(driver, clickonsortingoptions);
		        WebElement Clickonpackagedproduct=driver.findElement(By.xpath("(//ion-icon[@name='swap'])[2]"));
		        Commonclass.Click(driver, Clickonpackagedproduct);
		        WebElement clickonpackagingbarcode=driver.findElement(By.xpath("//ion-radio[@name='packagingBarcode']"));
		        Commonclass.Click(driver, clickonpackagingbarcode);
		        WebElement clickondecendingbox= driver.findElement(By.xpath("(//ion-toggle[@role='checkbox'])[2]"));
		        JavascriptExecutor moveuptodecendingbox = (JavascriptExecutor) driver;
		        moveuptodecendingbox.executeScript("arguments[0].click();", clickondecendingbox);
		        WebElement clickonsortbutton= driver.findElement(By.xpath("(//ion-button[text()='SORT'])[2]"));
		        JavascriptExecutor moveuptosortbutton = (JavascriptExecutor) driver;
		        moveuptosortbutton.executeScript("arguments[0].click();", clickonsortbutton);
		        Commonclass.Threadtime5sec(driver, clickonsortbutton);
		        WebElement clickon1stproduct=driver.findElement(By.xpath("(//ion-icon[@name='arrow-forward'])[13]"));
		        Commonclass.Click(driver, clickon1stproduct);
		        WebElement clickonassignme=driver.findElement(By.xpath("//span[text()='Assign to Me']"));
		        Commonclass.Click(driver, clickonassignme);
		        Commonclass.Threadtime5sec(driver, clickonsortbutton);
		        WebElement clickonnewassignedproduct=driver.findElement(By.xpath("(//ion-icon[@name='arrow-forward'])[13]"));
		        Commonclass.Click(driver, clickonnewassignedproduct);
		        WebElement clickonViewdetails=driver.findElement(By.xpath("//span[text()='View Details']"));
		        Commonclass.Click(driver, clickonViewdetails);
		        WebElement clickonpolystershirt= driver.findElement(By.xpath("(//div[text()='LS ZIPPERED POLYESTER SHIRT'])[2]"));
		        JavascriptExecutor moveuptoploystershirt = (JavascriptExecutor) driver;
		        moveuptoploystershirt.executeScript("arguments[0].click();", clickonpolystershirt);
		        WebElement clickonbegin=driver.findElement(By.xpath("//ion-button[text()='Begin']"));
		        Commonclass.Click(driver, clickonbegin);
		        WebElement clcikoncomplete=driver.findElement(By.xpath("//ion-button[text()='Complete']"));
		        Commonclass.Click(driver, clcikoncomplete);
		        Commonclass.Threadtime3sec(driver, clcikoncomplete);
		        WebElement clickbackarrow3rdtime= driver.findElement(By.xpath("(//button[@class='button-native sc-ion-back-button-md'])[3]"));
		        JavascriptExecutor movebackarrow3rdtime = (JavascriptExecutor) driver;
		        movebackarrow3rdtime.executeScript("arguments[0].click();", clickbackarrow3rdtime);
		        WebElement clickTransferbutton= driver.findElement(By.xpath("//ion-button[text()='TRANSFER']"));
		        JavascriptExecutor moveuptotransferbutton = (JavascriptExecutor) driver;
		        moveuptotransferbutton.executeScript("arguments[0].click();", clickTransferbutton);
		        WebElement clickonscanbutton=driver.findElement(By.xpath("//ion-button[text()='Scan']"));
		        Commonclass.Click(driver, clickonscanbutton);
		        WebElement sendtailoringbarcode=driver.findElement(By.xpath("//input[@placeholder='UPC']")); 
		    	String storetailoringbarcode=p1.getProperty("Tailoringbarcodenum");
		    	Commonclass.SendKeys(driver, sendtailoringbarcode, storetailoringbarcode);
		        WebElement clickonsearch2=driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));
		        Commonclass.Click(driver, clickonsearch2);
		        WebElement clickoncompletebutton2=driver.findElement(By.xpath("//ion-button[text()='Complete']"));
		        Commonclass.Click(driver, clickoncompletebutton2);
		        boolean status = driver.findElement(By.xpath("//ion-button[text()='Complete']")).isEnabled();
		    	if(status){
		    		System.out.println("Tailoring was done successfully");
		    	} else {
		    		System.out.println("Tailoring was not done successfully");
		    	}
		        WebElement clickonbackbutton3=driver.findElement(By.xpath("(//button[@class='button-native sc-ion-back-button-md'])[2]"));
		        Commonclass.Click(driver, clickonbackbutton3);
		        Commonclass.Threadtime5sec(driver, clickonbackbutton3);
		        
		        }
		        @Test(priority=6,enabled=true)
		        public void QualityAsurance() throws Exception
		        {
		        WebElement clickonmenubutton=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-tailoring/ion-header/ion-toolbar/ion-buttons[1]"));
		        Commonclass.Click(driver, clickonmenubutton);
		        WebElement clcikondashboards=driver.findElement(By.xpath("//mat-panel-title[text()=' Dashboards ']"));
		        Commonclass.Click(driver, clcikondashboards);
		        WebElement clickQA= driver.findElement(By.xpath("//ion-label[text()=' Quality Assurance ']"));
		        JavascriptExecutor clickanywhere = (JavascriptExecutor) driver;
		        clickanywhere.executeScript("arguments[0].click();", clickQA);
		        Commonclass.Threadtime3sec(driver, clickQA);
		        WebElement clickonAllwork=driver.findElement(By.xpath("(//ion-button[text()='All work'])[2]"));
		        Commonclass.Click(driver, clickonAllwork);
		        Commonclass.Threadtime5sec(driver, clickonAllwork);
		    	WebElement clickonsortingoptions= driver.findElement(By.xpath("(//ion-icon[@name='options'])[4]"));
		        JavascriptExecutor moveuptosortingoptionsicon = (JavascriptExecutor) driver;
		        moveuptosortingoptionsicon.executeScript("arguments[0].click();", clickonsortingoptions);
		        Commonclass.Threadtime5sec(driver, clickonsortingoptions);
		    	WebElement clickonswap3=driver.findElement(By.xpath("(//ion-icon[@name='swap'])[3]"));
		    	Commonclass.Click(driver, clickonswap3);
		    	WebElement clickonpackagingbarcode=driver.findElement(By.xpath("(//ion-radio[@name='packagingBarcode'])[2]"));
		    	Commonclass.Click(driver, clickonpackagingbarcode);
		    	WebElement clickondecendingbox= driver.findElement(By.xpath("(//ion-toggle[@role='checkbox'])[3]"));
		    	JavascriptExecutor moveuptodecendingbox = (JavascriptExecutor) driver;
		    	moveuptodecendingbox.executeScript("arguments[0].click();", clickondecendingbox);
		    	WebElement clickonsortbutton= driver.findElement(By.xpath("(//ion-button[text()='SORT'])[3]"));
		    	JavascriptExecutor moveuptosortbutton = (JavascriptExecutor) driver;
		    	moveuptosortbutton.executeScript("arguments[0].click();", clickonsortbutton);
		    	Commonclass.Threadtime5sec(driver, clickonsortbutton);
		        WebElement clickonewassigned=driver.findElement(By.xpath("(//ion-icon[@name='arrow-forward'])[33]"));
		        Commonclass.Click(driver, clickonewassigned);
		        driver.findElement(By.xpath("//span[text()='View Details']")).click();
		        WebElement clickshirt=driver.findElement(By.xpath("(//div[text()='LS ZIPPERED POLYESTER SHIRT'])[2]"));
		        Commonclass.Click(driver, clickshirt);
		        Commonclass.Threadtime5sec(driver, clickshirt);
		        WebElement clcikonYes1=driver.findElement(By.xpath("//ion-button[text()='Yes']")); 
		        Commonclass.Click(driver, clcikonYes1);
		        WebElement clickonYes2=driver.findElement(By.xpath("//ion-button[text()='Yes']")); 
		        Commonclass.Click(driver, clickonYes2);   
		        WebElement clickonpassbutton= driver.findElement(By.xpath("(//ion-button[text()='Pass'])[1]"));
		    	JavascriptExecutor moveuptopassbutton = (JavascriptExecutor) driver;
		    	moveuptopassbutton.executeScript("arguments[0].click();", clickonpassbutton);
		    	JavascriptExecutor moveuptotakepicture = (JavascriptExecutor) driver;
		    	WebElement StoreTakepicture=driver.findElement(By.xpath("//ion-button[text()='Take Picture']"));
		    	moveuptotakepicture.executeScript("arguments[0].scrollIntoView();", StoreTakepicture);
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