package OperationsAppTasks;

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

public class Task1847withoutThread 
{
	public static WebDriver driver;
	public static Properties p1;
	@Test(priority=1,enabled=true)
	public void SelectPickedandNeedspicked() throws Exception
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
		Commonclass.Threadtime3sec(driver, Loginbutton);
		WebElement clickonpos= driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-5\"]/span[1]/mat-panel-title"));
	    JavascriptExecutor moveuptopos = (JavascriptExecutor) driver;
	    moveuptopos.executeScript("arguments[0].click();", clickonpos);
		WebElement viewelement= driver.findElement(By.xpath("//*[text()=' View ']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", viewelement);
	    WebElement	selectlocation=driver.findElement(By.xpath("//*[text()='Neville Island']"));
	    Commonclass.Click(driver, selectlocation);
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
		WebElement clickonmatthew= driver.findElement(By.xpath("//*[text()='Sardar12345 ']"));
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
	    WebElement getpicbinbarcode = driver.findElement(By.xpath("//span[@name='pickBinLabel']"));
	  	String storepicbinbarcode = getpicbinbarcode.getText(); 
	  	String getinnerscripttt = "return arguments[0].innerText";
	  	storepicbinbarcode= (String) ((JavascriptExecutor) driver).executeScript(getinnerscripttt, getpicbinbarcode);
	  	System.out.println(storepicbinbarcode);
	  	WebElement clickonbarcode1=driver.findElement(By.xpath("//*[@name='barcode']"));
	  	Commonclass.Click(driver, clickonbarcode1);
		WebElement sendbarcodeupc1=driver.findElement(By.xpath("//*[@name='ion-input-2']"));
		String storebarcodeupc1=p1.getProperty("BarcodeUpc1");
		Commonclass.SendKeys(driver, sendbarcodeupc1, storebarcodeupc1);
		WebElement clcikonsearch1time=driver.findElement(By.xpath("(//*[text()='Search'])[3]"));
		Commonclass.Click(driver, clcikonsearch1time);
		WebElement customersize= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
	    JavascriptExecutor moveuptocustomersize = (JavascriptExecutor) driver;
	    moveuptocustomersize.executeScript("arguments[0].click();", customersize);
		WebElement selectpickedproduct= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[3]"));
	    JavascriptExecutor moveuptopickedproduct = (JavascriptExecutor) driver;
	    moveuptopickedproduct.executeScript("arguments[0].click();", selectpickedproduct);
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
		WebElement addproduct=driver.findElement(By.xpath("(//*[text()='Search'])[3]"));
		JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
		moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
		WebElement erasebarcodeandsendnewone=driver.findElement(By.xpath("//*[@name='ion-input-2']"));
		Commonclass.clear(driver, erasebarcodeandsendnewone);
		String storebarcode2time=p1.getProperty("BarcodeUpc1");
		Commonclass.SendKeys(driver, erasebarcodeandsendnewone, storebarcode2time);
		WebElement searchbarcode= driver.findElement(By.xpath("(//*[text()='Search'])[3]"));
	    JavascriptExecutor moveuptosearchbarcode = (JavascriptExecutor) driver;
	    moveuptosearchbarcode.executeScript("arguments[0].click();", searchbarcode);
		WebElement customersize2= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
	    JavascriptExecutor moveuptocustomersize2 = (JavascriptExecutor) driver;
	    moveuptocustomersize2.executeScript("arguments[0].click();", customersize2);
		WebElement selectneedspickedproduct= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[4]"));
	    JavascriptExecutor moveuptoneedspickedproduct = (JavascriptExecutor) driver;
	    moveuptoneedspickedproduct.executeScript("arguments[0].click();", selectneedspickedproduct);
		WebElement clickonsuccess2ndtime=driver.findElement(By.xpath("(//ion-button[@color='success'])[6]"));
		Commonclass.Click(driver, clickonsuccess2ndtime);
		boolean NeedsPickedproduct = driver.findElement(By.xpath("(//ion-button[@color='success'])[6]")).isEnabled();
		if(NeedsPickedproduct){
			System.out.println("Added Needspicked product successfully");
		} else {
			System.out.println(" Needspicked product not added successfully");
		}
}
}