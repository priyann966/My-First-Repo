package task_19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Task19 {

	public static void main(String[] args) throws InterruptedException {
		//setting the path to the browser

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\priya\\Desktop\\drivers\\geckodriver.exe");
		//instantiating the WebDriver
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.guvi.in/register");
		driver.manage().window().maximize();
//		WebElement t=driver.findElement(By.tagName("title"));
//		System.out.println(t.getAttribute("textContent"));
		Thread.sleep(2000);
		//locating all input titles in the first page
		List<WebElement> t1= driver.findElements(By.tagName("input"));
		System.out.println(t1.size());
		//locating the webelement by id,className,xpath
		driver.findElement(By.className("form-control")).sendKeys("John");
		driver.findElement(By.id("email")).sendKeys("Testt9@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Johnuk@1234");
		//locating the cssselectors by id,attribute value

		driver.findElement(By.cssSelector("#mobileNumber")).sendKeys("9234567889");

		driver.findElement(By.cssSelector("a[class='btn signup-btn']")).click();
		Thread.sleep(2000);
		WebElement Dropdown = driver.findElement(By.cssSelector("#profileDrpDwn"));
		Dropdown.click();
		Thread.sleep(2000);
		//creation of object for the select class
		Select selobj = new Select(Dropdown);
		// using selectByValue
		selobj.selectByValue("Looking for a career");
		WebElement down = driver.findElement(By.cssSelector("#degreeDrpDwn"));
		down.click();
		Thread.sleep(2000);
		
		Select selobj1 = new Select(down);
		selobj1.selectByValue("Higher Secondary");

		driver.findElement(By.cssSelector("#year")).sendKeys("2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		Thread.sleep(20000);
		//		driver.findElement(By.xpath("//a[text()='May be later']")).click();
		System.out.println("registered succesfully");
	
		driver.close();

	}

}
