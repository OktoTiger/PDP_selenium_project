package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public BasePage(){
        driver = DriverConfig.getInstance().getDriver();
    }
    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getElementComment(By name,WebDriver driver) {

        return driver.findElement(name);
    }
//    public void clickOnElementWithText(String text){
//        driver.findElement(By.xpath(String.format("//*[text()='%s']", text)));
//    }
    public void clickOnElement(By locator,WebDriver driver){
        driver.findElement(locator).click();
        //        driver.findElement(By.xpath(String.format("%s", locator))).click();
    }

    public void typeText(By locator,String text, WebDriver driver){

        driver.findElement(locator).sendKeys(text);
    }

//    public void clickOnElement1(By loca){
//        driver.findElement(By.xpath(String.format("%s", text))).click();
//    }

    /* оставил для себя, в качестве примера
    public String getText(By name,WebDriver driver) {
        return driver.findElement(name).getText();
    }*/

}



