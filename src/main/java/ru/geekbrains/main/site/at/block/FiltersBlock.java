package ru.geekbrains.main.site.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.page.ContentPage;

public class FiltersBlock extends BasePage {



    @FindBy(css = "[id=\"filter-0\"]")
    private WebElement filtersFree;

    @FindBy(css = "[id=\"filter-1\"]")
    private WebElement filtersForBeginners;

    @FindBy(css = "[id=\"filter-2\"]")
    private WebElement filtersWebDevelopment;

    @FindBy(css = "[id=\"filter-3\"]")
    private WebElement filtersProgrammeDevelopment;

    @FindBy(css = "[id=\"filter-4\"]")
    private WebElement filtersWebDesign;

    @FindBy(css = "[id=\"filter-5\"]")
    private WebElement filtersMobileDevelopment;

    @FindBy(css = "[id=\"filter-6\"]")
    private WebElement filtersGameDevelopment;

    @FindBy(css = "[id=\"filter-7\"]")
    private WebElement filtersInformationSecurity;

    @FindBy(css = "[id=\"filter-8\"]")
    private WebElement filtersDataScience;

    @FindBy(css = "[id=\"filter-9\"]")
    private WebElement filtersTesting;

    @FindBy(css = "[id=\"filter-10\"]")
    private WebElement filtersInternetMarketing;

    @FindBy(css = "[id=\"filter-11\"]")
    private WebElement filtersSystemAdministration;

    @FindBy(css = "[id=\"filter-12\"]")
    private WebElement filtersGeekClub;

    @FindBy(css = "[id=\"filter-13\"]")
    private WebElement filtersSport;

    public FiltersBlock(WebDriver driver) {
        super(driver);
    }
    //    Бесплатные                    filtersFree
//    Для начинающих                filtersForBeginners
//    Веб-разработка                filtersWebDevelopment
//    Разработка программ           filtersProgrammeDevelopment
//    Веб-дизайн                    filtersWebDesign
//    Мобильная разработка          filtersMobileDevelopment
//    Разработка игр                filtersGameDevelopment
//    Информационная безопасность   filtersInformationSecurity
//    Data Science                  filtersDataScience
//    Тестирование                  filtersTesting
//    Интернет маркетинг            filtersInternetMarketing
//    Системное администрирование   filtersSystemAdministration
//    GeekClub                      filtersGeekClub
//    Киберспорт                    filtersSport
    public ContentPage clickButton(String nameButton) {
        switch (nameButton) {
            case "Бесплатные": {
                this.filtersFree.click();
                break;
            }
            case "Для начинающих": {
                this.filtersForBeginners.click();
                break;
            }
            case "Веб-разработка": {
                this.filtersWebDevelopment.click();
                break;
            }
            case "Разработка программ": {
                this.filtersProgrammeDevelopment.click();
                break;
            }
            case "Веб-дизайн": {
                this.filtersWebDesign.click();
                break;
            }
            case "Мобильная разработка": {
                this.filtersMobileDevelopment.click();
                break;
            }
            case "Разработка игр": {
                this.filtersGameDevelopment.click();
                break;
            }
            case "Информационная безопасность": {
                this.filtersInformationSecurity.click();
                break;
            }
            case "Data Science": {
                this.filtersDataScience.click();
                break;
            }
            case "Тестирование": {
                this.filtersTesting.click();
                break;
            }
            case "Интернет маркетинг": {
                this.filtersInternetMarketing.click();
                break;
            }
            case "Системное администрирование": {
                this.filtersSystemAdministration.click();
                break;
            }
            case "GeekClub": {
                this.filtersGeekClub.click();
                break;
            }
            case "Киберспорт": {
                this.filtersSport.click();
                break;
            }

            default: {
                throw new RuntimeException("Кнопки: " + nameButton + " нет на странице!");
            }
        }
        return new ContentPage(driver);
    }
}
