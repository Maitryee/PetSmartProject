package Pet.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GroomingPage {
    public WebDriver driver;

    public GroomingPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By dogButton=By.xpath("//h5[@class='grooming__species-title']/parent::div");
    By breedDrop= By.xpath("//div[@class='grooming__dropdown-container grooming__tablet-element']/div/div");
    By breed=By.xpath("//div[@id='react-select-2--value']/div[2]/input");
    By ageDrop=By.xpath("//div[@id='react-select-3--value']/div");
    By ageSelect=By.xpath("//input[@value='2020-04-20']");




    public WebElement dog()
    {
        return driver.findElement(dogButton);
    }
    public WebElement species()
    {
        return driver.findElement(breedDrop);
    }

    public WebElement breedSelect()
    {
        return driver.findElement(breed);
    }
    public WebElement age()
    {
        return driver.findElement(ageDrop);
    }
    public WebElement dogAge()
    {
        return driver.findElement(ageSelect);
    }
}
