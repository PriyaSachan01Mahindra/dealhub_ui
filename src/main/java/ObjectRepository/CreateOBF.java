package ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class CreateOBF {
    WebDriver driver = null;
    public CreateOBF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//Click on Create OBF button
        @FindBy(xpath = "//span[normalize-space()='create OBF']")
        public WebElement Create_OBF_button;
      //  Thread.sleep(6000);
        //Upload OBF
        @FindBy(xpath = "/html/body/app-root/app-backend-layout/div/div/app-creatobf/form/div[2]/div/mat-accordion/mat-expansion-panel[1]/div/div/div/div/div[1]/div[1]/div/ngx-dropzone/input")
       public WebElement Upload_OBF_button;
        // Upload_OBF_button.click();
        @FindBy(xpath = "//*[@class=\"mat-focus-indicator creat_bt mat-flat-button mat-button-base\"]")
       public WebElement Final_Upload_Button;
        // LOI/PO/AGREEMENT OR SELF DECLARATION
//        Here we choose Document type
    @FindBy(xpath ="//*[@id=\"mat-select-4\"]")
   public WebElement dropdown;

//        //Here we upload Agreement
 @FindBy(xpath="//*/mat-accordion/mat-expansion-panel[1]/div/div/div/div/div[1]/div[2]/div/ngx-dropzone/input")
 public WebElement Upload_Agreement;

        //Here we confirm Uploading Agreement
        @FindBy(xpath ="//*[@class=\"mat-focus-indicator creat_bt mat-flat-button mat-button-base\"]")
        public WebElement Confirm_Upload_Agreement;

        //Here we submit Supporting document
       @FindBy( xpath ="//*/ngx-dropzone[@accept='.xlsx,.xls,.pdf,.jpeg,.png,.doc,.docx,.csv,.msg,.JPG']/input")
    public WebElement Supporting_Document;
//      //Upload Support Document
    @FindBy(xpath = "//div[3]//div[1]//div[2]//button[1]//span[1]")
    public WebElement Upload_Support_Document;
//        //Here we click enable Next Button

       @FindBy(xpath ="//*[@class=\"mat-focus-indicator creat_bt mat-flat-button mat-button-base\"]")
    public WebElement Next_Button;

//        //Enter details to create OBF
//        //Select Solution Category
    @FindBy(xpath = "//*[@formcontrolname=\"Solutioncategory\"]\n")
        public WebElement Select_Category;
    @FindBy(xpath ="//span[normalize-space()='Services']" )
            public WebElement Select_Category_Service;

//
//        //Select type of Service
    @FindBy(xpath = "//*[@id=\"mat-select-8\"]")
    public WebElement Service_Dropdown;
    // Locate and click the options you want to select
   @FindBy(xpath ="//span[normalize-space()='Express/PTL Transportation']")
    public WebElement optionsToSelect;
   //Select Sector
    @FindBy(xpath = "//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c126-35 ng-star-inserted']")
    public WebElement Select_Sector;
    @FindBy(xpath = "//span[normalize-space()='Engineering']")
    public WebElement Select_Sector_Option;
    //Select Sub_Sector
    @FindBy(xpath = "//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c126-37 ng-star-inserted']")
    public  WebElement Select_Sub_Sector;
    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Light engineering']")
    public WebElement Select_Sub_Sector_Option;
    //Select Next Button
    @FindBy(xpath = "//*[@ class=\"mat-focus-indicator creat_bt cu_width mat-flat-button mat-button-base\"]")
    public WebElement Select_Next_Button;

    @FindBy(xpath = "//span[normalize-space()='SUBMIT']")
    public WebElement Submit_Button;

    @FindBy(xpath = "//div[normalize-space()='Submitted']")
    public  WebElement Submitted_OBF;

    @FindBy(xpath = "//mat-row[1]//mat-cell[4]")
    public WebElement OBF_Code;
    @FindBy(xpath = "//mat-row[1]//mat-cell[5]")
    public WebElement Opp_ID;
    //Logout
    @FindBy(xpath = "//img[@src='assets/images/log_out_icon_new.png']")
    public WebElement Logout;





//        //Select Apply Button
////        WebElement out_link = driver.findElement(By.xpath("//*[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']"));
////        out_link.click();
//
//
//        //Select Sector
////        WebElement sector = driver.findElement(By.className("mat-select-placeholder mat-select-min-line ng-tns-c126-35 ng-star-inserted"));
////        sector.click();
////        WebElement option;
////        option = By.xpath("div[@class='mat-select-arrow ng-tns-c126-29']").findElement(driver);
////        actions.moveToElement(option).click().perform();
//        // Close the browser
//  driver.quit();
    }


