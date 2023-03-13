package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DqaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class DemoQAStepDefinitions {

    DqaPage dqaPage = new DqaPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @Then("kullanici alerte tiklar")
    public void kullanici_alerte_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dqaPage.alert.click();
    }

    @Then("kullanici on button click alert will appear after bes seconds karsisindaki click me butonuna basar")
    public void kullanici_on_button_click_alert_will_appear_after_bes_seconds_karsisindaki_click_me_butonuna_basar() {
        dqaPage.onButtonClick.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("kullanici alertin gorunur olmasini bekler")
    public void kullanici_alertin_gorunur_olmasini_bekler() {
        wait.until(ExpectedConditions.alertIsPresent());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("kullanici alert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullanici_alert_uzerindeki_yazinin_this_alert_appeared_after_bes_seconds_oldugunu_test_eder() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String alertYazisi = Driver.getDriver().switchTo().alert().getText();
        String beklenenYazi = "This alert appeared after bes seconds";
        Assert.assertEquals(beklenenYazi, alertYazisi);
    }

    @Then("kullanici ok diyerek alerti kapatir")
    public void kullanici_ok_diyerek_alerti_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSayi) {
        try {
            Thread.sleep(istenenSayi * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
