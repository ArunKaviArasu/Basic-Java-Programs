package week5.day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

//@Listeners(extentITestListenerClassAdapter.class)
public class BaseUtil {
	public String excelFileName;
	public ChromeDriver driver;
	
	@BeforeMethod
	@Parameters({"url","username","password"})
	public void login(String url,String uname,String pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException{
		
		return ReadExcel.readExcelData(excelFileName);
		
	}
	
	
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
