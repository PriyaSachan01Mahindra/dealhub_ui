package utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Initialization {
    public static WebDriver intializeBrowser() throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dealhub.mllqa.com/login");
        String title = driver.getTitle();
        Thread.sleep(3000);
        System.out.println(title);

        return driver;
    }
}
