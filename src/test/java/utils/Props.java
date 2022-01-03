package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Props {
    Props props;
    static Properties properties = new Properties();

    private Props() {}

    public static void init() {
        try {
            // C:\Users\br3nd\IdeaProjects\Selenium\src\test\java\resources\Props.properties
            properties.load(new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\Props.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProp(String key) {
         init();
         return properties.getProperty(key);
    }
}
