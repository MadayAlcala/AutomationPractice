/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package AutomationPractice.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * UrlBuilder, this class is used for build a url with the urlBase and the endpoint.
 *
 * @author Maday Alcala.
 * @version 0.0.1
 */
public final class UrlBuilder {
    private static String URL_BASE = ReadAppFile.getInstance().getUrl("url");

    /**
     * This is the constructor of the class.
     */
    private UrlBuilder() {
    }

    private static Map<String, String> endpoint = new HashMap<>();
    static {
        endpoint.put("login", "controller=authentication&back=my-account");
        endpoint.put("address", "controller=address");
        endpoint.put("dresses", "id_category=8&controller=category");
        endpoint.put("casualDresses", "id_category=9&controller=category");
        endpoint.put("summerDresses", "id_category=11&controller=category");
        endpoint.put("eveningDresses", "id_category=10&controller=category");
        endpoint.put("controlOrder", "controller=order");
        endpoint.put("tShirts", "id_category=5&controller=category");
        endpoint.put("blouses", "id_category=7&controller=category");
    }

    /**
     * This Method build an utl and return the necessary url.
     *
     * @param endpointKey is the type of url that is needed.
     * @return the url needed according to the parameter 'url'.
     */
    public static String getUrl(String endpointKey){
        return URL_BASE.concat(endpoint.get(endpointKey));
    }
}
