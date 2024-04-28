package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		if (driver.getTitle().equals("STORE")) {
			System.out.println("Page landed on correct website");

		} else {
			System.out.println("Page not landed on correct website");

		}
		Thread.sleep(2000);

		driver.close();

	}
}
