package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.page.ContentPage;

public class NavigationBlock extends BasePage{

    @FindBy(css = "[class=\"gb-left-menu__logo \"]")
    private WebElement icon;

    @FindBy(css = "[href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(css = "[href='/events']")
    private WebElement buttonWebinars;

    @FindBy(css = "[href=\"/topics\"]")
    private WebElement buttonForum;

    @FindBy(css = "[href=\"/posts\"]")
    private WebElement buttonBlog;

    @FindBy(css = "[href=\"/tests\"]")
    private WebElement buttonTests;

    @FindBy(css = "[href=\"/career\"]")
    private WebElement buttonCareer;

    public NavigationBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Клик по кнопке навигации с соответствующим контентом:{nameButton}")
    public ContentPage clickButton(String nameButton){
        switch (nameButton){
            case "Иконка" : {
                this.icon.click();
                break;
            }
            case "Курсы" : {
                this.buttonCourses.click();
                break;
            }
            case "Вебинары" : {
                this.buttonWebinars.click();
                break;
            }
            case "Форум" : {
                this.buttonForum.click();
                break;
            }
            case "Блог" : {
                this.buttonBlog.click();
                break;
            }
            case "Тесты" : {
                this.buttonTests.click();
                break;
            }
            case "Карьера" : {
                this.buttonCareer.click();
                break;
            }
            default:{
                throw new RuntimeException("Кнопки: "+nameButton+" нет на странице!");
            }
        }
        return new ContentPage(driver);
    }
}
//    Иконка
//    Курсы
//    Вебинары
//    Форум
//    Блог
//    Тесты
//    Карьера
