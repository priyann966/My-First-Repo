package task_18;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Task18 {

	public static void main(String[] args) {
		//Launch browser and navigate to Site
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\priya\\Desktop\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		//checking whether it has landed on the correct page or not
		if (driver.getTitle().contains("log in or sign up")) {
			System.out.println("landed on homepage");

		} else {
			System.out.println("Not landed on homepage");

		}
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//locating the webelements by name and xpath

		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("D");
		driver.findElement(By.name("reg_email__")).sendKeys("test1user@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("test1user@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("JohnJane@123");
		WebElement Dropdown = driver.findElement(By.id("day"));
		Dropdown.click();
		//using select class and picking select by values
		Select selobj = new Select(Dropdown);
		selobj.selectByValue("11");
		
		WebElement Dropdown2 = driver.findElement(By.id("month"));
		Dropdown2.click();
		Select selobj2 = new Select(Dropdown2);
		selobj2.selectByValue("5");
		
		WebElement Dropdown3 = driver.findElement(By.id("year"));
		Dropdown3.click();
		Select selobj3= new Select(Dropdown3);
		selobj3.selectByValue("1985");
		
		driver.findElement(By.className("_8esa")).click();
		driver.findElement(By.name("websubmit")).click();
		//after submitting getting profile and sometimes asking to enter code bcoz of website 
		System.out.println("registered succesfully");
		driver.close();
		
		}
}
