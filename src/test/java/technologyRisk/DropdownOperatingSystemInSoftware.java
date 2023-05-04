package technologyRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class DropdownOperatingSystemInSoftware extends BaseClass{
	@Test
	public void operatingSystemDropdown() {
		hrmPg.getTechnologyRiskAssessmentText().click();
		Reporter.log("Successfully clicked on Technology Risk Assessment text on Hipaa Risk Management Page", true);
		// Verifying Asset Inventory section and performing clicking action
		basePg.getAssetInventorytLeftNavBar().click();
		Reporter.log("Successfully clicked on Risk Assessment on left navigation bar in technology risks page", true);
		// Verifying Software Asset and performing clicking action
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getSoftwareAsset()));
		softassert.assertEquals(basePg.getSoftwareAsset().isDisplayed(), true,
				"Software Asset is not provided in left navigation bar in Asset Inventory");
		basePg.getSoftwareAsset().click();
		//Clicking on New Asset Button
		explicit.until(ExpectedConditions.elementToBeClickable(softwarePg.getNewAssetButton()));
		softwarePg.getNewAssetButton().click();
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("Os_chosen")));
		softwarePg.getOperatingSystemDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver, "Operating System","Software");
	}

}

