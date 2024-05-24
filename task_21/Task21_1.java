package task_21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Task21_1 {

	public static void main(String[] args) {
		// launch the browser and navigate to website
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\priya\\Desktop\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='tox-icon']")).click();

		// Locating the iframe and switching to iframe
		WebElement frameelement = driver.findElement(By.cssSelector("#mce_0_ifr"));
		driver.switchTo().frame(frameelement);
		// locating p tag
		WebElement element = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		// element.click();
		element.clear();
		// this website non editable cannot enter text issue with website

		element.sendKeys("Hello People");
		
		driver.close();

		// new Actions(driver).sendKeys("Hello People").build().perform();

//		String inputText ="hello";
//		WebElement myElement = driver.findElement(By.cssSelector("body p"));
//		String j1s = "arguments[0].setAttribute('value','"+inputText+"')";		
//		((JavascriptExecutor) driver).executeScript(j1s, myElement);
//		
//		WebElement givenelement = driver.findElement(By.cssSelector("body p"));
//		System.out.println(givenelement.getAttribute(inputText));

	}

}
