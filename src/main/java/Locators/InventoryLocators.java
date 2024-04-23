package Locators;

import Utilities.SeleniumPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryLocators extends SeleniumPageFactory {
    @FindBy(xpath = "(//div[@class='app_logo'])[1]")
    public WebElement swagLogo;

    public InventoryLocators(){

    }
}
