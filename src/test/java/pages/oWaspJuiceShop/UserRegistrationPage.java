package pages.oWaspJuiceShop;

import controlSelenium.Button;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class UserRegistrationPage
{
    public Label RegistrationHeader = new Label(By.xpath("//h1[text()=\"User Registration\"]"),"[User Registration] Label in User Registration Page");
    public TextBox newEmailTextBox = new TextBox(By.id("emailControl"),"[Email] Textbox in User Registration Page");
    public TextBox newPasswordTextBox = new TextBox(By.id("passwordControl"),"[Password] Textbox in User Registration Page");
    public TextBox repeatPasswordTextBox = new TextBox(By.id("repeatPasswordControl"),"[Repeat Password] Textbox in User Registration Page");
    public Button passwordAdviceRadioButton = new Button(By.xpath("//span[@class=\"mat-slide-toggle-bar\"]"),"[Password Advices] Radiobutton in User Registration Page");

    public Label minimumCharactersSuggestionLabel = new Label(By.xpath("//span[@class=\"ng-tns-c128-15\" and text()=\"contains at least one lower character\"]"),"[Minimum characters suggestion] Label in User Registration Page");
    public Button securityQuestionMenu = new Button(By.xpath("//mat-select[@aria-label=\"Selection list for the security question\"]"),"[Security Question] Listbox in User Registration Page");

    public Button eldestSiblingOption = new Button(By.xpath("//span[@class=\"mat-option-text\" and contains(text(),'eldest')]"),"[Eldest Sibling] Button in User Registration Page");

    public TextBox securityAnswerTextBox = new TextBox(By.id("securityAnswerControl"),"[Security Question Answer] Textbox in User Registration Page");
    //public Button registerButton = new Button(By.xpath("//*[@id=\"registerButton\"]"));
    public Button registerButton = new Button(By.id("registerButton"),"[Register] Button in User Registration Page");
}
