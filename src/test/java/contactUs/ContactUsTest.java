package contactUs;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.hu_002.ContactUsPage;

public class ContactUsTest extends BaseTest {

    @ParameterizedTest
    @CsvFileSource(files = {"src/test/resources/params/contactUs.csv"},
            numLinesToSkip = 1)
    public void testSendContact(int index, String email, String orderNumber, String containMessage, String alert1
    ,String alert2){
        ContactUsPage contactUsPage = homePageChrome.clickContactUsButton();
        contactUsPage.selectSubjectHeadingList(index);
        contactUsPage.setEmail(email);
        contactUsPage.setOrderNumber(orderNumber);
        contactUsPage.attachFile("E:\\Sofka\\curso\\6. Automatizacion\\Reto1\\AutomatizacionSelenium\\RetoAutoSelenium\\AutomatizacionSelenium\\src\\test\\resources\\File.png");
        contactUsPage.setMessage(containMessage);
        contactUsPage.clickSubmitButton();
        Assertions.assertTrue(contactUsPage.getAlertText().contains(alert1)
                &&contactUsPage.getAlertText().contains(alert2),"Alert incorrect");
    }

}
