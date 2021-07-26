import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.restassured.RestAssured.given;
import static java.time.zone.ZoneRulesProvider.refresh;

import static org.hamcrest.Matchers.is;


public class ShopCartTest {

    @Test
    public void addProductInCartTest() {
        //Получить куки и установить в браузер
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

            //Открыть небольшой контент для активной сессии, куда можно подставить куки
                    open("http://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/mobile-menu-collapse.png");

            //Установить куки в браузер
                    getWebDriver().manage().addCookie(
                            new Cookie("Nop.customer", authorizationCookie));
            refresh();


        //Открыть главную страницу
            open("http://demowebshop.tricentis.com/");

            //Проверить актуальное количество товара в корзине
            $(".cart-qty").shouldHave(text("1"));

    }

}
