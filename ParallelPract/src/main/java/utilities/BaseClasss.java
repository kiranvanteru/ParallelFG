package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClasss {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void Startbr(String browser){
	
		if(browser.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver", "C:\\selenium jars and files\\geckodriver.exe");
	driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
	
			System.setProperty("webdriver.chrome.driver", "C:\\selenium jars and files\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else{
			System.out.println("specify driver");
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}
	
	@AfterTest
	public void Clean(){
		driver.close();
	}
}

