package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.page.ContentPage;
import ru.geekbrains.main.site.at.utils.BasePage;

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
    public ContentPage clickButtonHBlock(NameButtonHBlock nameButtonHBlock){
        switch (nameButtonHBlock) {
            case PROFESSIONS: {
                this.professions.click();
                break;
            }
            case FREE_INTENSIVES: {
                this.freeIntensives.click();
                break;
            }
            case COURSES: {
                this.courses.click();
                break;
            }
            case COMPANIES: {
                this.companies.click();
                break;
            }
            default: {
                throw new RuntimeException("Кнопки: " + nameButtonHBlock + " нет на странице!");
            }
        }
        return new ContentPage(driver);
    }

    public enum NameButtonHBlock{
        PROFESSIONS("Профессии"),
        FREE_INTENSIVES("Бесплатные интенсивы"),
        COURSES("Курсы"),
        COMPANIES("Компаниям");

        NameButtonHBlock(String text) {
            this.text = text;
        }
        private String text;

        public String getText() {
            return text;
        }
    }
}