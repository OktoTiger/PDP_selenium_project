package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class VideoCameraPage extends BasePage {

    WebDriver driver;
    BasePage basePage;

    private String comment = "Камера 7 отредактированно";

    public VideoCameraPage(){
        driver = DriverConfig.getInstance().getDriver();
        basePage = new BasePage();
    }
    private By editButton = By.xpath("//div[@class='ant-menu-submenu-title']");
    private By videoCameraButton = By.xpath("//a[@class='menu-link'][text()=' Видеокамеры ']");
    private By camera = By.xpath("//div[@class='ng-star-inserted'][text()='7']");
    private By commentOne = By.xpath("//input[@maxlength=\"100\"]");
    private By commentOneEdited = By.xpath("//div[@class='ng-star-inserted'][text()='Камера 7 отредактированно']");
    private By commentTwo = By.xpath("//div[@class='ng-star-inserted'][text()='Камера 6']");
    private By saveButton = By.xpath("//button[@class='ant-btn']/span[text()='Сохранить']");

    public void goToVideoCameraPage(){
        clickOnElement(editButton,driver);
        clickOnElement(videoCameraButton, driver);
    }

    public void checkAndClickActiveButton() {
        try {
            clickOnElement(saveButton, driver);
        } catch (org.openqa.selenium.ElementClickInterceptedException ElementClickInterceptedException)
        {
            System.out.println("Кнопка не кликабельна");}
    }

    public void clickOnTableRow() {
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(camera);
        actions.doubleClick(elementLocator).perform();
    }

    public void clearField(){
        driver.findElement(commentOne).clear();
    }

    public void typeComment() {
        typeText(commentOne, comment,driver);
    }

    public VideoCameraPage checkEditedComment(){
        String text = getText(getElementComment(commentOneEdited,driver));
        Assert.assertEquals(comment, text);
        return this;
    }











    }







