package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	WebDriver Driver; 

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver2\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.get("https://techfios.com/test/101/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	public void CheckAllBox () throws InterruptedException {
		
		
		Driver.findElement(By.name("todo[0]")).click();
		Driver.findElement(By.name("todo[1]")).click();
		Driver.findElement(By.name("todo[2]")).click();
		Driver.findElement(By.name("todo[3]")).click();
			
	}
	
	@Test
	public void remove()  {
	Driver.findElement(By.name("todo[0]")).click();
	Driver.findElement(By.name("submit")).click();
	
	
	}
	
	}

