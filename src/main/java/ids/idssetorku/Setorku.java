package ids.idssetorku;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Test
public class Setorku extends BaseLogin {

	public void bulkUpload() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div[2]/div[2]/ul/li[2]/div")));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div[2]/div[2]/ul/li[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div[2]/div[2]/ul/li[2]/div/div[2]/span"))
				.click();
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div[2]/div[2]/ul/div/div/div/li[1]/div/div/span"))
				.click();

		// Add Filter
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/button[1]"))
				.click();

		// Select Status Waiting
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-status\"]/div[3]/ul/li[1]")).click();

		// Apply Filter
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/button[2]")).click();

		// Select Status Generated
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/button[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-status\"]/div[3]/ul/li[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/button[2]")).click();

		// AddDataUpload
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/button[2]"))
				.click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div/input"))
				.sendKeys("NewDataUpload01");

		// Submit Data Upload
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/button[2]")).click();
	}

	public void partnerTransaction() throws InterruptedException {

		String username = "ryobranch";

		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div[2]/div[2]/ul/div/div/div/li[2]/div/div/span"))
				.click();

		// Add Filter
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/button[1]"))
				.click();

		// Input Tracking Reff
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/label")));
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/div/input")).sendKeys("Reff040524");

		// Input Payment Code
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/div/input")).sendKeys("Pay001");

		// Input Username
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[4]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[4]/div/input")).sendKeys(username);

		// Input Receipt Number
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[5]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[5]/div/input")).sendKeys("Rcp03052024");

		// Apply
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[6]/button[2]")).click();

		// Export Data Partner Transaction List
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/button[2]"))
				.click();
	}
}
