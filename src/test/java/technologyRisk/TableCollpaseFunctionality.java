package technologyRisk;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class TableCollpaseFunctionality extends BaseClass {

	@Test
	public void verifyTableCollapseOnTechnologyRiskAssessmentPage() {
		Assert.assertEquals(hrmPg.getTechnologyRiskAssessmentText().isDisplayed(), true,
				"Technology Risk Assessment Text is not provided in HRM Page");
		hrmPg.getTechnologyRiskAssessmentText().click();
		Reporter.log("Successfully clicked on Technology Risk Assessment text on Hipaa Risk Management Page",true);
		// Verifying Risk Assessment section and performing clicking action
		Assert.assertEquals(basePg.getRiskAssessmentLeftNavBar().isDisplayed(), true,
				"Risk Assessment section is not provided in left navigation bar in technology risks page");
		basePg.getRiskAssessmentLeftNavBar().click();
		Reporter.log("Successfully clicked on Risk Assessment on left navigation bar in technology risks page",true);                                        
		// Verifying New Risk section and performing clicking action
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getNewRisk()));
		Assert.assertEquals(basePg.getNewRisk().isDisplayed(), true,
				"New Risk section is not provided in left navigation bar in technology risks page");
		basePg.getNewRisk().click();
		Reporter.log("Successfully clicked on New Risk under Risk Assessment section in technology risk page",true);
		explicit.until(ExpectedConditions.visibilityOf(basePg.getRiskAssessmentTable()));
		// Verifying the functionality of table section 
		Assert.assertEquals(basePg.getRiskAssessmentTable().isDisplayed(), true,
				"Risk Assessment table is not provided in New Technology Risk Page");
		basePg.getRiskAssessmentTable().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getRiskAssessmentTable()));
		basePg.getRiskAssessmentTable().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getRiskAssessmentTable()));
		Assert.assertEquals(basePg.getRiskTreatmentTable().isDisplayed(), true,
				"Risk Treatment table is not provided in New Technology Risk Page");
		basePg.getRiskTreatmentTable().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getRiskTreatmentTable()));
		basePg.getRiskAssessmentTable().click();
		Assert.assertEquals(basePg.getRiskResponseTable().isDisplayed(), true,
				"Risk Response table is not provided in New Technology Risk Page");
		basePg.getRiskResponseTable().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getRiskResponseTable()));
		basePg.getRiskResponseTable().click();
		Reporter.log("Successfully verifyed the functionality of table collapsible feature",true);

	}

}
