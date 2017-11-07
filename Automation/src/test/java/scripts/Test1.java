package scripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Test1 {
	public WebDriver driver;

	@Parameters("sBrowser")

	@BeforeMethod
	public void launchBrowser(String sBrowser) {
		if (sBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (sBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
