package org.test.my_app_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        
        Calculator calc = new Calculator();
        int sum = calc.add(10, 20);
        int diff =calc.subtract(20, 10);
        
        System.out.println("sum-" + sum + " diff-"+ diff);
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("email"));
        WebElement passBox = driver.findElement(By.name("pass"));
        WebElement submitButton = driver.findElement(By.name("login"));

        Thread.sleep(2000);
        textBox.sendKeys("test@gmail.com");
        passBox.sendKeys("hello@123");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        driver.quit();

	}

}
