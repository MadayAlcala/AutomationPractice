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
public class PropertyLoader {

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
