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

public class Task1847
{
	public static WebDriver driver;
	public static Properties p1;
		@Test(priority=1,enabled=true)
		public void SelectingPickedproduct() throws Exception
		{
			String	Testname="Createanorderwithpickedproducts";
			System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications","--window-size=1366,768");
			driver = new ChromeDriver(options);
			// WebDriver driver = new HtmlUnitDriver();
			FileInputStream fis = new FileInputStream("./Lib/Properties/PropertyFile");
			p1 = new Properties();
			p1.load(fis);
		//	driver.get(p1.getProperty("URL"));
		/*	DesiredCapabilities cap = DesiredCapabilities.chrome();
	        cap.setCapability(ChromeOptions.CAPABILITY, options);
			 LoggingPreferences logPrefs = new LoggingPreferences();
	         logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
	         options.setCapability("goog:loggingPrefs", logPrefs);    */
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
				WebElement clickontest= driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]"));
			    JavascriptExecutor moveuptotestclient = (JavascriptExecutor) driver;
			    moveuptotestclient.executeScript("arguments[0].click();", clickontest);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[text()='Yes']")).click();
				Thread.sleep(3000);
				WebElement clickonskip= driver.findElement(By.xpath("//*[text()='Skip']"));
			    JavascriptExecutor moveuptoskip = (JavascriptExecutor) driver;
			    moveuptoskip.executeScript("arguments[0].click();", clickonskip);
				Thread.sleep(3000);
				WebElement clickonpayment= driver.findElement(By.xpath("//*[text()='Agency Order ']"));
			    JavascriptExecutor moveuptopayment = (JavascriptExecutor) driver;
			    moveuptopayment.executeScript("arguments[0].click();", clickonpayment);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='OK']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//ion-icon[@aria-label='create'])[4]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//ion-button[text()='Neville Island']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='Pick BIN Label ']")).click();
				Thread.sleep(3000);
				WebElement clickonprinter= driver.findElement(By.xpath("//*[text()='Microsoft Print to PDF']"));
				JavascriptExecutor moveuptoprinter = (JavascriptExecutor) driver;
				moveuptoprinter.executeScript("arguments[0].click();", clickonprinter);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[text()='Print ']")).click();
				Thread.sleep(3000);
				WebElement picbinbarcode = driver.findElement(By.xpath("//span[@name='pickBinLabel']"));
				String getpicpinbarcode = picbinbarcode.getText(); // does not work (returns "" as expected)
				String scripttt = "return arguments[0].innerText";
				getpicpinbarcode= (String) ((JavascriptExecutor) driver).executeScript(scripttt, picbinbarcode);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@name='barcode']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@name='ion-input-2']")).sendKeys(p1.getProperty("BarcodeUpc1"));
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[text()='Search'])[3]")).click();
				Thread.sleep(3000);
				  WebElement customersize= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
			      JavascriptExecutor moveuptocustomersize = (JavascriptExecutor) driver;
			      moveuptocustomersize.executeScript("arguments[0].click();", customersize);
			      Thread.sleep(3000);
				  WebElement selectpickedproduct= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[3]"));
			      JavascriptExecutor moveuptopickedproduct = (JavascriptExecutor) driver;
			      moveuptopickedproduct.executeScript("arguments[0].click();", selectpickedproduct);
			      Thread.sleep(3000);
			  	driver.findElement(By.xpath("(//ion-button[@color='success'])[6]")).click();
				Thread.sleep(3000);
				WebElement Storeproduct = driver.findElement(By.xpath("//span[@name='ppssBarcode']"));
				String getthebarcode = Storeproduct.getText(); // does not work (returns "" as expected)
				String script = "return arguments[0].innerText";
				getthebarcode= (String) ((JavascriptExecutor) driver).executeScript(script, Storeproduct);
				System.out.println(getthebarcode);
				driver.findElement(By.xpath("//input[@name='upc']")).sendKeys(getthebarcode);
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='upc']")).sendKeys(getpicpinbarcode);
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]")).click(); 	
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@name='barcode']")).click();
				Thread.sleep(3000);
				WebElement addproduct=driver.findElement(By.xpath("(//*[text()='Search'])[3]"));
				JavascriptExecutor moveuptoaddproductt = (JavascriptExecutor) driver;
				moveuptoaddproductt.executeScript("arguments[0].scrollIntoView();", addproduct);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@name='ion-input-2']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@name='ion-input-2']")).sendKeys(p1.getProperty("BarcodeUpc1"));
				Thread.sleep(3000);
				//driver.findElement(By.xpath("(//*[text()='Search'])[3]")).click();
				  WebElement searchbarcode= driver.findElement(By.xpath("(//*[text()='Search'])[3]"));
			      JavascriptExecutor moveuptosearchbarcode = (JavascriptExecutor) driver;
			      moveuptosearchbarcode.executeScript("arguments[0].click();", searchbarcode);
				Thread.sleep(3000);
				  WebElement customersize2= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));
			      JavascriptExecutor moveuptocustomersize2 = (JavascriptExecutor) driver;
			      moveuptocustomersize2.executeScript("arguments[0].click();", customersize2);
			      Thread.sleep(3000);
				  WebElement selectneedspickedproduct= driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[4]"));
			      JavascriptExecutor moveuptoneedspickedproduct = (JavascriptExecutor) driver;
			      moveuptoneedspickedproduct.executeScript("arguments[0].click();", selectneedspickedproduct);
			      Thread.sleep(3000);
				  	driver.findElement(By.xpath("(//ion-button[@color='success'])[6]")).click();
}
		
}
