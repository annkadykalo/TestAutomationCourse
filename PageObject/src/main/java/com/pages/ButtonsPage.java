package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

public class ButtonsPage {
    private Page page;

    public ButtonsPage(Page page){
        this.page = page;
    }

    public By goHomeButtonSelector = By.id("home");
    public By getPositionSelector = By.cssSelector("#position");
    public By getColorSelector = By.cssSelector("#color");
    public By getSizeSelector = By.cssSelector("#size");

    public void goHome (){
        page.click(goHomeButtonSelector);
    }

    public void getButtonPosition(){
        Point point = page.getPosition(getPositionSelector);
        System.out.println(point.toString());
    }

    public void getColor (){
        page.getColor(getColorSelector);
    }

    public void getSize (){
        page.getSize(getSizeSelector);
    }

}
