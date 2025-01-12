package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_driver(String browser) {
        properties = ConfigReader.getProperties();
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("Safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        } else {
            WebDriverManager.operadriver().setup();
            driver = (WebDriver) new OperaDriverManager();
        }
        String url = properties.getProperty("url");
        int imgWait = Integer.parseInt(properties.getProperty("impWaitTime"));
        int waitTime = Integer.parseInt(properties.getProperty("waitTime"));
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(waitTime, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(imgWait, TimeUnit.SECONDS);
        return getDriver();


    }
    public static WebDriver getDriver(){
        return driver;
    }
}

