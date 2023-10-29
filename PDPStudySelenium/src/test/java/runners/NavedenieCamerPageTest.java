//package runners;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.firefox.FirefoxDriver;
//import pages.NavedenieCamerPage;
//
//import java.util.concurrent.TimeUnit;
//
//public class NavedenieCamerPageTest {
//    private WebDriver driver;
//    private AuthSteps authSteps;
//    private NavedenieCamerSteps navedenieCamerSteps;
//    private NavedenieCamerPage navedenieCamerPage;
//
//    @Before
//    public void setUp(){
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\IdeaProjects\\PDPStudySelenium\\PDPStudySelenium\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://arm-video.01-bfv-server.stroki.loc/auth");
//
//    }
//
//    @Test
//    public void loginTest(){
//        AuthSteps authSteps = new AuthSteps(driver);
//        authSteps.logIn();
//    }
//
//    @Test
//    public void usingToolsOnNavedinieCamerPageTest() throws CommonException {
//        authSteps = new AuthSteps(driver);
//        navedenieCamerSteps = new NavedenieCamerSteps(driver);
//        navedenieCamerPage = new NavedenieCamerPage(driver);
//        authSteps.logIn();
//        navedenieCamerSteps.getPlanZala();
//        navedenieCamerSteps.closePlanZala();
//        navedenieCamerSteps.getCamera();
//        /*Оставил этот вызов метода для себя в качестве примера
//        String bottomTitle1 = navedenieCamerSteps.getTitle1();*/
//        String getText1 = navedenieCamerSteps.getText(navedenieCamerSteps.getElementComment(navedenieCamerPage.bottomTitle1,driver ));
//        Assert.assertEquals("Видеокамера выбрана", getText1);
//        navedenieCamerSteps.clickBlockCameraButton();
//        String getText2 = navedenieCamerSteps.getText(navedenieCamerSteps.getElementComment(navedenieCamerPage.bottomTitle2,driver ));
//        Assert.assertEquals("заблокирована", getText2);
//        navedenieCamerSteps.getPreset();
//        navedenieCamerSteps.getVideoCamera();
//        navedenieCamerSteps.clickRecordButton();
//        String getText3 = navedenieCamerSteps.getText(navedenieCamerSteps.getElementComment(navedenieCamerPage.textInWarningWindow,driver ));
//        Assert.assertEquals("Сохранить текущее положение видеокамеры 6 в пресет 6-1?", getText3);
//        navedenieCamerSteps.clickYesButton();
//        navedenieCamerSteps.clickDeblockCameraButton();
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
