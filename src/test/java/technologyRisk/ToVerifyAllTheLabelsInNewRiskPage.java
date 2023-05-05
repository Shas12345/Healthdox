package technologyRisk;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyAllTheLabelsInNewRiskPage extends BaseClass {

	@Test(priority = 1)
	public void riskIdInTechnologyRisk() {
		hrmPg.getTraImage().click();
		basePg.getRiskAssessmentLeftNavBar().click();
		basePg.getNewRisk().click();
		// Verifying Risk Id Label
		Assert.assertEquals(basePg.getRiskIdLabel().isDisplayed(), true, "Risk Id label not provided in New Risk Page");
		extentTest.pass("Verifyed Risk Id label in New Page");
	}

	@Test(priority = 2)
	public void riskAssetClassInTechnologyRisk() {
		// Verifying Risk Asset Class Label
		Assert.assertEquals(basePg.getRiskAssetClassLabel().isDisplayed(), true,
				"Risk Asset Class label not provided in New Risk Page");
		extentTest.pass("Verifyed Risk Asset Class label in New Page");
	}

	@Test(priority = 3)
	public void departmentNameInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getDepartmentLabel().isDisplayed(), true,
				"Department Name label not provided in New Risk Page");
		extentTest.pass("Verifyed Department Name label in New Page");
	}

	@Test(priority = 4)
	public void entityNameInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getEntityLabel().isDisplayed(), true,
				"Entity Name label not provided in New Risk Page");
		extentTest.pass("Verifyed Entity Name label in New Page");
	}

	@Test(priority = 5)
	public void assessorInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getAssessorLabel().isDisplayed(), true,
				"Assessor label not provided in New Risk Page");
		extentTest.pass("Verifyed Assessor label in New Page");
	}

	@Test(priority = 6)
	public void assessedInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getAssessedLabel().isDisplayed(), true,
				"Assessed label not provided in New Risk Page");
		extentTest.pass("Verifyed Assessed label in New Page");
	}

	@Test(priority = 7)
	public void riskInputInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getRiskInputLabel().isDisplayed(), true,
				"Risk Input label not provided in New Risk Page");
		extentTest.pass("Verifyed Risk Input label in New Page");
	}

	@Test(priority = 8)
	public void threatSourceInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getThreadSourceLabel().isDisplayed(), true,
				"Threat Source label not provided in New Risk Page");
		extentTest.pass("Verifyed Threat Source label in New Page");
	}

	@Test(priority = 9)
	public void riskDescriptionInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getRiskDescriptionLabel().isDisplayed(), true,
				"Risk Description label not provided in New Risk Page");
		extentTest.pass("Verifyed Risk Description label in New Page");
	}

	@Test(priority = 10)
	public void existingControlsInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getExistingControlsLabel().isDisplayed(), true,
				"Existing Controls label not provided in New Risk Page");
		extentTest.pass("Verifyed Existing Controls label in New Page");
	}

	@Test(priority = 11)
	public void riskImpactCategoryInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getRiskImpactCategoryLabel().isDisplayed(), true,
				"Risk Impact Category label not provided in New Risk Page");
		extentTest.pass("Verifyed Risk Impact Category label in New Page");
	}

	@Test(priority = 12)
	public void probabilityOfOccuranceInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getProbabilityOfOccuranceLabel().isDisplayed(), true,
				"Probability of Occurance label not provided in New Risk Page");
		extentTest.pass("Verifyed Probability of Occurance label in New Page");
	}

	@Test(priority = 13)
	public void impactLevelInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getImpactLevelLabel().isDisplayed(), true,
				"Impact Level label not provided in New Risk Page");
		extentTest.pass("Verifyed Impact Level label in New Page");
	}

	@Test(priority = 14)
	public void riskExposureLevelInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getImpactLevelLabel().isDisplayed(), true,
				"Risk Exposure Level label not provided in New Risk Page");
		extentTest.pass("Verifyed Risk Exposure Level label in New Page");
	}

	@Test(priority = 15)
	public void selectControlClassInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getSelectControlLabel().isDisplayed(), true,
				"Select Control Class label not provided in New Risk Page");
		extentTest.pass("Verifyed Select Control Class label in New Page");
	}

	@Test(priority = 16)
	public void controlNameInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getControlNameLabel().isDisplayed(), true,
				"Control Name label not provided in New Risk Page");
		extentTest.pass("Verifyed Control Name Class label in New Page");
	}

	@Test(priority = 17)
	public void subControlNameInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getSubControlLabel().isDisplayed(), true,
				"Sub Control Name label not provided in New Risk Page");
		extentTest.pass("Verifyed Sub Control Name label in New Page");
	}

	@Test(priority = 18)
	public void descriptionInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getDescriptionLabel().isDisplayed(), true,
				"Description label not provided in New Risk Page");
		extentTest.pass("Verifyed Description label in New Page");
	}

	@Test(priority = 19)
	public void newControlsInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getNewControlsLabel().isDisplayed(), true,
				"New Controls  label not provided in New Risk Page");
		extentTest.pass("Verifyed New Control label in New Page");
	}

	@Test(priority = 20)
	public void responsibleInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getNewControlsLabel().isDisplayed(), true,
				"Responsible label not provided in New Risk Page");
		extentTest.pass("Verifyed Responsible label in New Page");
	}

	@Test(priority = 21)
	public void targetDateInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getTargetDateLabel().isDisplayed(), true,
				"Target Date label not provided in New Risk Page");
		extentTest.pass("Verifyed Target Date label in New Page");
	}

	@Test(priority = 22)
	public void targetQuarterInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getTargetQuarterLabel().isDisplayed(), true,
				"Target Quarter label not provided in New Risk Page");
		extentTest.pass("Verifyed Target Quarter label in New Page");
	}

	@Test(priority = 23)
	public void responsibleDeptInTechnologyRisk() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getResponsibleDeptLabel().isDisplayed(), true,
				"Responsible Dept label not provided in New Risk Page");
		extentTest.pass("Verifyed Responsible Dept label in New Page");
	}

	@Test(priority = 24)
	public void riskResponse() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getResponsibleDeptLabel().isDisplayed(), true,
				"Risk Response label not provided in New Risk Page");
		extentTest.pass("Verifyed Risk Response label in New Page");
	}

	@Test(priority = 25)
	public void status() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getStatusLabel().isDisplayed(), true, "Status label not provided in New Risk Page");
		extentTest.pass("Verifyed Status label in New Page");
	}

	@Test(priority = 26)
	public void closedDate() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getClosedLabel().isDisplayed(), true,
				" Closed Date label not provided in New Risk Page");
		extentTest.pass("Verifyed  Closed Date label in New Page");
	}

}
