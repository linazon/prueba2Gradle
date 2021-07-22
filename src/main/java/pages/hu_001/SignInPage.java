package pages.hu_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By txtEmail = By.id("email");
    private By txtPassword = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By alertText = By.xpath("//div[@class='alert alert-danger']");

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(txtPassword).sendKeys(password);
    }

    public MyAccountPage clickSignInButton(){
        driver.findElement(signInButton).click();
        return new MyAccountPage(driver);
    }

    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }

}
