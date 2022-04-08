package demo4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {
		
		

public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
			
			
 ChromeDriver  driver= new ChromeDriver();
driver.get("https://www.goibibo.com/");
driver.manage().window().maximize();
	System.out.println("page title is:-" + driver.getTitle());
}
}