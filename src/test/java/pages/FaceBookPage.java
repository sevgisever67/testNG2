package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {

    public FaceBookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(id="email")
   public WebElement emailButonu;

    @FindBy(id="pass")
    public WebElement passWordButton;

    @FindBy(xpath="//*[@name='login']")
    public WebElement loginButton;


}