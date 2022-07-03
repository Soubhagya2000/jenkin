package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		/*driver.findElement(By.id("pass")).sendKeys("hello mr");
		driver.findElement(By.linkText("Forgotten password?")).click();*/
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mindtree");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.gNO89b")).click();
		
		

	}

}
