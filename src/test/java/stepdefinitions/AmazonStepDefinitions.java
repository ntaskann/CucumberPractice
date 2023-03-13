package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        amazonPage.aramaKutusu.sendKeys("selenium", Keys.ENTER);
    }

    @Then("sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.closeDriver();
    }


    @When("amazon sayfasinda iphone aratilir")
    public void amazon_sayfasinda_iphone_aratilir() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);

    }

    @Then("sayfa basliginin iphone icerdigini test eder")
    public void sayfa_basliginin_iphone_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }

    @Then("sayfa basliginin selenium icerdigini test eder")
    public void sayfa_basliginin_selenium_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
    }


    @When("amazon sayfasinda java aratilir")
    public void amazon_sayfasinda_java_aratilir() {
        amazonPage.aramaKutusu.sendKeys("java", Keys.ENTER);

    }

    @Then("sayfa basliginin java icerdigini test eder")
    public void sayfa_basliginin_java_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("java"));

    }

    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @When("amazon sayfasinda {string} aratilir")
    public void amazon_sayfasinda_aratilir(String string) {
        amazonPage.aramaKutusu.sendKeys(string, Keys.ENTER);
    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfa_basliginin_icerdigini_test_eder(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @Then("kullanici {string} için arama yapar")
    public void kullaniciIçinAramaYapar(String string) {
        amazonPage.aramaKutusu.sendKeys(string, Keys.ENTER);
    }

    @Then("kullanici sql ve samsung aramasi yapar basliklari test eder")
    public void kullaniciSqlVeSamsungAramasiYaparBasliklariTestEder() {
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("kelime1"), Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty("kelime1")));
        amazonPage.aramaKutusu.clear();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("kelime2"), Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty("kelime2")));
        amazonPage.aramaKutusu.clear();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("kelime3"), Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty("kelime3")));
    }
}
