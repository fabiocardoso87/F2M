package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import br.com.softdesign.f2m.Framework.Interfaces.IAlert;

public class Alert implements IAlert {

    WebDriver driver;

    public Alert(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getText() {
        try {
            this.driver.switchTo().alert().getText();
        } catch (NoAlertPresentException ex) {
            return false;
        }
        return true;
    }

    public boolean accept() {
        try {
            this.driver.switchTo().alert().accept();
        } catch (NoAlertPresentException ex) {
            return false;
        }
        return true;
    }

    public boolean dismiss() {
        try {
            this.driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException ex) {
            return false;
        }
        return true;
    }

    public boolean sendKeys(String texto) {
        try {
            this.driver.switchTo().alert().sendKeys(texto);
        } catch (NoAlertPresentException ex) {
            return false;
        }
        return true;
    }

}