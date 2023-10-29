package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresetVideoCameraPage {
    WebDriver driver;

    public PresetVideoCameraPage(WebDriver driver){

        this.driver = driver;
    }

    protected By editButton = By.xpath("//div[@class='ant-menu-submenu-title']");
    protected By presetVideoCameraLink = By.xpath("//a[text()=' Пресеты видеокамер ']");
    protected By addButtonLocator =By.xpath("//span[text()=' Добавить ']/parent::button");
    protected By deleteButton = By.xpath("//span[text()=' Удалить ']/parent::button");
    protected By saveButton = By.xpath("//span[text()=' Сохранить ']/parent::button");
    protected By locationField = By.xpath("//nz-select[@formcontrolname='location']");
    protected By parterLocation = By.xpath("//nz-option-item[@title='Партер']");
    protected By lineField = By.xpath("//nz-select[@formcontrolname='line']");
    protected By secondLine = By.xpath("//nz-option-item[@title='2']");
    protected By seatField = By.xpath("//nz-select[@formcontrolname='seat']");
    protected By secondField = By.xpath("//nz-option-item[@title='2']");
    protected By cameraField = By.xpath("//div[@class='ant-table-body ng-star-inserted']//tr[3]//td[2]/nz-select");
    protected By cameraSix = By.xpath("//nz-option-item[@title='6']");
    protected By numberArrowUp = By.xpath("//i[@nztype='up']/parent::span");
    protected By Priority = By.xpath("//div[@class='ant-table-body ng-star-inserted']//tr[3]//td[4]//input");
    protected By newPreset = By.xpath("//tr[@class='selected ant-table-row ng-star-inserted']");










}
