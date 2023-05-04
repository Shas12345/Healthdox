import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchingDriverControl {
	public void switchDriverControl(WebDriver driver,String ParentWindowId) {
	Set<String> allWindowId=driver.getWindowHandles();
	allWindowId.remove(ParentWindowId)
	for(String windowid:allWindowId) {
		driver.switchTo().window(windowid);
		
	}
		
		
	}

}
