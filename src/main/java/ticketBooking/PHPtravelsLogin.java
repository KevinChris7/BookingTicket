package ticketBooking;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PHPtravelsLogin {
	@Test
	public void loginTo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		driver.findElementByXPath("(//a[@class='btn btn-primary btn-lg btn-block'])[1]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String numWindowHandles:windowHandles) {
			System.out.println(numWindowHandles);
		}
		List<String> WinList=new ArrayList<String>();
		WinList.addAll(windowHandles);
		driver.switchTo().window(WinList.get(1));
		System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='select2-choice select2-default'])[1]"))).sendKeys("Melbourne");
		driver.findElementByXPath("(//button[@type='submit'])[1]").click();
		driver.findElementByXPath("//a[contains(text(),'Flights')]").click();
		WebElement dd1List = driver.findElementByName("cabinclass");
		//System.out.println(dd1List);

		Select dd1=new Select(dd1List);
		List<WebElement> options = dd1.getOptions();
		for (WebElement eachOption : options) {
			System.out.println(eachOption.getText());

		}
		dd1.selectByIndex(1);

		Thread.sleep(1000);
		dd1.selectByValue("economy");
		driver.findElementByXPath("(//button[@id='bookbtn'])[1]").click();
		driver.findElementByName("firstname").sendKeys("kevin");
		driver.findElementByName("lastname").sendKeys("christopher");
		driver.findElementByName("email").sendKeys("kevin@gmail.com");
		driver.findElementByName("confirmemail").sendKeys("kevin@gmail.com");
		driver.findElementByName("phone").sendKeys("9092316449");
		driver.findElementByName("address").sendKeys("17th street");
		driver.findElementByXPath("//button[text()='CONFIRM THIS BOOKING']").click();
		String billingtitle = driver.getTitle();
		System.out.println(billingtitle);
	}

}
