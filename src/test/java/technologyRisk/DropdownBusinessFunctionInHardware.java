package technologyRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class DropdownBusinessFunctionInHardware extends BaseClass {
	@Test
	public void businessFunctionDropdown() {
		hrmPg.getTechnologyRiskAssessmentText().click();
		Reporter.log("Successfully clicked on Technology Risk Assessment text on Hipaa Risk Management Page", true);
		// Verifying Asset Inventory section and performing clicking action
		basePg.getAssetInventorytLeftNavBar().click();
		Reporter.log("Successfully clicked on Risk Assessment on left navigation bar in technology risks page", true);
		// Verifying Software Asset and performing clicking action
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getHardwareAsset()));
		softassert.assertEquals(basePg.getHardwareAsset().isDisplayed(), true,
				"Hardware Asset is not provided in left navigation bar in Asset Inventory");
		basePg.getHardwareAsset().click();
		// Clicking on New Asset Button
		explicit.until(ExpectedConditions.elementToBeClickable(hardwarepg.getNewAssetButton()));
		hardwarepg.getNewAssetButton().click();
		explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("BusinessFunction_chosen")));
		hardwarepg.getBusinessFunctionDropdown().click();
		data.checkDropDownListfromUIAndExcel(driver, "Business Function", "Hardware");
	}

}
