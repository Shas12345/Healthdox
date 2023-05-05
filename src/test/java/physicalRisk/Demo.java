package physicalRisk;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class Demo extends BaseClass {
	@Test
	public void graph() throws InterruptedException {
		hrmPg.getTechnologyRiskAssessmentText().click();
	driver.findElement(By.id("chas")).click();
		//driver.findElement(By.xpath("//div[@class='shas']")).click();
		
		try {

			extentTest.info("1st Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).getText());

			extentTest.info("2nd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).getText());

			extentTest.info("3rd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).getText()
					);

			extentTest.info("4rth Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).getText()
					);

			extentTest.info("5th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[5]")).getText()
					);

			extentTest.info("6th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[6]")).getText()
					);
		} catch (Exception e) {
			driver.navigate().refresh();

			extentTest.info("1st Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).getText()
					);

			extentTest.info("2nd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).getText()
					);

			extentTest.info("3rd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).getText()
					);

			extentTest.info("4rth Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).getText()
					);

			extentTest.info("5th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[5]")).getText()
					);

			extentTest.info("6th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[6]")).getText()
					);
			

		}
		/*
		 * List<WebElement> graphText =
		 * driver.findElements(By.xpath("//*[local-name()='svg']")); Thread.sleep(5000);
		 * explicit.until(ExpectedConditions.visibilityOfAllElements(graphText)); for
		 * (WebElement text : graphText) { extentTest.info(text.getText()); }
		 */

	}

}
