package Pet.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdoptPetPage {
    public WebDriver driver;

    By waysToAdopt = By.xpath("//li[@class='nav-item menu-item--expanded dropdown'][2]");
    By findAPet= By.xpath("//li[@class='dropdown-item active']/a");

public AdoptPetPage(WebDriver driver)
{
    this.driver=driver;
}

public WebElement adopt()
{
    return driver.findElement(waysToAdopt);
}
public WebElement findPet()
{
   return driver.findElement(findAPet);
}

}
