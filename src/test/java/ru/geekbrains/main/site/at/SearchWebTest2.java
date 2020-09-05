package ru.geekbrains.main.site.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.block.HeaderCoursesBlock.NameButtonHBlock;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

import static ru.geekbrains.main.site.at.block.FiltersBlock.NameFilter.FREE;
import static ru.geekbrains.main.site.at.block.FiltersBlock.NameFilter.TESTING;
import static ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;

//       Перейти на страницу авторизация https://geekbrains.ru/login
//       Ввести логин : hks47018@eoopy.com
//       Пароль: hks47018
//       Нажать кнопку войти
//       Проверить что отобразилась страница "Главная"
//       Нажать в навигации "Курсы"
//       Нажать в шапке сайта "Курсы"
//       Выбрать в фильтрах чекбокс "Бесплатные"
//       Выбрать в фильтрах чекбокс "Тестирование"
//       Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 1"
//       Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 2"


@Feature("Проверка фильтров")
@Story("Успешная сортировка по фильтрам")
@DisplayName("Проверка функционала")
public class SearchWebTest2 extends BaseWebSettingsTest {

    @Test
    void SearchTestTwo() {
        new AuthorizationPage(driver)
                .openURL()
                .singIn("hks47018@eoopy.com", "hks47018")
               .checkPageName(NameButton.ICON)
               .getNavigationBlock()
               .clickButton(NameButton.COURSES)
                .getHeaderCoursesBlock()
                .clickButtonHBlock(NameButtonHBlock.COURSES)
                .getFiltersBlock()
                .clickButton(FREE)
                .getFiltersBlock()
                .clickButton(TESTING)
                .getSampleBlock()
                .searchContent("Тестирование ПО. Уровень 1")
                .getSampleBlock()
                .searchContent("Тестирование ПО. Уровень 2");
    }
}
