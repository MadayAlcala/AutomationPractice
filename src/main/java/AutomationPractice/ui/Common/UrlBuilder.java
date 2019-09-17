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

import java.util.HashMap;
import java.util.Map;

/**
 * UrlBuilder, this class is used for build a url with the urlBase and the endpoint.
 *
 * @author Maday Alcala.
 * @version 0.0.1
 */
public final class UrlBuilder {
    static final String URL_BASE = "url";
    static final String LOGIN = "controller=authentication&back=my-account";
    static final String ADDRESS = "controller=address";
    static final String WISHLIST = "fc=module&module=blockwishlist&controller=mywishlist";
    static final String DRESSES = "id_category=8&controller=category";
    static final String CASUAL_DRESSES = "id_category=9&controller=category";
    static final String SUMMER_DRESSES = "id_category=11&controller=category";
    static final String EVENING_DRESSES = "id_category=10&controller=category";
    static final String CONTROLLER_ORDER = "controller=order";
    static final String T_SHIRTS = "id_category=5&controller=category";
    static final String BLOUSES = "id_category=7&controller=category";

    /**
     * This is the constructor of the class.
     */
    private UrlBuilder() {
    }

    /**
     * This Method build an utl and return the necessary url.
     *
     * @param url is the type of url that is needed.
     * @return the url needed according to the parameter 'url'.
     */
    public static String getUrlReader(final String url) {
        Map<String, String> map = new HashMap<>();
        map.put("login", ReadAppFile.getInstance().getUrl(URL_BASE).concat(LOGIN));
        map.put("address", ReadAppFile.getInstance().getUrl(URL_BASE).concat(ADDRESS));
        map.put("wishlist", ReadAppFile.getInstance().getUrl(URL_BASE).concat(WISHLIST));
        map.put("dresses", ReadAppFile.getInstance().getUrl(URL_BASE).concat(DRESSES));
        map.put("casualDresses", ReadAppFile.getInstance().getUrl(URL_BASE).concat(CASUAL_DRESSES));
        map.put("summerDresses", ReadAppFile.getInstance().getUrl(URL_BASE).concat(SUMMER_DRESSES));
        map.put("eveningDresses", ReadAppFile.getInstance().getUrl(URL_BASE).concat(EVENING_DRESSES));
        map.put("controlOrder", ReadAppFile.getInstance().getUrl(URL_BASE).concat(CONTROLLER_ORDER));
        map.put("tShirts", ReadAppFile.getInstance().getUrl(URL_BASE).concat(T_SHIRTS));
        map.put("blouses", ReadAppFile.getInstance().getUrl(URL_BASE).concat(BLOUSES));
        return map.get(url);
    }
}
