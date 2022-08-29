package hwSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCaseHW {

	WebDriver driver;
	public void setUp() {
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\Holly\\OneDrive\\Desktop\\B7-Selenium\\new\\chromedriver.exe";
		System.setProperty(key, path);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	public void rightClickTest() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement el = driver.findElement(By.xpath("//*[contains(text(), 'right click me')]"));
		Actions action = new Actions(driver);
		action.contextClick(el).build().perform();
		WebElement e2 = driver.findElement(By.xpath("//span[text() = 'Copy']"));
		e2.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert Message: " + alertText);
		Thread.sleep(5000);
		alert.accept();
	}
	public void doubleClickTest() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement el = driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
		// importing the Actions Class driver
		Actions action = new Actions(driver);
		// using the action Interface double click button
		action.doubleClick(el).build().perform();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert Message: " + alertText);
		Thread.sleep(5000);
		alert.accept();
	}
}

