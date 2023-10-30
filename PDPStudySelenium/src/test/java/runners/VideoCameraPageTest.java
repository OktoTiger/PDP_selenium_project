package runners;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.DriverConfig;
import steps.AuthSteps;
import steps.VideoCameraPageSteps;

public class VideoCameraPageTest {

    private AuthSteps authSteps;
    private VideoCameraPageSteps videoCameraPageSteps;


    @Before
    public void setUp() {
        authSteps = new AuthSteps();
        videoCameraPageSteps = new VideoCameraPageSteps();
    }

    @Test
    public void editVideoCameraTest() {
        authSteps.logIn();
        videoCameraPageSteps.editVideoCamera();
    }

    @After
    public void closeDriver(){
        DriverConfig.getInstance().closeDriver();
    }







}
