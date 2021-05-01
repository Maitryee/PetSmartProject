package Pet.Tests;

import Pet.PageObjects.AdoptPetPage;
import Pet.PageObjects.FirstPage;
import Pet.Resources.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PetAdopt extends Base {


    public WebDriver driver;
    @BeforeTest
    public void initialize() throws IOException
    {

        driver=initializeDriver();
    }
    @Test
    public void petAdopt()
    {
        driver.get(prop.getProperty("url"));
        FirstPage f1= new FirstPage(driver);
        f1.imageDoorDash().click();
        f1.petCharity().click();


        AdoptPetPage app=new AdoptPetPage(driver);
        app.adopt().click();
        Actions action=new Actions(driver);
        action.moveToElement(app.adopt()).build().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        app.findPet().click();
    }
}
