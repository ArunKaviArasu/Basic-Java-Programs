package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws Exception {
		
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("dd");
		String cDateStr=d1.format(d);
		//Convert current date to integer to add 1 (Tomorrow date)
		int cDate=Integer.parseInt(cDateStr)+1;
		//Convert tomorrow date to string
		String addDate=Integer.toString(cDate);
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		
		//Launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.zoomcar.com/chennai/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click on start your	
		Thread.sleep(3000);
		
		driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
		
		//Click on Thuraipakkam
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[@class='component-popular-locations']/div[2]").click();
		
		//Click on next button
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[@class='proceed']").click();
		
	
		//Click on tomorrow date
		
		driver.findElementByXPath("//div[contains(text(),'"+addDate+"')]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		//Click on Done button
		Thread.sleep(3000);	
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		List<WebElement> carsPrice = driver.findElementsByXPath("//div[@class='price']");
		
		System.out.println("Number of cars present in the list" +carsPrice);
		
		List<WebElement> CarNameList = driver.findElementsByXPath("//div[@class='details']/h3");
		
		List<Integer> price=new ArrayList<>();
		
		Map<Integer,String> carnew=new TreeMap<>();
		
		
		for(int i=0;i<carsPrice.size();i++) {
			String carsPriceText=carsPrice.get(i).getText();
			String car=carsPriceText.replaceAll("[^0-9]", "");
			String carNameList=CarNameList.get(i).getText();
			price.add(Integer.parseInt(car));
			carnew.put(Integer.parseInt(car),carNameList );
			
		}
		
		Collections.sort(price);
		
		Integer hValue=price.get(price.size()-1);
		System.out.println("Maximum price" + hValue);
		String carNames=carnew.get(price.get(price.size()-1));
		System.out.println("CarNames" + carNames);
		
		driver.findElementByXPath("((//h3[text()='"+carNames+"']/parent::div)/following::div//button)[1]").click();

	}

}
