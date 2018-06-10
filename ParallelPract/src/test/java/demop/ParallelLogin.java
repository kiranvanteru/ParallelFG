package demop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.BaseClasss;

public class ParallelLogin extends BaseClasss {
	

	
	@Test
  public void fb() throws Exception {
	  
	  	  driver.get("https://facebook.com");
	  	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kk23_vanteru@yahoo.com");;
	  driver.findElement(By.id("pass")).sendKeys("infoguyusad12");
	  driver.findElement(By.id("loginbutton")).click();
	  Thread.sleep(5000);
	  String fbtitle=driver.getTitle();
	  System.out.println(fbtitle);
	  System.out.println("fb test completed");
  }
  
  
  @Test
  public void gm() throws Exception {
	  
	  	  driver.get("https://gmail.com");
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kk23vanteru");;
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("infoguyusad");;
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  Thread.sleep(5000);
	  String gmtitle=driver.getTitle();
	  System.out.println(gmtitle);
	  System.out.println("gm test completed");
  }
}
