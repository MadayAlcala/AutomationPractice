/*
 * @(#) FormPageFour.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package AutomationPractice.ui.entities;

/**
 * Context class.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Context {
    private Address address;

    /**
     * Constructor class.
     */
    public Context() {
        this.address = new Address();
    }

    /**
     * Metod return the class address.
     *
     * @return address class.
     */
    public Address getAddress() {
        return address;
    }
}
