package runners;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.CommonException;
import pages.DriverConfig;
import steps.AuthSteps;
import steps.NavedenieCamerSteps;

public class NavedenieCamerPageTest {
    private AuthSteps authSteps;
    private NavedenieCamerSteps navedenieCamerSteps;

    @Before
    public void setUp() {
        authSteps = new AuthSteps();
        navedenieCamerSteps = new NavedenieCamerSteps();
    }

    @Test
    public void loginTest() {
        AuthSteps authSteps = new AuthSteps();
        authSteps.logIn();
    }

    @Test
    public void usingToolsOnNavedinieCamerPageTest() throws CommonException {
        authSteps.logIn();
        navedenieCamerSteps.usingToolsOnNavedinieCamerPage();
    }

    @After
    public void closeDriver() {
        DriverConfig.getInstance().closeDriver();
    }
}
