package pages.oWaspJuiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class CatalogPage
{
    public Button mainPageButton = new Button(By.xpath("//span[text()=\"OWASP Juice Shop\"]"),"[OWasp Juice Shop] Button on Catalog Page");
    public Button accountButton = new Button(By.id("navbarAccount"),"[Account] button in Catalog Page");
    public Button loginButton = new Button(By.id("navbarLoginButton"),"[Login] Button in Catalog Page");
    public Button shoppingCartButton = new Button(By.xpath("//button[@aria-label=\"Show the shopping cart\"]"),"[Shopping Cart] button in Catalog Page");
    public Button logOutButton = new Button(By.id("navbarLogoutButton"),"[Log out] button in Catalog Page");

}
