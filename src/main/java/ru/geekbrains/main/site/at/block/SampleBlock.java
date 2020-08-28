package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.page.ContentPage;

public class SampleBlock extends BasePage {

    @FindBy(css = "[id=\"courses-tab\"]")
    private WebElement fullSample;

    public SampleBlock(WebDriver driver) {
        super(driver);
    }
    @Step("Проверка контента:{nameContent}")
    public ContentPage searchContent(String nameContent){
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(fullSample,nameContent));
        return new ContentPage(driver);


    }

}