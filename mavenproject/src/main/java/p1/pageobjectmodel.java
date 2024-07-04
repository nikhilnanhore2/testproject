package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageobjectmodel {
	public static void main(String[]args) {
	
		
		
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new  ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		
		
		
		
	
	
	

}
}
