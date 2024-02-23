//import io.appium.java_client.MobileElement;
//import io.appium.java_client.AppiumDriver;
//import org.openqa.selenium.By;
package ebs.test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import java.net.URL;

@RunWith(Cucumber.class)
public class StepDefinitions {
public  AppiumDriver<WebElement> appium;
@Before
public void setUp() throws Exception{
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("platformVersion","16.2");
        capabilities.setCapability("deviceName","iPhone 11 Pro Max");
        capabilities.setCapability("deviceId","709E5872-23B1-44F6-B726-6D65E3051F6F");
        capabilities.setCapability("automationName","XCUITest");
        capabilities.setCapability("bundleId","com.ebsnakliyat2.app");
        capabilities.setCapability("no-reset","true");
        capabilities.setCapability("full-reset","false");
        capabilities.setCapability("nativeWebTap","true");
        appium = new IOSDriver<WebElement>(new URL("http://localhost:4723/wd/hub"),capabilities);
        }
    @When("Yönetici girişine tıkla")
    public void yoneticiGirisineTikla(){
    //appiumdan önce web element yazıyordu hata verirse geri ekle
        WebElement el1 = appium.findElementByXPath("//XCUIElementTypeButton[@name=\"Yönetici Girişi\"]");
        el1.click();
    }
    @When("Surucu ekleye tıkla")
    public void surucuEkleyeTikla() {
        By el7 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Sürücü Ekle\"`]");
        appium.findElement(el7).click();
    }
    @When("Telefon Numarasina Harf Gir")
    public void telefonNumarasinaHarfGir() {
        By el8 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Adı\"`]");
        appium.findElement(el8).click();
        appium.findElement(el8).sendKeys("Sena");
        By el9 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Soyadı\"`]");
        appium.findElement(el9).click();
        appium.findElement(el9).sendKeys("Gurkan");
        By el11 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Telefonu\"`]");
        appium.findElement(el11).click();
        appium.findElement(el11).sendKeys("0505112050a");
        By el12 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Araç Kapasitesi\"`]");
        appium.findElement(el12).click();
        appium.findElement(el12).sendKeys("2");
        By el13 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Ücret\"`]");
        appium.findElement(el13).click();
        appium.findElement(el13).sendKeys("5");
        By el10 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"İlçe\"`]");
        appium.findElement(el10).click();
        appium.findElement(el10).sendKeys("Adalar");
        By el14 = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Sürücü Ekle\"`][2]");
        appium.findElement(el14).click();

    }
    @Then("Rakam, Harf ve Boşluk Hatası Yakala")
    public void rakamHarfBoslukHataMesaji(){
       By el15 = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Sürücü Adına/Soyadına Rakam Girilemez, Sürücü Telefonuna Ve Ücrete Harf Girilemez, Alanlar Boş Bırakılamaz\"`]");
        appium.findElement(el15);
        By el16 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Tamam\"`]");
        appium.findElement(el16).click();

    }

    @When("Arac kapasitesine negatif deger gir")
    public void aracKapasitesineNegatifDegerGir() {
        By el8 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Adı\"`]");
        appium.findElement(el8).click();
        appium.findElement(el8).sendKeys("Emirhan");
        By el9 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Soyadı\"`]");
        appium.findElement(el9).click();
        appium.findElement(el9).sendKeys("Şimşek");
        By el11 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Telefonu\"`]");
        appium.findElement(el11).click();
        appium.findElement(el11).sendKeys("05051120501");
        By el12 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Araç Kapasitesi\"`]");
        appium.findElement(el12).click();
        appium.findElement(el12).sendKeys("-4");
        By el13 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Ücret\"`]");
        appium.findElement(el13).click();
        appium.findElement(el13).sendKeys("5");
        By el10 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"İlçe\"`]");
        appium.findElement(el10).click();
        appium.findElement(el10).sendKeys("Adalar");
        By el14 = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Sürücü Ekle\"`][2]");
        appium.findElement(el14).click();

    }

    @Then("Surucu ekle buton kontrol")
    public void surucuEkleButonKontrol() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Sürücü Ekle\"`]");
        appium.findElement(el0);
      //  appium.navigate().back();
       // appium.navigate().back();
    }

    @Then("İlanları gör buton kontrol")
    public void ilanlariGorButonKontrol() {
        By el20 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"İlanları Gör\"`]");
        appium.findElement(el20);

    }

    @When("Surucu bilgileri ekle")
    public void surucuBilgileriEkle() {
        By el8 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Adı\"`]");
        appium.findElement(el8).click();
        appium.findElement(el8).sendKeys("Melike Sena");
        By el9 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Soyadı\"`]");
        appium.findElement(el9).click();
        appium.findElement(el9).sendKeys("Gurkan");
        By el11 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Telefonu\"`]");
        appium.findElement(el11).click();
        appium.findElement(el11).sendKeys("05051120501");
        By el12 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Araç Kapasitesi\"`]");
        appium.findElement(el12).click();
        appium.findElement(el12).sendKeys("2");
        By el13 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Ücret\"`]");
        appium.findElement(el13).click();
        appium.findElement(el13).sendKeys("5");
        By el10 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"İlçe\"`]");
        appium.findElement(el10).click();
        appium.findElement(el10).sendKeys("Adalar");
        By el14 = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Sürücü Ekle\"`][2]");
        appium.findElement(el14).click();
    }

    @When("Sürücü adına rakam ekle")
    public void surucuAdinaRakamEkle() {
        By el8 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Adı\"`]");
        appium.findElement(el8).click();
        appium.findElement(el8).sendKeys("Berhan Berk1");
        By el9 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Soyadı\"`]");
        appium.findElement(el9).click();
        appium.findElement(el9).sendKeys("Akgün");
        By el11 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Telefonu\"`]");
        appium.findElement(el11).click();
        appium.findElement(el11).sendKeys("05051120501");
        By el12 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Araç Kapasitesi\"`]");
        appium.findElement(el12).click();
        appium.findElement(el12).sendKeys("2");
        By el13 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Ücret\"`]");
        appium.findElement(el13).click();
        appium.findElement(el13).sendKeys("5");
        By el10 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"İlçe\"`]");
        appium.findElement(el10).click();
        appium.findElement(el10).sendKeys("Adalar");
        By el14 = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Sürücü Ekle\"`][2]");
        appium.findElement(el14).click();

    }

    @When("Kullanıcı girişine tıkla")
    public void kullaniciGirisineTikla() {
        By el14 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Kullanıcı Girişi\"`]");
        appium.findElement(el14).click();
    }

    @Then("Araç bul buton kontrol")
    public void aracBulButonKontrol() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Araç Bul\"`]");
        appium.findElement(el0);
    }

    @Then("Siparişlerimi görüntüle buton kontrol")
    public void siparislerimiGoruntuleButonKontrol() {
            By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Siparişlerimi Görüntüle\"`]");
            appium.findElement(el0);
    }

    @When("Araç bula tıkla")
    public void aracBulaTikla() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Araç Bul\"`]");
        appium.findElement(el0).click();
    }

    @When("Eşya sayısına negatif deger gir")
    public void esyaSayisinaNegatifDegerGir() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Kalkış İlçesi\"`]");
        appium.findElement(el0).click();
        appium.findElement(el0).sendKeys("Adalar");
        By el1 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Varış İlçesi\"`]");
        appium.findElement(el1).click();
        appium.findElement(el1).sendKeys("Arnavutköy");
        By el2 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Eşya Sayısı\"`]");
        appium.findElement(el2).click();
        appium.findElement(el2).sendKeys("-2");
        By el3 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Tarih\"`]");
        appium.findElement(el3).click();
        appium.findElement(el3).sendKeys("25 Kasım 2022");
        By el4 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Araç Bul\"`]");
        appium.findElement(el4).click();

    }

    @When("Giriş ekranına geri dön")
    public void girisEkraninaGeriDon() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Giriş Ekranına Geri Dön\"`]");
        appium.findElement(el0).click();
    }

    @Then("Surucu ekleme sayfa kontrol")
    public void surucuEklemeSayfaKontrol() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeNavigationBar[`name == \"Sürücü Ekle\"`]");
        appium.findElement(el0);

    }

    @When("İlanları göre tıkla")
    public void ilanlariGoreTikla() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"İlanları Gör\"`]");
        appium.findElement(el0).click();
    }

    @Then("Yük ilanları sayfa kontrol")
    public void yukIlanlariSayfaKontrol() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeNavigationBar[`name == \"Yük İlanları\"`]");
        appium.findElement(el0);

    }

    @Then("Araç bul sayfa kontrol")
    public void aracBulSayfaKontrol() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeNavigationBar[`name == \"Araç Bul\"`]");
        appium.findElement(el0);
    }

    @When("Boş alan bırak")
    public void bosAlanBirak() {
        By el8 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Adı\"`]");
        appium.findElement(el8).click();
        appium.findElement(el8).sendKeys("Emirhan");
        By el9 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Sürücü Soyadı\"`]");
        appium.findElement(el9).click();
        appium.findElement(el9).sendKeys("Şimşek");
        By el12 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Araç Kapasitesi\"`]");
        appium.findElement(el12).click();
        appium.findElement(el12).sendKeys("2");
        By el13 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Ücret\"`]");
        appium.findElement(el13).click();
        appium.findElement(el13).sendKeys("5");
        By el10 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"İlçe\"`]");
        appium.findElement(el10).click();
        appium.findElement(el10).sendKeys("Adalar");
        By el14 = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Sürücü Ekle\"`][2]");
        appium.findElement(el14).click();
    }

    @When("arac boş alan bırak")
    public void aracBosAlanBirak() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Kalkış İlçesi\"`]");
        appium.findElement(el0).click();
        appium.findElement(el0).sendKeys("Adalar");
        By el1 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Varış İlçesi\"`]");
        appium.findElement(el1).click();
        appium.findElement(el1).sendKeys("Arnavutköy");
        By el2 = MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Eşya Sayısı\"`]");
        appium.findElement(el2).click();
        appium.findElement(el2).sendKeys("2");
        By el4 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Araç Bul\"`]");
        appium.findElement(el4).click();
    }

    @Then("Boşluk Hatası Yakala")
    public void boslukHatasiYakala() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Boş Alan Bırakılamaz!\"`]");
        appium.findElement(el0);
        By el1 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Tamam\"`]");
        appium.findElement(el1).click();

    }

    @Then("Siparişlerim ekran kontrol")
    public void siparislerimEkranKontrol() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Siparişlerimi Görüntüle\"`]");
        appium.findElement(el0).click();
    }

    @Then("Suruculer buton kontrol")
    public void suruculerButonKontrol() {
        By el0 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Sürücüler\"`]");
        appium.findElement(el0);
    }
}
