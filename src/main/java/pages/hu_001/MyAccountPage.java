package pages.hu_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private WebDriver driver;
    private By welcomeMessage = By.className("info-account");
    private By signOutButton = By.className("logout");

    public MyAccountPage (WebDriver driver){
        this.driver = driver;
    }

    public String getWelcomeMessage(){
        return driver.findElement(welcomeMessage).getText();
    }

    public void clickLogOutButton(){
        driver.findElement(signOutButton).click();
    }
}
