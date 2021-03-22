package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.SplittableRandom;

public class Page {
    public WebDriver driver;
    public WebDriverWait wait;

    private int timeOut = 10;

    private ButtonsPage _buttonsPage;

    public Page (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, timeOut);
    }

    public ButtonsPage buttonsPage() {
        return _buttonsPage == null ? _buttonsPage = new ButtonsPage(this) : _buttonsPage;
    }

    public void click(By selector) {
        driver.findElement(selector).click();
    }

    public void click(WebElement element) {
        element.click();
    }

    public Dimension getSize (By selector){
        Dimension size = driver.findElement(selector).getSize();
        System.out.println(size);
        return size;
    }

    public Point getPosition (By selector){
        return driver.findElement(selector).getLocation();
    }

    public String getColor (By selector){
        String color = driver.findElement(selector).getCssValue("background-color");
        System.out.println(color);
        return color;
    }

    public void open(String myUrl) {
        driver.get(myUrl);
    }

    public String getTitle (){
        return driver.getTitle();
    }
}