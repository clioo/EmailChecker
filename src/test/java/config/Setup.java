package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Setup {
	public static WebDriver driver;
	static String chromePath = System.getProperty("user.dir") + "/drivers/chromedriver76.exe";
	
	@BeforeSuite
	public static void setBrowser() {
	System.setProperty("webdriver.chrome.driver", chromePath);
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1569376946&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fRpsCsrfState%3d149a1292-4780-fe60-ac68-bf197a2229f5&id=292841&aadredir=1&whr=hotmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");  // se supone que el navigate espera
	// hasta que termine de cargar la pagina, en vez del get
	driver.manage().window().maximize();
	
	}
	
	@AfterSuite
	public void closeBrowser() {
		//driver.close();
	}
	
}