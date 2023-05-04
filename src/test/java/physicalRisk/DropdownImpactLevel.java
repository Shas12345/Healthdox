package physicalRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class DropdownImpactLevel extends BaseClass {
	@Test
	public void impactLevelDropdown() {
		hrmPg.getPhysicalRiskAssessmentText().click();
		Reporter.log("Successfully clicked on Physical Risk Assessment text on Hipaa Risk Management Page", true);
		// Verifying Risk Assessment section and performing clicking action
		basePg.getRiskAssessmentLeftNavBar().click();
		Reporter.log("Successfully clicked on Risk Assessment on left navigation bar in physical risks page", true);
		// Verifying New Risk section and performing clicking action
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getNewRisk()));
		softassert.assertEquals(basePg.getNewRisk().isDisplayed(), true,
				"New Risk section is not provided in left navigation bar in technology risks page");
		basePg.getNewRisk().click();
		js.executeScript("arguments[0].scrollIntoView(true)", basePg.getImpactLevelLabel());
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("ImpactLevel_chosen")));
		basePg.getImpactLevelDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver, "Impact Level","Physical");
	}

}
