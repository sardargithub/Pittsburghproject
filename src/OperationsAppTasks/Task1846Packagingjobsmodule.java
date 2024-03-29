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
import org.testng.annotations.Test;

public class Task1846Packagingjobsmodule 
{
	public static WebDriver driver;
	public static Properties p1;
	
		@Test(priority=1,enabled=true)
		public void Selectingpackagingjobsmodule() throws Exception
		{
			String	Testname="Createanorderwithpickedproducts";
			System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
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
			Thread.sleep(4000);
			WebElement clickonorders= driver.findElement(By.xpath("//mat-panel-title[text()=' Orders ']"));
			JavascriptExecutor moveuptoorders = (JavascriptExecutor) driver;
			moveuptoorders.executeScript("arguments[0].click();", clickonorders);
}
		@Test(priority=2,enabled=true)
		public void Packagingjobs() throws Exception
		{
			Thread.sleep(3000);
			WebElement storepackagingjobs= driver.findElement(By.xpath("//*[text()=' Packaging Jobs ']"));
			JavascriptExecutor moveuptopackagingjobs = (JavascriptExecutor) driver;
			moveuptopackagingjobs.executeScript("arguments[0].click();", storepackagingjobs);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='mat-row ng-star-inserted'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Begin Packaging']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scan']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(p1.getProperty("Slotbarcodeforpacking"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()=' Scan']")).click();
			Thread.sleep(3000);
			WebElement containerbarcode1 = driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-packaging-jobs-begin/ion-content/ion-card/ion-card-content/div[1]/div[4]/table/tbody/tr[1]/td[2]"));
			String getcontainerbarcode1 = containerbarcode1.getText(); // does not work (returns "" as expected)
			String scripttt = "return arguments[0].innerText";
			getcontainerbarcode1= (String) ((JavascriptExecutor) driver).executeScript(scripttt, containerbarcode1);
			System.out.println(getcontainerbarcode1);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(getcontainerbarcode1);
			Thread.sleep(3000);
			WebElement storesearchcontainer1= driver.findElement(By.xpath("(//*[text()='Search'])[2]"));
			JavascriptExecutor moveuptosearchcontainer1= (JavascriptExecutor) driver;
			moveuptosearchcontainer1.executeScript("arguments[0].click();", storesearchcontainer1);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Create Package']")).click();
			Thread.sleep(3000);
			WebElement addproduct4= driver.findElement(By.xpath("//*[text()='Microsoft Print to PDF']"));
		    JavascriptExecutor jsee4 = (JavascriptExecutor) driver;
		    jsee4.executeScript("arguments[0].click();", addproduct4);
		    Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Print ']")).click();
			Thread.sleep(3000);
			WebElement packagebarcode = driver.findElement(By.xpath("(//tr[@class='ng-star-inserted'])[3]"));
			String getpackagebarcode = packagebarcode.getText(); // does not work (returns "" as expected)
			String packagebarCodeNumber=getpackagebarcode.substring(0, 11);
			System.out.println(packagebarCodeNumber); 
			Thread.sleep(3000);
			WebElement storescanbutton1= driver.findElement(By.xpath("//*[text()='Scan']"));
			JavascriptExecutor moveuptoscanbarcode1= (JavascriptExecutor) driver;
			moveuptoscanbarcode1.executeScript("arguments[0].click();", storescanbutton1);
			Thread.sleep(3000);
			WebElement storesearchbutton1= driver.findElement(By.xpath("(//*[text()='Search'])[2]"));
			JavascriptExecutor moveuptosearchbutton1= (JavascriptExecutor) driver;
			moveuptosearchbutton1.executeScript("arguments[0].scrollIntoView();", storesearchbutton1);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(packagebarCodeNumber);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scan']")).click();
			Thread.sleep(3000);
			WebElement Opbarcode1 = driver.findElement(By.xpath("(//*[@class='ng-star-inserted'])[2]"));
			String getOpbarcode1 = Opbarcode1.getText();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(getOpbarcode1);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			WebElement storescanbutton2=driver.findElement(By.xpath("//*[text()='Scan']"));
			JavascriptExecutor moveuptoscanbutton2 = (JavascriptExecutor) driver;
			moveuptoscanbutton2.executeScript("arguments[0].click();", storescanbutton2);
			Thread.sleep(3000);
			WebElement storesearchbutton2=driver.findElement(By.xpath("(//*[text()='Search'])[2]"));
			JavascriptExecutor moveuptosearchbutton2 = (JavascriptExecutor) driver;
			moveuptosearchbutton2.executeScript("arguments[0].scrollIntoView();", storesearchbutton2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(packagebarCodeNumber);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scan']")).click();
			WebElement Opbarcode2 = driver.findElement(By.xpath("(//*[@class='ng-star-inserted'])[2]"));
			String gettextOpbarcode2 = Opbarcode2.getText();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(gettextOpbarcode2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()=' Scan']")).click();
			Thread.sleep(3000);
			WebElement Storecontainerbarcode2 = driver.findElement(By.xpath("((//tr[@class='ng-star-inserted'])[2])//td[2]"));
			String gettextcontainerbarcode2 = Storecontainerbarcode2.getText();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(gettextcontainerbarcode2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scan']")).click();
			Thread.sleep(3000);
			WebElement storesearchbutton3=driver.findElement(By.xpath("(//*[text()='Search'])[2]"));
			JavascriptExecutor moveuptosearchbutton3 = (JavascriptExecutor) driver;
			moveuptosearchbutton3.executeScript("arguments[0].scrollIntoView();", storesearchbutton3);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(packagebarCodeNumber);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scan']")).click();
			Thread.sleep(3000);
			WebElement Opbarcode3 = driver.findElement(By.xpath("(//*[@class='ng-star-inserted'])[2]"));
			String gettextOpbarcode3 = Opbarcode3.getText();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(gettextOpbarcode3);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			WebElement Storecontainerbarcode3 = driver.findElement(By.xpath("((//tr[@class='ng-star-inserted'])[3])//td[2]"));
			String gettextcontainerbarcode3 = Storecontainerbarcode3.getText();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()=' Scan']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(gettextcontainerbarcode3);
			Thread.sleep(3000);
			WebElement storesearchbutton4=driver.findElement(By.xpath("(//*[text()='Search'])[2]"));
			JavascriptExecutor moveuptosearchbutton4 = (JavascriptExecutor) driver;
			moveuptosearchbutton4.executeScript("arguments[0].click();", storesearchbutton4);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scan']")).click();
			Thread.sleep(3000);
			WebElement storesearchbutton5=driver.findElement(By.xpath("(//*[text()='Search'])[2]"));
			JavascriptExecutor moveuptosearchbutton5 = (JavascriptExecutor) driver;
			moveuptosearchbutton5.executeScript("arguments[0].scrollIntoView();", storesearchbutton5);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(packagebarCodeNumber);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scan']")).click();
			Thread.sleep(3000);
			WebElement Opbarcode4 = driver.findElement(By.xpath("(//*[@class='ng-star-inserted'])[2]"));
			String gettextOpbarcode4 = Opbarcode4.getText();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(gettextOpbarcode4);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Transfer Packages']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(packagebarCodeNumber);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scan']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='upc']")).sendKeys(p1.getProperty("Slotbarcodeforpacking"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[text()='Search'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Finish']")).click();
		
}
}