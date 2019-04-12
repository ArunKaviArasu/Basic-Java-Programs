package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	
	public static void main(String[] args) {
		//Set the chrome driver path
				System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
				
				//Launch chrome browser
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//navigate to the respective frame using frame name
				driver.switchTo().frame("iframeResult");
				
				
				//Click on try it button
				driver.findElementByXPath("//button[text()='Try it']").click();
				
				
				//Now navigate to alert box which is a prompt alert box
				Alert myalert=driver.switchTo().alert();
				
				//Enter the text inside the alert
				myalert.sendKeys("Arun");
				
				//Click on OK button in the alert
				myalert.accept();
				
				
				//Get the text from the frame using getText()
				String text=driver.findElementById("demo").getText();
				
				
				//Check whether the text is present inside the frame
				if(text.contains("Arun")) {
					System.out.println("Arun is present inside the frame");
				}
				else {
					System.out.println("It shows error");
				}
				
				
			
				
				
	}

}
