package ru.geekbrains.main.site.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.ContentPage;

import java.util.stream.Stream;

import static ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;

@Feature("Проверка навигации")
@Story("Успешный переход на соответствующий контент")
@DisplayName("Навигация")
public class NavigationWebTest extends BaseWebSettingsTest {

@DisplayName("Проверка навигации")
@ParameterizedTest(name = "{index} => Нажатие на: {0}")
@MethodSource("stringProviderNotPopUp")
public void checkNavigationNotPopUp(NameButton nameButton) {
    new ContentPage(driver)
            .openURL()
            .getNavigationBlock().clickButton(nameButton)
            .checkPageName(nameButton);
}


    public static Stream<NameButton> stringProviderNotPopUp() {
        return Stream.of(
                NameButton.WEBINARS,
                NameButton.FORUM,
                NameButton.BLOG,
                NameButton.TESTS
        );
    }

    @DisplayName("Проверка страницы Блог с PopUp")
    @Test
    public void checkNavigationPopUp() {
        new ContentPage(driver)
                .openURL()
                .getNavigationBlock().clickButton(NameButton.BLOG)
                .closePopUp()
                .checkPageName(NameButton.BLOG);
    }
}
