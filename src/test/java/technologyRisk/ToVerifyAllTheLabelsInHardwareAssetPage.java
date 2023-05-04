package technologyRisk;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyAllTheLabelsInHardwareAssetPage extends BaseClass {
	@Test(priority = 1)
	public void assetId() {
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
		Assert.assertEquals(softwarePg.getAssetIdLabel().isDisplayed(), true,
				"Asset Id label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified AssetId label under Hardware Inventory Details in Hardware Asset Page",
				true);

	}

	@Test(priority = 2)
	public void assetClassLabel() {
		// Verifying Asset Class Label in Hardware Inventory Details.
		// explicit.until(ExpectedConditions.visibilityOf(softwarePg.getAssetClassLabel()));
		Assert.assertEquals(hardwarepg.getAssetClassLabel().isDisplayed(), true,
				"Asset Class label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified Asset Class label under Hardware Inventory Details in Hardware Asset Page",
				true);

	}

	@Test(priority = 3)
	public void HostNameLabel() {
		// Verifying Host Name Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getNameOfApplicationLabel()));
		Assert.assertEquals(softwarePg.getNameOfApplicationLabel().isDisplayed(), true,
				"Host Name label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified Host Name label under Hardware Inventory Details in Hardware Asset Page",
				true);
	}

	@Test(priority = 4)
	public void makeLabel() {
		// Verifying Make Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getMakeLabel()));
		Assert.assertEquals(hardwarepg.getMakeLabel().isDisplayed(), true,
				"Make label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified Operating System label under Hardware Inventory Details in Hardware Asset Page",
				true);
	}

	@Test(priority = 5)
	public void descriptionLabel() {
		// Verifying Description Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getDescriptionLabel()));
		Assert.assertEquals(hardwarepg.getDescriptionLabel().isDisplayed(), true,
				"Description label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified Description label under Hardware Inventory Details in Hardware Asset Page",
				true);
	}

	@Test(priority = 6)
	public void hardwareCriticalityLabel() {
		// Verifying Hardware Criticality Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getHardwareCriticalityLabel()));
		Assert.assertEquals(hardwarepg.getHardwareCriticalityLabel().isDisplayed(), true,
				"Hardware Criticality label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified Hardware Criticality label under Hardware Inventory Details in Hardware Asset Page",
				true);
	}

	@Test(priority = 7)
	public void type() {
		// Verifying Type Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getTypeLabel()));
		Assert.assertEquals(hardwarepg.getTypeLabel().isDisplayed(), true,
				"Type label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified Type label under Hardware Inventory Details in Hardware Asset Page", true);
	}

	@Test(priority = 8)
	public void riskAssessFrequencyLabel() {
		// Verifying Risk Assess Frequency Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getRiskAssessFrequencyLabel()));
		Assert.assertEquals(hardwarepg.getRiskAssessFrequencyLabel().isDisplayed(), true,
				"Risk Frequency label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified  Risk Assess Frequency label under Hardware Inventory Details in Hardware Asset Page",
				true);
	}

	@Test(priority = 9)
	public void businessFunctionLabel() {
		// Verifying Business Function Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getBusinessFunctionLabel()));
		Assert.assertEquals(hardwarepg.getBusinessFunctionLabel().isDisplayed(), true,
				"Business Function label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified Business Function label under Hardware Inventory Details in Hardware Asset Page",
				true);
	}

	@Test(priority = 10)
	public void systemOwnerLabel() {
		// Verifying System Owner Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getSystemOwnerLabel()));
		Assert.assertEquals(hardwarepg.getSystemOwnerLabel().isDisplayed(), true,
				"System Owner label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log("Successfully verified System Owner label under Hardware Inventory Details in Hardware Asset Page",
				true);
	}

	@Test(priority = 11)
	public void departmentFunctionLabel() {
		// Verifying Department Function Label in Hardware Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getDepartmentLabel()));
		Assert.assertEquals(hardwarepg.getDepartmentLabel().isDisplayed(), true,
				"Department Function label is not provided under Hardware Inventory Details in Hardware Asset Page");
		Reporter.log(
				"Successfully verified Department Function label under Hardware Inventory Details in Hardware Asset Page",
				true);
	}

}
