/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package core.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * This class is used to generate logs.
 *
 * @author Maday Alcala Cuba.
 * @version 0.0.1
 */
public final class Log {
    private static Log instance;
    private static Logger log = Logger.getLogger(Log.class);

    /**
     * Private constructor for the Singleton pattern.
     */
    private Log() {
        initialize();
    }

    /**
     * This method initializes the logger characteristics.
     */
    public void initialize() {
        log.setLevel(Level.ALL);
    }

    /**
     * This method ensures that only one instance is created according
     * to the builder pattern and returns a log instance.
     *
     * @return an 'instance' of Log.
     */
    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    /**
     * This method returns a 'log' with which more loggers can be added.
     *
     * @return a 'log'.
     */
    public Logger getLog() {
        return log;
    }
}
