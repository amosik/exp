import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainTests extends BaseUI{

    @Test
    public void openMainUrl() {
        driver.findElement(Locators.FLIGHTS_TAB).click();
        driver.findElement(Locators.ROUND_TRIP_TAB).click();
        if (driver.findElement(Locators.RETURNING_INPUT_FIELD).isDisplayed()) {
            System.out.println("Returning field is appeared");
        }
    }
}
