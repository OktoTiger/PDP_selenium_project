package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverConfig {

    private static WebDriver driver;
    private static DriverConfig instance;

    public static DriverConfig getInstance() {
        if (instance == null){
            instance = new DriverConfig();
        }
        return instance;
    }

    public WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\testArmVideoSelenium\\testArmVideoSelenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://arm-video.01-bfv-server.stroki.loc/auth");
        return driver;
    }

}
