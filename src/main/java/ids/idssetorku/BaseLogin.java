package ids.idssetorku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {

	WebDriver driver;
	String username = "ryobranch";
	String password = "Ryo@1234";

	@BeforeTest
	public void setUpLogin() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stg-sob.ids.id/auth/login?callbackUrl=%2Fdashboard");

		driver.findElement(By.xpath("//*[@id=\":R4alat1b36:\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div/form/div/button")).click();

	}

	@AfterTest
	public void TearDown() {
		driver.findElement(By.xpath("/html/body/div/div/div/div/header/div/div[2]/div/button/p")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li")).click();
		driver.close();
	}
}
