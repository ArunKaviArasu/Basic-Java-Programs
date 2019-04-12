package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		//Set the chrome driver path
				System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
				
				//Launch chrome browser
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Click on contact us
				driver.findElementByXPath("//a[text()='Contact Us']").click();
				
				/*String s1 = driver.getWindowHandle();
				
				System.out.println(s1);*/
				
				//Initiate Set for for storing multiple windows and that shouldn't be duplicate. that's why Set
				Set<String> allW=driver.getWindowHandles();
				
				//To get the index for windows List is initiated here
				List<String> lst=new ArrayList<>();
				
				//Add all the windows unique string id's to ArrayList
				lst.addAll(allW);
				
				//Switching to 1st window (Child window)
				driver.switchTo().window(lst.get(1));
				
				//Get the title of child window
				String contactusTitle = driver.getTitle();
				
				//Print the child window title
				System.out.println("Contact us Title "+contactusTitle);
				
				//Switch to child window
				driver.switchTo().window(lst.get(0));
				
				//Close the child window
				driver.close();
				
				//Switch to parent or Base window
				driver.switchTo().window(lst.get(1));
				
				//Close the child window
				driver.close();	
				
				
		
				

	}

}
