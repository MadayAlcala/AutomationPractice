package AutomationPractice.ui.Common;

import core.utils.Log;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyLoader {
    public static Properties loadProperty(String file) {
        Properties properties;
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            Log.getInstance().getLog().error(e + "File not found.");
            throw new RuntimeException("File not found." + e);
        }
        return properties;
    }
}
