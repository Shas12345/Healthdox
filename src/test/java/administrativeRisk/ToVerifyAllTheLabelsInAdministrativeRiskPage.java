package administrativeRisk;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyAllTheLabelsInAdministrativeRiskPage extends BaseClass {

	@Test(priority = 1)
	public void riskId() {
		hrmPg.getAraImage().click();
		basePg.getRiskAssessmentLeftNavBar().click();
		basePg.getNewRisk().click();
		// Verifying Risk Id Label
		Assert.assertEquals(basePg.getRiskIdLabel().isDisplayed(), true, "Risk Id label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Id label in New Page", true);
	}

	@Test(priority = 2)
	public void riskAgent() {
		// Verifying Risk Agent Label
		Assert.assertEquals(adminPg.getRiskAgentLabel().isDisplayed(), true,
				"Risk Id label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Agent label in New Page", true);

	}

	@Test(priority = 3)
	public void departmentName() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getDepartmentLabel().isDisplayed(), true,
				"Department Name label not provided in New Risk Page");
		Reporter.log("Verifyed Department Name label in New Page", true);
	}

	@Test(priority = 4)
	public void entityName() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getEntityLabel().isDisplayed(), true,
				"Entity Name label not provided in New Risk Page");
		Reporter.log("Verifyed Entity Name label in New Page", true);
	}

	@Test(priority = 5)
	public void assessor() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getAssessorLabel().isDisplayed(), true,
				"Assessor label not provided in New Risk Page");
		Reporter.log("Verifyed Assessor label in New Page", true);
	}

	@Test(priority = 6)
	public void assessed() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getAssessedLabel().isDisplayed(), true,
				"Assessed label not provided in New Risk Page");
		Reporter.log("Verifyed Assessed label in New Page", true);
	}

	@Test(priority = 7)
	public void riskInput() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getRiskInputLabel().isDisplayed(), true,
				"Risk Input label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Input label in New Page", true);
	}

	@Test(priority = 8)
	public void threatSource() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getThreadSourceLabel().isDisplayed(), true,
				"Threat Source label not provided in New Risk Page");
		Reporter.log("Verifyed Threat Source label in New Page", true);
	}

	@Test(priority = 9)
	public void riskDescription() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getRiskDescriptionLabel().isDisplayed(), true,
				"Risk Description label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Description label in New Page", true);
	}

	@Test(priority = 10)
	public void existingControls() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getExistingControlsLabel().isDisplayed(), true,
				"Existing Controls label not provided in New Risk Page");
		Reporter.log("Verifyed Existing Controls label in New Page", true);
	}

	@Test(priority = 11)
	public void riskImpactCategory() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getRiskImpactCategoryLabel().isDisplayed(), true,
				"Risk Impact Category label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Impact Category label in New Page", true);
	}

	@Test(priority = 12)
	public void probabilityOfOccurance() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getProbabilityOfOccuranceLabel().isDisplayed(), true,
				"Probability of Occurance label not provided in New Risk Page");
		Reporter.log("Verifyed Probability of Occurance label in New Page", true);
	}

	@Test(priority = 13)
	public void impactLevel() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getImpactLevelLabel().isDisplayed(), true,
				"Impact Level label not provided in New Risk Page");
		Reporter.log("Verifyed Impact Level label in New Page", true);
	}

	@Test(priority = 14)
	public void riskExposureLevel() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getImpactLevelLabel().isDisplayed(), true,
				"Risk Exposure Level label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Exposure Level label in New Page", true);
	}

	@Test(priority = 15)
	public void selectControlClass() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getSelectControlLabel().isDisplayed(), true,
				"Select Control Class label not provided in New Risk Page");
		Reporter.log("Verifyed Select Control Class label in New Page", true);
	}

	@Test(priority = 16)
	public void controlName() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getControlNameLabel().isDisplayed(), true,
				"Control Name label not provided in New Risk Page");
		Reporter.log("Verifyed Control Name Class label in New Page", true);
	}

	@Test(priority = 17)
	public void subControlName() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getSubControlLabel().isDisplayed(), true,
				"Sub Control Name label not provided in New Risk Page");
		Reporter.log("Verifyed Sub Control Name label in New Page", true);
	}

	@Test(priority = 18)
	public void description() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getDescriptionLabel().isDisplayed(), true,
				"Description label not provided in New Risk Page");
		Reporter.log("Verifyed Description label in New Page", true);
	}

	@Test(priority = 19)
	public void newControls() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getNewControlsLabel().isDisplayed(), true,
				"New Controls  label not provided in New Risk Page");
		Reporter.log("Verifyed New Control label in New Page", true);
	}

	@Test(priority = 20)
	public void responsible() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getNewControlsLabel().isDisplayed(), true,
				"Responsible label not provided in New Risk Page");
		Reporter.log("Verifyed Responsible label in New Page", true);
	}

	@Test(priority = 21)
	public void targetDate() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getTargetDateLabel().isDisplayed(), true,
				"Target Date label not provided in New Risk Page");
		Reporter.log("Verifyed Target Date label in New Page", true);
	}

	@Test(priority = 22)
	public void targetQuarter() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getTargetQuarterLabel().isDisplayed(), true,
				"Target Quarter label not provided in New Risk Page");
		Reporter.log("Verifyed Target Quarter label in New Page", true);
	}

	@Test(priority = 23)
	public void responsibleDept() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getResponsibleDeptLabel().isDisplayed(), true,
				"Responsible Dept label not provided in New Risk Page");
		Reporter.log("Verifyed Responsible Dept label in New Page", true);
	}

	@Test(priority = 24)
	public void riskResponse() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getResponsibleDeptLabel().isDisplayed(), true,
				"Risk Response label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Response label in New Page", true);
	}

	@Test(priority = 25)
	public void status() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getStatusLabel().isDisplayed(), true, "Status label not provided in New Risk Page");
		Reporter.log("Verifyed Status label in New Page", true);
	}

	@Test(priority = 26)
	public void closedDate() {
		// Verifying Department Name Label
		Assert.assertEquals(basePg.getClosedLabel().isDisplayed(), true,
				" Closed Date label not provided in New Risk Page");
		Reporter.log("Verifyed  Closed Date label in New Page", true);
	}

}
