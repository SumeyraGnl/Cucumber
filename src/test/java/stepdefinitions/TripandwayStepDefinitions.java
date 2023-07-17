package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;
import java.util.List;

public class TripandwayStepDefinitions {


    TripandwayPage tripandwayPage = new TripandwayPage();
    String expectedIcerik;
    String actualTitle;

    Actions actions = new Actions(Driver.getDriver());


    @Then("Title'in {string}  icerdigini test eder")
    public void titleInIcerdiginiTestEder(String title) {
        actualTitle = Driver.getDriver().getTitle();
        expectedIcerik = title;

        System.out.println(actualTitle);

        Assert.assertTrue(actualTitle.contains(expectedIcerik));

    }

    @Then("Anasayfa da logini tiklayabilmeli")
    public void anasayfaDaLoginiTiklayabilmeli() throws InterruptedException {

        tripandwayPage.loginButton.click();
        Thread.sleep(3000);

        expectedIcerik = "Login";
        actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedIcerik));


    }

    @Then("Kullanici {string} headeri tiklar")
    public void kullaniciHeaderiTiklar(String aranacakKelime) throws InterruptedException {


        switch (aranacakKelime) {
            case "services":
                tripandwayPage.servicesButton.click();
                Thread.sleep(3000);
                break;
            case "destinations":
                tripandwayPage.destinationsButton.click();
                Thread.sleep(3000);
                break;

        }


    }


    @Given("Kullanici {string} sekmesine tiklar")
    public void kullaniciSekmesineTiklar(String sekme) throws InterruptedException {

        switch (sekme) {
            case "International Tour":
                tripandwayPage.tabInternationalTour.click();
                Thread.sleep(1000);
                break;
            case "Adventure Tour":
                tripandwayPage.tabAdventureTour.click();
                Thread.sleep(1000);
                break;
            case "Culture Tour":
                tripandwayPage.tabCultureTour.click();
                Thread.sleep(1000);
                break;
            case "Bussiness Tour":
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                tripandwayPage.tabBussinessTour.click();
                Thread.sleep(1000);
                break;
            case "Health Tour":
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                tripandwayPage.tabHealthTour.click();
                Thread.sleep(1000);
                break;
            case "Religious Tour":
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                tripandwayPage.tabReligiousTour.click();
                Thread.sleep(1000);
                break;

        }


    }

    @When("Services sekmesine tiklar")
    public void services_sekmesine_tiklar() throws InterruptedException {

        tripandwayPage.servicesButton.click();
        Thread.sleep(3000);
        tripandwayPage.acceptButonu.click();
        Thread.sleep(2000);

    }

    @When("Kullanici {string} sekmesinin aktif oldugunu test eder")
    public void kullaniciSekmesininAktifOldugunuTestEder(String sekmeTest) throws InterruptedException {

        switch (sekmeTest) {
            case "International Tour":

                expectedIcerik = "International Tour";
                actualTitle = Driver.getDriver().getTitle();

                Assert.assertTrue(actualTitle.contains(expectedIcerik));
                break;
            case "Adventure Tour":
                expectedIcerik = "Adventure Tour";
                actualTitle = Driver.getDriver().getTitle();

                Assert.assertTrue(actualTitle.contains(expectedIcerik));
                break;
            case "Culture Tour":
                expectedIcerik = "Culture Tour";
                actualTitle = Driver.getDriver().getTitle();

                Assert.assertTrue(actualTitle.contains(expectedIcerik));
                break;
            case "Bussiness Tour":
                expectedIcerik = "Bussiness Tour";
                actualTitle = Driver.getDriver().getTitle();

                Assert.assertTrue(actualTitle.contains(expectedIcerik));
                break;
            case "Health Tour":
                expectedIcerik = "Health Tour";
                actualTitle = Driver.getDriver().getTitle();

                Assert.assertTrue(actualTitle.contains(expectedIcerik));
                break;
            case "Religious Tour":
                expectedIcerik = "Religious Tour";
                actualTitle = Driver.getDriver().getTitle();

                Assert.assertTrue(actualTitle.contains(expectedIcerik));
                break;

        }


    }
}
