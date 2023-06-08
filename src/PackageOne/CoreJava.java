package PackageOne;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreJava {

	public static void main(String[] args) throws InterruptedException {
		String Key = "webdriver.chrome.driver";
		String Value = "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span[@class='checkmark']")).click();
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		
		
		
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sel = new Select(dropDown);
		sel.selectByVisibleText("Consultant");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
	}
}
