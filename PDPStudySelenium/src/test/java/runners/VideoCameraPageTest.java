package runners;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.VideoCameraPage;
import steps.AuthSteps;
import steps.VideoCameraPageSteps;

import java.util.concurrent.TimeUnit;

public class VideoCameraPageTest {

    private AuthSteps authSteps;
    private VideoCameraPageSteps videoCameraPageSteps;


    @Before
    public void setUp() {
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\testArmVideoSelenium\\testArmVideoSelenium\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://arm-video.01-bfv-server.stroki.loc/auth");

    }

    @Test
    public void editVideoCameraTest() {
        authSteps = new AuthSteps();
        videoCameraPageSteps = new VideoCameraPageSteps();
        authSteps.logIn();
        videoCameraPageSteps.editVideoCamera();

//        authSteps = new AuthSteps(driver);
//        videoCameraPageSteps = new VideoCameraPageSteps(driver);
//        videoCameraPage = new VideoCameraPage(driver);
//        authSteps.logIn();
//        videoCameraPageSteps.goToVideoCameraPage();
//        videoCameraPageSteps.getVideoCamera();
//        videoCameraPageSteps.editComment();
//        videoCameraPageSteps.clickSaveButton();
//        videoCameraPageSteps.getVideoCamera();
//        videoCameraPageSteps.clickSaveButton();
//        String getText = videoCameraPageSteps.getText(videoCameraPageSteps.getElementComment(videoCameraPage.commentOneEdited,driver ));
//        Assert.assertEquals("Камера 7 отредактированно", getText);

    }








}
