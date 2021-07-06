package ru.geekbrains.main.site.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

//        Дополнительное задание
//
//        Реализовать тест:
//        1. Перейти на страницу авторизация https://geekbrains.ru/login
//        2. Ввести логин : hks47018@eoopy.com
//        3. Пароль: hks47018
//        4. Нажать кнопку войти
//        5. Проверить что отобразилась страница "Главная"
//        6. Нажать в навигации "Курсы"
//        7. Нажать в шапке сайта "Курсы"
//        8. Выбрать в фильтрах чекбокс "Бесплатные"
//        9. Выбрать в фильтрах чекбокс "Тестирование"
//        10. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 1"
//        11. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 2"


@Feature("Проверка фильтров")
@Story("Успешная сортировка по фильтрам")
@DisplayName("Проверка функционала")
public class SearchWebTest2 extends BaseWebSettingsTest {

    @Test
    void SearchTestTwo() {
        driver.get("https://geekbrains.ru/login");

        new AuthorizationPage(driver)
                .singIn("hks47018@eoopy.com", "hks47018")
                .checkPageName("Главная")
                .getNavigationBlock()
                .clickButton("Курсы")
                .getHeaderCoursesBlock()
                .clickButton("Курсы")
                .getFiltersBlock()
                .clickButton("Бесплатные")
                .getFiltersBlock()
                .clickButton("Тестирование")
                .getSampleBlock()
                .searchContent("Тестирование ПО. Уровень 1")
                .getSampleBlock()
                .searchContent("Тестирование ПО. Уровень 2");
    }
}
