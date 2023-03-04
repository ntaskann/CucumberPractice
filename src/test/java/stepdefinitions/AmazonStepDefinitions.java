package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("amazon sayfasina gidilir")
    public void amazon_sayfasina_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("amazon sayfasinda selenium aratilir")
    public void amazon_sayfasinda_selenium_aratilir() {
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }

    @Then("sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.closeDriver();
    }
}
