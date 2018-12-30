import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {

    public static void main(String[] args) {

        // FireFox

        //Cube

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\utyfd\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");

        //Home

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.seleniumhq.org/");

        // Chrome

        //Cube

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\utyfd\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");

        //Home

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver2 = new ChromeDriver();

        driver2.get("https://www.google.com.ua/");




    }

}
