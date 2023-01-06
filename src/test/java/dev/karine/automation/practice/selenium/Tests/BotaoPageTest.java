package dev.karine.automation.practice.selenium.Tests;

import dev.karine.automation.practice.selenium.Pages.BotaoPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class BotaoPageTest {
    private BotaoPage botaoPage;

    private final String URL = "https://www.saucedemo.com/inventory.html";

    BotaoPageTest() {
    }

    @BeforeEach
    void setUp() {
        this.botaoPage = new BotaoPage();
        this.botaoPage.visit(this.URL);
    }

    @AfterEach
    void tearDown() {
        //this.botaoPage.quitWebDriver();
    }

    @Test
    void test() {
        //when
        this.botaoPage.viewLinhasPage();

        //then
        Assertions.assertEquals("PRODUCTS", this.botaoPage.getTitlePage());
        //Assertions.assertFalse(this.URL.equals(botaoPage.getCurrentUrl()));
    }
}
