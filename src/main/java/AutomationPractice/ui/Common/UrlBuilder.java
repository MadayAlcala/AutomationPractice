package AutomationPractice.ui.Common;

import java.util.HashMap;
import java.util.Map;

/**
 * UrlBuilder, this class is used for build a url with the urlBase and the endpoint.
 *
 * @author Maday Alcala.
 * @version 0.0.1
 */
public class UrlBuilder {
    static final String URL_BASE = "url";
    static final String LOGIN = "controller=authentication&back=my-account";
    static final String ADDRESS = "controller=address";
    static final String WISHLIST = "fc=module&module=blockwishlist&controller=mywishlist";

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
        return map.get(url);
    }
}
