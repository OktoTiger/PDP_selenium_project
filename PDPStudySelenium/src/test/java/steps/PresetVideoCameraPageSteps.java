//package steps;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class PresetVideoCameraPageSteps  {
//
//    WebDriver driver;
//    PresetVideoCameraPage presetVideoCameraPage;
//
//    public PresetVideoCameraPageSteps(WebDriver driver) {
//        this.driver=driver;
//        presetVideoCameraPage = new PresetVideoCameraPage(driver);
//
//    }
//
//    public PresetVideoCameraPage goPresetVideoCameraPage() {
//        driver.findElement(presetVideoCameraPage.editButton).click();
//        driver.findElement(presetVideoCameraPage.presetVideoCameraLink).click();
//        return new PresetVideoCameraPage(driver);
//    }
//
//
//    public void getLocationLineSeat() {
//        driver.findElement(presetVideoCameraPage.locationField).click();
//        driver.findElement(presetVideoCameraPage.parterLocation).click();
//        driver.findElement(presetVideoCameraPage.lineField).click();
//        driver.findElement(presetVideoCameraPage.secondLine).click();
//        driver.findElement(presetVideoCameraPage.seatField).click();
//        driver.findElement(presetVideoCameraPage.secondField).click();
//
//    }
//
//    public void checkEnableAddButton() {
//        WebElement addButton = driver.findElement(presetVideoCameraPage.addButtonLocator);
//        if (addButton.isEnabled()){
//            System.out.println("Кнопка Добавить доступна: "+addButton.isEnabled());
//            addButton.click();
//        }
//        else System.out.println("Кнопка Добавить доступна: "+addButton.isEnabled());
//    }
//
//    public void checkEnableSaveButton() {
//        WebElement saveBotton = driver.findElement(presetVideoCameraPage.saveButton);
//        if (saveBotton.isEnabled()) saveBotton.click();
//        else System.out.println("Кнопка Сохранить доступна: "+saveBotton.isEnabled());
//    }
//
//    public void addPreset() {
//        driver.findElement(presetVideoCameraPage.cameraField).click();
//        driver.findElement(presetVideoCameraPage.cameraSix).click();
//        driver.findElement(presetVideoCameraPage.numberArrowUp).click();
//        driver.findElement(presetVideoCameraPage.Priority).sendKeys("5");
//    }
//
//    public void checkAddedPreset() {
//        driver.findElements(presetVideoCameraPage.newPreset).size();
//        if (driver.findElements(presetVideoCameraPage.newPreset).size()>0)
//            System.out.println("Пресет добавлен");
//        else System.out.println("Пресет НЕ добавлен");
//    }
//    public void deletePreset(){
//        driver.findElement(presetVideoCameraPage.deleteButton).click();
//    }
//
//}
