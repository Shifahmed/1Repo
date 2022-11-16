//History
package AF;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openga.selenium.ElementNotVisibleException;

public class Test23 {
	ChromeDriver driver;
	
	@BeforeMethod
	public void openBrower() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","..//YTFramework/chromedriver");
 driver=new ChromeDriver();
 Thread.sleep(5000);
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	Thread.sleep(50000);
	}
	
	
	@Test
	public void youtubeLogin() throws InterruptedException {
	WebElement login= driver.findElement(By.xpath("(//tp-yt-paper-button[@aria-label='Sign in'])[1]"));
			login.click();
			Thread.sleep(2000);
			WebElement userName=driver.findElement(By.xpath("//*[@id='identifierId']"));
			userName.sendKeys("jselenium12@gmail.com");
			WebElement nextButton1=driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));
			nextButton1.click();
			Thread.sleep(1000);
			WebElement password=driver.findElement(By.xpath("input[@type='password']"));
			password.sendKeys("SJa@2000");	
			WebElement nextButton2=driver.findElement(By.xpath("//*[@id='passwordNext']"));
			nextButton2.click();
			Thread.sleep(2000);
			WebElement hamIcon=driver.findElement(By.xpath("//yt-icon[@icon='yt-icons:menu']"));
			hamIcon.click();
			WebElement history=driver.findElement(By.xpath("//*[.='History']"));
			history.click();
			WebElement accountLogo=driver.findElement(By.xpath("//*[@alt='Avatar image']"));
			accountLogo.click();
			Thread.sleep(3000);
			WebElement logout=driver.findElement(By.xpath("//*[text()='Sign out']"));
			logout.click();
			Thread.sleep(3000);
	}
	
	@AfterMethod
	public void browserClose() {
			driver.close();
	
			
			
	}
	


}
