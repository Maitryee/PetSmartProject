package Pet.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public  WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {


        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\maitr\\IdeaProjects\\E2ERevision\\src\\main\\java\\Pet\\Resources\\data.properties");
        prop.load(fis);
        String browserName= prop.getProperty("browser");

        if (browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Selenium jars and drivers\\Drivers\\Chrome\\chromedriver.exe");
             driver=new ChromeDriver();
        }
        else if (browserName.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","C:\\Selenium jars and drivers\\Drivers\\Firefox\\geckodriver.exe");
            driver=new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }
}
