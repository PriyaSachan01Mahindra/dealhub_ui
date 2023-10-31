package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver = null;
    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    public WebElement user_name;
    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    public WebElement pass_word;
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement login_button;
}
