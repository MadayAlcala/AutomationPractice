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
public class PageTransporter {
    private static PageTransporter pageTransporter;
    private WebDriver webDriver;

    /**
     * This method is used for initializes the variables.
     */
    public PageTransporter() {
        initialize();
    }

    /**
     * This method is used for initializes the variables.
     */
    public void initialize() {
        webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * This method is used for instantiate the PageTransporter class.
     *
     * @return a pageTransporter.
     */
    public static PageTransporter getInstance() {
        if (pageTransporter == null) {
            pageTransporter = new PageTransporter();
        }
        return pageTransporter;
    }

    /**
     * This method is used for go to a page.
     *
     * @param url The parameter url defines a input url.
     */
    public void goToUrl(String url) {
        webDriver.navigate().to(url);
    }

    /**
     * This method is used for go to a page login.
     *
     * @return a LoginPage.
     */
    public LoginPage goToUrlLogin() {
        goToUrl(ReadAppFile.getInstance().getUrlLogin());
        return new LoginPage();
    }
}
