package OperationsAppTasks;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pittsburgh.base.Baseclass;

public class Task1732Main {
	public static WebDriver driver;
	public static Properties p1;
		@Test(priority=1,enabled=true)
		public void RecreateOrder() throws Exception
		{
			String	Testname="Createanorderwithpickedproducts";
			Baseclass.setup();

			//			System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications","--window-size=1366,768");
			driver = new ChromeDriver(options);
			FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
			p1 = new Properties();
			p1.load(fis);
		//	driver.get(p1.getProperty("URL"));
			DesiredCapabilities cap = DesiredCapabilities.chrome();
	        cap.setCapability(ChromeOptions.CAPABILITY, options);
			 LoggingPreferences logPrefs = new LoggingPreferences();
	         logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
	         options.setCapability("goog:loggingPrefs", logPrefs);
	         driver.get(p1.getProperty("URL"));
			driver.manage().window().maximize();
			// driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[text()='Login']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(p1.getProperty("Username"));
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(p1.getProperty("Password"));
			driver.findElement(By.xpath("//ion-button[@type='submit']")).click();
			String pagetitle = driver.getTitle();
			System.out.println(pagetitle);
			Thread.sleep(5000);//*[@id="mat-expansion-panel-header-5"]/span[1]/mat-panel-title
			driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-5\"]/span[1]/mat-panel-title")).click();
			//driver.findElement(By.xpath("//*[text()=' View ']")).click();
			Thread.sleep(3000);
		    WebElement clickonview= driver.findElement(By.xpath("//*[text()=' View ']"));
			JavascriptExecutor moveuptoview = (JavascriptExecutor) driver;
			moveuptoview.executeScript("arguments[0].click();", clickonview);
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
			Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='form-group-input-4']")).sendKeys("01132021");
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(3000);
			//	driver.findElement(By.xpath("//*[text()='Matt ']")).click();
				WebElement clickonmatthew= driver.findElement(By.xpath("//*[text()='Matt ']"));
			    JavascriptExecutor moveuptomatthew = (JavascriptExecutor) driver;
			    moveuptomatthew.executeScript("arguments[0].click();", clickonmatthew);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//ion-button[text()='Yes']")).click();
				Thread.sleep(3000);
				//driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]")).click();
				WebElement clickontest= driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]"));
			    JavascriptExecutor moveuptotestclient = (JavascriptExecutor) driver;
			    moveuptotestclient.executeScript("arguments[0].click();", clickontest);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[text()='Yes']")).click();
				Thread.sleep(3000);
			//	driver.findElement(By.xpath("//*[text()='Skip']")).click();
				WebElement clickonskip= driver.findElement(By.xpath("//*[text()='Skip']"));
			    JavascriptExecutor moveuptoskip = (JavascriptExecutor) driver;
			    moveuptoskip.executeScript("arguments[0].click();", clickonskip);
				Thread.sleep(3000);
				//driver.findElement(By.xpath("//*[text()='Agency Order ']")).click();
				WebElement clickonpayment= driver.findElement(By.xpath("//*[text()='Agency Order ']"));
			    JavascriptExecutor moveuptopayment = (JavascriptExecutor) driver;
			    moveuptopayment.executeScript("arguments[0].click();", clickonpayment);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='OK']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//ion-icon[@aria-label='create'])[4]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//ion-button[text()='Neville Island']")).click();
				driver.findElement(By.xpath("//*[text()='Pick BIN Label ']")).click();
				Thread.sleep(3000);
				WebElement addproduct2= driver.findElement(By.xpath("//*[text()='Microsoft Print to PDF']"));
			    JavascriptExecutor jsee2 = (JavascriptExecutor) driver;
			    jsee2.executeScript("arguments[0].click();", addproduct2);
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//*[text()='Print ']")).click();
			     Thread.sleep(3000);
			      WebElement hiddenDivtag = driver.findElement(By.xpath("//span[@name='pickBinLabel']"));
			  	String nnn = hiddenDivtag.getText(); // does not work (returns "" as expected)
			  	String scripttt = "return arguments[0].innerText";
			  	nnn= (String) ((JavascriptExecutor) driver).executeScript(scripttt, hiddenDivtag);
			  	System.out.println(nnn);
			  	Thread.sleep(3000);
				  WebElement addproduct= driver.findElement(By.xpath("//*[contains(text(),'Add Product ')]"));
			      JavascriptExecutor jsee = (JavascriptExecutor) driver;
			      jsee.executeScript("arguments[0].click();", addproduct);
			       Thread.sleep(3000);
			       driver.findElement(By.xpath("//*[text()='Search Product to Add']")).click();
			       Thread.sleep(3000);
			       driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
			       Thread.sleep(3000);
			       driver.findElement(By.xpath("//span[text()=' Blauer ']")).click();
			       driver.findElement(By.xpath("//*[@formcontrolname='manufacturerNum']")).click();
			       driver.findElement(By.xpath("//span[text()=' 8600-Z ']")).click();
			       driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click();
			       Thread.sleep(3000);
			       driver.findElement(By.xpath("//td[text()=' LS ZIPPERED POLYESTER SHIRT ']")).click();
			       Thread.sleep(3000);
			       driver.findElement(By.xpath("(//ion-button[text()='Show Related '])[2]")).click();
			       Thread.sleep(3000);  
				driver.findElement(By.xpath("//td[text()=' BLACK ']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()=' Add product to Order']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]")).click();
				  Thread.sleep(3000);
			    // driver.findElement(By.xpath("(//*[@color='success'])[6]")).click();
				  driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[3]")).click();
				  Thread.sleep(3000);
					//driver.findElement(By.xpath("//ion-button[text()='Use Other Printer']")).click();
					WebElement addproduct5= driver.findElement(By.xpath("//ion-button[text()='Use Other Printer']"));
				      JavascriptExecutor jsee5 = (JavascriptExecutor) driver;
				      jsee5.executeScript("arguments[0].click();", addproduct5);
					Thread.sleep(3000);
					  WebElement addproduct4= driver.findElement(By.xpath("//*[text()='Microsoft Print to PDF']"));
				      JavascriptExecutor jsee4 = (JavascriptExecutor) driver;
				      jsee4.executeScript("arguments[0].click();", addproduct4);	
					Thread.sleep(3000);
				  WebElement addproduct3= driver.findElement(By.xpath("(//*[@color='success'])[6]"));
			      JavascriptExecutor jsee3 = (JavascriptExecutor) driver;
			      jsee3.executeScript("arguments[0].click();", addproduct3);   
	              Thread.sleep(3000);
	WebElement hiddenDiv = driver.findElement(By.xpath("//span[@name='ppssBarcode']"));
	String n = hiddenDiv.getText(); // does not work (returns "" as expected)
	String script = "return arguments[0].innerText";
	n= (String) ((JavascriptExecutor) driver).executeScript(script, hiddenDiv);
	System.out.println(n);
	driver.findElement(By.xpath("//input[@name='upc']")).sendKeys(n);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='upc']")).sendKeys(nnn);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click();  
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Save']")).click(); 
	Thread.sleep(5000);
	WebElement ClickCheckout= driver.findElement(By.xpath("//ion-button[text()=' Checkout']"));
	JavascriptExecutor clickanylocation = (JavascriptExecutor) driver;
	clickanylocation.executeScript("arguments[0].click();", ClickCheckout);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//ion-button[text()='Verify']")).click();
	WebElement Clickverify= driver.findElement(By.xpath("//ion-button[text()='Verify']"));
	JavascriptExecutor clickany = (JavascriptExecutor) driver;
	clickany.executeScript("arguments[0].click();", Clickverify);
	Thread.sleep(10000);
	driver.findElement(By.xpath("//ion-button[text()='Next']")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Customer will pickup the order']")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Neville Island Store']")).click(); 
	Thread.sleep(6000);
	driver.findElement(By.xpath("//ion-button[text()='Agency Bill']")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("12345");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Save']")).click(); 
	Thread.sleep(10000);
	driver.findElement(By.xpath("//ion-button[text()='back']")).click();    
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Exit POS Mode']")).click();
		}
@Test(priority=2,enabled=true)
public void Releaseorder() throws Exception
{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Orders Need Reviewed']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[4]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[5]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='RELEASE ORDER']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='OK']")).click();
}
	@Test(priority=3,enabled=true)
	public void Processorder() throws Exception {
	Thread.sleep(4000);
	driver.findElement(By.xpath("//mat-panel-title[text()=' Home ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-label[text()=' Home ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Pick Bins Need Processed']")).click();  
	Thread.sleep(3000);    
	WebElement element2= driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]"));
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("arguments[0].click();", element2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='View Pick Bin']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Scan']")).click();
	Thread.sleep(3000);
	 WebElement picbinbarcode = driver.findElement(By.xpath("//li[@class='ng-star-inserted']"));
			  	String storeinstring = picbinbarcode.getText(); // does not work (returns "" as expected)
			  	String getinnerscript = "return arguments[0].innerText";
			  	storeinstring= (String) ((JavascriptExecutor) driver).executeScript(getinnerscript, picbinbarcode);
			  	System.out.println(getinnerscript);
			  	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys(storeinstring);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Next']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Next']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='number']")).clear();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1");
	Thread.sleep(3000);    
	driver.findElement(By.xpath("//ion-button[text()='Print']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Next']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Scan Container Barcode']")).click();
	Thread.sleep(3000);
	WebElement Storecontainerbarcode = driver.findElement(By.xpath("//span[@name='containerLabelBarcode']"));
	String getcontainerbarcode = Storecontainerbarcode.getText(); // does not work (returns "" as expected)
	String getinnertext = "return arguments[0].innerText";
	getcontainerbarcode= (String) ((JavascriptExecutor) driver).executeScript(getinnertext, Storecontainerbarcode);
	System.out.println(getcontainerbarcode);
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys(getcontainerbarcode);
	Thread.sleep(3000);
	  driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//ion-button[text()='Scan']")).click();
	  Thread.sleep(3000);
	  WebElement Storeppssbarcode1 = driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])[2]"));
		String getppssbarcode1 = Storeppssbarcode1.getText(); // does not work (returns "" as expected)
		String getinnertextppss1 = "return arguments[0].innerText";
		getppssbarcode1= (String) ((JavascriptExecutor) driver).executeScript(getinnertextppss1, Storeppssbarcode1);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys(getppssbarcode1);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Okay']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Scan Container ']")).click();
	Thread.sleep(3000);
	WebElement Storecontainerbarcode2 = driver.findElement(By.xpath("//span[@name='containerLabelBarcode']"));
	String getcontainerbarcode2 = Storecontainerbarcode2.getText(); // does not work (returns "" as expected)
	String getinnertextcontainer2 = "return arguments[0].innerText";
	getcontainerbarcode2= (String) ((JavascriptExecutor) driver).executeScript(getinnertextcontainer2, Storecontainerbarcode2);
	System.out.println(getcontainerbarcode2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys(getcontainerbarcode2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	driver.findElement(By.xpath("//ion-button[text()='Scan Slot ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys("SL000000002");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Finish']")).click(); 
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Okay']")).click();
}
	@Test(priority=4,enabled=true)
	public void Transfertocontainer() throws Exception
	{
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//mat-panel-title[text()=' Orders ']")).click(); 
		WebElement clickonorders= driver.findElement(By.xpath("//mat-panel-title[text()=' Orders ']"));
		JavascriptExecutor moveuptoorders = (JavascriptExecutor) driver;
		moveuptoorders.executeScript("arguments[0].click();", clickonorders);
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//ion-label[text()=' View Orders ']")).click(); 
		WebElement clickonvieworders= driver.findElement(By.xpath("//ion-label[text()=' View Orders ']"));
		JavascriptExecutor moveuptovieworders = (JavascriptExecutor) driver;
		moveuptovieworders.executeScript("arguments[0].click();", clickonvieworders);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[11]")).click(); 
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//strong[text()='Pick Bins & Container Tracking ']")).click(); 
		WebElement clickonpicbinandtracker= driver.findElement(By.xpath("//strong[text()='Pick Bins & Container Tracking ']"));
		JavascriptExecutor moveuptotracker = (JavascriptExecutor) driver;
		moveuptotracker.executeScript("arguments[0].click();", clickonpicbinandtracker);
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("(//img[@src='./assets/images/back-arrow.png'])[1]")).click(); 
		WebElement clickarrow= driver.findElement(By.xpath("(//img[@src='./assets/images/back-arrow.png'])[1]"));
		JavascriptExecutor clickbelowarrow = (JavascriptExecutor) driver;
		clickbelowarrow.executeScript("arguments[0].click();", clickarrow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()=' TRANSFER ']")).click(); 	
		Thread.sleep(3000);
	/*	WebElement containerbarcode = driver.findElement(By.xpath("(//div[@class='col-9'])[2]"));
	  	String storecontainerbarcode = containerbarcode.getText(); // does not work (returns "" as expected)
	  	String getinnercontainerbarcode = "return arguments[0].innerText";
	  	storecontainerbarcode= (String) ((JavascriptExecutor) driver).executeScript(getinnercontainerbarcode, containerbarcode);
	  	System.out.println(getinnercontainerbarcode); 
		Thread.sleep(3000);                               */
		driver.findElement(By.xpath("//ion-button[text()=' SCAN ']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys("SL000000006"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click(); 
     	Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()=' COMPLETE ']")).click(); 
	/*	Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@aria-label='arrow back'])[3]")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-buttons[@slot='start']")).click();   */
		Thread.sleep(5000);
		driver.findElement(By.xpath("//mat-panel-title[text()=' Dashboards ']")).click();
	}
	@Test(priority=5,enabled=true)
	public void Tailoring() throws Exception
	{
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//ion-label[text()=' Tailoring ']")).click();
		WebElement clickontailaring= driver.findElement(By.xpath("//ion-label[text()=' Tailoring ']"));
		JavascriptExecutor moveuptotailoring = (JavascriptExecutor) driver;
		moveuptotailoring.executeScript("arguments[0].click();", clickontailaring);
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//ion-button[text()='Available work']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[23]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Assign to Me']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[27]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='LS ZIPPERED POLYESTER SHIRT'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Begin']")).click();
	//	Thread.sleep(5000);
	//	driver.findElement(By.xpath("(//div[text()='LS ZIPPERED POLYESTER SHIRT'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Complete']")).click();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-tailoring-item-detail/ion-header/ion-toolbar/ion-buttons/ion-back-button/button/span/ion-icon")).click();
		WebElement backarrow= driver.findElement(By.xpath("(//ion-icon[@aria-label='arrow back'])[5]"));
		JavascriptExecutor clickbackarrow = (JavascriptExecutor) driver;
		clickbackarrow.executeScript("arguments[0].click();", backarrow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='TRANSFER']")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("(//ion-buttons[@slot='start'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Scan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='UPC'])[2]")).sendKeys("SL000000010");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ion-button[text()='Complete']")).click(); 
	}
	@Test(priority=6,enabled=true)
	public void QualityAsurance() throws Exception
	{
		Thread.sleep(5000);
		WebElement clickQA= driver.findElement(By.xpath("//ion-label[text()=' Quality Assurance ']"));
		JavascriptExecutor clickanywhere = (JavascriptExecutor) driver;
		clickanywhere.executeScript("arguments[0].click();", clickQA);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[35]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='LS ZIPPERED POLYESTER SHIRT'])[3]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//ion-button[text()='Yes']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Yes']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ion-button[text()='Pass'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Take Picture']")).click();
		Thread.sleep(2000);
		StringSelection ss = new StringSelection(System.getProperty("fileToUpload"));
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
	/*	Thread.sleep(3000);
		driver.findElement(By.xpath("(//ion-button[text()='TRANSFER'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Scan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys("SL000000015");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ion-button[text()='Complete']")).click(); */
	}
}