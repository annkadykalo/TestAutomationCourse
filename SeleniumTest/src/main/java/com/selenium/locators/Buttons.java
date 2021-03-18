package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Buttons {
    private String url = "http://www.leafground.com/pages/Button.html";

    private WebDriver startDriver (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }

    private void teardown(WebDriver driver){
        driver.close();
    }

    public void goHomeTest (){
        WebDriver driver = startDriver();
        driver.get(url);

        By goHomeButtonSelector = By.cssSelector("#home");
        WebElement goHomeButton = driver.findElement(goHomeButtonSelector);
        goHomeButton.click();

        teardown(driver);
    }
    public void getPositionButton (){
        WebDriver driver = startDriver();
        driver.get(url);

        By getPositionSelector = By.cssSelector("#position");
        WebElement getPositionButton = driver.findElement(getPositionSelector);
        System.out.println(getPositionButton.getLocation().toString());

        teardown(driver);
    }

    public void getColourButton (){
        WebDriver driver = startDriver();
        driver.get(url);

        By getColorSelector = By.cssSelector("#color");
        WebElement getColorButton = driver.findElement(getColorSelector);
        System.out.println(getColorButton.getCssValue("background-color"));

        teardown(driver);
    }

    public void getSizeButton (){
        WebDriver driver = startDriver();
        driver.get(url);

        By getSizeSelector = By.cssSelector("#size");
        WebElement getSizeButton = driver.findElement(getSizeSelector);
        System.out.println(getSizeButton.getSize().toString());

        teardown(driver);
    }

}
