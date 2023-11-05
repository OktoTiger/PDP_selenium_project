package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class NavedenieCamerPage extends BasePage {

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

    public void getPlanZala() {
        clickOnElement(planZala, driver);
    }

    public void closePlanZala() {
        clickOnElement(closeButtonPlanZala, driver);
    }
    public void getCamera() {
        clickOnElement(cameraButton, driver);
    }

    public void clickBlockCameraButton() throws CommonException {
        try {
            clickOnElement(blockCameraBotton, driver);
        } catch (Exception e) {
            System.out.println("Получено исключение " + e.getClass());
        }
    }

    public void clickDeblockCameraButton() {
        clickOnElement(deBlockCameraBotton, driver);
    }

    public void getPreset() {
        clickOnElement(presetNum, driver);
    }

    public void clickOnListOfVideoCameras() {
        clickOnElement(videoCameraField, driver);
    }

    public void getVideoCamera() {
        clickOnElement(cameraNum, driver);
    }

    public void clickRecordButton() throws CommonException {
        try {
            clickOnElement(recordButton, driver);
        } catch (Exception e) {
            System.out.println("Получено исключение " + e.getClass());
        }
    }

    public void clickYesButton() {
        clickOnElement(yesButton, driver);
    }

    public NavedenieCamerPage checkTitle1() {
        String text = getText(getElementComment(bottomTitle1, driver));
        Assert.assertEquals("Видеокамера выбрана", text);
        return this;
    }

    public NavedenieCamerPage checkTitle2() {
        String text = getText(getElementComment(bottomTitle2, driver));
        Assert.assertEquals("заблокирована", text);
        return this;
    }

    public NavedenieCamerPage checkWarningText() {
        String text = getText(getElementComment(textInWarningWindow, driver));
        Assert.assertEquals("Сохранить текущее положение видеокамеры 6 в пресет 6-1?", text);
        return this;
    }







 /*Оставил этот вызов метода для себя в качестве примера
    public String getTitle1 (){
        return driver.findElement(navedenieCamerPage.bottomTitle1).getText();
    }*/


}
