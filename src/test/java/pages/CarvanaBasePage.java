package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CarvanaBasePage {

    public CarvanaBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "svg[viewBox='0 0 153 35']")
    public WebElement logo;

    @FindBy(css = "div[class*='Navigationstyles__NavigationWrapper']")
    public WebElement NavItems;

    @FindBy(css = "a[data-cv-test='headerSignInLink']")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement emailInputBox;

    @FindBy(css = "button[data-qa*='enter-email-submit']")
    public WebElement continueButton;

    @FindBy(css = "input[type*='password']")
    public WebElement passwordInputBox;

    @FindBy(css = "button[type*='submit']")
    public WebElement submitButton;

    @FindBy(id = "error-banner")
    public WebElement errorMessage;

    @FindBy(css = "a[data-cv-test*='headerSearchLink']")
    public WebElement searchCarButton;

    @FindBy(css = "div[data-qa='menu-flex']")
    public WebElement filterOptions;

    @FindBy(css = "input[placeholder*='Search']")
    public WebElement carSearchBar;

    @FindBy(css = "button[class^='Key']")
    public WebElement goButton;


    @FindBy(css = "img[loading='lazy']")
    public List<WebElement> carImage;

    @FindBy(css = "svg[class='favorite-icon']")
    public List<WebElement> favoriteButton;

    @FindBy(css = "div[class='result-tile']")
    public List<WebElement> tileBody;

    @FindBy(css = "div[class='tk-frame middle-frame']")
    public List<WebElement> tileText;

    @FindBy(css = "div[data-test^='BaseInv']")
    public List<WebElement> inventoryType;

    @FindBy(css = "div[class='year-make']")
    public List<WebElement> makeAndModel;

    @FindBy(css = "div[class='trim-mileage']")
    public List<WebElement> trimAndMileage;

    @FindBy(css = "div[data-testid='price']")
    public List<WebElement> price;

    @FindBy(css = "div[class='monthly-payment']")
    public List<WebElement> monthlyPayment;

    @FindBy(css = "div[class='down-payment']")
    public List<WebElement> downPayment;

    @FindBy(css = "div[data-qa='shipping-cost']")
    public List<WebElement> ship;












}



