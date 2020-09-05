package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.utils.BasePage;
import ru.geekbrains.main.site.at.block.*;
import ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;

public class ContentPage extends BasePage implements IOpenURL{

    private HeaderBlock headerBlock;
    private NavigationBlock navigationBlock;
    private HeaderCoursesBlock headerCoursesBlock;
    private FiltersBlock filtersBlock;
    private SampleBlock sampleBlock;

    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement popUp1;

    @FindBy(css = "button>[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement popUp2;

    public ContentPage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        this.navigationBlock = new NavigationBlock(driver);
        this.headerCoursesBlock = new HeaderCoursesBlock(driver);
        this.filtersBlock = new FiltersBlock(driver);
        this.sampleBlock = new SampleBlock(driver);
    }

    @Step("Проверка что имя страницы равно:{expectedNamePage}")
 public ContentPage checkPageName(NameButton nameButton) {
     headerBlock.checkNamePage(nameButton.getText());
     return this;
 }

    @Step("Закрытие всплывающий окон с предложениями")
    public ContentPage closePopUp(){
        popUp1.click();
        popUp2.click();

        return this;
    }

    public HeaderCoursesBlock getHeaderCoursesBlock() {
        return headerCoursesBlock;
    }

    public FiltersBlock getFiltersBlock() {
        return filtersBlock;
    }

    public SampleBlock getSampleBlock() {
        return sampleBlock;
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }

    public NavigationBlock getNavigationBlock() { return navigationBlock; }

    @Override
    public ContentPage openURL() {
        driver.get("https://geekbrains.ru/career");
        return this;
    }
}
