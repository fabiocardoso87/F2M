package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.softdesign.f2m.Framework.Interfaces.ISelect;

public class Select2 implements ISelect {

    public WebDriver driver;
    public WebElement element;
    public WebElement txtSearch;

    public Select2(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public void sendKeys(CharSequence keysToSend) {
        this.element.sendKeys(keysToSend);
    }

    public boolean selectOption(String option) throws InterruptedException {
        boolean flag = true;
        this.element.click();
        this.txtSearch = this.element.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        this.txtSearch.sendKeys(option);
        Thread.sleep(2000);
        String result = driver.findElement(By.xpath("/html/body/span/span/span[2]")).getText();
        if (result.equals("No results found") || result.equals("The results could not be loaded.")) {
            flag = false;
        } else {
            this.txtSearch.sendKeys(Keys.ENTER);
        }
        //System.out.println(result);
        return flag;
    }

    public void click() {
        this.element.click();
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

}