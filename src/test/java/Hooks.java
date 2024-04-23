import Utilities.Base;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Hooks {
    @BeforeSuite
    public void beforeSuite(){
        Base.setUp();
    }

    @AfterSuite
    public void afterSuite() throws InterruptedException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Base.closeDriver();
    }
}
