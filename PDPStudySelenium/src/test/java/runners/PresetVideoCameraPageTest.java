//package runners;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class PresetVideoCameraPageTest {
//    private WebDriver driver;
//    private AuthSteps authSteps;
//    private PresetVideoCameraPageSteps presetVideoCameraPageSteps;
//
//    @Before
//    public void setUp () {
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\testArmVideoSelenium\\testArmVideoSelenium\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://arm-video.01-bfv-server.stroki.loc/auth");
//
//    }
//    @Test
//    public void getLocationLineSeatTest() {
//        authSteps = new AuthSteps(driver);
//        presetVideoCameraPageSteps = new PresetVideoCameraPageSteps(driver);
//        authSteps.logIn();
//        presetVideoCameraPageSteps.goPresetVideoCameraPage();
//        presetVideoCameraPageSteps.checkEnableAddButton();
//        presetVideoCameraPageSteps.checkAddedPreset();
//        presetVideoCameraPageSteps.getLocationLineSeat();
//        presetVideoCameraPageSteps.checkEnableAddButton();
//        presetVideoCameraPageSteps.addPreset();
//        presetVideoCameraPageSteps.checkEnableSaveButton();
//        presetVideoCameraPageSteps.checkAddedPreset();
//        presetVideoCameraPageSteps.deletePreset();
//    }
//
//}
