package com.Bitrix24.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Driver
{
    // 1- Make constructor private
    private Driver()
    {

    }

    private static WebDriver driver;

    public static WebDriver getDriver()
    {
        if (driver==null)
        {
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser)
            {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
            }
        }
        return driver;
    }
}
