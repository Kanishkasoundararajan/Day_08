package com.example.flower;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_04 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	   driver.get("https://www.abhibus.com/bus-ticket-booking");
	   driver.manage().window().maximize();
	  WebElement wb= driver.findElement(By.name("source"));
	  wb.sendKeys("Coimbatore");
	  Thread.sleep(5000);
	 WebElement wb1=driver.findElement(By.name("destination"));
	 wb1.sendKeys("Namakkal");
	 Thread.sleep(5000);
	   WebElement dt=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
	   dt.click();

	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].setAttribute('value','10/06/2023')", dt);
	   
	   
	}
	
	
}
