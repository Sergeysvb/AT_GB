package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.utils.BasePage;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTabsBlock extends BasePage {

    @FindBy(css = "[class='search-page-tabs'] [data-tab='all']")
    private WebElement tabEveryWhere;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='professions']")
    private WebElement tabProfessions;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='courses']")
    private WebElement tabCourses;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='webinars']")
    private WebElement tabWebinars;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='blogs']")
    private WebElement tabBlogs;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='forums']")
    private WebElement tabForums;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='tests']")
    private WebElement tabTests;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='companies']")
    private WebElement tabCompanies;

    public SearchTabsBlock(WebDriver driver) {
        super(driver);
    }

    public void clickTab(tabName tabName) {
        getTab(tabName).click();
    }

    @Step("Проверка контента на соответствие при поиске {tabName}")
    public SearchTabsBlock checkCount(tabName tabName, Matcher<Integer> matcher) {
        String actualCount = getTab(tabName).findElement(By.cssSelector("span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
    }

    private WebElement getTab(tabName tabName) {
        switch (tabName){
            case EveryWhere: {
                return tabEveryWhere;
            }
            case Professions: {
                return tabProfessions;
            }
            case Courses: {
                return tabCourses;
            }
            case Webinars: {
                return tabWebinars;
            }
            case Blogs: {
                return tabBlogs;
            }
            case Forums: {
                return tabForums;
            }
            case Tests: {
                return tabTests;
            }
            case Companies: {
                return tabCompanies;
            }
            default:
                throw new RuntimeException("Элемента: "+tabName+" нет на странице!");
        }
    }

    public enum tabName {
        EveryWhere("Везде"),
        Professions("Профессии"),
        Courses("Курсы"),
        Webinars("Вебинары"),
        Blogs("Блоги"),
        Forums("Форумы"),
        Tests("Тесты"),
        Companies("Компании")
        ;

        tabName(String text) {
            this.text = text;
        }
        private String text;

        public String getText() {
            return text;
        }
    }
}