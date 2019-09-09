package AutomationPractice.ui.Common;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class is used for implement the read og the properties file.
 *
 * @author Maday Alcala.
 * @version 0.0.1
 */
public final class ReadAppFile {
    private static final String URL_LOGIN = "url_login";
    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";
    private static final String PROPERTIES_FILE = "automationpractice.properties";
    private static ReadAppFile readAppProperties;
    private Properties properties;

    /**
     * this method is used for initializes the variables.
     */
    private ReadAppFile() {
        readConfigurationFile();
    }

    /**
     * This method reads the file 'gradle.properties' ans return its values through the object 'properties'.
     *
     * @return an object 'properties' with wich you can get data from 'gradle.properties'.
     */
    private Properties readConfigurationFile() {
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(PROPERTIES_FILE);
            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * This method ensure that only one instance is created according to the build pattern.
     *
     * @return an instance of 'ReadAppProperties' type.
     */
    public static ReadAppFile getInstance() {
        if (readAppProperties == null) {
            readAppProperties = new ReadAppFile();
        }
        return readAppProperties;
    }

    /**
     * This method is used for get the url of login in page.
     *
     * @return a string with the url.
     */
    public String getUrlLogin() {
        return properties.getProperty(URL_LOGIN);
    }

    /**
     * This method is used for get the email of login in page.
     *
     * @return a string with the email.
     */
    public String getEmail() {
        return properties.getProperty(EMAIL);
    }

    /**
     * This method is used for get the password of login in page.
     *
     * @return a string with the password.
     */
    public String getPassword() {
        return properties.getProperty(PASSWORD);
    }


}
