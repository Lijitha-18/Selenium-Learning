package com.sel2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name1=driver.findElement(By.id("inputUsername"));
		name1.sendKeys("lijitha");
		WebElement passwd1=driver.findElement(By.name("inputPassword"));
		passwd1.sendKeys("Lijitha18");
		WebElement submit1=driver.findElement(By.className("submit"));
		submit1.click();
		WebElement link1=driver.findElement(By.partialLinkText("Forgot"));
		link1.click();
		WebElement name2=driver.findElement(By.cssSelector("input[placeholder='Name'"));
		name2.sendKeys("Lijitha Raju");
		WebElement email1=driver.findElement(By.xpath("//input[@placeholder='Email']"));
		email1.sendKeys("lijitha@gmail.com");
		WebElement phoneNumber=driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		phoneNumber.sendKeys("9933992299");
		Thread.sleep(2000);
		WebElement link2=driver.findElement(By.className("reset-pwd-btn"));
		link2.click();
		Thread.sleep(2000);
		WebElement link3=driver.findElement(By.className("go-to-login-btn"));
		link3.click();
		WebElement name3=driver.findElement(By.id("inputUsername"));
		name3.sendKeys("Lijitha Raju");
		WebElement passwd2=driver.findElement(By.name("inputPassword"));
		passwd2.sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		WebElement submit2=driver.findElement(By.className("submit"));
		submit2.click();
		
	}
	

}
