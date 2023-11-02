package github.com;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitWikiPageSoftAssertions {
    @BeforeAll
    static void config() {
        //config params
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Disabled
    @Test
    void assertionSoftTest() {

        open("https://github.com/selenide/selenide");
        //Выполняем переход на страницу Wiki
        $("#wiki-tab").click();
        //Развернуть скрытые строки
        $("#wiki-pages-box button").scrollTo().click();
        //Ищем в списке страниц "SoftAssertions"
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //Выполняем переход на страницу SoftAssertions
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        //Находим текст на странице
        $(".markdown-body").$(byText("3. Using JUnit5 extend test class:"))
                .sibling(0).shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
                        "class Tests {\n" +
                        "  @Test\n" +
                        "  void test() {\n" +
                        "    Configuration.assertionMode = SOFT;\n" +
                        "    open(\"page.html\");\n" +
                        "\n" +
                        "    $(\"#first\").should(visible).click();\n" +
                        "    $(\"#second\").should(visible).click();\n" +
                        "  }\n" +
                        "}"));

    }
}
