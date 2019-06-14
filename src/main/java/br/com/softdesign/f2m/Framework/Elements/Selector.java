package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selector {

    WebDriver driver;
    WebElement element;
    TextField filter;
    Button chooseAll, choose, remove, removeAll;
    SelectOfSelector chooser, choosed;

    public Selector(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
        this.filter = (TextField) this.element.findElement(By.xpath("/div/p/input"));
        this.chooser = (SelectOfSelector) this.element.findElement(By.xpath("/div/select"));
        this.choosed = (SelectOfSelector) this.element.findElement(By.xpath("/div/div[2]/select"));
        this.chooseAll = (Button) this.element.findElement(By.xpath("/div/a"));
        this.choose = (Button) this.element.findElement(By.xpath("/div/ul/li[1]/a"));
        this.remove = (Button) this.element.findElement(By.xpath("/div/ul/li[2]/a"));
        this.removeAll = (Button) this.element.findElement(By.xpath("/div/div[2]/a"));
    }

    public void adicionaTodos() {
        this.chooseAll.click();
    }

    public void adicionarUm(String option) {
        this.filter.sendKeys(option);
        this.choose.click();
    }

    public boolean pesquisa(String option) {
        this.filter.sendKeys(option);
        return true;
    }

}