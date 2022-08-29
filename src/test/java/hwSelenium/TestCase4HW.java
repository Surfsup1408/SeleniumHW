package hwSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase4HW {

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
	public void addNewJob() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class = 'oxd-main-menu-item']")).click();
		driver.findElement(By.xpath("//span[contains(text() , 'Job')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Titles')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button--secondary')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'oxd-main-menu-button')]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("SDET");  
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Software Engineer in Test"); 
		driver.findElement(By.xpath("//textarea[contains(@placeholder, 'Add note')]")).sendKeys("I am qualified for SDET"); 
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
		driver.findElement(By.xpath("//div[text() = 'SDET']")).getText();
		
		String actualEntry = driver.findElement(By.xpath("//*[contains(text(),'SDET')]")).getText();
		String expectedEntry = "SDET";
		Assert.assertEquals(actualEntry, expectedEntry, "job title did not match");
		System.out.println(expectedEntry);
		
		System.out.println("Done!");
		Thread.sleep(3000);
		driver.close();
	}
	
}
