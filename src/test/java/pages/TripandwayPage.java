package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripandwayPage {

    public TripandwayPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//i[@class='fas fa-lock']")
    public WebElement loginButton;


    @FindBy (xpath = "(//a[text()='Services'])[2]")
    public WebElement servicesButton;

    @FindBy (xpath = "(//a[text()='Destinations'])[2]")
    public WebElement destinationsButton;

    @FindBy(xpath = "//*[text()='International Tour']")
    public WebElement tabInternationalTour;

    @FindBy(xpath = "//*[text()='Adventure Tour']")
    public WebElement tabAdventureTour;

    @FindBy(xpath = "//*[text()='Culture Tour']")
    public WebElement tabCultureTour;

    @FindBy(xpath = "//*[text()='Bussiness Tour']")
    public WebElement tabBussinessTour;
    @FindBy(xpath = "//*[text()='Health Tour']")
    public WebElement tabHealthTour;
    @FindBy(xpath = "//*[text()='Religious Tour']")
    public WebElement tabReligiousTour;

    @FindBy (xpath = "//button[@type='button']")
    public WebElement cookiesAcceptButton;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement acceptButonu;


}
