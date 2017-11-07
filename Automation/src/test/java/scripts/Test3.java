package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test3 extends Test1{
	@Test
	public void searchApache() {
		driver.findElement(By.name("q")).sendKeys("apache maven");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Maven – Welcome to Apache Maven")).click();
	}

}
