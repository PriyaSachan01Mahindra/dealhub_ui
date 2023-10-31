package test_cases;
import ObjectRepository.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.Browser_Initialization;
import java.time.Duration;


public class OBF_Sanity extends BaseClass {

    static WebDriver driver = null;
    static Login login;
    static CreateOBF obf;
    static Multiple_User user;
    String[] usernames = user.usernames;
    String[] passwords = user.passwords;
    //  static BaseClass page;
    public static String dir = System.getProperty("user.dir");
    public OBF_Sanity() {
        super();
    }

    static Wait<WebDriver> wait = null;
    public final ExtentReports extentReports = new ExtentReports();

    @BeforeClass
    public void Initialize_Browser() throws Exception {
        driver = Browser_Initialization.intializeBrowser();
    }

    @Test(priority = 0)
    public void Login() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO,"Login");
        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(60L))
                        .pollingEvery(Duration.ofSeconds(50L))
                        .ignoring(NoSuchElementException.class);
        login = new Login(driver);
        Thread.sleep(8000);
        wait.until(ExpectedConditions.elementToBeClickable(login.user_name));
        login.user_name.click();
        login.user_name.sendKeys("09900134");
        login.pass_word.click();
        wait.until(ExpectedConditions.elementToBeClickable(login.pass_word));
        login.pass_word.sendKeys("pass,123");
        login.login_button.click();
        Thread.sleep(15000);
        Reporter.log("=====Login Successfully=====", true);

    }

    @Test(priority = 1)
    public void Upload_OBF() throws InterruptedException {
          ExtentTestManager.getTest().log(LogStatus.INFO,"Upload OBF");
        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(30L))
                        .pollingEvery(Duration.ofSeconds(50L))
                        .ignoring(NoSuchElementException.class);
        obf = new CreateOBF(driver);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Create_OBF_button));
        obf.Create_OBF_button.click();
        Thread.sleep(10000);
        obf.Upload_OBF_button.sendKeys(dir + "/test-output/DealhubOBF.xlsx");
        Thread.sleep(9000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Final_Upload_Button));
        obf.Final_Upload_Button.click();
        Thread.sleep(10000);
         Reporter.log("=====OBF Upload Successfully=====", true);
    }

    @Test(priority = 2)
    public void Agreement() throws InterruptedException {
          ExtentTestManager.getTest().log(LogStatus.INFO,"Agreement");
        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(60L))
                        .pollingEvery(Duration.ofSeconds(5L))
                        .ignoring(NoSuchElementException.class);
        obf = new CreateOBF(driver);
        wait.until(ExpectedConditions.elementToBeClickable(obf.dropdown));
        obf.dropdown.click();
        obf.dropdown.sendKeys(Keys.ARROW_DOWN);
        obf.dropdown.sendKeys(Keys.ARROW_DOWN);
        obf.dropdown.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        obf.Upload_Agreement.sendKeys(dir + "/test-output/Agreement.pdf");
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Confirm_Upload_Agreement));
        obf.Confirm_Upload_Agreement.click();
    }

    @Test(priority = 3)
    public void Support_Document() throws InterruptedException {
          ExtentTestManager.getTest().log(LogStatus.INFO,"Support Document");
        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(8000))
                        .pollingEvery(Duration.ofSeconds(5000))
                        .ignoring(NoSuchElementException.class);
        obf = new CreateOBF(driver);
        obf.Supporting_Document.sendKeys(dir + "/test-output/Agreement.pdf");
        Thread.sleep(9000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Upload_Support_Document));
        obf.Upload_Support_Document.click();
    }

    @Test(priority = 4)
    public void Other_Details() throws InterruptedException {
          ExtentTestManager.getTest().log(LogStatus.INFO,"Other Details");
        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(8000))
                        .pollingEvery(Duration.ofSeconds(5000))
                        .ignoring(NoSuchElementException.class);
        obf = new CreateOBF(driver);
        //Scroll the page top to bottom so next button will visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(40,3000)");
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Next_Button));
        obf.Next_Button.click();
        Thread.sleep(3000);
        //Select Solution category
        wait.until(ExpectedConditions.elementToBeClickable(obf.Select_Category));
        obf.Select_Category.click();
        obf.Select_Category.sendKeys(Keys.ARROW_DOWN);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Select_Category_Service));
        obf.Select_Category_Service.click();
        Thread.sleep(8000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Service_Dropdown));
        obf.Service_Dropdown.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.optionsToSelect));
        obf.optionsToSelect.click();
        obf.Service_Dropdown.sendKeys(Keys.ESCAPE);
        Thread.sleep(10000);
//     Select Sector
        wait.until(ExpectedConditions.elementToBeClickable(obf.Select_Sector));
        obf.Select_Sector.click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Select_Sector_Option));
        obf.Select_Sector_Option.click();
        Thread.sleep(8000);
        //Select Sub Sector
        wait.until(ExpectedConditions.elementToBeClickable(obf.Select_Sub_Sector));
        obf.Select_Sub_Sector.click();
        Thread.sleep(8000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Select_Sub_Sector_Option));
        obf.Select_Sub_Sector_Option.click();
        Thread.sleep(8000);
        //Scroll the page top to bottom so next button will visible
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(40,3000)");
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Select_Next_Button));
        obf.Select_Next_Button.click();
        //Scroll the page top to bottom so next button will visible
        js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,8000)");
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Submit_Button));
        obf.Submit_Button.click();
        String expectedText = "OBF created successfully";
        Assert.assertEquals("OBF created successfully", expectedText);
        Thread.sleep(40000);
        wait.until(ExpectedConditions.elementToBeClickable(obf.Submitted_OBF));
        obf.Submitted_OBF.click();
        String cellText =  obf.OBF_Code.getText();
        System.out.println("Code is :" +cellText);
        String cellText1 =  obf.Opp_ID.getText();
        System.out.println("Code is :" +cellText1);

        wait.until(ExpectedConditions.elementToBeClickable(obf.Logout));
        obf.Logout.click();
    }

    @Test(priority = 5)
    public void Approval() throws InterruptedException {
          ExtentTestManager.getTest().log(LogStatus.INFO,"Approval");
        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(8000))
                        .pollingEvery(Duration.ofSeconds(5000))
                        .ignoring(NoSuchElementException.class);
        Multiple_User user = new Multiple_User(driver);
        Thread.sleep(20000);
        for (int i = 0; i < usernames.length; i++) {
            driver.get("https://dealhub.mllqa.com/login");
            String username = usernames[i];
            String password = passwords[i];
            wait.until(ExpectedConditions.elementToBeClickable(user.User_user_name ));
            user.User_user_name.click();
            user.User_user_name.sendKeys(username);
            wait.until(ExpectedConditions.elementToBeClickable(user.User_pass_word));
            user.User_pass_word.click();
            user.User_pass_word.sendKeys(password);
            Thread.sleep(20000);
            user.User_login_button.click();
            Thread.sleep(20000);
            System.out.println("Successfully Login " + username);
            wait.until(ExpectedConditions.elementToBeClickable(user.User_View_Button));
            user.User_View_Button.click();
            //Scroll the page top to bottom so next button will visible
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("window.scrollBy(40,3000)");
            Thread.sleep(20000);
            wait.until(ExpectedConditions.elementToBeClickable(user.Approve_Button));
            user.Approve_Button.click();
            String expectedText = "OBF approved successfully";
            Assert.assertEquals("OBF approved successfully", expectedText);
            wait.until(ExpectedConditions.elementToBeClickable(user.User_Logout));
            user.User_Logout.click();
            Thread.sleep(20000);
        }

    }
}

