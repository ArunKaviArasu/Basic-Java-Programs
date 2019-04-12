package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	
	public void facebooklogin() throws InterruptedException {
		//Set the chrome driver path
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		//Launch chrome browser
		ChromeDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("kavi.jeno@gmail.com");
		
		driver.findElementByXPath("//input[@id='pass']").sendKeys("benny@123");
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		/*ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromerDriver(op);*/
		
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@type='text']").sendKeys("TestLeaf");
		
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		
		//driver.findElementByXPath("//div[text()='Places'])[1]").click();
		
		
		/*if(driver.findElementByLinkText("TestLeaf").isDisplayed()) {
			
			String Like = driver.findElementByXPath(" (//button[@type='submit'])[2]").getText();
			
			System.out.println(Like);
		}*/
		
		//Verify testleaf
		WebElement verifyTestLeaf = driver.findElementByLinkText("TestLeaf");
		String text=verifyTestLeaf.getText();
		
		if(text.contains("TestLeaf")) {
			System.out.println("Name is present-" + text);
		}
		else {
			System.out.println("Name isn't present");
		}
		
		//Verify Like text 
		WebElement likeText = driver.findElementByXPath("(//button[@type='submit'])[2]");
		String texta=likeText.getText();
		if(texta.contains("Liked")) {
			System.out.println("Already liked");
		}
		else {
			likeText.click();
		}
		
		verifyTestLeaf.click();
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is" + pageTitle);
		
		Thread.sleep(8000);
		
		//Check for total likes
		WebElement totalLikes = driver.findElementByXPath("//img[@alt='Highlights info row image']/following::div[2]");
		String textb = totalLikes.getText();
		
		System.out.println("Total likes" + textb);
		
		//Removing unwanted things in Likes
		String textc = textb.replaceAll("[^0-9]", "");
		
		System.out.println(textc);
		
		driver.close();
		
		
				
		
		

}

	public static void main(String[] args) throws InterruptedException {
		
		Facebook f1=new Facebook();
		f1.facebooklogin();
	}
	
			
}
