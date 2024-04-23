package Actions;

import Locators.LoginLocators;
import Utilities.FileProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.Base.driver;

public class LoginActions {

    LoginLocators loginLocators = new LoginLocators();

    //Ingresar nombre
    public void sendUsrName(){
        //Espero a que el elemneto sea clickeable
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(loginLocators.userNameInput));

        loginLocators.userNameInput.sendKeys(FileProperties.getProperty().getProperty("user"));
        System.out.println("Ingresa Nombre");
    }

    public void sendPassword(){
        loginLocators.passwordInput.sendKeys(FileProperties.getProperty().getProperty("password"));
        System.out.println("Ingresa Password");
    }

    public void clickLogin() throws InterruptedException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginLocators.loginBtn.click();
        System.out.println("Click en Login");
        //Se agrega un comentario
        //Se agrega otro comentario para la prueba GIT
    }
}
