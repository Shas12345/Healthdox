package technologyRisk;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyAllTheLabelsInSoftwareAssetPage extends BaseClass {

	@Test
	public void assetId() {
		// Navigating to Software Asset Popup in Software Asset Page.
		hrmPg.getTraImage().click();
		basePg.getAssetInventoryArrow().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getSoftwareAsset()));
		basePg.getSoftwareAsset().click();
		explicit.until(ExpectedConditions.elementToBeClickable(softwarePg.getNewAssetButton()));
		softwarePg.getNewAssetButton().click();
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getSoftwareAssetText()));
		// Verifying Asset Id Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getAssetIdLabel()));
		Assert.assertEquals(softwarePg.getAssetIdLabel().isDisplayed(), true,
				"Asset Id label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log("Successfully verified AssetId label under Software Inventory Details in Software Asset Page",
				true);

	}

	@Test
	public void assetClassLabel() {
		// Verifying Asset Class Label in Software Inventory Details.
		//explicit.until(ExpectedConditions.visibilityOf(softwarePg.getAssetClassLabel()));
		Assert.assertEquals(softwarePg.getAssetClassLabel().isDisplayed(), true,
				"Asset Class label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log("Successfully verified Asset Class label under Software Inventory Details in Software Asset Page",
				true);

	}

	@Test(priority = 1)
	public void nameOfApplicationLabel() {
		// Verifying Name of Application Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getNameOfApplicationLabel()));
		Assert.assertEquals(softwarePg.getNameOfApplicationLabel().isDisplayed(), true,
				"Name of Application label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log(
				"Successfully verified Name of Application label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 2)
	public void operatingSystemLabel() {
		// Verifying Operating System Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getOperatingSystemLabel()));
		Assert.assertEquals(softwarePg.getOperatingSystemLabel().isDisplayed(), true,
				"Operating System label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log(
				"Successfully verified Operating System label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 3)
	public void descriptionLabel() {
		// Verifying Description Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getDescriptionLabel()));
		Assert.assertEquals(softwarePg.getDescriptionLabel().isDisplayed(), true,
				"Description label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log("Successfully verified Description label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 4)
	public void sharedLabel() {
		// Verifying Shared Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getSharedLabel()));
		Assert.assertEquals(softwarePg.getSharedLabel().isDisplayed(), true,
				"Shared label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log("Successfully verified Shared label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 5)
	public void applicationCriticalityLabel() {
		// Verifying Application Criticality Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getApplicationCriticalityLabel()));
		Assert.assertEquals(softwarePg.getApplicationCriticalityLabel().isDisplayed(), true,
				"Application Criticality label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log(
				"Successfully verified Application Criticality label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 6)
	public void dataClassificationLabel() {
		// Verifying Data Classification Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getDataClassificationLabel()));
		Assert.assertEquals(softwarePg.getDataClassificationLabel().isDisplayed(), true,
				"Data Classification label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log(
				"Successfully verified Data Classification label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 7)
	public void riskAssessFrequencyLabel() {
		// Verifying Risk Assess Frequency Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getRiskAssessFrequencyLabel()));
		Assert.assertEquals(softwarePg.getRiskAssessFrequencyLabel().isDisplayed(), true,
				"Risk Frequency label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log(
				"Successfully verified  Risk Assess Frequency label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 8)
	public void businessFunctionLabel() {
		// Verifying Business Function Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getBusinessFunctionLabel()));
		Assert.assertEquals(softwarePg.getBusinessFunctionLabel().isDisplayed(), true,
				"Business Function label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log(
				"Successfully verified Business Function label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 9)
	public void systemOwnerLabel() {
		// Verifying System Owner Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getSystemOwnerLabel()));
		Assert.assertEquals(softwarePg.getSystemOwnerLabel().isDisplayed(), true,
				"System Owner label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log("Successfully verified System Owner label under Software Inventory Details in Software Asset Page",
				true);
	}

	@Test(priority = 10)
	public void departmentFunctionLabel() {
		// Verifying Department Function Label in Software Inventory Details.
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getDepartmentLabel()));
		Assert.assertEquals(softwarePg.getDepartmentLabel().isDisplayed(), true,
				"Department Function label is not provided under Software Inventory Details in Software Asset Page");
		Reporter.log(
				"Successfully verified Department Function label under Software Inventory Details in Software Asset Page",
				true);
	}
}
