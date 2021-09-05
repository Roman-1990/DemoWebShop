package tests.api;

import annotations.JiraIssue;
import annotations.JiraIssues;
import annotations.Layer;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static java.time.zone.ZoneRulesProvider.refresh;

import static org.hamcrest.Matchers.is;

@Layer("Api")
@Owner("roman")
@Feature("Issues")
public class ShopCartTest extends TestBase{

    @Test
    @JiraIssues({@JiraIssue("RK-01")})
    @Tag("Api")
    @DisplayName("Добавление товара в корзину")
    public void addProductInCartTest() {
        //Получить куки и установить в браузер
        step("Получить куки и установить в браузер", () -> {
            String authorizationCookie =
                    given()
                            .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                            .body("product_attribute_72_5_18=53&" +
                                    "product_attribute_72_6_19=54&" +
                                    "product_attribute_72_3_20=57&" +
                                    "addtocart_72.EnteredQuantity=1")
                            .when()
                            .post("http://demowebshop.tricentis.com/addproducttocart/details/72/1")
                            .then()
                            .statusCode(200)
                            .body("success", is(true))
                            .body("updatetopcartsectionhtml", is("(1)"))
                            .extract()
                            .cookie("Nop.customer");

            step("Открыть небольшой контент для активной сессии, куда можно подставить куки", () -> {
            //Открыть небольшой контент для активной сессии, куда можно подставить куки
                    open("http://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/mobile-menu-collapse.png");
            });
                    step("Установить куки в браузер", () -> {
            //Установить куки в браузер
                    getWebDriver().manage().addCookie(
                            new Cookie("Nop.customer", authorizationCookie));
            refresh();
                    });
                    step("Открыть главную страницу", () -> {
        //Открыть главную страницу
            open("http://demowebshop.tricentis.com/");
                    });
                        step("Проверить актуальное количество товара в корзине", () -> {
            //Проверить актуальное количество товара в корзине
            $(".cart-qty").shouldHave(text("1"));
                        });
        });
    }
}
