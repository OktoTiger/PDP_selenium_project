package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class AuthPage extends BasePage{
    WebDriver driver;

    public AuthPage(){
        driver =  DriverConfig.getInstance().getDriver();
    }

    private By loginField = By.xpath("//input[@formcontrolname='login']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By authButton = By.xpath("//button[contains(@class,'login-form-button')]");

    public AuthPage typeLogin (String login){
        driver.findElement(loginField).sendKeys(login);
        return this;
    }

    public AuthPage typePassword (String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public AuthPage clickButton (){
        clickOnElement(authButton,driver);
//        driver.findElement(authButton).click();
        return this;
    }






}
