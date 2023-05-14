package administrativeRisk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyComponentsInKriDashboardPage extends BaseClass {
	public int value = 1;

	@Test
	public void toVerifyComponentsInKriDashboardPage() {
		hrmPg.getAdministrativeRiskAssessmentText().click();
		basePg.getKriDashboardLeftNavBar().click();

		// Verifying Page title text
		String pageText = dashboardpg.getPageHeader().getText();
		softassert.assertEquals(pageText, data.fromPropertyFile("dashBoardTitleInPhysicalInAdministrative"),
				"Page Title is not provided as expectation");
		Reporter.log("Successfully verified page title in dashboard page", true);
		extentTest.info("Successfully verified page title in dashboard page");
		List<WebElement> headerTitle = driver.findElements(By.xpath("//h5[@class='widget-title']"));
		for (WebElement header : headerTitle) {
			softassert.assertEquals(header.getText(), (data.fromPropertyFile("header" + value)),
					"values are not maching");
			value++;
		}
		Reporter.log("Header is matching", true);
		extentTest.info("Header is matching");

		try {

			extentTest.info("1st Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).getText());
			Reporter.log("1st Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).getText());
		} catch (Exception e) {
			driver.navigate().refresh();
			extentTest.info("1st Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).getText());
			Reporter.log("1st Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).getText());

		}
		try {
			extentTest.info("2nd Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).getText());
			Reporter.log("2nd Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).getText(),
					true);
		} catch (Exception e) {
			driver.navigate().refresh();
			extentTest.info("2nd Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).getText());
			Reporter.log("2nd Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).getText(),
					true);
		}
		try {
			extentTest.info("3rd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).getText());
			Reporter.log("3rd Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).getText(),
					true);
		} catch (Exception e) {
			driver.navigate().refresh();
			extentTest.info("3rd Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).getText());
			Reporter.log("3rd Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).getText(),
					true);

		}
		try {
			extentTest.info("4th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).getText());
			Reporter.log("4th Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).getText(),
					true);
		} catch (Exception e) {
			driver.navigate().refresh();
			extentTest.info("4th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).getText());
			Reporter.log("4th Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).getText(),
					true);
		}

		try {
			extentTest.info("5th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[5]")).getText());
			Reporter.log("5th Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[5]")).getText(),
					true);
		} catch (Exception e) {
			driver.navigate().refresh();
			extentTest.info("5th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[5]")).getText());
			Reporter.log("5th Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[5]")).getText(),
					true);
		}
		try {
			extentTest.info("6th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[6]")).getText());
			Reporter.log("6th Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[6]")).getText(),
					true);
		} catch (Exception e) {
			driver.navigate().refresh();
			extentTest.info("6th Graph Data" + driver.findElement(By.xpath("(//*[local-name()='svg'])[6]")).getText());
			Reporter.log("6th Graph Data " + driver.findElement(By.xpath("(//*[local-name()='svg'])[6]")).getText(),
					true);
		}
	}
}
