package ru.geekbrains.main.site.at.utils;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
@Step("Открыта страница: {url}")
    protected void openPageInBrowser(String url) {
        driver.get(url);

    }
}
