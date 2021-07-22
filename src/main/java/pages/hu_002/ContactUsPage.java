package pages.hu_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class ContactUsPage {

    private WebDriver driver;
    private List<String> subjectHeading = Arrays.asList("//*[@id=\"id_contact\"]/option[1]",
            "//*[@id=\"id_contact\"]/option[2]","//*[@id=\"id_contact\"]/option[3]");
    private By txtEmail = By.id("email");
    private By txtOrderNumber = By.id("id_order");
    private By txtFileUpload = By.id("fileUpload");

    private By txtMessage = By.id("message");
    private By btnSubmit = By.id("submitMessage");
    private By alertText = By.className("alert");



    public ContactUsPage(WebDriver driver){
        this.driver= driver;
    }

    public void selectSubjectHeadingList(int index){
        driver.findElement(By.xpath(subjectHeading.get(index))).click();
    }

    public void setEmail(String email){
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void setOrderNumber(String orderNumber){
        driver.findElement(txtOrderNumber).sendKeys(orderNumber);
    }

    /**
     * Provides path of file to the form then clicks Upload button
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void attachFile(String absolutePathOfFile) {
        driver.findElement(txtFileUpload).sendKeys(absolutePathOfFile);
    }

    public void setMessage(String message){
        driver.findElement(txtMessage).sendKeys(message);
    }

    public void clickSubmitButton(){
        driver.findElement(btnSubmit).click();
    }

    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }
}
