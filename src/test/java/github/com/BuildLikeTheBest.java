package github.com;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BuildLikeTheBest {

    @BeforeAll
    static void config() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

    }

    @Test
    void checkHeaderTextOnPageEnterpriseTest(){
        // Перейти на главную страницу GitHub
        open("https://github.com/");

        // Выбрать меню Solution
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        // В выпадающем списке Solution выбрать пункт Enterprise
        $(".header-menu-wrapper").$(byText("Enterprise")).click();
        // Проверить на открытой странице заголовок содержит текст "Build like the best"
        $(".application-main  h1").shouldHave(text("Build like the best"));
     }

}
