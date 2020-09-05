package ru.geekbrains.main.site.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

import static ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;

public class AuthorizationWebTest extends BaseWebSettingsTest {

@Feature("Авторизация")
@Story("Успешная авторизация")
@DisplayName("Авторизация")
@Test
void name1() {
    new AuthorizationPage(driver)
            .openURL()
            .singIn("hks47018@eoopy.com","hks47018")
            .checkPageName(NameButton.ICON);
}
}
