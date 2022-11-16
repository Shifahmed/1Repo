package AF;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;




public class B {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","../YFT/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Username=driver.findElement(By.cssSelector("input#email"));
		Username.sendKeys("shizaahmed");
		WebElement Password=driver.findElement(By.cssSelector("input#pass"));
		Password.sendKeys("abcde1234");
		WebElement loginButton=driver.findElement(By.cssSelector("button[name='login']"));
		loginButton.click();
		
	}
	

}
Thread.sleep(500);
for(int i=0; i<=5;i++);{
		ac.sendKeys(Keys.TAB).perform(); Thread.sleep(1000);
        ac.sendKeys(Keys.ENTER).perform();Thread.sleep(1000);




