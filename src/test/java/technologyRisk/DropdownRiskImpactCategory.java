package technologyRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class DropdownRiskImpactCategory extends BaseClass {

	@Test
	public void riskImpactCatrgoryDropdownOptionInTechnologyRisk() {
		hrmPg.getTechnologyRiskAssessmentText().click();
		extentTest.info("Successfully clicked on Technology Risk Assessment text on Hipaa Risk Management Page" );
		// Verifying Risk Assessment section and performing clicking action
		basePg.getRiskAssessmentLeftNavBar().click();
		extentTest.info("Successfully clicked on Risk Assessment on left navigation bar in technology risks page" );
		// Verifying New Risk section and performing clicking action
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getNewRisk()));
		softassert.assertEquals(basePg.getNewRisk().isDisplayed() ,true,
				"New Risk section is not provided in left navigation bar in technology risks page");
		basePg.getNewRisk().click();
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("RiskImpactCategory_chosen")));
		basePg.getRiskImpactDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver ,"Risk Impact Category","Technology");
	}

}
