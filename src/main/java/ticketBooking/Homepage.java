package ticketBooking;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homepage {
	@Test
	public void loginpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/chennai");
		//driver.switchTo().alert().accept();
		//Thread.sleep(1000);
		driver.findElementById("wzrk-confirm").click();
		driver.findElementByXPath("//a[text()='Movies']").click();
		driver.findElementByXPath("(//span[@class='__checkbox'])[1]").click();
		driver.findElementByXPath("//a[text()='Kaala']").click();
		String movietitle = driver.getTitle();
		System.out.println(movietitle);
		driver.findElementByXPath("//a[@class='showtimes btn _cuatro']").click();
		String showtimes = driver.getTitle();
		System.out.println(showtimes);
		driver.findElementByXPath("//div[text()='21']").click();
		driver.findElementByXPath("(//a[@class='__showtime-link  time_vrcenter '])[5]").click();
		//driver.findElementByXPath("//a[@id='btnPopupOK']").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("//ul[@id='popQty']/li[@id='pop_1']").click();
		driver.findElementByXPath("//div[contains(text(),'Select Seats')]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@id='B_1_07']/a[text()='T28']").click();

		driver.findElementByXPath("//a[@id='btmcntbook']").click();
		//driver.findElementById("shmticket").click();
		Thread.sleep(1000);
		//driver.findElementByXPath("//div[@id='shmticket']/input[@id='mticket']").click();
		driver.findElementByXPath("//a[@id='payLat']").click();
		driver.findElementByLinkText("Continue").click();
		WebElement errEmail = driver.findElementById("errDiv_Email");
		if(errEmail.isDisplayed()) {
			System.out.println(errEmail);
		}
		driver.findElementById("txtEmail").sendKeys("kevinchris@gmail.com");
		driver.findElementById("txtMobile").sendKeys("9092316448");
		driver.findElementByLinkText("Continue").click();
	}
}
