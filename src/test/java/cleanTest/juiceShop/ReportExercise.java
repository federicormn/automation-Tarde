package cleanTest.juiceShop;

import helpers.GenericMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.util.Date;

public class ReportExercise extends TestBaseJuiceShop
{
    @Test
    public void test() throws InterruptedException
    {
        String newEmail = genericMethod.getAlphaNumericString(5)+ "@mail.com";
        String newPassword = "12345";
        String secQuestAnswer = "asd";

        //catalogPage.mainPageButton.waitClickable();
        catalogPage.mainPageButton.indicateURL();

        welcomePopUp.closePopUpButton.click();

        catalogPage.accountButton.waitClickable();
        catalogPage.accountButton.click();
        catalogPage.accountButton.waitAttributeToBe("aria-expanded","true");

        catalogPage.loginButton.waitPresenceOfElement();
        catalogPage.loginButton.waitClickable();
        catalogPage.loginButton.click();

        Assertions.assertTrue(loginPageJuiceShop.notYetACustomerButton.isControlDisplayed());

        loginPageJuiceShop.notYetACustomerButton.click();

        Assertions.assertTrue(userRegistrationPage.RegistrationHeader.isControlDisplayed());

        userRegistrationPage.newEmailTextBox.writeText(newEmail);
        userRegistrationPage.newPasswordTextBox.writeText(newPassword);
        userRegistrationPage.repeatPasswordTextBox.writeText(newPassword);

        userRegistrationPage.securityQuestionMenu.waitClickable();
        userRegistrationPage.securityQuestionMenu.waitVisibilityOfElement();
        userRegistrationPage.securityQuestionMenu.waitPresenceOfElement();
        userRegistrationPage.securityQuestionMenu.click();

        userRegistrationPage.securityQuestionMenu.waitVisibilityOfElement();
        userRegistrationPage.securityQuestionMenu.waitPresenceOfElement();
        userRegistrationPage.eldestSiblingOption.click();
        userRegistrationPage.securityAnswerTextBox.writeText(secQuestAnswer);

        userRegistrationPage.registerButton.waitClickable();
        userRegistrationPage.registerButton.waitPresenceOfElement();

        userRegistrationPage.registerButton.click();

        Assertions.assertTrue(loginPageJuiceShop.emailTextBox.isControlDisplayed());

        loginPageJuiceShop.emailTextBox.writeText(newEmail);
        loginPageJuiceShop.passwordTextBox.writeText(newPassword);
        loginPageJuiceShop.loginButton.click();

        Assertions.assertTrue(catalogPage.shoppingCartButton.isControlDisplayed());

        catalogPage.accountButton.waitClickable();
        catalogPage.accountButton.click();
        catalogPage.accountButton.waitAttributeToBe("aria-expanded","true");
        catalogPage.logOutButton.click();

        Assertions.assertFalse(catalogPage.shoppingCartButton.isControlDisplayed(),"Error, shopping cart was not hidden.");

        Thread.sleep(2000);
    }

}
