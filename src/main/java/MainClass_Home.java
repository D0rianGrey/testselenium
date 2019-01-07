import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass_Home {

    public static void main(String[] args) {



        // FireFox


        /*System.setProperty("webdriver.gecko.driver", "C:\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.seleniumhq.org/");*/


        // Chrome


        System.setProperty("webdriver.chrome.driver", "C:\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().setSize((new Dimension(900,500)));

        driver.get("http://en.wikipedia.org");

        WebElement link = driver.findElement(By.linkText("Log in"));
        WebElement link2 = driver.findElement(By.partialLinkText("Donate"));
        WebElement searchField = driver.findElement(By.name("go"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement searchform = driver.findElement(By.id("searchform"));
        WebElement input = driver.findElement(By.tagName("input"));
        WebElement element = driver.findElement(By.cssSelector("#searchInput"));
        WebElement logo= driver.findElement(By.xpath("//a[@title='Visit the main page']"));



        driver.quit();


        // driver.manage().window().maximize();



        /*driver.get("https://www.google.com.ua/");
        driver.navigate().to("http://asiaworld.cn.ua");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl()); */

        driver.quit();







    }

}
