package technologyRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Generic_Liberary.BaseClass;

public class DropdownThreatSource extends BaseClass {

	@Test
	public void threatSourceDropdownInTechnologyRisk() {
		hrmPg.getTechnologyRiskAssessmentText().click();
		Reporter.log("Successfully clicked on Technology Risk Assessment text on Hipaa Risk Management Page", true);
		extentTest.info("Successfully clicked on Technology Risk Assessment text on Hipaa Risk Management Page");
		// Verifying Risk Assessment section and performing clicking action
		basePg.getRiskAssessmentLeftNavBar().click();
		Reporter.log("Successfully clicked on Risk Assessment on left navigation bar in technology risks page", true);
		extentTest.info("Successfully clicked on Risk Assessment on left navigation bar in technology risks page");
		// Verifying New Risk section and performing clicking action
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getNewRisk()));
		softassert.assertEquals(basePg.getNewRisk().isDisplayed(), true,
				"New Risk section is not provided in left navigation bar in technology risks page");
		basePg.getNewRisk().click();
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("ThreatSource_chosen")));
		basePg.getThreadSourceDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver, "Threat Source", "Technology");
		extentTest.pass("The Dropdown options are matching");
	}
}
