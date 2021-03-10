package com.selenium.test.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

/*
Make browser full screen
Open URL with test site - http://www.leafground.com/pages/Window.html
Click on “Open Multiple Windows” button;
Display all windows titles in console
Switch to one of that windows - to ‘Interact with Buttons’ (Bond with Buttons)
Make it full screen and display some title of the button from that page to console;
Close all windows.
*/

public class Main {
    public static void main (String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        String url = "http://www.leafground.com/pages/Window.html";

        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);

        //driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();

        By multipleWindowButtonSelector = By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button");
        WebElement multipleWindowButton = driver.findElement(multipleWindowButtonSelector);
        multipleWindowButton.click();

        Set<String> handles = driver.getWindowHandles();

        for (String temp : handles) {
            driver.switchTo().window(temp);
            System.out.println(driver.getTitle());

            if (driver.getTitle().equals("TestLeaf - Interact with Buttons")){
                driver.manage().window().maximize();
                Thread.sleep(2000);
                System.out.println(driver.findElement(By.xpath("//*[@id=\"home\"]")).getText());
            }

            driver.close();
        }
    }
}
