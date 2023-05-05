package technologyRisk;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyAllTheLabelsInHardwareAssetPage extends BaseClass {
	@Test(priority = 1)
	public void assetIdInHardwareAsser() {
		// Navigating to Hardware Asset Pop up in Hardware Asset Page.
		hrmPg.getTraImage().click();
		basePg.getAssetInventoryArrow().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getHardwareAsset()));
		basePg.getHardwareAsset().click();
		explicit.until(ExpectedConditions.elementToBeClickable(hardwarepg.getNewAssetButton()));
		hardwarepg.getNewAssetButton().click();
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getHardwareAssetText()));
		// Verifying Asset Id Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getAssetIdLabel()));
		softassert.assertEquals(softwarePg.getAssetIdLabel().isDisplayed(), true,
				"Asset Id label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified AssetId label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info("Successfully verified AssetId label under Hardware Inventory Details in Hardware Asset Page");

	}

	@Test(priority = 2)
	public void assetClassLabelInHardwareAsset() {
		// Verifying Asset Class Label in Hardware Inventory Details.
		// explicit.until(ExpectedConditions.visibilityOf(softwarePg.getAssetClassLabel()));
		softassert.assertEquals(hardwarepg.getAssetClassLabel().isDisplayed(), true,
				"Asset Class label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified Asset Class label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info("Successfully verified Asset Class label under Hardware Inventory Details in Hardware Asset Page");

	}

	@Test(priority = 3)
	public void HostNameLabelInHardwreAsset() {
		// Verifying Host Name Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getNameOfApplicationLabel()));
		softassert.assertEquals(softwarePg.getNameOfApplicationLabel().isDisplayed(), true,
				"Host Name label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified Host Name label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info("Successfully verified Host Name label under Hardware Inventory Details in Hardware Asset Page");
	}

	@Test(priority = 4)
	public void makeLabelInHardwareAsset() {
		// Verifying Make Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getMakeLabel()));
		softassert.assertEquals(hardwarepg.getMakeLabel().isDisplayed(), true,
				"Make label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified Operating System label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info(
				"Successfully verified Operating System label under Hardware Inventory Details in Hardware Asset Page");
	}

	@Test(priority = 5)
	public void descriptionLabelInHardwareAsset() {
		// Verifying Description Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getDescriptionLabel()));
		softassert.assertEquals(hardwarepg.getDescriptionLabel().isDisplayed(), true,
				"Description label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified Description label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info("Successfully verified Description label under Hardware Inventory Details in Hardware Asset Page");
	}

	@Test(priority = 6)
	public void hardwareCriticalityLabelInHardwareAsset() {
		// Verifying Hardware Criticality Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getHardwareCriticalityLabel()));
		softassert.assertEquals(hardwarepg.getHardwareCriticalityLabel().isDisplayed(), true,
				"Hardware Criticality label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified Hardware Criticality label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info(
				"Successfully verified Hardware Criticality label under Hardware Inventory Details in Hardware Asset Page");
	}

	@Test(priority = 7)
	public void typeLabelInHardwareAsset() {
		// Verifying Type Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getTypeLabel()));
		softassert.assertEquals(hardwarepg.getTypeLabel().isDisplayed(), true,
				"Type label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified Type label under Hardware Inventory Details in Hardware Asset Page", true);
		extentTest.info("Successfully verified Type label under Hardware Inventory Details in Hardware Asset Page");
	}

	@Test(priority = 8)
	public void riskAssessFrequencyLabelInHardwareAsset() {
		// Verifying Risk Assess Frequency Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getRiskAssessFrequencyLabel()));
		softassert.assertEquals(hardwarepg.getRiskAssessFrequencyLabel().isDisplayed(), true,
				"Risk Frequency label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified  Risk Assess Frequency label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info(
				"Successfully verified  Risk Assess Frequency label under Hardware Inventory Details in Hardware Asset Page");
	}

	@Test(priority = 9)
	public void businessFunctionLabelInHardwareAsset() {
		// Verifying Business Function Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getBusinessFunctionLabel()));
		softassert.assertEquals(hardwarepg.getBusinessFunctionLabel().isDisplayed(), true,
				"Business Function label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified Business Function label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info(
				"Successfully verified Business Function label under Hardware Inventory Details in Hardware Asset Page");
	}

	@Test(priority = 10)
	public void systemOwnerLabelInHardwareAsset() {
		// Verifying System Owner Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getSystemOwnerLabel()));
		softassert.assertEquals(hardwarepg.getSystemOwnerLabel().isDisplayed(), true,
				"System Owner label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified System Owner label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info("Successfully verified System Owner label under Hardware Inventory Details in Hardware Asset Page");
	}

	@Test(priority = 11)
	public void departmentFunctionLabelInHardwareAsset() {
		// Verifying Department Function Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getDepartmentLabel()));
		softassert.assertEquals(hardwarepg.getDepartmentLabel().isDisplayed(), true,
				"Department Function label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified Department Function label under Hardware Inventory Details in Hardware Asset Page",
				true);
		extentTest.info(
				"Successfully verified Department Function label under Hardware Inventory Details in Hardware Asset Page");
	}

}
