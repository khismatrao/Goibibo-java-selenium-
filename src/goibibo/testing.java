package goibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testing {

		public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
			
			
			ChromeDriver  driver= new ChromeDriver();
			driver.get("https://www.goibibo.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Flights")).click();
			//driver.get("https://www.goibibo.com/flights/");
		     
		
			

			Thread.sleep(2000);	
			driver.findElement(By.cssSelector(".sc-GEbAx.kenSRj")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[contains(@p,'Enter city or airport')][1]")).click();
			driver.findElement(By.cssSelector(".sc-iJKOTD.iipKRx.fswWidgetPlaceholder")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[contains(@p,'Enter city or airport')][1]")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@class='sc-iAKWXU iyyKqe'][1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='sc-iAKWXU iyyKqe'][1]")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//div[@class='DayPicker-Day'][2]")).click();
			driver.findElement(By.xpath("	//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[3]/div[5]")).click();
		
			//driver.findElement(By.xpath("//div[@aria-label='Fri Apr 08 2022']")).click();
			driver.findElement(By.xpath("//p[@class='gr_fswFld__info']")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]/div[4]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
			driver.findElement(By.xpath("//a[@class='sc-dtMgUX daltrV']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='sc-fHeRUh jHgPBA']]")).click();
			//span[@class='sc-fHeRUh jHgPBA']
			
			
			//driver.findElement(By.xpath("//a[@href='/trains/']")).click();
			//a[@href='/hotels/']	
			
			
			
			//driver.findElement(By.xpath("//p[@class='sc-hGPBjI bACBrS']")).sendKeys("London (LON)");
			//driver.findElement(By.value("Mumbai (BOM)")).sendKeys("Mumbai (BOM)");
			//driver.findElement(By.xpath("//*[@class='sc-iJKOTD iipKRx.fswWidgetPlaceholder']")).click();
			//driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']//input[@type='text']")).sendKeys("Mumbai",Keys.ENTER);
		
	}

}
