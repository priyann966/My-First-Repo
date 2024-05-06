package task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Desktop\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.cssSelector(".demo-frame"));
		Thread.sleep(2000);
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("// a[text()='22']"));
		date.click();
		System.out.println(date.getText());
		WebElement selecteddate = driver.findElement(By.xpath("//input[@id='datepicker']"));
		System.out.println(selecteddate.getAttribute("value"));
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
