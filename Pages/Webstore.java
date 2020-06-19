package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webstore {
	WebDriver driver;
	
	String webstoreURL = "https://webstore.fbot-sandbox.me/dev/email.html#no-iframe";
	String merchantUUID = "555e7441-24d8-4b6d-88ba-67f26c3fed72";
	
	String merchantUUIDTextboxID = "merchantId";
	String emailAddressTextboxID = "email";
	String fromDateTextboxID = "fromDate";
	String toDateTextboxID = "toDate";
	String getLatestEmailID = "searchEmail";
	String referralLinkID = "sharelink";
	
	public Webstore(WebDriver driver) {
		this.driver = driver;
		driver.get(webstoreURL);
	}
	
	public void enterDefaultMerchantUUID() {
		WebElement uuidTextboxEle = driver.findElement(By.id(merchantUUIDTextboxID));
		uuidTextboxEle.clear();
		uuidTextboxEle.sendKeys(merchantUUID);
	}
	
	public void enterEmail(String email) {
		WebElement emailAddressTextboxEle = driver.findElement(By.id(emailAddressTextboxID));
		emailAddressTextboxEle.clear();
		emailAddressTextboxEle.sendKeys(email);
	}
	
	public void enterFromDate(String date) {
		driver.findElement(By.id(fromDateTextboxID)).sendKeys(date);
	}

	public void enterToDate(String date) {
		driver.findElement(By.id(toDateTextboxID)).sendKeys(date);
	}
	
	public void getLatestEmail() {
		driver.findElement(By.id(getLatestEmailID)).click();
	}
	
	public void clickReferral() {
		driver.findElement(By.id(referralLinkID)).click();
	}
	
}
