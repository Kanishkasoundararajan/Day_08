package com.example.flower;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_02 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	   driver.get("https://jqueryui.com/droppable/");
	   driver.manage().window().maximize();
	   driver.switchTo().frame(0);
	   WebElement ds=driver.findElement(By.id("draggable"));
	   WebElement ds1=driver.findElement(By.id("droppable"));
	   Actions ac=new Actions(driver);
	   ac.clickAndHold(ds).release(ds1).build().perform();
	   Thread.sleep(5000);
	}

}
