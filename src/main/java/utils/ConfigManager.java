package utils;

import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    private static FileInputStream fileInputStreamConfigurationProperties;
    private static FileInputStream fileInputStreamTestData;
    private static Properties configurationProperties;
    private static Properties testDataProperties;
    private static String configurationPropertiesPath = "src/main/resources/conf.properties";
    private static String testDataPath = "src/main/resources/testData.properties";

    static {
        try {
            fileInputStreamConfigurationProperties = new FileInputStream(configurationPropertiesPath);
            fileInputStreamTestData = new FileInputStream(testDataPath);
            configurationProperties = new Properties();
            testDataProperties = new Properties();
            configurationProperties.load(fileInputStreamConfigurationProperties);
            testDataProperties.load(fileInputStreamTestData);
        } catch (IOException e) {
            Assert.fail("Configuration properties weren't downloaded");
        }
    }

    public static String getConfigurationProperty(String key) {
        return configurationProperties.getProperty(key);
    }

    public static String getTestDataProperty(String key) {
        return testDataProperties.getProperty(key);
    }
}