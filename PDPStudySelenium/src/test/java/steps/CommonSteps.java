package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonSteps {


/* оставил для себя, в качестве примера
    public String getText(By name,WebDriver driver) {
        return driver.findElement(name).getText();
    }*/
    public String getText(WebElement element) {
        return element.getText();
    }

    public WebElement getElementComment(By name,WebDriver driver) {
        return driver.findElement(name);
    }

//    public void assertion(String sample, String text){
//        Assert.assertEquals(sample, text);
//    }



}