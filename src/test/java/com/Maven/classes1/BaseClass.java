package com.Maven.classes1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;

	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver=new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
