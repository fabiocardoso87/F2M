package br.com.softdesign.f2m.Framework.Interfaces;

public interface ISelect {

    void sendKeys(CharSequence keysToSend);

    void click();

    boolean isDisplayed();

    boolean selectOption(String option) throws InterruptedException;

}