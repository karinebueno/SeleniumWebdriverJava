package dev.karine.automation.practice.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    private WebDriver driver;
    @Test
    public void helloSelenium() {
        //https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        String currentUrl = driver.getCurrentUrl();
        String expected = "https://www.saucedemo.com/";

        Assertions.assertEquals(expected,currentUrl);

        driver.quit();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}

