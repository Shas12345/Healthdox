package technologyRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class DropdownSubControlNameIfOperationalRadioButtonAndMediaProtectionOptionSelected extends BaseClass {
	@Test
	public void subControlNameDropdown() {
		hrmPg.getTechnologyRiskAssessmentText().click();

		Reporter.log("Successfully clicked on Technology Risk Assessment text on Hipaa Risk Management Page", true);
		// Verifying Risk Assessment section and performing clicking action
		basePg.getRiskAssessmentLeftNavBar().click();
		Reporter.log("Successfully clicked on Risk Assessment on left navigation bar in technology risks page", true);
		// Verifying New Risk section and performing clicking action
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getNewRisk()));
		softassert.assertEquals(basePg.getNewRisk().isDisplayed(), true,
				"New Risk section is not provided in left navigation bar in technology risks page");
		basePg.getNewRisk().click();

		// Clicking on Operational Radio Button
		explicit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='lbl'])[3]")));
		driver.findElement(By.xpath("(//span[@class='lbl'])[3]")).click();

		// Clicking on Control Name drop down
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("ControlName_chosen")));
		js.executeScript("arguments[0].scrollIntoView(false)", basePg.getResponsibleLabel());
		basePg.getControlNameDropdown().click();

		// selecting Media Protection option
		driver.findElement(By.xpath("//li[contains(text(),'Media Protection')]")).click();
		basePg.getSubControlNameDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver, "Operational Media Protection Sub Control Name",
				"Technology");
	}

}
