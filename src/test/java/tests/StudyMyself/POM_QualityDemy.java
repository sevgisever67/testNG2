package tests.StudyMyself;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class POM_QualityDemy {
    @Test
    public void QualitiyDemi(){
        //PositiveTest
        //1- https://www.qualitydemy.com/ anasayfasina gidin
      //  QualitydemyPage qualitiyDemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        //Cerezi handle edin
        qualitydemyPage.cerezkutusuElementi.click();
        //3- Kullanici email'i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        //4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //5- Login butonuna basarak login olun
        qualitydemyPage.loginButonu.click();
        //6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());

    }
}