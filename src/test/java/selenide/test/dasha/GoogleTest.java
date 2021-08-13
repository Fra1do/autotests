package selenide.test.dasha;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

public class GoogleTest {

    @Test
    public void shouldSerch(){
        open("https://google.com/ncr");

        element(byName("input")).setValue("selenide").pressEnter();

        elements("#search .g").shouldHave(sizeGreaterThanOrEqual(6))
                .first().shouldHave(text("Selenide: concise UI tests in Java"))
                .find(".r>a").click();





    }
}
