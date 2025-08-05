package com.raymoli.training;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Make sure the ChromeDriver executable is in your PATH
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleHomePageTitle() {
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        assertEquals("Google", pageTitle);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
