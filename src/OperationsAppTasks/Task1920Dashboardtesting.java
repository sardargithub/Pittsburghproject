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

public class Task1920Dashboardtesting 
{


	public static WebDriver driver;
	public static Properties p1;
	@Test(priority=1,enabled=true)
	public void RecreateOrder() throws Exception
	{
	String	Testname="Login";
    System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","--window-size=1195,705");
		driver = new ChromeDriver(options); //"headless"
		FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
		p1 = new Properties();
		p1.load(fis);
		driver.get(p1.getProperty("URL"));
		//options.setHeadless(true);
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
		String	Testname1="POSmodule";
		//Thread.sleep(3000);
	
		WebElement clickonpos= driver.findElement(By.xpath("//*[text()=' POS ']"));
	    JavascriptExecutor moveuptopos = (JavascriptExecutor) driver;
	    moveuptopos.executeScript("arguments[0].click();", clickonpos);
	   Commonclass.Threadtime3sec(driver, clickonpos);
		WebElement viewelement= driver.findElement(By.xpath("//*[text()=' View ']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", viewelement);
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
	    JavascriptExecutor moveuptomatthew = (JavascriptExecutor) driver;
	    moveuptomatthew.executeScript("arguments[0].click();", clickonmatthew);
		WebElement clickonyes1= driver.findElement(By.xpath("//*[text()='Yes']"));
		JavascriptExecutor moveuptoyes1 = (JavascriptExecutor) driver;
		moveuptoyes1.executeScript("arguments[0].click();", clickonyes1); 
		Commonclass.Threadtime2sec(driver, clickonyes1);
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
		public void Customization() throws Exception
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
	    Commonclass.Threadtime2sec(driver, clickonFinish1);
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
	    WebElement clickonnext3invinyl=driver.findElement(By.xpath("(//*[text()='Next'])[3]"));
	    JavascriptExecutor moveuptonext3invinyl= (JavascriptExecutor) driver;
	    moveuptonext3invinyl.executeScript("arguments[0].click();", clickonnext3invinyl);
	  //  WebElement selectnotes4= driver.findElement(By.xpath("//input[@formcontrolname='notes']"));
	  //  Commonclass.Click(driver, selectnotes4);
	    WebElement clickonnotes4=driver.findElement(By.xpath("(//*[text()='Next'])[3]"));
	    JavascriptExecutor moveuptonotes4= (JavascriptExecutor) driver;
	    moveuptonotes4.executeScript("arguments[0].click();", clickonnotes4);
	    Commonclass.Threadtime2sec(driver, selectnotes3);
	    WebElement Finish4= driver.findElement(By.xpath("//ion-button[text()='Finish']"));
	    Commonclass.Click(driver, Finish4);
		boolean customizatinbutton = driver.findElement(By.xpath("//*[text()='Done']")).isDisplayed();
		if(customizatinbutton){
			System.out.println("Customization done successfully");
		} else {
			System.out.println("Customization not done successfully");
		} 
	    WebElement clickondone=    driver.findElement(By.xpath("//*[text()='Done']"));
	    Commonclass.Click(driver, clickondone);   
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
        Thread.sleep(5000);
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
		Commonclass.Threadtime2sec(driver, clickon4thbox);
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
		Commonclass.Threadtime5sec(driver, clickonokinorderrelease);
	}
@Test(priority=5,enabled=true)
public void Processorder() throws Exception {
	WebElement clickonhome=driver.findElement(By.xpath("//mat-panel-title[text()=' Home ']"));
	Commonclass.Click(driver, clickonhome);
	WebElement clickonghome2=driver.findElement(By.xpath("//ion-label[text()=' Home ']"));
	Commonclass.Click(driver, clickonghome2);
	Commonclass.Threadtime3sec(driver, clickonghome2);
	WebElement clickonpicbinneedsprocess= driver.findElement(By.xpath("//div[text()='Pick Bins Need Processed']"));  
	Commonclass.Click(driver, clickonpicbinneedsprocess); 
	//Commonclass.Threadtime2sec(driver, clickonpicbinneedsprocess);
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
@Test(priority=6,enabled=true)
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
@Test(priority=7,enabled=true)
public void Tailoring() throws Exception
{
	WebElement clickontailaring= driver.findElement(By.xpath("//ion-label[text()=' Tailoring ']"));
	JavascriptExecutor moveuptotailoring = (JavascriptExecutor) driver;
	moveuptotailoring.executeScript("arguments[0].click();", clickontailaring);
	//Thread.sleep(20000);
	Commonclass.Threadtime5sec(driver, clickontailaring);
	WebElement clickonAllwork=driver.findElement(By.xpath("(//ion-button[text()='All work'])[1]"));
    Commonclass.Click(driver, clickonAllwork);
    Commonclass.Threadtime5sec(driver, clickonAllwork);
    //Commonclass.WaitForElementclickable(driver, clickonAllwork);
    //Thread.sleep(20000);
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
    //Thread.sleep(20000);
	WebElement clicknewproduct=driver.findElement(By.xpath("//*[@matsortactive='orgName']/tbody/tr[1]"));
	Commonclass.Click(driver, clicknewproduct);
	WebElement clickassignme=driver.findElement(By.xpath("//span[text()='Assign to Me']"));
	Commonclass.Click(driver, clickassignme);
	Commonclass.Threadtime5sec(driver, clickassignme);
	//Thread.sleep(20000);
	WebElement clicknewassignedproduct=driver.findElement(By.xpath("//*[@matsortactive='orgName']/tbody/tr[1]"));
	Commonclass.Click(driver, clicknewassignedproduct);
	WebElement clickonViewdetails=driver.findElement(By.xpath("//span[text()='View Details']"));
    Commonclass.Click(driver, clickonViewdetails);
    Commonclass.Threadtime5sec(driver, clickonViewdetails);
    //Thread.sleep(5000);
	//WebElement clcikshirt=driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[2]"));
	//Commonclass.Click(driver, clcikshirt);
	WebElement clickonshirt= driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[2]"));
    JavascriptExecutor moveuptoshirt = (JavascriptExecutor) driver;
    moveuptoshirt.executeScript("arguments[0].click();", clickonshirt);
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
	String storetailoringbarcode=p1.getProperty("Tailoringbarcodetoembroidery");
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
@Test(priority=8,enabled=true)
public void Embroidery() throws Exception
{
	WebElement clickEmbroiderey= driver.findElement(By.xpath("//*[text()=' Embroidery ']"));
	JavascriptExecutor moveuptoembroidery = (JavascriptExecutor) driver;
	moveuptoembroidery.executeScript("arguments[0].click();", clickEmbroiderey);
	Commonclass.Threadtime3sec(driver, clickEmbroiderey);
	WebElement clickonAllwork=driver.findElement(By.xpath("(//ion-button[text()='All work'])[2]"));
    Commonclass.Click(driver, clickonAllwork);
    WebElement clickonsortingoptions= driver.findElement(By.xpath("(//ion-icon[@name='options'])[5]"));
    JavascriptExecutor moveuptosortingoptionsicon = (JavascriptExecutor) driver;
    moveuptosortingoptionsicon.executeScript("arguments[0].click();", clickonsortingoptions);
    Commonclass.Threadtime3sec(driver, clickonsortingoptions);
    WebElement Clickonpackagedproduct=driver.findElement(By.xpath("(//ion-icon[@name='swap'])[4]"));
    Commonclass.Click(driver, Clickonpackagedproduct);
    WebElement clickonpackagingbarcode=driver.findElement(By.xpath("(//ion-radio[@name='packagingBarcode'])[3]"));
    Commonclass.Click(driver, clickonpackagingbarcode);
    WebElement clickondecendingbox= driver.findElement(By.xpath("(//ion-toggle[@role='checkbox'])[4]"));
    JavascriptExecutor moveuptodecendingbox = (JavascriptExecutor) driver;
    moveuptodecendingbox.executeScript("arguments[0].click();", clickondecendingbox);
    WebElement clickonsortbutton= driver.findElement(By.xpath("(//ion-button[text()='SORT'])[4]"));
    JavascriptExecutor moveuptosortbutton = (JavascriptExecutor) driver;
    moveuptosortbutton.executeScript("arguments[0].click();", clickonsortbutton);
    Commonclass.Threadtime5sec(driver, clickonsortbutton);
    WebElement Clickonproduct1=driver.findElement(By.xpath("(//*[@matsortactive='orgName']/tbody/tr[1])[2]"));
    Commonclass.Click(driver, Clickonproduct1);
    WebElement clickonViewdetails=driver.findElement(By.xpath("//span[text()='View Details']"));
    Commonclass.Click(driver, clickonViewdetails);
    Commonclass.Threadtime5sec(driver, clickonViewdetails);
    //Thread.sleep(5000);
	//WebElement clcikshirt=driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[3]"));
	//Commonclass.Click(driver, clcikshirt);
    WebElement clickonshirt= driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[3]"));
    JavascriptExecutor moveuptoshirt = (JavascriptExecutor) driver;
    moveuptoshirt.executeScript("arguments[0].click();", clickonshirt);
	WebElement clickbegin=driver.findElement(By.xpath("//ion-button[text()='Begin']"));
	Commonclass.Click(driver, clickbegin);
	WebElement clickcomplete=driver.findElement(By.xpath("//ion-button[text()='Complete ']"));
	Commonclass.Click(driver, clickcomplete);
	WebElement backarrow= driver.findElement(By.xpath("(//ion-icon[@aria-label='arrow back'])[6]"));
	JavascriptExecutor clickbackarrow = (JavascriptExecutor) driver;
	clickbackarrow.executeScript("arguments[0].click();", backarrow);   
	Commonclass.Threadtime3sec(driver, backarrow);
	WebElement clicktransfer=driver.findElement(By.xpath("(//ion-button[text()='TRANSFER'])[2]"));
	Commonclass.Click(driver, clicktransfer);
	WebElement clickonscan=driver.findElement(By.xpath("//ion-button[text()='Scan']"));
	Commonclass.Click(driver, clickonscan);
	WebElement sendtransferbarnum=driver.findElement(By.xpath("(//input[@placeholder='UPC'])[2]"));
	String storetailoringbarcode=p1.getProperty("Embroiderytoprint");
	Commonclass.SendKeys(driver, sendtransferbarnum, storetailoringbarcode);
	WebElement clickonserach3=driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]"));
	Commonclass.Click(driver, clickonserach3);
	WebElement clickoncomplete=driver.findElement(By.xpath("//ion-button[text()='Complete']")); 
	Commonclass.Click(driver, clickoncomplete);
	boolean status = driver.findElement(By.xpath("//ion-button[text()='Complete']")).isEnabled();
	if(status){
		System.out.println("Embroidery was done successfully");
	} else {
		System.out.println("Embroidery was not done successfully");
	}
	Commonclass.Threadtime5sec(driver, clickoncomplete);
}
@Test(priority=9,enabled=true)
public void print() throws Exception
{
	WebElement clickprint= driver.findElement(By.xpath("//*[text()=' Print ']"));
	JavascriptExecutor moveuptoprint = (JavascriptExecutor) driver;
	moveuptoprint.executeScript("arguments[0].click();", clickprint);
	Commonclass.Threadtime3sec(driver, clickprint);
	WebElement clickonAllworkinprint=driver.findElement(By.xpath("(//ion-button[text()='All work'])[3]"));
    Commonclass.Click(driver, clickonAllworkinprint);
    WebElement clickonsortingoptions= driver.findElement(By.xpath("(//ion-icon[@name='options'])[6]"));
    JavascriptExecutor moveuptosortingoptionsicon = (JavascriptExecutor) driver;
    moveuptosortingoptionsicon.executeScript("arguments[0].click();", clickonsortingoptions);
    Commonclass.Threadtime3sec(driver, clickonsortingoptions);
    WebElement Clickonpackagedproduct=driver.findElement(By.xpath("(//ion-icon[@name='swap'])[5]"));
    Commonclass.Click(driver, Clickonpackagedproduct);
    WebElement clickonpackagingbarcode=driver.findElement(By.xpath("(//ion-radio[@name='packagingBarcode'])[4]"));
    Commonclass.Click(driver, clickonpackagingbarcode);
    WebElement clickondecendingbox= driver.findElement(By.xpath("(//ion-toggle[@role='checkbox'])[5]"));
    JavascriptExecutor moveuptodecendingbox = (JavascriptExecutor) driver;
    moveuptodecendingbox.executeScript("arguments[0].click();", clickondecendingbox);
    WebElement clickonsortbutton= driver.findElement(By.xpath("(//ion-button[text()='SORT'])[5]"));
    JavascriptExecutor moveuptosortbutton = (JavascriptExecutor) driver;
    moveuptosortbutton.executeScript("arguments[0].click();", clickonsortbutton);
    Commonclass.Threadtime5sec(driver, clickonsortbutton);
    WebElement Clickonproduct1=driver.findElement(By.xpath("(//*[@matsortactive='orgName'])[3]/tbody/tr[1]"));
    Commonclass.Click(driver, Clickonproduct1);
    WebElement clickonViewdetails=driver.findElement(By.xpath("//span[text()='View Details']"));
    Commonclass.Click(driver, clickonViewdetails);
    Commonclass.Threadtime5sec(driver, Clickonproduct1);  
	//WebElement clcikshirt=driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[4]"));
	//Commonclass.Click(driver, clcikshirt);
    WebElement clickonshirt= driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[4]"));
    JavascriptExecutor moveuptoshirt = (JavascriptExecutor) driver;
    moveuptoshirt.executeScript("arguments[0].click();", clickonshirt);
	WebElement clickbegin=driver.findElement(By.xpath("//ion-button[text()='Begin']"));
	Commonclass.Click(driver, clickbegin);
	WebElement clickcomplete=driver.findElement(By.xpath("//ion-button[text()='Complete ']")); 
	Commonclass.Click(driver, clickcomplete);   
	Commonclass.Threadtime3sec(driver, clickcomplete);
	WebElement backarrow= driver.findElement(By.xpath("(//ion-icon[@aria-label='arrow back'])[7]"));
	JavascriptExecutor clickbackarrow = (JavascriptExecutor) driver;
	clickbackarrow.executeScript("arguments[0].click();", backarrow);
	Commonclass.Threadtime3sec(driver, backarrow);
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
@Test(priority=10,enabled=true)
public void Vinyl() throws Exception
{
	WebElement clickonvinyl= driver.findElement(By.xpath("//*[text()=' Vinyl ']"));
	JavascriptExecutor moveuptovinyl = (JavascriptExecutor) driver;
	moveuptovinyl.executeScript("arguments[0].click();", clickonvinyl);
	Commonclass.Threadtime3sec(driver, clickonvinyl);
	WebElement clickonAllworkinvinyl=driver.findElement(By.xpath("(//ion-button[text()='All work'])[4]"));
    Commonclass.Click(driver, clickonAllworkinvinyl);
    WebElement clickonsortingoptions= driver.findElement(By.xpath("(//ion-icon[@name='options'])[7]"));
    JavascriptExecutor moveuptosortingoptionsicon = (JavascriptExecutor) driver;
    moveuptosortingoptionsicon.executeScript("arguments[0].click();", clickonsortingoptions);
    Commonclass.Threadtime3sec(driver, clickonsortingoptions);
    WebElement Clickonpackagedproduct=driver.findElement(By.xpath("(//ion-icon[@name='swap'])[6]"));
    Commonclass.Click(driver, Clickonpackagedproduct);
    WebElement clickonpackagingbarcode=driver.findElement(By.xpath("(//ion-radio[@name='packagingBarcode'])[5]"));
    Commonclass.Click(driver, clickonpackagingbarcode);
    WebElement clickondecendingbox= driver.findElement(By.xpath("(//ion-toggle[@role='checkbox'])[6]"));
    JavascriptExecutor moveuptodecendingbox = (JavascriptExecutor) driver;
    moveuptodecendingbox.executeScript("arguments[0].click();", clickondecendingbox);
    WebElement clickonsortbutton= driver.findElement(By.xpath("(//ion-button[text()='SORT'])[6]"));
    JavascriptExecutor moveuptosortbutton = (JavascriptExecutor) driver;
    moveuptosortbutton.executeScript("arguments[0].click();", clickonsortbutton);
    Commonclass.Threadtime5sec(driver, clickonsortbutton);
    WebElement Clickonproduct1=driver.findElement(By.xpath("(//*[@matsortactive='orgName'])[4]/tbody/tr[1]"));
    Commonclass.Click(driver, Clickonproduct1);
   // Commonclass.Threadtime5sec(driver, Clickonproduct1);
    WebElement clickonViewdetails=driver.findElement(By.xpath("//span[text()='View Details']"));
    Commonclass.Click(driver, clickonViewdetails);
    Thread.sleep(5000);
	//WebElement clcikshirt=driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[5]"));
	//Commonclass.Click(driver, clcikshirt);
    WebElement clickonshirt= driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[5]"));
    JavascriptExecutor moveuptoshirt = (JavascriptExecutor) driver;
    moveuptoshirt.executeScript("arguments[0].click();", clickonshirt);
	WebElement clickbegin=driver.findElement(By.xpath("//ion-button[text()='Begin']"));
	Commonclass.Click(driver, clickbegin);
	WebElement clickcomplete=driver.findElement(By.xpath("//ion-button[text()='Complete ']")); 
	Commonclass.Click(driver, clickcomplete);   
	Commonclass.Threadtime3sec(driver, clickcomplete);
	WebElement backarrow= driver.findElement(By.xpath("(//ion-icon[@aria-label='arrow back'])[8]"));
	JavascriptExecutor clickbackarrow = (JavascriptExecutor) driver;
	clickbackarrow.executeScript("arguments[0].click();", backarrow);
	Commonclass.Threadtime3sec(driver, backarrow);
	WebElement clicktransfer=driver.findElement(By.xpath("(//ion-button[text()='TRANSFER'])[4]"));
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
		System.out.println("Vinyl was done successfully");
	} else {
		System.out.println("Vinyl was not done successfully");
	}
	Commonclass.Threadtime5sec(driver, clickoncomplete);
}
@Test(priority=11,enabled=true)
public void QualityAsurance() throws Exception
{
	WebElement clickQA= driver.findElement(By.xpath("//ion-label[text()=' Quality Assurance ']"));
	JavascriptExecutor clickanywhere = (JavascriptExecutor) driver;
	clickanywhere.executeScript("arguments[0].click();", clickQA);
	Commonclass.Threadtime5sec(driver, clickQA);
	//Thread.sleep(7000);
	WebElement clickonAllworkinvinyl=driver.findElement(By.xpath("(//ion-button[text()='All work'])[5]"));
    Commonclass.Click(driver, clickonAllworkinvinyl);
    Commonclass.Threadtime5sec(driver, clickonAllworkinvinyl);
    WebElement clickonsortingoptions= driver.findElement(By.xpath("(//ion-icon[@name='options'])[8]"));
    JavascriptExecutor moveuptosortingoptionsicon = (JavascriptExecutor) driver;
    moveuptosortingoptionsicon.executeScript("arguments[0].click();", clickonsortingoptions);
    Commonclass.Threadtime3sec(driver, clickonsortingoptions);
    WebElement Clickonpackagedproduct=driver.findElement(By.xpath("(//ion-icon[@name='swap'])[7]"));
    Commonclass.Click(driver, Clickonpackagedproduct);
    WebElement clickonpackagingbarcode=driver.findElement(By.xpath("(//ion-radio[@name='packagingBarcode'])[6]"));
    Commonclass.Click(driver, clickonpackagingbarcode);
    WebElement clickondecendingbox= driver.findElement(By.xpath("(//ion-toggle[@role='checkbox'])[7]"));
    JavascriptExecutor moveuptodecendingbox = (JavascriptExecutor) driver;
    moveuptodecendingbox.executeScript("arguments[0].click();", clickondecendingbox);
    WebElement clickonsortbutton= driver.findElement(By.xpath("(//ion-button[text()='SORT'])[7]"));
    JavascriptExecutor moveuptosortbutton = (JavascriptExecutor) driver;
    moveuptosortbutton.executeScript("arguments[0].click();", clickonsortbutton);
    Commonclass.Threadtime5sec(driver, clickonsortbutton);
	WebElement clcik1stone=driver.findElement(By.xpath("(//*[@matsortactive='orgName'])[5]/tbody/tr[1]"));
	Commonclass.Click(driver, clcik1stone);
	WebElement clickonViewdetails=driver.findElement(By.xpath("//span[text()='View Details']"));
	Commonclass.Click(driver, clickonViewdetails);
	Commonclass.Threadtime5sec(driver, clickonViewdetails);
	//WebElement clickshirt=driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[6]"));
	//Commonclass.Click(driver, clickshirt);
	 WebElement clickonshirt= driver.findElement(By.xpath("(//div[text()='Short Sleeve Polyester SuperShirt™'])[6]"));
	    JavascriptExecutor moveuptoshirt = (JavascriptExecutor) driver;
	    moveuptoshirt.executeScript("arguments[0].click();", clickonshirt);
	Commonclass.Threadtime5sec(driver, clickonshirt);
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
	WebElement Clickoncontoinue= driver.findElement(By.xpath("//*[text()='Continue']"));
	JavascriptExecutor moveuptocontinue = (JavascriptExecutor) driver;
	moveuptocontinue.executeScript("arguments[0].click();", Clickoncontoinue);
	WebElement clickonpass2=driver.findElement(By.xpath("(//ion-button[text()='Pass'])[1]"));
	Commonclass.Click(driver, clickonpass2);
	WebElement Clickoncontoinue2= driver.findElement(By.xpath("//*[text()='Continue']"));
	JavascriptExecutor moveuptocontinue2 = (JavascriptExecutor) driver;
	moveuptocontinue2.executeScript("arguments[0].click();", Clickoncontoinue2);
	WebElement clickonpass3=driver.findElement(By.xpath("(//ion-button[text()='Pass'])[1]"));
	Commonclass.Click(driver, clickonpass3);
	WebElement Clickoncontoinue3= driver.findElement(By.xpath("//*[text()='Continue']"));
	JavascriptExecutor moveuptocontinue3 = (JavascriptExecutor) driver;
	moveuptocontinue3.executeScript("arguments[0].click();", Clickoncontoinue3);
	WebElement clickonpass4=driver.findElement(By.xpath("(//ion-button[text()='Pass'])[1]"));
	Commonclass.Click(driver, clickonpass4);
	WebElement Clickoncontoinue4= driver.findElement(By.xpath("//*[text()='Continue']"));
	JavascriptExecutor moveuptocontinue4 = (JavascriptExecutor) driver;
	moveuptocontinue4.executeScript("arguments[0].click();", Clickoncontoinue4);
	WebElement clickonpass5=driver.findElement(By.xpath("(//ion-button[text()='Pass'])[1]"));
	Commonclass.Click(driver, clickonpass5);
	WebElement Clickoncontoinue5= driver.findElement(By.xpath("//*[text()='Continue']"));
	JavascriptExecutor moveuptocontinue5 = (JavascriptExecutor) driver;
	moveuptocontinue5.executeScript("arguments[0].click();", Clickoncontoinue5);
	WebElement clickonpass6=driver.findElement(By.xpath("(//ion-button[text()='Pass'])[1]"));
	Commonclass.Click(driver, clickonpass6);
	WebElement Clickcomplete= driver.findElement(By.xpath("//*[text()='QC Complete']"));
	JavascriptExecutor Clickanyloc = (JavascriptExecutor) driver;
	Clickanyloc.executeScript("arguments[0].click();", Clickcomplete);
	boolean status = driver.findElement(By.xpath("//*[text()='QC Complete']")).isEnabled();
	if(status){
		System.out.println("QC was done successfully");
	} else {
		System.out.println("QC was not done successfully");
	}
	Commonclass.Threadtime5sec(driver, Clickcomplete);
	WebElement clicktransfer=driver.findElement(By.xpath("(//ion-button[text()='TRANSFER'])[5]"));
	Commonclass.Click(driver, clicktransfer);
	WebElement clickonscan=driver.findElement(By.xpath("//ion-button[text()='Scan']"));
	Commonclass.Click(driver, clickonscan);
	WebElement sendtransferbarnum=driver.findElement(By.xpath("(//input[@placeholder='UPC'])[2]"));
	String storetailoringbarcode=p1.getProperty("QCtoAwaitingdeliverybarcode");
	Commonclass.SendKeys(driver, sendtransferbarnum, storetailoringbarcode);
	WebElement clickonserach3=driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]"));
	Commonclass.Click(driver, clickonserach3);
	WebElement clickoncomplete=driver.findElement(By.xpath("//ion-button[text()='Complete']")); 
	Commonclass.Click(driver, clickoncomplete);
	boolean transfercomplete = driver.findElement(By.xpath("//ion-button[text()='Complete']")).isEnabled();
	if(transfercomplete){
		System.out.println("QC to Awaiting delivery transfer was done successfully");
	} else {
		System.out.println("QC to Awaiting delivery transfer was not done successfully");
	}
}


}
