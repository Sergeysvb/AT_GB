package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.page.ContentPage;

public class HeaderCoursesBlock extends BasePage {
    @FindBy(css = "[id=\"prof-link\"]")
    private WebElement professions;

    @FindBy(css = "[id=\"free-link\"]")
    private WebElement freeIntensives;

    @FindBy(css = "[id=\"cour-link\"]")
    private WebElement courses;

    @FindBy(css = "[class=\"text-dark-dk\"][target=\"_blank\"]")
    private WebElement companies;

    public HeaderCoursesBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка кнопок с соответствующим контентом:{nameButton}")
    public ContentPage clickButton(String nameButton) {
        switch (nameButton) {
            case "Профессии": {
                this.professions.click();
                break;
            }
            case "Бесплатные интенсивы": {
                this.freeIntensives.click();
                break;
            }
            case "Курсы": {
                this.courses.click();
                break;
            }
            case "Компаниям": {
                this.companies.click();
                break;
            }

            default: {
                throw new RuntimeException("Кнопки: " + nameButton + " нет на странице!");
            }
        }
        return new ContentPage(driver);
    }
}