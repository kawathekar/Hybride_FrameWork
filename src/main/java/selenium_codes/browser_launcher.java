package selenium_codes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Utilities.Utils_Config;

public class browser_launcher {
	static String cd=Utils_Config.configclass1("chromedriver");
	WebDriver driver;

	
	public static void openMoneyControl() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",cd);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.moneycontrol.com//");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();

	}
}

