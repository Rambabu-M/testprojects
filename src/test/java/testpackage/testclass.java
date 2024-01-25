package testpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
	
	 public static void main(String[] args) {
	        // Setup WebDriverManager for Chrome
	        WebDriverManager.chromedriver().setup();

	        // Create an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();
          
	        // Navigate to the desired URL
	        driver.get("https://connectors.cbwpayments.com/ledgermaster/#/login");
 

	        // Close the browser
	      //  driver.quit();
	    }

}
