package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    Properties properties;
    String propertiesPath;

    public PropertiesLoader() {
        propertiesPath = "local.properties";
        loadProperties();
    }

    private void loadProperties() {
        if ((isCI())) {
            loadSystemProperties();
        } else {
            loadFromFile();
        }
    }

    public boolean isCI() {
        return Boolean.parseBoolean(System.getenv("CI"));
    }

    public void loadFromFile() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(propertiesPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadSystemProperties() {
        properties = new Properties();
        for (EnvironmentVariables variable : EnvironmentVariables.values()) {
            if (System.getenv(variable.name()) != null) {
                properties.put(variable.name(), System.getenv(variable.name()));
            }
        }
    }

    public String getAppPathAndroid() {
        return properties.getProperty("APP_PATH_ANDROID");
    }

    public String getAutomationName() {
        return properties.getProperty("AUTOMATION_NAME");
    }

    public Long getImplicitWait() {
        return Long.parseLong(properties.getProperty("IMPLICIT_WAIT"));
    }

    public Integer getNewCommandTimeout() {
        return Integer.parseInt(properties.getProperty("NEW_COMMAND_TIMEOUT"));
    }

}
