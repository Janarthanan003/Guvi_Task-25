package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LoginGuvi {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com");
        driver.findElement(By.xpath("//span[@class=\"accountUserName col-xs-12 reset-padding\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"https://www.snapdeal.com/login\"]")).click();
        driver.findElement(By.id("luser")).sendKeys("jana@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Jana03!");
    }
}