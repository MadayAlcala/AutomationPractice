package AutomationPractice.ui.Common;

import core.selenium.webdrivers.BrowserType;
import core.selenium.webdrivers.IBrowser;

import java.util.HashMap;
import java.util.Map;

public class UrlBuilder {
    final static String URL_BASE = "url";
    final static String LOGIN = "controller=authentication&back=my-account";
    final static String ADDRESS = "controller=address";
    final static String WISHLIST = "fc=module&module=blockwishlist&controller=mywishlist";


    public static String getUrlReader(String url) {
        Map<String, String> map = new HashMap<>();
        map.put("login", ReadAppFile.getInstance().getUrl(URL_BASE).concat(LOGIN));
        map.put("address", ReadAppFile.getInstance().getUrl(URL_BASE).concat(ADDRESS));
        map.put("wishlist", ReadAppFile.getInstance().getUrl(URL_BASE).concat(WISHLIST));
        return map.get(url);
    }
}
