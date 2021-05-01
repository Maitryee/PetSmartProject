package Pet.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

import java.lang.reflect.AccessibleObject;

public class FirstPage {

    public WebDriver driver;

    By doordash=By.cssSelector("._HP_promoModal__close--light");
    By signing=By.cssSelector("span[class='caret']");
    By charity=By.xpath("//div[@class='_GN_Footer__linksCol '] /a[2]");

    By petService=By.linkText("pet services");
    By grooming=By.linkText("Grooming Salon");
    By ad1=By.xpath("//div[@class='_GN_headerPromo__text']");

    public FirstPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement imageDoorDash()
    {
                return driver.findElement(doordash);
    }
    public WebElement signIn()
    {

        return driver.findElement(signing);

    }
    public WebElement petCharity()
    {
          return driver.findElement(charity);
    }
    public WebElement petServ()
    {
        return driver.findElement(petService);
    }
    public WebElement groom()
    {
        return driver.findElement(grooming);
    }
    public WebElement advertise()
    {
        return driver.findElement(ad1);
    }

}


