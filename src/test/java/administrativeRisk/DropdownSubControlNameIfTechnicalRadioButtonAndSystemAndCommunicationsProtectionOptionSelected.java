package administrativeRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class DropdownSubControlNameIfTechnicalRadioButtonAndSystemAndCommunicationsProtectionOptionSelected
		extends BaseClass {
	@Test
	public void subControlNameDropdown() {
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

		// Clicking on Management Radio Button
		explicit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='lbl'])[2]")));
		driver.findElement(By.xpath("(//span[@class='lbl'])[2]")).click();

		// Clicking on Control Name drop down
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("ControlName_chosen")));
		js.executeScript("arguments[0].scrollIntoView(false)", basePg.getResponsibleLabel());
		basePg.getControlNameDropdown().click();

		// selecting Certification, Accreditation, and Security Assessments option
		try {
			driver.findElement(By.xpath("//li[contains(text(),'Certification, Accreditation, and Security Assessments')]"))
					.click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//li[contains(text(),'Certification, Accreditation, and Security Assessments')]"))
					.click();
		}
		basePg.getSubControlNameDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver, "Technical System and Communications Protection Sub Control Name",
				"Administrative");
	}

}
