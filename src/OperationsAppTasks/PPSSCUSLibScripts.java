package OperationsAppTasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pittsburgh.base.Baseclass;
import com.pittsburgh.genericlib.Screenshotclass;

public class PPSSCUSLibScripts
{
	public static WebDriver driver;
	public static Properties p1;
//Testcase-1
	@Test(priority = 1, enabled=true)
	public void Createanorderwithpickedproducts() throws IOException, Exception {
		String	Testname="Createanorderwithpickedproducts";
//		System.setProperty("webdriver.chrome.driver","./Lib/Browsers/chromedriver.exe");	
		Baseclass.setup();

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
		driver.findElement(By.xpath("//*[@id='form-group-input-1']")).sendKeys("sardar");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]")).click();
	    WebElement clickoncustomer= driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[1]"));
			JavascriptExecutor moveuptocustomer = (JavascriptExecutor) driver;
			moveuptocustomer.executeScript("arguments[0].click();", clickoncustomer);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Yes']")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]")).click();
	    WebElement clickoncustomerorganization= driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]"));
			JavascriptExecutor moveuptocustomerorganization = (JavascriptExecutor) driver;
			moveuptocustomerorganization.executeScript("arguments[0].click();", clickoncustomerorganization);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Yes']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-verify-organization/ion-content/ion-card[2]/ion-card-content/div/div[1]/ion-button")).click();
		WebElement clickpaymentordertype= driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-verify-organization/ion-content/ion-card[2]/ion-card-content/div/div[1]/ion-button"));
		JavascriptExecutor moveuptopaymentordertype = (JavascriptExecutor) driver;
		moveuptopaymentordertype.executeScript("arguments[0].click();", clickpaymentordertype);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//ion-icon[@aria-label='create'])[4]")).click();
	     Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Neville Island']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Pick BIN Label ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mat-dialog-3\"]/app-print-dialog/div/button[1]/span/div[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Print ']")).click();
	Thread.sleep(3000);
	WebElement hiddenDivtag = driver.findElement(By.xpath("//span[@name='pickBinLabel']"));
	String nnn = hiddenDivtag.getText(); // does not work (returns "" as expected)
	String scripttt = "return arguments[0].innerText";
	nnn= (String) ((JavascriptExecutor) driver).executeScript(scripttt, hiddenDivtag);
	System.out.println(nnn);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Add Pants']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]")).click();
	driver.findElement(By.xpath("(//ion-button[@color='success'])[6]")).click();
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("12");
	driver.findElement(By.xpath("//span[text()='Ok']")).click();
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
	  Reporter.log("Method Executed" + Testname);
		 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname); 
	
}
@Test(priority=2,enabled=true)
public void CreateoorderwithNeedsPicked() throws Exception
{
	String	Testname="CreateoorderwithNeedsPicked";
	Thread.sleep(3000);
	WebElement selectsuspand1=driver.findElement(By.xpath("//ion-button[text()=' Suspend Order']"));
	JavascriptExecutor moveuptosuspandorder1 = (JavascriptExecutor) driver;
	moveuptosuspandorder1.executeScript("arguments[0].scrollIntoView();", selectsuspand1); 
	Thread.sleep(3000);
    WebElement element= driver.findElement(By.xpath("//*[text()=' Suspend Order']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", element);
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[text()='Suspend']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Ok']")).click();
	driver.findElement(By.xpath("//*[text()='Start New Order']")).click();
	driver.findElement(By.xpath("//*[text()='Search For Customer']")).click();
	driver.findElement(By.xpath("//*[@id='form-group-input-1']")).sendKeys("sardar");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	//driver.findElement(By.xpath("//*[text()='sardar ']")).click();
	 WebElement element2= driver.findElement(By.xpath("(//*[text()='Sardar12345 '])[1]"));
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("arguments[0].click();", element2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Yes']")).click();
	Thread.sleep(3000);
	///driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]")).click();
	WebElement clickonorganization= driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-search-customer/ion-content/ion-card[3]/ion-card-content/table/tbody/tr/td[1]"));
    JavascriptExecutor moveuptoorganization = (JavascriptExecutor) driver;
    moveuptoorganization.executeScript("arguments[0].click();", clickonorganization);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Yes']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-verify-organization/ion-content/ion-card[2]/ion-card-content/div/div[1]/ion-button")).click();
	WebElement clickonpaymenttype= driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-verify-organization/ion-content/ion-card[2]/ion-card-content/div/div[1]/ion-button"));
    JavascriptExecutor moveuptopaymeenttype = (JavascriptExecutor) driver;
    moveuptopaymeenttype.executeScript("arguments[0].click();", clickonpaymenttype);
Thread.sleep(5000);
	driver.findElement(By.xpath("(//ion-icon[@aria-label='create'])[4]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Neville Island']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Add Pants']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class='mat-radio-container'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@color='success'])[6]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("12");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Ok']")).click();
	Thread.sleep(3000);
	WebElement selectsuspand=driver.findElement(By.xpath("//ion-button[text()=' Suspend Order']"));
	JavascriptExecutor moveuptosuspandorder = (JavascriptExecutor) driver;
	moveuptosuspandorder.executeScript("arguments[0].scrollIntoView();", selectsuspand);  
	Thread.sleep(3000);
    WebElement suspend2ndtime= driver.findElement(By.xpath("//*[text()=' Suspend Order']"));
    JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", suspend2ndtime);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text()='Suspend']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//*[text()='Ok'])")).click();
  //  Thread.sleep(3000);
   // driver.findElement(By.xpath("(//*[text()='Ok'])")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//ion-button[text()='Exit POS Mode']")).click();
    Reporter.log("Method Executed" + Testname);
  	 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
	
}
@Test(priority=3,enabled=false)
public void Orderpic() throws Exception
{
/*	System.setProperty("webdriver.chrome.driver","./Lib/Browser/chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	FileInputStream fis = new FileInputStream("./Lib/resources/PropertyFile");
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
	driver.findElement(By.xpath("//ion-button[@type='submit']")).click();    */
	String	Testname="Orderpic";
	Thread.sleep(3000);
	 WebElement element= driver.findElement(By.xpath("//*[text()=' Orders ']"));
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", element);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()=' Orders To Pick ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class='mat-row ng-star-inserted'])[11]")).click();
//	Thread.sleep(2000);
/*	try {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert data: " + alertText);
        alert.accept();
      //  driver.findElement(By.xpath("(//td[text()=' Test Client 01132021 '])[1]")).click();
    } catch (NoAlertPresentException e) {
        e.printStackTrace();
       */
	
/*	WebDriverWait wait = new WebDriverWait(driver, 30);
	System.out.println(wait.until(ExpectedConditions.alertIsPresent()));
	
   if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
    Alert alert = driver.switchTo().alert();
    alert.accept();
    System.out.println("bye");
	 }else {
	 System.out.println("Hiii");
	 }   */
    
//Thread.sleep(3000);
//	driver.findElement(By.xpath("(//td[text()=' Test Client 01132021 '])[1]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[text()='Resume Pick']")).click();
	/*Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Print Product Labels']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[text()='Microsoft XPS Document Writer'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Print ']")).click();
	driver.findElement(By.xpath("//ion-button[text()='Yes']")).click();
	driver.findElement(By.xpath("//ion-button[text()='Scan Pick Bin']")).click();
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys("PB000000077");
	driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	driver.findElement(By.xpath("//ion-button[text()='Scan Location']")).click();
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys("BI000000753");
	driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	driver.findElement(By.xpath("//ion-button[text()='Scan Product']")).click();
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys("600729580021");
	driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	driver.findElement(By.xpath("//ion-button[text()='Scan PPSS Product Barcode']")).click();
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys("OP000000695");   */
//	WebElement hiddenDivtagg = driver.findElement(By.xpath("//div[@class='barcodes ng-star-inserted']]"));
//	String nnnn = hiddenDivtagg.getText(); // does not work (returns "" as expected)
	//String scripttt = "return arguments[0].innerText";
//	nnn= (String) ((JavascriptExecutor) driver).executeScript(scripttt, hiddenDivtag);
	//System.out.println(nnnn);
	driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	  Reporter.log("Method Executed" + Testname);
	 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
	
}
@Test(priority=4,enabled=true)
public void OrderProcess() throws Exception
{
/*	System.setProperty("webdriver.chrome.driver","./Lib/Browser/chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	FileInputStream fis = new FileInputStream("./Lib/resources/PropertyFile");
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
	driver.findElement(By.xpath("//ion-button[@type='submit']")).click();     */
	String	Testname="OrderProcess";
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[text()=' Orders ']")).click();
	 WebElement OrderProces= driver.findElement(By.xpath("//*[text()=' Orders ']"));
     JavascriptExecutor jse = (JavascriptExecutor) driver;
     jse.executeScript("arguments[0].click();", OrderProces);
	Thread.sleep(3000);
	 WebElement element= driver.findElement(By.xpath("//ion-label[text()=' Orders to Process ']"));
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", element);
     Thread.sleep(3000);
   //  driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper']")).click();
/*	 WebElement increasepagesize= driver.findElement(By.xpath("(//div[@class='mat-select-arrow-wrapper'])[3]"));
     JavascriptExecutor moveuptopage = (JavascriptExecutor) driver;
     moveuptopage.executeScript("arguments[0].click();", increasepagesize);
     Thread.sleep(3000);
    // driver.findElement(By.xpath("(//mat-option[@role='option'])[3]")).click();
     WebElement selectpagesize= driver.findElement(By.xpath("(//mat-option[@role='option'])[3]"));
     JavascriptExecutor moveuptopagesize = (JavascriptExecutor) driver;
     moveuptopagesize.executeScript("arguments[0].click();", selectpagesize);    */
     Thread.sleep(3000);
	//driver.findElement(By.xpath("//td[text()=' PB000000139 ']")).click();
	 WebElement element2= driver.findElement(By.xpath("(//tr[@class='mat-row ng-star-inserted'])[3]"));
     JavascriptExecutor js2 = (JavascriptExecutor) driver;
     js2.executeScript("arguments[0].click();", element2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='View Pick Bin']")).click();
	Thread.sleep(3000);
	WebElement Storeordernumbarcode = driver.findElement(By.xpath("//li[@class='ng-star-inserted']"));
	String getordernumberbarcode = Storeordernumbarcode.getText(); // does not work (returns "" as expected)
	String getinnertextofproduct = "return arguments[0].innerText";
	getordernumberbarcode= (String) ((JavascriptExecutor) driver).executeScript(getinnertextofproduct, Storeordernumbarcode);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Scan']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys(getordernumberbarcode);
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
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("(//div[text()='Microsoft Print to PDF'])[1]")).click();
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
	  driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
		Thread.sleep(3000);
		WebElement Storeppssbarcode1 = driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])[2]"));
		String getppssbarcode1 = Storeppssbarcode1.getText(); // does not work (returns "" as expected)
		String getinnertextppss1 = "return arguments[0].innerText";
		getppssbarcode1= (String) ((JavascriptExecutor) driver).executeScript(getinnertextppss1, Storeppssbarcode1);
		System.out.println(getppssbarcode1);
		driver.findElement(By.xpath("//ion-button[text()='Scan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys(getppssbarcode1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
	/*	Thread.sleep(3000);  
		driver.findElement(By.xpath("//ion-button[text()='Scan']")).click();
		Thread.sleep(3000);
		WebElement Storeppssbarcode2 = driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])[3]"));
		String getppssbarcode2 = Storeppssbarcode1.getText(); // does not work (returns "" as expected)
		String getinnertextppss2 = "return arguments[0].innerText";
		getppssbarcode2= (String) ((JavascriptExecutor) driver).executeScript(getinnertextppss2, Storeppssbarcode2);
		System.out.println(getppssbarcode2);
		driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys(getppssbarcode2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Search']")).click();     */
		driver.findElement(By.xpath("//span[text()='Okay']")).click();
		driver.findElement(By.xpath("//ion-button[text()='Scan Container ']")).click();
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
		driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys("SL000000005");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Finish']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Okay']")).click();
	/*	driver.findElement(By.xpath("//ion-button[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Print']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Scan Container Barcode']")).click();
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Scan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='UPC']")).sendKeys(getcontainerbarcode2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-button[text()='Search']")).click();    */
		 Reporter.log("Method Executed" + Testname);
		 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
}
@Test(priority=5,enabled=true)
public void OrderRelease() throws Exception
{
/*	System.setProperty("webdriver.chrome.driver","./Lib/Browser/chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	FileInputStream fis = new FileInputStream("./Lib/resources/PropertyFile");
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
	driver.findElement(By.xpath("//ion-button[@type='submit']")).click();    */
	String	Testname="OrderRelease";
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[text()=' Orders ']")).click();
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//ion-label[text()=' Need Reviewed  ']")).click();
	 WebElement element= driver.findElement(By.xpath("//ion-label[text()=' Need Reviewed  ']"));
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", element);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class='mat-row ng-star-inserted'])[11]")).click();
/*	Thread.sleep(3000);
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
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='OK']")).click();      */
	  Reporter.log("Method Executed" + Testname);
		 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);      

}
@Test(priority=6,enabled=true)
public void Transfercontainertoslot() throws Exception
{
	
	String	Testname="Transfercontainertoslot";
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-panel-title[text()=' Dashboards ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-label[text()=' Containers '])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//img[@class='back-arrow-cls'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()=' TRANSFER ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()=' SCAN ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@placeholder='UPC'])[1]")).sendKeys("SL000000005");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Search'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()=' COMPLETE ']")).click();
	  Reporter.log("Method Executed" + Testname);
		 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
	
}
@Test(priority=7,enabled=true)
public void TransferStock() throws Exception
{
	String	Testname="TransferStock";
	Thread.sleep(4000);
	driver.findElement(By.xpath("//mat-panel-title[text()=' Test Pages ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-label[text()=' Barcode ']")).click();
	Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@placeholder='UPC'])[2]")).sendKeys("BI000000012 ");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Search'])[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Add']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@placeholder='UPC'])[3]")).sendKeys("600729591621");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Search'])[4]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Reason']")).sendKeys("teeee");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Save'])[4]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Okay']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ion-button[text()='Transfer Stock ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@placeholder='UPC'])[3]")).sendKeys("600729591621");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Search'])[4]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Reason']")).sendKeys("testtt");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='NEXT']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@placeholder='UPC'])[4]")).sendKeys("SL000000005");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//ion-button[text()='Search'])[5]")).click();
	Thread.sleep(3000);
	WebElement element= driver.findElement(By.xpath("//ion-button[text()='transfer']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", element);
    Reporter.log("Method Executed" + Testname);
  	 Screenshotclass.takeSnapShot(Screenshotclass.fileWithPath, Testname);
}
}
