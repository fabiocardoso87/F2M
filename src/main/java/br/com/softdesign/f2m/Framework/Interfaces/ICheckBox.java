package br.com.softdesign.f2m.Framework.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ICheckBox {

    void click();

    boolean isSelected();

    boolean isDisplayed();

    String getAttribute(String attribute);

}