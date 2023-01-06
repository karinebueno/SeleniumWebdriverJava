package dev.karine.automation.practice.selenium.Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    //Locators
    private By emailAddressLocator = By.id("user-name");
    private By passwordLocator = By.name("password");
    private By submitBtnLocator = By.name("login-button");

    private By tagProductsLocator = By.className("title");


    public void signin() {
        if(super.isDisplayed(emailAddressLocator)) {
            super.type("standard_user", emailAddressLocator);
            super.type("secret_sauce", passwordLocator);
            super.click(submitBtnLocator);
        } else {
            System.out.println("email textbox was not present");
        }
    }

    public String getProductsMessage() {

        return super.getText(tagProductsLocator);
    }

}
