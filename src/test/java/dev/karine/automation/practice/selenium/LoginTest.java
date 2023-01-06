package dev.karine.automation.practice.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    void test() {
        WebElement emailAddressElement = driver.findElement(By.id("user-name"));
        emailAddressElement.sendKeys("standard_user");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("secret_sauce");

        WebElement submitBtnElement = driver.findElement(By.name("login-button"));
        submitBtnElement.click();

        WebElement tagProducts = driver.findElement(By.className("title"));
        String textTagH1 = tagProducts.getText();

        Assertions.assertTrue(textTagH1.equals("PRODUCTS"));
    }



}
