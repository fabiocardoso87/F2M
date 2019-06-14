package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.softdesign.f2m.Framework.Interfaces.ISelect;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SelectOfSelector implements ISelect {

    WebDriver driver;
    WebElement element;

    public SelectOfSelector(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public void sendKeys(CharSequence keysToSend) {
        if(this.isDisplayed()) {
            this.element.sendKeys(keysToSend);
        }
    }

    public void click() {
        if(this.isDisplayed()) {
            this.element.click();
        }
    }

    public boolean isDisplayed() {
        if(this.element.isDisplayed()) {
            return this.element.isDisplayed();
        } else {
            throw new NoSuchElementException(" Elemento não está disponível! ");
        }
    }

    public List<WebElement> getOptions() {
        List<WebElement> listaOptions = new ArrayList<>();
        if(this.isDisplayed()) {
             listaOptions = this.element.findElements(By.tagName("option"));
        }
        return listaOptions;
    }

    public boolean selectOption(String option) {
        if(this.isDisplayed()) {
            for (WebElement element : this.getOptions()) {
                if (element.getAttribute("value").equalsIgnoreCase(option)) {
                    element.click();
                    return true;
                }
            }
        }
        return false;
    }

}