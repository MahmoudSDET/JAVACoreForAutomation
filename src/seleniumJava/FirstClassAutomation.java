package seleniumJava;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstClassAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		RemoteWebDriver driver_2=new FirefoxDriver();
		WebDriver driver_3=new EdgeDriver();
		// 
	//	WebDriver driver_8=new RemoteWebDriver();
		
  
		
		driver_2.get("https://www.guru99.com/first-webdriver-script.html");
	 
		
		

	}

}
