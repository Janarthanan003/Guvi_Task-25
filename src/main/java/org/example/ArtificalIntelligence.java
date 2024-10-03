package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArtificalIntelligence {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchInput")).sendKeys("Artifical Intelligence", Keys.ENTER);
        driver.findElement(By.xpath("//div[text()='History']")).click();
        String text = driver.findElement(By.id("History")).getText();
        if(text.equals("History")) {
            System.out.println("Title of the section");
        }
        else{
            System.out.println("Title not found");
        }

    }
}
