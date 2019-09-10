package AutomationPractice.ui.Common;

import core.utils.Log;

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
    private static ReadAppFile instance;
    private Properties properties;

    /**
     * This is the constructor and is used for initializes the variables.
     */
    private ReadAppFile() {
        readConfigurationFile();
    }

    /**
     * This method reads the file 'automationpractice.properties'.
     */
    private void readConfigurationFile() {
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(PROPERTIES_FILE);
            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            Log.getInstance().getLog().error(e + "Something went wrong.");
        }
    }

    /**
     * This method ensure that only one instance is created according to the Singleton pattern.
     *
     * @return an instance of 'ReadAppFile' type.
     */
    public static ReadAppFile getInstance() {
        if (instance == null) {
            instance = new ReadAppFile();
        }
        return instance;
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
     * This method is used for get the email to login in page.
     *
     * @return a string with the email.
     */
    public String getEmail() {
        return properties.getProperty(EMAIL);
    }

    /**
     * This method is used for get the password to login in page.
     *
     * @return a string with the password.
     */
    public String getPassword() {
        return properties.getProperty(PASSWORD);
    }
}
