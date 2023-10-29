package properties.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    @Tag("property")
    void systemPropertiesTest() {
        String browser = System.getProperty("browser", "mozilla");
    }
    @Test
    @Tag("property")
    void testBrowserSize() {
        String browserSizes = System.getProperty("browserSize", "1920x1080");
        Configuration.browserSize = browserSizes;

    }

    @Test
    @Tag("property")
    void testBrowserVersion() {
        String browserVersion = System.getProperty("browserVersion", "89.0");
        Configuration.browserVersion = browserVersion;
    }

}
