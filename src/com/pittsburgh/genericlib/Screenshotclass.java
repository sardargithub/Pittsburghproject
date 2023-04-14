package com.pittsburgh.genericlib;

import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;

import com.pittsburgh.EcommerceappTasks.Task1767Item2forPaypallHeadless;

import OperationsAppTasks.LogintoordercreationwithHeadless;
import OperationsAppTasks.PPSSCUSLibScripts;
import OperationsAppTasks.Task1767MobileviewwithHeadless;
//import Tasks.LoginFunctionality1;
//import Tasks.PPSSCUSLibScripts;
//import PittsburghTests.LoginFunctionality;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshotclass
{
	public static String fileWithPath = "./Lib/Screenshots";
	//./Lib/Screenshots

	public static void takeSnapShot(String fileWithPath, String testname) throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		Date d = new Date();
		System.out.println("Taking Screenshot !");
		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		fileWithPath = fileWithPath + testname + FileName;
		System.out.println("Name of current method: " + nameofCurrMethod);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Task1767Item2forPaypallHeadless.driver);
		ImageIO.write(screenshot.getImage(), "PNG", new File(fileWithPath));
}
}