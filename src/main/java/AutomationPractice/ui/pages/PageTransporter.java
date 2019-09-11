package AutomationPractice.ui.pages;

import AutomationPractice.ui.Common.ReadAppFile;
import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;

/**
 * PageTransporter class.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public final class PageTransporter {
    private static WebDriver webDriver;

    /**
     * This is the empty constructor according to checkstyle.
     */
    private PageTransporter() {
    }

    /**
     * This method is used for go to a page.
     *
     * @param url The parameter url defines a input url.
     */
    public static void goToUrl(final String url) {
        webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.navigate().to(ReadAppFile.getInstance().getUrl(url));
    }
}
