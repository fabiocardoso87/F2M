package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.softdesign.f2m.Framework.Interfaces.IButton;

import org.openqa.selenium.JavascriptExecutor;

public class Button implements IButton {

    public WebDriver driver;
    public WebElement element;

    public Button(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public void click() {
        this.element.click();
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

    public String getAttribute(String attribute) {
        return this.element.getAttribute(attribute);
    }

}