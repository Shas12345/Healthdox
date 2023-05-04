package administrativeRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class DropdownSubControlNameIfTechnicalRadioButtonAndAccessControlOptionSelected  extends BaseClass{
	@Test
	public void	subControlNameDropdown() {
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
		
		//Clicking on Management Radio Button
		explicit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='lbl'])[1]")));
		driver.findElement(By.xpath("(//span[@class='lbl'])[1]")).click();
		
		//Clicking on Control Name drop down
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("ControlName_chosen")));
		js.executeScript("arguments[0].scrollIntoView(false)", basePg.getResponsibleLabel());
		basePg.getControlNameDropdown().click();
		driver.findElement(By.xpath("//li[text()='Access Control']")).click();
		basePg.getSubControlNameDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver, "Technical Access Control Sub Control Name","Administrative");
	}

}


