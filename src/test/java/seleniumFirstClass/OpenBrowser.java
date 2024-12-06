package seleniumFirstClass;

import org.testng.annotations.Test;

public class OpenBrowser extends BaseDriver{
	
	@Test
	public void openUrl() throws InterruptedException {
		
		drive.get("https://www.rokomari.com/book");
		Thread.sleep(5000);
		
	}
}
