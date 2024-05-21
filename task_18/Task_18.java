package task_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Task_18 {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser and navigate to website
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\priya\\Desktop\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Locating the iframe and switching to iframe

		WebElement frameElement = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frameElement);
		
		//Locating webelements  

		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		//finding the css color properties before dropping element

		String s = drag.getCssValue("color");
		// convert rgb to hex
		String hexcode = Color.fromString(s).asHex();
		System.out.println("before Color is :" + s);
		System.out.println("Hex code for beforecolor:" + hexcode);

		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		//using actions class to perform drag and drop operations

		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		//finding the css color properties after dropping element

		String afterdropping = drop.getCssValue("color");
		// convert rgb to hex
		String finalhexcode= Color.fromString(afterdropping).asHex();
		System.out.println("after Color is :" + afterdropping);
		System.out.println("Hex code for aftercolor:" + finalhexcode);
		
		//Verifying whether the color properties have changed or not
		
		if(s.equals(afterdropping)) {
			System.out.println("same colour properties");
		
		}else {
			System.out.println("change in colour properties");

		}

		String textTo = drop.getText();
		//Verifying whether the text has changed after dropping

		if (textTo.equals("Dropped!")) {
			System.out.println("PASS: File is dropped to target as expected");
		} else {
			System.out.println("FAIL: File couldn't be dropped to target as expected");
		}
		driver.close();

	}

}
