package dev.karine.automation.practice.selenium.Pages;

import org.openqa.selenium.By;

public class BotaoPage extends BasePage {
    //Locators
    private By menuLinhasLocator = By.cssSelector("#react-burger-menu-btn");
    private By submenuAllItemsLocator = By.cssSelector("#inventory_sidebar_link");

    private By titleProductsLocator = By.className("title");

    public void viewLinhasPage() {
        if(super.isDisplayed(titleProductsLocator)) {
            super.actionMoveToElementPerform(menuLinhasLocator);
            super.click(menuLinhasLocator);
            super.actionMoveToElementPerform(submenuAllItemsLocator);
            super.click(submenuAllItemsLocator);
        } else {
            System.out.println("menu linhas was not found");
        }
    }

    public String getTitlePage() {
        return super.getText(titleProductsLocator);
    }



}