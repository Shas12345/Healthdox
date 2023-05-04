package physicalRisk;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class Demo extends BaseClass {
	@Test
	public void graph() throws InterruptedException {
		hrmPg.getTechnologyRiskAssessmentText().click();
		try {

			Reporter.log("1st Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).getText(),
					true);

			Reporter.log("2nd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).getText(),
					true);

			Reporter.log("3rd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).getText(),
					true);

			Reporter.log("4rth Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).getText(),
					true);

			Reporter.log("5th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[5]")).getText(),
					true);

			Reporter.log("6th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[6]")).getText(),
					true);
		} catch (Exception e) {
			driver.navigate().refresh();

			Reporter.log("1st Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).getText(),
					true);

			Reporter.log("2nd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).getText(),
					true);

			Reporter.log("3rd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).getText(),
					true);

			Reporter.log("4rth Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).getText(),
					true);

			Reporter.log("5th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[5]")).getText(),
					true);

			Reporter.log("6th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[6]")).getText(),
					true);

		}
		/*
		 * List<WebElement> graphText =
		 * driver.findElements(By.xpath("//*[local-name()='svg']")); Thread.sleep(5000);
		 * explicit.until(ExpectedConditions.visibilityOfAllElements(graphText)); for
		 * (WebElement text : graphText) { Reporter.log(text.getText()); }
		 */

	}

}
