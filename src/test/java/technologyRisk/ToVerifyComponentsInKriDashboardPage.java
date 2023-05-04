package technologyRisk;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyComponentsInKriDashboardPage extends BaseClass {
	public int value = 1;

	@Test
	public void tableHeader() {
		hrmPg.getTechnologyRiskAssessmentText().click();
		basePg.getKriDashboardLeftNavBar().click();

		// Verifying Page title text
		String pageText = dashboardpg.getPageHeader().getText();
		softassert.assertEquals(pageText.contains(data.fromPropertyFile("dashBoardTitle")), true,
				"Page Title is not provided as expectation");
		Reporter.log("Successfully verified page title in dashboard page", true);
		List<WebElement> headerTitle = driver.findElements(By.xpath("//h5[@class='widget-title']"));
		for (WebElement header : headerTitle) {
			softassert.assertEquals(header.getText(), (data.fromPropertyFile("header" + value)),
					"values are not maching");
			value++;
		}
		Reporter.log("Header is matching", true);
	}

}
