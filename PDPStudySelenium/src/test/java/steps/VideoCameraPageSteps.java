package steps;
import pages.VideoCameraPage;
public class VideoCameraPageSteps extends CommonSteps {

    VideoCameraPage videoCameraPage;
    public VideoCameraPageSteps() {

        videoCameraPage = new VideoCameraPage();
    }

    public void editVideoCamera() {
        videoCameraPage.goToVideoCameraPage();
        videoCameraPage.clickOnTableRow();
        videoCameraPage.clearField();
        videoCameraPage.typeComment();
        videoCameraPage.checkAndClickActiveButton();
        videoCameraPage.checkEditedComment();

    }




























    /*public void goToVideoCameraPage() {
        driver.findElement(videoCameraPage.editButton).click();
        driver.findElement(videoCameraPage.videoCameraButton).click();
    }

    public VideoCameraPage getVideoCamera() {
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(videoCameraPage.camera);
        actions.doubleClick(elementLocator).perform();
        return videoCameraPage;
    }

    public VideoCameraPage editComment() {
        driver.findElement(videoCameraPage.commentOne).clear();
        driver.findElement(videoCameraPage.commentOne).sendKeys("Камера 7 отредактированно");
        return videoCameraPage;
    }

    public VideoCameraPage clickSaveButton() {
        try {
            driver.findElement(videoCameraPage.saveButton).click();
        } catch (org.openqa.selenium.ElementClickInterceptedException ElementClickInterceptedException)
        {
            System.out.println("Кнопка не кликабельна");}
        return videoCameraPage;
    }

/* Оставил для себя, в качестве примера
    public WebElement getElementComment(){

        return driver.findElement(videoCameraPage.commentOneEdited);
    }*/

}
