package steps;

import org.openqa.selenium.WebDriver;
import pages.AuthPage;
import pages.BasePage;
import pages.NavedenieCamerPage;
import pages.Properties;

public class AuthSteps {

    AuthPage authPage;
    Properties login = Properties.LOGIN;
    Properties password = Properties.PASSWORD;

    public AuthSteps() {
        authPage = new AuthPage();
    }


    public NavedenieCamerPage logIn() {
        authPage.typeLogin(login.getProperty());
        authPage.typePassword(password.getProperty());
        authPage.clickButton();
        return new NavedenieCamerPage();

    }




}
