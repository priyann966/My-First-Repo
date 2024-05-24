package task_22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;  
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task22 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Specify the path to your chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Desktop\\drivers\\chromedriver.exe");
		
		// Instantiate chrome driver object
		WebDriver driver = new ChromeDriver();
		//using webdriver wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to the website
		driver.get("https://phptravels.com/demo/");
		
		driver.manage().window().maximize();
				
		//locating the webelements

		driver.findElement(By.name("first_name")).sendKeys("K");

		driver.findElement(By.name("last_name")).sendKeys("John");

		driver.findElement(By.name("business_name")).sendKeys("Retail");

		driver.findElement(By.name("email")).sendKeys("John@gmail.com");
		
		//performing the sumlogic between 2 webelements

		int add = Integer.parseInt(driver.findElement(By.id("numb1")).getText());

		int add1 = Integer.parseInt(driver.findElement(By.id("numb2")).getText());

		int value = add + add1;

		WebElement k = driver.findElement(By.id("number"));

		k.sendKeys(String.valueOf(value));
		
		WebElement demo = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("demo")));
		demo.click();
		
	 // ExpectedCondition for Presence of Element Located
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[text()=' Thank you!']"))).click();		

		// Using TakesScreenshot method to capture screenshot

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		// Saving the screenshot in desired location

		File source = screenshot.getScreenshotAs(OutputType.FILE);
		// Path to the location to save screenshot
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));

		System.out.println("Screenshot is captured");

		driver.close();

	}

}
