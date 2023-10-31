package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Multiple_User {
    public static final String[] usernames = {
            "23197950",
            "23148127",
            "BUSHuser",
            "23095502",
            "08042021"
    };

    public static final String[] passwords = {
            "pass,123",
            "pass,123",
            "pass,123",
            "pass,123",
            "pass,123"
    };
    public Multiple_User(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    public WebElement User_user_name;
    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    public WebElement User_pass_word;
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement User_login_button;

    //View Button
    @FindBy(xpath = "//mat-row[1]/mat-cell[11]/button/span[1]")
    public WebElement User_View_Button;

    //Approve OBF
    @FindBy(xpath = "//span[normalize-space()='Approve']")
    public WebElement Approve_Button;
    //Logout
    @FindBy(xpath = "//img[@src='assets/images/log_out_icon_new.png']")
    public WebElement User_Logout;
}

