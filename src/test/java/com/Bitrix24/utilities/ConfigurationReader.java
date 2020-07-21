package com.Bitrix24.utilities;

import javax.security.auth.login.Configuration;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader
{
    // 1- We created properties object
    private static Properties properties = new Properties();

    static
    {
        // 2- Get the path and store in String, or directly pass into fileInputStream obj
        String path = "Configuration.properties";

        // 3- We need to open the file
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
            // 4- We need to load the file
            properties.load(file);

            // 5- close.file
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found");
        }
    }

    // Our own custom method to read and get values from configuration.properties file
    public static String getProperty(String keyWord)
    {
        return properties.getProperty(keyWord);
    }


}
