//package steps;
//
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//
//public class NavedenieCamerSteps extends BasePage {
//
//    WebDriver driver;
//    NavedenieCamerPage navedenieCamerPage;
//    public NavedenieCamerSteps(WebDriver driver) {
//        this.driver=driver;
//        navedenieCamerPage = new NavedenieCamerPage(driver);
//    }
//
//    public void getPlanZala(){
//        driver.findElement(navedenieCamerPage.planZala).click();
//    }
//
//    public void closePlanZala(){
//        driver.findElement(navedenieCamerPage.closeButtonPlanZala).click();
//
//    }
//
//    public void getCamera(){
//        driver.findElement(navedenieCamerPage.cameraButton).click();
//
//    }
// /*Оставил этот вызов метода для себя в качестве примера
//    public String getTitle1 (){
//        return driver.findElement(navedenieCamerPage.bottomTitle1).getText();
//    }*/
//
//    public void clickBlockCameraButton() throws CommonException {
//        try {
//            driver.findElement(navedenieCamerPage.blockCameraBotton).click();
//        } catch (Exception e){
//            throw new CommonException("Проблема в том, что кнопка уже была нажата в предыдущей сессии.\n" +
//                    "Нужно нажать кнопку вручную, закрыть браузер и повторить тест");
//        }
//
//    }
//
//    public void clickDeblockCameraButton() {
//        driver.findElement(navedenieCamerPage.deBlockCameraBotton).click();
//    }
//
//    public void getPreset() {
//        driver.findElement(navedenieCamerPage.presetNum).click();
//
//    }
//
//    public void getVideoCamera() {
//        driver.findElement(navedenieCamerPage.videoCameraField).click();
//        driver.findElement(navedenieCamerPage.cameraNum).click();
//    }
//
//    public void clickRecordButton() throws CommonException {
//        try {
//            driver.findElement(navedenieCamerPage.recordButton).click();
//        } catch (Exception e){
//            throw new CommonException("Кнопка не доступна");
//        }
//    }
//
//    public void clickYesButton(){
//        driver.findElement(navedenieCamerPage.yesButton).click();
//    }
//
//
//
//
//
//
//
//}
