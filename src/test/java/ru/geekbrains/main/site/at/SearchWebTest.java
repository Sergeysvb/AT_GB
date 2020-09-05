package ru.geekbrains.main.site.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;
import static ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;
import static ru.geekbrains.main.site.at.block.SearchTabsBlock.tabName;

//        Перейти на сайт https://geekbrains.ru/courses
//        Нажать на кнопку Поиск
//        В поле Поиск ввести текст: java
//        Проверить что отобразились блоки и в них:
//        Профессий не менее чем 2
//        Курсов более 7
//        Вебинаров больше чем 180, но меньше 300
//        Блогов более 300
//        Форумов не 350
//        Тестов не 0

@DisplayName("Поиск")
public class SearchWebTest extends BaseWebSettingsTest {


    @BeforeEach
    void beforeSearchTest() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Feature("Поиск")
    @Story("Проверка исправной работы поиска")
    @DisplayName("Проверка количества контента")
    @Test
    void searchTest() {
        new AuthorizationPage(driver)
                .openURL()
                .singIn("hks47018@eoopy.com","hks47018")
                .checkPageName(NameButton.ICON)
                .getHeaderBlock()
                .searchText("java")
                .getSearchTabsBlock()
                .checkCount(tabName.Professions, greaterThanOrEqualTo(2))
                .checkCount(tabName.Courses, greaterThan(7))
                .checkCount(tabName.Webinars, allOf(greaterThan(180), lessThan(300)))
                .checkCount(tabName.Blogs, greaterThan(300))
                .checkCount(tabName.Forums, not(350))
                .checkCount(tabName.Tests, not(0));
    }
}