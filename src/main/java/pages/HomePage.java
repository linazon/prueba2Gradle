package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.hu_001.SignInPage;
import pages.hu_002.ContactUsPage;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignInPage clickSignInPageButton(){
        driver.findElement(By.linkText("Sign in")).click();
        return new SignInPage(driver);
    }

    public ContactUsPage clickContactUsButton(){
        driver.findElement(By.id("contact-link")).click();
        return new ContactUsPage(driver);
    }

}
