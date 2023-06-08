package PackageOne;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class windowInteraction {

	public static void main(String[] args) {
		
		String Key = "webdriver.chrome.driver";
		String Value = "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(Key, Value);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Actions act = new Actions(driver);
		WebElement Win = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
		act.moveToElement(Win).click().build().perform();
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		act.moveToElement(click).click().build().perform();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> ID = window.iterator();
		String ParentId = ID.next();
		String ChildId = ID.next();
		driver.switchTo().window(ChildId);
		String ChildText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		driver.switchTo().window(ParentId);
		String ParentText=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(ChildText);
		System.out.println(ParentText);
		driver.quit();
	}

}
