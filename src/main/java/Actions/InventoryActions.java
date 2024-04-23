package Actions;

import Locators.InventoryLocators;
import org.testng.Assert;

public class InventoryActions {
    InventoryLocators inventoryLocators = new InventoryLocators();

    public void assertSwagLogo(){
        Assert.assertTrue(inventoryLocators.swagLogo.isDisplayed());
        System.out.println("Se muestra Logo Swag");
    }
}
