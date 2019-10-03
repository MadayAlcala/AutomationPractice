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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to generate logs.
 *
 * @author Maday Alcala Cuba.
 * @version 0.0.1
 */
public final class Log {
    private static final Logger log = LoggerFactory.getLogger(Log.class);

    /**
     * Private constructor.
     */
    private Log() {

    }

    /**
     * This method returns a 'log' with which more loggers can be added.
     *
     * @return a 'log'.
     */
    public static Logger getLog() {
        return log;
    }
}
