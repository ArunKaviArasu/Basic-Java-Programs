package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafGround {

	public static void main(String[] args) {
		//Set the chrome driver path
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		
		//Launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click on alert box button
		driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		
		Alert al=driver.switchTo().alert();
		
		String text = al.getText();
		
		System.out.println(text);

	}

}
