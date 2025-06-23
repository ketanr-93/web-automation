package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataLoader {
    private static Properties props = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/testdata/testData.properties");
            props.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
