package steps;

import pages.AuthPage;
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
        authPage.openAuthPage();
        authPage.typeLogin(login.getProperty());
        authPage.typePassword(password.getProperty());
        authPage.clickButton();
        return new NavedenieCamerPage();

    }




}
