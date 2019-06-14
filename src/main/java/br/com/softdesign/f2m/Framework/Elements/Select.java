package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.softdesign.f2m.Framework.Interfaces.ISelect;

public class Select implements ISelect {

    public WebDriver driver;
    public WebElement element;

    public Select(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public void sendKeys(CharSequence keysToSend) {
        this.element.sendKeys(keysToSend);
    }

    public boolean selectOption(String option) {
        boolean flag = false;
        for(WebElement element : this.element.findElements(By.tagName("option"))) {
            if(element.getText().trim().equals(option)) {
                element.click();
                flag = true;
            }
        }
        return flag;
    }

    public void click() {

        this.element.click();
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

}