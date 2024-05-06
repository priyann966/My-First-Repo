package task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Desktop\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='nav-item python-signup-btn']//a[text()='Sign up'][1]")).click();
		driver.findElement(By.className("form-control")).sendKeys("Jacky");
		driver.findElement(By.id("email")).sendKeys("Testz@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Johnuk@123");
		// locating the cssselectors by id,attribute value

		driver.findElement(By.cssSelector("#mobileNumber")).sendKeys("9234567889");

		driver.findElement(By.cssSelector("a[class='btn signup-btn']")).click();
		Thread.sleep(2000);

		// driver.findElement(By.className("Bz112c Bz112c-r9oPif")).click();
		WebElement Dropdown = driver.findElement(By.cssSelector("#profileDrpDwn"));
		Dropdown.click();
		Thread.sleep(2000);
		// creation of object for the select class
		Select selobj = new Select(Dropdown);
		// using selectByValue
		selobj.selectByValue("Looking for a career");
		WebElement down = driver.findElement(By.cssSelector("#degreeDrpDwn"));
		down.click();
		Thread.sleep(2000);

		Select selobj1 = new Select(down);
		selobj1.selectByValue("Higher Secondary");

		driver.findElement(By.cssSelector("#year")).sendKeys("2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		Thread.sleep(20000);
		System.out.println("registered succesfully");
		driver.getTitle();
		loginpage(driver);
		driver.close();

	}

	private static void loginpage(WebDriver driver) throws InterruptedException {
		// after signup login with name and password
		driver.findElement(By.xpath("//img[@alt='Guvi Logo'][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='nav-item python-login-btn']//a['text()=Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#email")).sendKeys("Testy@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Johnuk@123");
		WebElement s = driver.findElement(By.cssSelector("#login-btn"));
		s.click();

		Thread.sleep(5000);
		if (driver.getTitle().contains("Login")) {
			System.out.println("logged in successfully");
		} else {
			System.out.println("Retry again");

		}

	}
}
