package steps;

import core.selenium.WebDriverManager;

import static org.hamcrest.CoreMatchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriverManager webDriverManager = WebDriverManager.getInstance();
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = webDriverManager.getWebDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void login() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("smilingly3@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("tresconejos");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        Assert.assertSame(driver.findElement(By.cssSelector(".account > span")).getText(), is("Maday Alcala"),
                "It is not the same text");
    }
}
