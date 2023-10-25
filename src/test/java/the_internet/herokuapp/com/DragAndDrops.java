package the_internet.herokuapp.com;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrops {

    @BeforeAll
    static void config() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void dragAndDropActions() {
        // Перейти на страницу "https://the-internet.herokuapp.com/drag_and_drop"
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // Выполнить перемещение элемента А к элементу В
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b"))
                .release().perform();
        // Проверить что В на месте А
        $("#column-a header").shouldHave(text("B"));

        // Проверить что А на месте В
        $("#column-b header").shouldHave(text("A"));
    }



    @Test
    void dragAndDropCommand() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // Элемен А находится на своём месте
        $("#column-a header").shouldHave(text("A"));

        // Элемент В находится на своём месте
        $("#column-b header").shouldHave(text("B"));

        // Меняем элементы местами
        $("#column-a").dragAndDropTo($("#column-b"));

        // Проверить что В на месте А
        $("#column-a header").shouldHave(text("B"));

        // Проверить что А на месте В
        $("#column-b header").shouldHave(text("A"));

    }
}
