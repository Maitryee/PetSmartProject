package Pet.Tests;

import Pet.PageObjects.FirstPage;
import Pet.PageObjects.GroomingPage;
import Pet.PageObjects.LoginPage;
import Pet.Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstPageTest extends Base {

    public WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
    }

    @Test
    public void FirstLogin() {

        driver.get(prop.getProperty("url"));
        //create object of FirstPage from PageObjects
        FirstPage fp = new FirstPage(driver);
        //click on the doordash image to close it
        fp.imageDoorDash().click();
        //get text on first page
        System.out.println("This is displayed on the page:" + fp.advertise().getText());
        //hover over the caret to get login button
        Actions action = new Actions(driver);
        action.moveToElement(fp.signIn()).build().perform();
        //click on login button
        fp.signIn().click();
        //next page-Login page- to sign in
        LoginPage lp = new LoginPage(driver);
        //put email id and pw in text boxes
        lp.getEmail().sendKeys("maitryee@xyz.com");
        lp.getPassword().sendKeys("Burna@2020");
    }

    @Test
    public void petGrooming() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        FirstPage fp = new FirstPage(driver);
        fp.imageDoorDash().click();

        Actions act = new Actions(driver);
        act.moveToElement(fp.petServ()).build().perform();
        fp.groom().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //in grooming page click on Dog button
        GroomingPage gp = new GroomingPage(driver);
        gp.dog().click();
        //click on breed dropdown menu
        gp.species().click();
        Thread.sleep(3);
        //Enter breed name and click ENTER
            gp.breedSelect().sendKeys("Labrador Retriever"+ Keys.ENTER);//"\n" is to simulate click enter


        gp.age().click();
        Actions ageMove=new Actions(driver);
        ageMove.moveToElement(gp.dogAge()).click();

      // gp.dogAge().;




            }
            }




















