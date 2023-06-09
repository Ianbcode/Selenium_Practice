import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ian/Documents/GitHub/Selenium_Practice/Java_Practice_Selenium/src/drivers/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:/Users/kahraman.bayraktar/source/Repos/BOUNSWE/SWE550/demo/chromedriver.exe");
        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to https://deltaco.com
        driver.get("https://deltaco.com");

        // Print Website Title
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}
