package goibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibiboTesting {

	
	

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
		
		
		ChromeDriver  driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Flights")).click();
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
		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][2]")).click();
		//driver.findElement(By.xpath("	//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[3]/div[5]")).click();
	
		driver.findElement(By.xpath("//div[@aria-label='Fri Apr 08 2022']")).click();
		driver.findElement(By.xpath("//div[@class='gr_fswFld ']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("span[@class='sc-kfPuZi dprjVP fswDownArrow fswDownArrowTraveller']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@class='sc-hOGkXu hAcfuc']")).click();
		//Thread.sleep(2000);
		
		//span[@class='sc-kfPuZi dprjVP fswDownArrow fswDownArrowTraveller']
		//driver.findElement(By.xpath("//span[@class='sc-fHeRUh jHgPBA']]")).click();
		//Thread.sleep(1000);
		//span[@class='sc-fHeRUh jHgPBA']
		
		//driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
		//driver.findElement(By.xpath("//p[@class='sc-jOxtWs cRUgor']")).click();
		//a[@href='/hotels/']
		//driver.findElement(By.)
		
		
		
		//driver.findElement(By.xpath("//p[@class='sc-hGPBjI bACBrS']")).sendKeys("London (LON)");
		//driver.findElement(By.value("Mumbai (BOM)")).sendKeys("Mumbai (BOM)");
		//driver.findElement(By.xpath("//*[@class='sc-iJKOTD iipKRx.fswWidgetPlaceholder']")).click();
		//driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']//input[@type='text']")).sendKeys("Mumbai",Keys.ENTER);
	
}

	//private static void Thread.sleep(int i) {
		// TODO Auto-generated method stub
		
	}




