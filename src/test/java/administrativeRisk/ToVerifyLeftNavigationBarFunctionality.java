package administrativeRisk;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Generic_Liberary.BaseClass;

public class ToVerifyLeftNavigationBarFunctionality extends BaseClass {

	@Test
	public void AdministrativeRiskNavBar() {
		hrmPg.getAraImage().click();
		softassert.assertEquals(basePg.getKriDashboardLeftNavBar().isDisplayed(), true,
				"KRI Dashboard section is not provided in left navigation bar for Administrative Risk Assessment");
		Reporter.log("Verifyed KRI Dashboard section in left navigation bar for Administrative Risk Assessment", true);

		softassert.assertEquals(basePg.getRiskAssessmentLeftNavBar().isDisplayed(), true,
				"Risk Assessment is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getRiskAssessmentLeftNavBar().click();
		Reporter.log("Successfully clicked on Risk Assessment in left navigation bar", true);
		// Verifying and clicking on New Risk
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getNewRisk()));
		softassert.assertEquals(basePg.getNewRisk().isDisplayed(), true,
				"New Risk option is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getNewRisk().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getRiskAssessmentTable()));
		Reporter.log(
				"Successfully verifyed on clicking New risk in left navigation bar navigated to New Administrative Risk Assessment Page",
				true);
		basePg.getRiskAssessmentLeftNavBar().click();
		// Verifying and clicking on Edit Risk
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getEditRisk()));
		softassert.assertEquals(basePg.getEditRisk().isDisplayed(), true,
				"Edit Risk option is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getEditRisk().click();
		explicit.until(ExpectedConditions.visibilityOf(adminPg.getListHeader()));
		Reporter.log(
				"Successfully verifyed on clicking Edit risk in left navigation bar navigated to Edit Administrative Risk Assessment Page",
				true);
		basePg.getRiskAssessmentLeftNavBar().click();
		// Verifying and clicking on View Risk
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getViewRisk()));
		softassert.assertEquals(basePg.getViewRisk().isDisplayed(), true,
				"View Risk option is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getViewRisk().click();
		// Verifying and clicking on All Risk under View Risk
		explicit.until(ExpectedConditions.visibilityOf(basePg.getAllRisk()));
		softassert.assertEquals(basePg.getAllRisk().isDisplayed(), true,
				"All Risk option is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getAllRisk().click();
		explicit.until(ExpectedConditions.visibilityOf(adminPg.getListHeader()));
		Reporter.log(
				"Successfully verifyed on clicking All risk in left navigation bar navigated to All Administrative Risk Assessment Page",
				true);
		// Verifying and clicking on open Risk under View Risk
		basePg.getRiskAssessmentLeftNavBar().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getViewRiskArrow()));
		basePg.getViewRiskArrow().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getOpenRisk()));
		softassert.assertEquals(basePg.getOpenRisk().isDisplayed(), true,
				"Open Risk option is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getOpenRisk().click();
		explicit.until(ExpectedConditions.visibilityOf(adminPg.getListHeader()));
		Reporter.log(
				"Successfully verifyed on clicking Open risk in left navigation bar navigated to All Administrative Risk Assessment Page",
				true);
		// Verifying and clicking on In progress Risk under View Risk
		basePg.getRiskAssessmentLeftNavBar().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getViewRiskArrow()));
		basePg.getViewRiskArrow().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getInProgressRisk()));
		softassert.assertEquals(basePg.getInProgressRisk().isDisplayed(), true,
				"In Progress Risk option is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getInProgressRisk().click();
		explicit.until(ExpectedConditions.visibilityOf(adminPg.getListHeader()));
		Reporter.log(
				"Successfully verifyed on clicking In Progress risk in left navigation bar navigated to All Administrative Risk Assessment Page",
				true);
		// Verifying and clicking on Closed Risk under View Risk
		basePg.getRiskAssessmentLeftNavBar().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getViewRiskArrow()));
		basePg.getViewRiskArrow().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getClosedRisk()));
		softassert.assertEquals(basePg.getClosedRisk().isDisplayed(), true,
				"Closed Risk option is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getClosedRisk().click();
		explicit.until(ExpectedConditions.visibilityOf(adminPg.getListHeader()));
		Reporter.log(
				"Successfully verifyed on clicking Closed risk in left navigation bar navigated to All Administrative Risk Assessment Page",
				true);
		// Verifying and clicking on Reports
		softassert.assertEquals(basePg.getReports().isDisplayed(), true,
				"Reports section is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getReports().click();
		// Verifying and clicking on Risk Excel Reports option under Reports
		softassert.assertEquals(basePg.getRiskExcelReports().isDisplayed(), true,
				"Risk Excel Reports option is not provided under Reports section in left navigation bar for Administrative Risk Assessment");
		basePg.getRiskExcelReports().click();
		Reporter.log("Error on clicking on Risk Excel reports in left navigation bar Server error is displayed", true);

		// Verifying and clicking on Risk PDF Reports option under Reports
		basePg.getReports().click();
		softassert.assertEquals(basePg.getRiskPdfReports().isDisplayed(), true,
				"Risk PDF Reports option is not provided under Reports section in left navigation bar for Administrative Risk Assessment");
		basePg.getRiskPdfReports().click();
		Reporter.log("Error on clicking on Risk Excel reports in left navigation bar Server error is displayed", true);

		// Verifying and clicking on Self Risk Assessment Reports option under Reports
		basePg.getReports().click();
		softassert.assertEquals(basePg.getSelfRiskAssessmentReports().isDisplayed(), true,
				"Risk PDF Reports option is not provided under Reports section in left navigation bar for Administrative Risk Assessment");
		basePg.getRiskPdfReports().click();
		Reporter.log("Error on clicking on Risk Excel reports in left navigation bar Server error is displayed", true);

		// Verifying and clicking on KRI PDF option under Reports
		basePg.getReports().click();
		softassert.assertEquals(basePg.getKrisInPdf().isDisplayed(), true,
				"KRI PDF Reports option is not provided under Reports section in left navigation bar for Administrative Risk Assessment");
		basePg.getKrisInPdf().click();
		Reporter.log("Error on clicking on Risk Excel reports in left navigation bar Server error is displayed", true);

		// Verifying and clicking on System Configuration section in left navigation
		// bar.
		softassert.assertEquals(basePg.getSystemConfiguration().isDisplayed(), true,
				"System Configuration section is not provided in left navigation bar for Administrative Risk Assessment");
		basePg.getSystemConfiguration().click();
		// Verifying and clicking on Update Self Risk Assessment Questions option under
		// System Configuration
		softassert.assertEquals(basePg.getUpdateSelfRiskAssessmentQuestions().isDisplayed(), true,
				"Update Self Risk Assessment Questions option is not provided under System Configuration section in left navigation bar for Administrative Risk Assessment");
		basePg.getUpdateSelfRiskAssessmentQuestions().click();
		Reporter.log(
				"Sucessfully navigated to self risk Assessment Question page on clicking on Update Self Risk Assessment Question on left navigation bar",
				true);
		// Checking collapse functionality
		softassert.assertEquals(basePg.getCollapseIcon().isDisplayed(), true,
				"Collapse icon is not provided under System Configuration section in left navigation bar for Administrative Risk Assessment");
		basePg.getCollapseIcon().click();
		Reporter.log("Successfully clicked on collapse icon", true);
	}

}
