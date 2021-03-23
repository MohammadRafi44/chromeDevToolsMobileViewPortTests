package chromeDevToolsMobileViewPort;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.github.lkkushan101.ChromeDevTools.ChromeDevTools;
import com.github.lkkushan101.ChromeDevTools.ChromeDevTools.Device;

public class ChromeDevToolsMobileViewPortTest {
	
	@Test(priority = 2)
	public void ChromeDevToolsMobileViewPortTest_01() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(ChromeDevTools.MobileEmulation(Device.iPadMini));
		driver.get("https://www.taqat.sa/");
		Thread.sleep(2000);
		driver.close();
	}

	@Test(priority = 1)
	public void ChromeDevToolsMobileViewPortTest_02() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(ChromeDevTools.MobileEmulation(600,300));
		driver.get("https://www.taqat.sa/");
		Thread.sleep(2000);
		driver.close();
		
	}
	
	@Test(priority = 3)
	public void ChromeDevToolsMobileViewPortTest_03() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(ChromeDevTools.MobileEmulation(900,900));
		driver.get("https://www.google.in/");
		Thread.sleep(2000);
		driver.close();
		
	}
}
