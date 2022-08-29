package hwSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase3HW {

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
	public void dragAndDropHW() throws InterruptedException {
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement oslo = driver.findElement(By.xpath("//*[@id = 'box1']"));
		WebElement stockholm = driver.findElement(By.xpath("//*[@id = 'box2']"));
		WebElement madrid = driver.findElement(By.xpath("//*[@id = 'box7']"));
		WebElement rome = driver.findElement(By.xpath("//*[@id = 'box6']"));
		WebElement washington = driver.findElement(By.xpath("//*[@id = 'box3']"));
		WebElement copenhagen = driver.findElement(By.xpath("//*[@id = 'box4']"));
		WebElement seoul = driver.findElement(By.xpath("//*[@id = 'box5']"));

		WebElement norway = driver.findElement(By.xpath("//div[text() = 'Norway']"));
		WebElement sweden = driver.findElement(By.xpath("//div[text() = 'Sweden']"));
		WebElement spain = driver.findElement(By.xpath("//div[text() = 'Spain']"));
		WebElement italy = driver.findElement(By.xpath("//div[text() = 'Italy']"));
		WebElement unitedStates = driver.findElement(By.xpath("//div[text() = 'United States']"));
		WebElement denmark = driver.findElement(By.xpath("//div[text() = 'Denmark']"));
		WebElement southKorea = driver.findElement(By.xpath("//div[text() = 'South Korea']"));
		Actions action = new Actions(driver);

		action.dragAndDrop(oslo, norway).build().perform();
		action.dragAndDrop(stockholm, sweden).build().perform();
		action.dragAndDrop(madrid, spain).build().perform();
		action.dragAndDrop(rome, italy).build().perform();
		action.dragAndDrop(washington, unitedStates).build().perform();
		action.dragAndDrop(copenhagen, denmark).build().perform();
		action.dragAndDrop(seoul, southKorea).build().perform();
		System.out.println("Done");
		Thread.sleep(1000);
		driver.close();
	}
}

