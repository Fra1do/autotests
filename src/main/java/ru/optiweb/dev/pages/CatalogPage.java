package ru.optiweb.dev.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.optiweb.dev.pages.base.BasePage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage extends BasePage {
    private static final SelenideElement title = $(By.xpath("//h1[@class='content__title']"));

    @Override
    @Step("open Catalog page")
    public CatalogPage open() {
//        Selenide.open("",
//                "",
//                getBaseAuthLogin(),
//                getBaseAuthPassword());
        Selenide.open("/catalog",
                "",
                "kuchumova",
                "wXKdeN");
        return new CatalogPage();
    }


    @Step("Check Catalog Page was open")
    public CatalogPage shouldBeOpened() {
        title.shouldHave(exactText("Каталог"));
        return this;
    }
}
