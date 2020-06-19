package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	WebDriver driver;
	
	String testUser = "fbt-tester";
	String testUserPW = "HdXWyVowcUFrcGaMjsofGGJ4";
	String webstoreSandboxURL = "webstore.fbot-sandbox.me/";
	
	String loginURL = "https://" + testUser + ":" + testUserPW + "@" + webstoreSandboxURL;

	String sharerEmail = "JohnD392@yahoo.com";
	String friendEmail = "nimish@friendbuy.com";
	
	String sharerEmailBoxID = "bw";
	String startSharingID = "bx";
	String shareToID = "dw";
	String sendEmailID = "c5";
	
	//Typically we would like to use IDs, but these seem to change dynamically so we'll use text for now
	//String get20btnID = "fbt-ribbon-?????";
	String get20Text = "Get $20";
	
	public Login(WebDriver driver) {
		this.driver = driver;
		driver.get(loginURL);
	}
	
	public void clickGet20() throws InterruptedException {
		Thread.sleep(3000); //Would wait for obstructing element to disappear, sleeping to save time for coding challenge
		WebElement get20 = driver.findElement(By.xpath("//*[text()='" + get20Text + "']"));
		get20.click();
		Thread.sleep(3000); //Same here, wait for iframe to load. Usually I write some functions to assist with these types of waits
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
	}
	
	public void enterDefaultSharerEmail() {
		WebElement sharerEmailEle = driver.findElement(By.id(sharerEmailBoxID));
		sharerEmailEle.sendKeys(sharerEmail);
	}
	
	public void submitSharerEmail() {
		WebElement sharerEmailSubmitEle = driver.findElement(By.id(startSharingID));
		sharerEmailSubmitEle.click();
	}
	
	public void enterFriendEmail() {
		WebElement toFriendEle = driver.findElement(By.id(shareToID));
		toFriendEle.sendKeys(friendEmail);
	}
	
	public void sendFriendEmail() {
		WebElement sendEmail = driver.findElement(By.id(sendEmailID));
		sendEmail.click();
	}
	
	

	
}
