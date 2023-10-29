package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class NavedenieCamerPage {

    WebDriver driver;

    public NavedenieCamerPage() {

        driver = DriverConfig.getInstance().getDriver();
    }

    /* Элементы страницы Навединие камеры */
    private By planZala = By.xpath("//span[@class='ng-star-inserted'][text()=' План зала '] ");
    private By closeButtonPlanZala = By.xpath("//span[@class='ant-modal-close-x']");
    private By cameraButton = By.xpath("//div[@class='cameras-control-camera']//span[text()='Камера 7']");
    private By bottomTitle1 = By.xpath("//div[@class='protocol-info']");
    private By blockCameraBotton = By.xpath("//span[text()='Камера 7']/../../../..//button[@nz-tooltip='Заблокировать видеокамеру']");

    private By deBlockCameraBotton = By.xpath("//span[text()='Камера 7']/../../../..//button[@nz-tooltip='Разблокировать видеокамеру']");

    private By bottomTitle2 = By.xpath("//div[@class='protocol-info'][text()=' заблокирована ']");
    private By presetNum = By.xpath("//span[@class='ng-star-inserted'][text()='4']");
    private By videoCameraField = By.xpath("//div[contains(@class,'cameras-list-body')]//nz-select-item");
    private By cameraNum = By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']//nz-option-item[2]");
    private By recordButton = By.xpath("//span[@class='ng-star-inserted'][text()=' Записать ']");
    private By yesButton = By.xpath("//span[@class='ng-star-inserted'][text()=' Да ']");
    private By textInWarningWindow = By.xpath("//span[@class='ant-typography'][contains(text(),'Сохранить текущее положение видеокамеры')]");
















}
