package Test;

import org.junit.*;

import Pages.AwesomeFriend;
import Pages.Login;
import Pages.Webstore;

public class ExampleTest extends BaseTest {
	
	String nimishEmail = "nimish@friendbuy.com";
	
	@Test
	public void testCodingChallenge() throws InterruptedException {
		Login loginPage = new Login(driver);
		loginPage.clickGet20();
		loginPage.enterDefaultSharerEmail();
		loginPage.submitSharerEmail();
		loginPage.enterFriendEmail();
		loginPage.sendFriendEmail();
		
		Webstore webstorePage = new Webstore(driver);
		webstorePage.enterDefaultMerchantUUID();
		webstorePage.enterEmail(nimishEmail);
		webstorePage.enterFromDate("6/18/2020");
		webstorePage.enterToDate("6/20/2020");
		webstorePage.getLatestEmail();
		webstorePage.clickReferral();
		
		//would verify that we land on the correct page
		AwesomeFriend awesomeFriendPage = new AwesomeFriend(driver);
		awesomeFriendPage.setName("Test User");
		awesomeFriendPage.setEmail(nimishEmail);
		awesomeFriendPage.getMyXOff();
		awesomeFriendPage.verifyCode();
	}
}
