package administrativeRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class DropdownResponsibleDept extends BaseClass {
	@Test
	public void responsibleDeptDropdown() {
		hrmPg.getAdministrativeRiskAssessmentText().click();
		Reporter.log("Successfully clicked on Administrative Risk Assessment text on Hipaa Risk Management Page", true);
		// Verifying Risk Assessment section and performing clicking action
		basePg.getRiskAssessmentLeftNavBar().click();
		Reporter.log("Successfully clicked on Risk Assessment on left navigation bar in Administrative risks page", true);
		// Verifying New Risk section and performing clicking action
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getNewRisk()));
		softassert.assertEquals(basePg.getNewRisk().isDisplayed(), true,
				"New Risk section is not provided in left navigation bar in Administrative risks page");
		basePg.getNewRisk().click();
		js.executeScript("arguments[0].scrollIntoView(true)", basePg.getResponsibleDeptLabel());
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("ResponsibleDepartment_chosen")));
		basePg.getResponsibleDebtDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver, "Responsible Dept","Administrative");
	}

}
