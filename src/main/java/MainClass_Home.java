import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass_Home {

    public static void main(String[] args) {



        // FireFox


        /*System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.seleniumhq.org/");*/


        // Chrome


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize((new Dimension(900,500)));
        // driver.manage().window().maximize();



        driver.get("https://www.google.com.ua/");
        driver.navigate().to("http://asiaworld.cn.ua");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();







    }

}
