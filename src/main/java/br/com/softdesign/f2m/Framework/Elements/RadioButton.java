package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.softdesign.f2m.Framework.Interfaces.IRadioButton;

public class RadioButton implements IRadioButton {

    public WebElement element;
    public WebDriver driver;

    public void click() {
        this.element.click();
    }

    public boolean isSelected() {
        return this.element.isSelected();
    }

    public String getValue() {
        return this.element.getAttribute("value");
    }

}