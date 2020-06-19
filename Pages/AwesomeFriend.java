package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AwesomeFriend {
	WebDriver driver;
	
	String nameID = "l";
	String emailID = "m";
	String getMyXOffID = "o";
	String codeID = "h";
	
	String expectedCode = "A97B23E4-FE06-410C-8642-CABB0540E6C2";
	
	public AwesomeFriend(WebDriver driver) {
		this.driver = driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	}
	
	public void setName(String name) {
		driver.findElement(By.id(nameID)).sendKeys(name);
	}
	
	public void setEmail(String email) {
		driver.findElement(By.id(emailID)).sendKeys(email);
	}
	
	public void getMyXOff() {
		driver.findElement(By.id(getMyXOffID)).click();
	}

	public void verifyCode() {
		String code = driver.findElement(By.id(codeID)).getText();
		Assert.assertEquals(code.toLowerCase(), expectedCode.toLowerCase());
	}
	
}
