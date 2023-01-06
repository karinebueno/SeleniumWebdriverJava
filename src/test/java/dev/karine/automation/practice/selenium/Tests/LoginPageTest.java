package dev.karine.automation.practice.selenium.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.karine.automation.practice.selenium.Pages.LoginPage;

class LoginPageTest {
    private LoginPage loginPage;
    private final String URL = "https://www.saucedemo.com/inventory.html";

    @BeforeEach
    void setUp() {
        this.loginPage = new LoginPage();
        this.loginPage.visit(this.URL);
    }

    @AfterEach
    void tearDown() {
        this.loginPage.quitWebDriver();
    }

    @Test
    void test() {
        //when
        this.loginPage.signin();

        //then
        Assertions.assertEquals("PRODUCTS", this.loginPage.getProductsMessage());
        //Assertions.assertNotEquals(this.loginPage.getCurrentUrl(), this.URL);
    }

}