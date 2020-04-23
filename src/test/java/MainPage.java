import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void beforeActions() {
        System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get(Data.mainUrl);
    }

    @Test
    public void openMainUrl() {
        driver.findElement(Locators.ROUNDTRIP_TAB).click();
        driver.findElement(By.cssSelector("#flight-type-roundtrip-label-hp-flight")).click();
        if (driver.findElement(By.cssSelector("#flight-returning-hp-flight")).isDisplayed()) {
            System.out.println("Returning field is appeared");
        }
    }

    @AfterMethod
    public void afterActions() {
        driver.quit();
    }
}
