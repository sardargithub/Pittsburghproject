package OperationsAppTasks;

import java.io.FileInputStream;
import java.util.List;
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

public class Task1920Dashboardtestingmobileview {
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
		    Commonclass.Threadtime2sec(driver, selectlocation);
			WebElement Okay=driver.findElement(By.xpath("//*[text()='Okay']"));
			Commonclass.Click(driver, Okay);
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
			WebElement clickonmatthew= driver.findElement(By.xpath("(//*[text()='SardarTest '])[2]"));
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
		    WebElement getpicbinbarcode = driver.findElement(By.xpath("//span[@name='pickBinLabel']"));
		  	String storepicbinbarcode = getpicbinbarcode.getText(); 
		  	String getinnerscripttt = "return arguments[0].innerText";
		  	storepicbinbarcode= (String) ((JavascriptExecutor) driver).executeScript(getinnerscripttt, getpicbinbarcode);
		  	System.out.println(storepicbinbarcode);
		  	WebElement clickonbarcode1=driver.findElement(By.xpath("//*[@name='barcode']"));
		  	Commonclass.Click(driver, clickonbarcode1);
			WebElement sendbarcodeupc1=driver.findElement(By.xpath("//*[@name='ion-input-2']"));
			String storebarcodeupc1=p1.getProperty("Upcbarcodefortask1920");
			Commonclass.SendKeys(driver, sendbarcodeupc1, storebarcodeupc1);
			WebElement clcikonsearch1time=driver.findElement(By.xpath("(//*[text()='Search'])[3]"));
			Commonclass.Click(driver, clcikonsearch1time);
			WebElement customersize= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
		    JavascriptExecutor moveuptocustomersize = (JavascriptExecutor) driver;
		    moveuptocustomersize.executeScript("arguments[0].click();", customersize);
		  	WebElement clcikonsuccess1=driver.findElement(By.xpath("(//ion-button[@color='success'])[6]"));
		  	Commonclass.Click(driver, clcikonsuccess1);
			WebElement Storeproduct = driver.findElement(By.xpath("//span[@name='ppssBarcode']"));
			String getthebarcode = Storeproduct.getText();
			String script = "return arguments[0].innerText";
			getthebarcode= (String) ((JavascriptExecutor) driver).executeScript(script, Storeproduct);
			System.out.println(getthebarcode);
			WebElement sendproductbarcode1=driver.findElement(By.xpath("//input[@name='upc']"));
			String storeproductbarcode1=getthebarcode;
			Commonclass.SendKeys(driver, sendproductbarcode1, storeproductbarcode1);
			WebElement clickonsearch2nd=driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]"));
			Commonclass.Click(driver, clickonsearch2nd);
			WebElement sendpicbinbarcode1time=driver.findElement(By.xpath("//input[@name='upc']"));
			String storepicbinbarcode1time=storepicbinbarcode;
			Commonclass.SendKeys(driver, sendpicbinbarcode1time, storepicbinbarcode1time);
			WebElement clickonsearch3rdtime=driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]")); 	
			Commonclass.Click(driver, clickonsearch3rdtime);
			boolean Pickedproduct = driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]")).isEnabled();
			if(Pickedproduct){
				System.out.println("Added picked product successfully");
			} else {
				System.out.println("picked product not added successfully");
			}
			Commonclass.Threadtime5sec(driver, clickonsearch3rdtime);
			WebElement select1stone=driver.findElement(By.xpath("(//*[@class='product'])[1]"));
			JavascriptExecutor moveupto1stproduct = (JavascriptExecutor) driver;
			moveupto1stproduct.executeScript("arguments[0].click();", select1stone);
			Commonclass.Threadtime3sec(driver, select1stone);
	}
	@Test(priority=2,enabled=true)
	public void Testcustomization() throws Exception
	{
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
		Commonclass.Threadtime2sec(driver, select1mage);
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
	    Commonclass.Threadtime2sec(driver, clickonnext3invinyl);
	    WebElement Finish4= driver.findElement(By.xpath("//ion-button[text()='Finish']"));
	    Commonclass.Click(driver, Finish4);
		boolean customizatinbutton = driver.findElement(By.xpath("//*[text()='Done']")).isDisplayed();
		if(customizatinbutton){
			System.out.println("Customization done successfully");
		} else {
			System.out.println("Customization not done successfully");
		} 
		WebElement clickondone=driver.findElement(By.xpath("//*[text()='Done']"));
	    JavascriptExecutor moveuptodone= (JavascriptExecutor) driver;
	    moveuptodone.executeScript("arguments[0].click();", clickondone);
	    Commonclass.Threadtime5sec(driver, clickondone);
	}			
	@Test(priority=3,enabled=true)
	public void Checkout() throws Exception
	{
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
    WebElement clickoncreditcard=driver.findElement(By.xpath("//*[text()='Credit Card']")); 
    Commonclass.Click(driver, clickoncreditcard);
    WebElement clickonpaywithclover=driver.findElement(By.xpath("//*[text()='Pay With Clover']")); 
    Commonclass.Click(driver, clickonpaywithclover);
    WebElement sendpaywithcloverprice=driver.findElement(By.xpath("//*[@formcontrolname='paymentAmount']"));
    String Storepaywithcloverprice="54.99";
    Commonclass.SendKeys(driver, sendpaywithcloverprice, Storepaywithcloverprice);
    WebElement clickonokforpaywithclover=driver.findElement(By.xpath("//*[text()='Ok']")); 
    Commonclass.Click(driver, clickonokforpaywithclover);
    Commonclass.Threadtime3sec(driver, clickonokforpaywithclover);
    WebElement clickonback1=driver.findElement(By.xpath("//ion-button[text()='back']"));    
    Commonclass.Click(driver, clickonback1);
    Commonclass.Threadtime2sec(driver, clickonback1);
    WebElement exitposmode=driver.findElement(By.xpath("//ion-button[text()='Exit POS Mode']"));
    Commonclass.Click(driver, exitposmode);  
    boolean status = driver.findElement(By.xpath("//ion-button[text()='Exit POS Mode']")).isEnabled();
	if(status){
		System.out.println("Checkout was done successfully");
	} else {
		System.out.println("Checkout was not done successfully");
	}
    Commonclass.Threadtime3sec(driver, exitposmode);    
}
	@Test(priority=4,enabled=true)
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
    @Test(priority=5,enabled=true)
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
    @Test(priority=6,enabled=true)
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
    @Test(priority=7,enabled=true)
    public void Tailoring() throws Exception
    {
    WebElement clickonTailoring=driver.findElement(By.xpath("//ion-label[text()=' Tailoring ']"));
    Commonclass.Click(driver, clickonTailoring);
    Commonclass.Threadtime5sec(driver, clickonTailoring);
    //Thread.sleep(6000);
    WebElement clickonAllwork=driver.findElement(By.xpath("//ion-button[text()='All work']"));
    Commonclass.Click(driver, clickonAllwork);
    Commonclass.Threadtime3sec(driver, clickonAllwork);
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
    WebElement clickon1stproduct=driver.findElement(By.xpath("(//ion-icon[@name='arrow-forward'])[14]"));
    Commonclass.Click(driver, clickon1stproduct);
    WebElement clickonassignme=driver.findElement(By.xpath("//span[text()='Assign to Me']"));
    Commonclass.Click(driver, clickonassignme);
    Commonclass.Threadtime5sec(driver, clickonassignme);
    WebElement clickonnewassignedproduct=driver.findElement(By.xpath("(//ion-icon[@name='arrow-forward'])[14]"));
    Commonclass.Click(driver, clickonnewassignedproduct);
    WebElement clickonViewdetails=driver.findElement(By.xpath("//span[text()='View Details']"));
    Commonclass.Click(driver, clickonViewdetails);
    Commonclass.Threadtime2sec(driver, clickonViewdetails);
    WebElement clickonpolystershirt= driver.findElement(By.xpath("(//*[text()='Short Sleeve Polyester SuperShirt™'])[2]"));
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
	String storetailoringbarcode=p1.getProperty("Tailoringbarcodetoembroidery");
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
	Commonclass.Threadtime3sec(driver, clickoncompletebutton2);
    WebElement clickonbackbutton3=driver.findElement(By.xpath("(//button[@class='button-native sc-ion-back-button-md'])[2]"));
    Commonclass.Click(driver, clickonbackbutton3);
    Commonclass.Threadtime5sec(driver, clickonbackbutton3);
	WebElement ClickonMenuIcon2=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-tailoring/ion-header/ion-toolbar/ion-buttons[1]"));
	Commonclass.Click(driver, ClickonMenuIcon2);
	Commonclass.WaitForElementclickable(driver, ClickonMenuIcon2);
	Commonclass.Threadtime3sec(driver, ClickonMenuIcon2);   
    }
    @Test(priority=8,enabled=true)
    public void Embroidery() throws Exception
    {
    	WebElement clickEmbroiderey= driver.findElement(By.xpath("//*[text()=' Embroidery ']"));
    	JavascriptExecutor moveuptoembroidery = (JavascriptExecutor) driver;
    	moveuptoembroidery.executeScript("arguments[0].click();", clickEmbroiderey);
    	Commonclass.Threadtime3sec(driver, clickEmbroiderey);
    	WebElement clickonAllwork=driver.findElement(By.xpath("(//ion-button[text()='All work'])[2]"));
        Commonclass.Click(driver, clickonAllwork);
        WebElement clickonsortingoptions= driver.findElement(By.xpath("(//ion-icon[@name='options'])[4]"));
        JavascriptExecutor moveuptosortingoptionsicon = (JavascriptExecutor) driver;
        moveuptosortingoptionsicon.executeScript("arguments[0].click();", clickonsortingoptions);
        Commonclass.Threadtime3sec(driver, clickonsortingoptions);
        WebElement Clickonpackagedproduct=driver.findElement(By.xpath("(//ion-icon[@name='swap'])[3]"));
        Commonclass.Click(driver, Clickonpackagedproduct);
        WebElement clickonpackagingbarcode=driver.findElement(By.xpath("(//ion-radio[@name='packagingBarcode'])[2]"));
        Commonclass.Click(driver, clickonpackagingbarcode);
        WebElement clickondecendingbox= driver.findElement(By.xpath("(//ion-toggle[@role='checkbox'])[3]"));
        JavascriptExecutor moveuptodecendingbox = (JavascriptExecutor) driver;
        moveuptodecendingbox.executeScript("arguments[0].click();", clickondecendingbox);
        WebElement clickonsortbutton= driver.findElement(By.xpath("(//ion-button[text()='SORT'])[3]"));
        JavascriptExecutor moveuptosortbutton = (JavascriptExecutor) driver;
        moveuptosortbutton.executeScript("arguments[0].click();", clickonsortbutton);
        Commonclass.Threadtime5sec(driver, clickonsortbutton);
        WebElement Clickonproduct1=driver.findElement(By.xpath("(//ion-icon[@name='arrow-forward'])[31]"));
        Commonclass.Click(driver, Clickonproduct1);
        WebElement clickonViewdetails=driver.findElement(By.xpath("//span[text()='View Details']"));
        Commonclass.Click(driver, clickonViewdetails);
        Commonclass.Threadtime2sec(driver, clickonViewdetails);
    	WebElement clcikshirt=driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[2]"));
    	Commonclass.Click(driver, clcikshirt);
    	WebElement clickbegin=driver.findElement(By.xpath("//ion-button[text()='Begin']"));
    	Commonclass.Click(driver, clickbegin);
    	WebElement clickcomplete=driver.findElement(By.xpath("//ion-button[text()='Complete ']"));
    	Commonclass.Click(driver, clickcomplete);
    	WebElement backarrow= driver.findElement(By.xpath("(//ion-icon[@aria-label='arrow back'])[3]"));
    	JavascriptExecutor clickbackarrow = (JavascriptExecutor) driver;
    	clickbackarrow.executeScript("arguments[0].click();", backarrow);   
    	Commonclass.Threadtime3sec(driver, backarrow);
    	//WebElement clicktransfer=driver.findElement(By.xpath("(//ion-button[text()='TRANSFER'])[1]"));
    	//Commonclass.Click(driver, clicktransfer);
    	WebElement clicktransfer= driver.findElement(By.xpath("(//ion-button[text()='TRANSFER'])[1]"));
    	JavascriptExecutor moveuptotransfer = (JavascriptExecutor) driver;
    	moveuptotransfer.executeScript("arguments[0].click();", clicktransfer);
    	WebElement clickonscan=driver.findElement(By.xpath("//ion-button[text()='Scan']"));
    	Commonclass.Click(driver, clickonscan);
    	WebElement sendtransferbarnum=driver.findElement(By.xpath("(//input[@placeholder='UPC'])[1]"));
    	String storetailoringbarcode=p1.getProperty("Embroiderytoprint");
    	Commonclass.SendKeys(driver, sendtransferbarnum, storetailoringbarcode);
    	WebElement clickonserach3=driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]"));
    	Commonclass.Click(driver, clickonserach3);
    	WebElement clickoncomplete=driver.findElement(By.xpath("//ion-button[text()='Complete']")); 
    	Commonclass.Click(driver, clickoncomplete);
    	boolean status = driver.findElement(By.xpath("//ion-button[text()='Complete']")).isEnabled();
    	if(status){
    		System.out.println("Embroidery was done successfully");
    	} else {
    		System.out.println("Embroidery was not done successfully");
    	}
    	Commonclass.Threadtime3sec(driver, clickoncomplete);
        WebElement clickonbackbutton4=driver.findElement(By.xpath("(//button[@class='button-native sc-ion-back-button-md'])[2]"));
        Commonclass.Click(driver, clickonbackbutton4);
        Commonclass.Threadtime3sec(driver, clickonbackbutton4);
    	WebElement ClickonMenuIcon3=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-embroidery/ion-header/ion-toolbar/ion-buttons[1]"));
    	Commonclass.Click(driver, ClickonMenuIcon3);
    	Commonclass.Threadtime5sec(driver, ClickonMenuIcon3); 
    }
    @Test(priority=9,enabled=true)
    public void print() throws Exception
    {
    	WebElement clickEmbroiderey= driver.findElement(By.xpath("//*[text()=' Print ']"));
    	JavascriptExecutor moveuptoembroidery = (JavascriptExecutor) driver;
    	moveuptoembroidery.executeScript("arguments[0].click();", clickEmbroiderey);
    	Commonclass.Threadtime3sec(driver, clickEmbroiderey);
        WebElement Clickonproduct1=driver.findElement(By.xpath("(//*[text()='All work'])[3]"));
        Commonclass.Click(driver, Clickonproduct1);
        Commonclass.Threadtime2sec(driver, Clickonproduct1);
    /*	List<WebElement> allElement=driver.findElements(By.xpath("(//ion-icon[@name='arrow-forward'])"));
    	int count=allElement.size();
    	allElement.get(count-1);
    	JavascriptExecutor moveuptonewproductintoprint= (JavascriptExecutor) driver;
    	moveuptonewproductintoprint.executeScript("arguments[0].scrollIntoView();", allElement);     */
      //  WebElement Clickonproduct1=driver.findElement(By.xpath("(//*[text()='All work'])[3]"));
      //  Commonclass.Click(driver, Clickonproduct1);
    	WebElement clickonnewproduct=driver.findElement(By.xpath("(//ion-icon[@name='arrow-forward'])"));
    	Commonclass.Click(driver, clickonnewproduct);
    	WebElement backarrow= driver.findElement(By.xpath("(//ion-icon[@aria-label='arrow back'])[7]"));
    	JavascriptExecutor clickbackarrow = (JavascriptExecutor) driver;
    	clickbackarrow.executeScript("arguments[0].click();", backarrow);
        Commonclass.Threadtime2sec(driver, backarrow);  
    	WebElement clcikshirt=driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[4]"));
    	Commonclass.Click(driver, clcikshirt);
    	WebElement clickbegin=driver.findElement(By.xpath("//ion-button[text()='Begin']"));
    	Commonclass.Click(driver, clickbegin);
    	WebElement clickcomplete=driver.findElement(By.xpath("//ion-button[text()='Complete ']")); 
    	Commonclass.Click(driver, clickcomplete);   
    	Commonclass.Threadtime3sec(driver, clcikshirt);
    	WebElement backarrow2= driver.findElement(By.xpath("(//ion-icon[@aria-label='arrow back'])[7]"));
    	JavascriptExecutor clickbackarrow2 = (JavascriptExecutor) driver;
    	clickbackarrow2.executeScript("arguments[0].click();", backarrow2);
    	Commonclass.Threadtime3sec(driver, backarrow2);
    	WebElement clicktransfer=driver.findElement(By.xpath("(//ion-button[text()='TRANSFER'])[3]"));
    	Commonclass.Click(driver, clicktransfer);
    	WebElement clickonscan=driver.findElement(By.xpath("//ion-button[text()='Scan']"));
    	Commonclass.Click(driver, clickonscan);
    	WebElement sendtransferbarnum=driver.findElement(By.xpath("(//input[@placeholder='UPC'])[2]"));
    	String storetailoringbarcode=p1.getProperty("Printtovinylbarcode");
    	Commonclass.SendKeys(driver, sendtransferbarnum, storetailoringbarcode);
    	WebElement clickonserach3=driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]"));
    	Commonclass.Click(driver, clickonserach3);
    	WebElement clickoncomplete=driver.findElement(By.xpath("//ion-button[text()='Complete']")); 
    	Commonclass.Click(driver, clickoncomplete);
    	boolean status = driver.findElement(By.xpath("//ion-button[text()='Complete']")).isEnabled();
    	if(status){
    		System.out.println("print was done successfully");
    	} else {
    		System.out.println("print was not done successfully");
    	}
    	Commonclass.Threadtime5sec(driver, clickoncomplete);
    }
}