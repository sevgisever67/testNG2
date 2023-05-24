package tests.StudyMyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FaceBook {
    @Test
    public void facebook(){
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("faceBookURL"));
        //2- POM’a uygun olarak email, sifre kutularini ve giris
        //yap butonunu locate edin
        FaceBookPage faceBookobj=new FaceBookPage();
        faceBookobj.emailButonu.sendKeys(ConfigReader.getProperty("facebookEmail"));
        faceBookobj.passWordButton.sendKeys(ConfigReader.getProperty("facebookPassword"));
        faceBookobj.loginButton.click();

        //4- Basarili giris yapilamadigini test edi
        Assert.assertTrue(faceBookobj.emailButonu.isEnabled());


    }
}