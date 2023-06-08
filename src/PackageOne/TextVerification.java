package PackageOne;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class TextVerification {

	public static void main(String[] args) throws MalformedURLException, IOException {
		String Key = "webdriver.chrome.driver";
		String Value = "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(Key, Value);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> WindowId = driver.getWindowHandles();
		Iterator<String> IdValue = WindowId.iterator();
		String ParentWindowId = IdValue.next();
		String ChildWindowId = IdValue.next();
		driver.switchTo().window(ChildWindowId);
		driver.get("https://www.rahulshettyacademy.com/");
		String CourseName = driver.findElement(By.xpath("//a[text()='Learn Postman for API Automation Testing with Javascript']")).getText();
		driver.switchTo().window(ParentWindowId);
		String NameXpath = "//div[@class='form-group']/input[@name='name']";
		WebElement Name= driver.findElement(By.xpath(NameXpath));
		Name.sendKeys(CourseName);
		System.out.println(Name.getRect().getDimension().getHeight());
		System.out.println(Name.getRect().getDimension().getWidth());
		driver.quit();
	}
}

