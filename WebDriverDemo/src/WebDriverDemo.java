import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","./resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		
//		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.lanbide.euskadi.eus/inicio-lanbide/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        
        
        // launch Fire fox and direct it to the Base URL
        driver.navigate().to(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        //driver.close();

	}

}
