import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass_Home {

    public static void main(String[] args) {



        // FireFox


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.seleniumhq.org/");


        // Chrome


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver2 = new ChromeDriver();

        driver2.get("https://www.google.com.ua/");







    }

}