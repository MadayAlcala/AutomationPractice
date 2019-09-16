/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package AutomationPractice.ui.Common;

import core.utils.Log;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * PropertyLoader, this class is used for implement the read of the properties file.
 *
 * @author Maday Alcala.
 * @version 0.0.1
 */
public final class PropertyLoader {

    /**
     * This is the constructor of the class.
     */
    private PropertyLoader() {
    }

    /**
     * This method is in charge to load File information.
     *
     * @param file is tje type of file that wants to read.
     * @return 'properties' that represent the property file.
     */
    public static Properties loadProperty(final String file) {
        Properties properties;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            Log.getInstance().getLog().error(e + "File not found.");
            throw new RuntimeException("File not found." + e);
        }
        return properties;
    }
}
