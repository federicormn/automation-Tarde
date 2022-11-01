package pages.oWaspJuiceShop;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPageJuiceShop
{
    public TextBox emailTextBox = new TextBox(By.id("email"),"[Email] textbox in Login Page");
    public TextBox passwordTextBox = new TextBox(By.id("password"),"[Password] textbox in Login Page");
    public Button loginButton = new Button(By.id("loginButton"),"[Login] button in Login Page");
    public Button notYetACustomerButton = new Button(By.xpath("//a[@href=\"#/register\"]"),"[Not yet a customer] button in Login Page");
}
