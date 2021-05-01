package Pet.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
     WebDriver driver;
     By email=By.cssSelector("input[name='username']");
     By password = By.cssSelector("input[name='password']");


     public LoginPage(WebDriver driver)
     {
         this.driver=driver;
     }
    public WebElement getEmail()
    {

            return driver.findElement(email);
        }

    public WebElement getPassword()
    {

        return driver.findElement(password);
    }
    public WebElement logIn()
    {
        WebElement login;
        login = (driver.findElement(By.id("login")));
        return login;
    }


    }




