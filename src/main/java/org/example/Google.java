package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        driver.manage().window().maximize();
        String text = driver.getCurrentUrl();
        System.out.println(text);
        driver.navigate().refresh();
        driver.close();
    }
}