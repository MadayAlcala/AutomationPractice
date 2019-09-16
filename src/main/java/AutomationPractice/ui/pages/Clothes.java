/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package AutomationPractice.ui.pages;

import AutomationPractice.ui.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Clothes class, this class is in charge of the Clothes elements.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Clothes extends BasePage {

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li")
    private List<WebElement> dressesCount;

    /**
     * This method returns a list of dresses' quantity.
     *
     * @return dressesCount that is a list.
     */
    public List<WebElement> getDressesCount() {
        return dressesCount;
    }

    /**
     * This method is used to choose a casual dress.
     *
     * @param dressNum is the num of the dress.
     */
    public void getCasualDressProduct(final int dressNum) {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]")).click();
    }

    /**
     * This method is used to choose a evening dress.
     *
     * @param dressNum is the num of the dress.
     */
    public void getEveningDressProduct(final int dressNum) {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]")).click();
    }

    /**
     * This method is used to choose a summer dress.
     *
     * @param dressNum is the num of the dress.
     */
    public void getSummerDressProduct(final int dressNum) {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]")).click();
    }
}
