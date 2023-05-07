package administrativeRisk;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyAllTheLabelsInAdministrativeRiskPage extends BaseClass {

	@Test(priority = 1)
	public void riskIdLabelInAdministrativeRisk() {
		hrmPg.getAraImage().click();
		basePg.getRiskAssessmentLeftNavBar().click();
		basePg.getNewRisk().click();
		// Verifying Risk Id Label
		softassert.assertEquals(basePg.getRiskIdLabel().isDisplayed(), true, "Risk Id label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Id label in Administrative Risk Page", true);
		extentTest.info("Verifyed Risk Id label in Administrative Risk Page");
	}

	@Test(priority = 2)
	public void riskAgentLabelInAdministrativeRisk() {
		// Verifying Risk Agent Label
		softassert.assertEquals(adminPg.getRiskAgentLabel().isDisplayed(), true,
				"Risk Id label not provided in Administrative Risk Risk Page");
		Reporter.log("Verifyed Risk Agent label in Administrative Risk Page", true);
		extentTest.info("Verifyed Risk Agent label in Administrative Risk Page");

	}

	@Test(priority = 3)
	public void departmentNameLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getDepartmentLabel().isDisplayed(), true,
				"Department Name label not provided in Administrative Risk Page");
		Reporter.log("Verifyed Department Name label in Administrative Risk Page", true);
		extentTest.info("Verifyed Department Name label in Administrative Risk Page");
	}

	@Test(priority = 4)
	public void entityNameLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getEntityLabel().isDisplayed(), true,
				"Entity Name label not provided in Administrative Risk Page");
		Reporter.log("Verifyed Entity Name label in Administrative Risk Page", true);
		extentTest.info("Verifyed Entity Name label in Administrative Risk Page");
	}

	@Test(priority = 5)
	public void assessorLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getAssessorLabel().isDisplayed(), true,
				"Assessor label not provided in New Risk Page");
		Reporter.log("Verifyed Assessor label in Administrative Risk Page", true);
		extentTest.info("Verifyed Assessor label in Administrative Risk Page");
	}

	@Test(priority = 6)
	public void assessedLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getAssessedLabel().isDisplayed(), true,
				"Assessed label not provided in New Risk Page");
		Reporter.log("Verifyed Assessed label in Administrative Risk Page", true);
		extentTest.info("Verifyed Assessed label in Administrative Risk Page");
	}

	@Test(priority = 7)
	public void riskInputLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getRiskInputLabel().isDisplayed(), true,
				"Risk Input label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Input label in Administrative Risk Page", true);
		extentTest.info("Verifyed Risk Input label in Administrative Risk Page");
	}

	@Test(priority = 8)
	public void threatSourceLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getThreadSourceLabel().isDisplayed(), true,
				"Threat Source label not provided in New Risk Page");
		Reporter.log("Verifyed Threat Source label in Administrative Risk Page", true);
		extentTest.info("Verifyed Threat Source label in Administrative Risk Page");
	}

	@Test(priority = 9)
	public void riskDescriptionLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getRiskDescriptionLabel().isDisplayed(), true,
				"Risk Description label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Description label in Administrative Risk Page", true);
		extentTest.info("Verifyed Risk Description label in Administrative Risk Page");
	}

	@Test(priority = 10)
	public void existingControlsLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getExistingControlsLabel().isDisplayed(), true,
				"Existing Controls label not provided in New Risk Page");
		Reporter.log("Verifyed Existing Controls label in Administrative Risk Page", true);
		extentTest.info("Verifyed Existing Controls label in Administrative Risk Page");
	}

	@Test(priority = 11)
	public void riskImpactCategoryLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getRiskImpactCategoryLabel().isDisplayed(), true,
				"Risk Impact Category label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Impact Category label in Administrative Risk Page", true);
		extentTest.info("Verifyed Risk Impact Category label in Administrative Risk Page");
	}

	@Test(priority = 12)
	public void probabilityOfOccuranceLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getProbabilityOfOccuranceLabel().isDisplayed(), true,
				"Probability of Occurance label not provided in New Risk Page");
		Reporter.log("Verifyed Probability of Occurance label in Administrative Risk Page", true);
		extentTest.info("Verifyed Probability of Occurance label in Administrative Risk Page");
	}

	@Test(priority = 13)
	public void impactLevelLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getImpactLevelLabel().isDisplayed(), true,
				"Impact Level label not provided in New Risk Page");
		Reporter.log("Verifyed Impact Level label in Administrative Risk Page", true);
		extentTest.info("Verifyed Impact Level label in Administrative Risk Page");
	}

	@Test(priority = 14)
	public void riskExposureLevelLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getImpactLevelLabel().isDisplayed(), true,
				"Risk Exposure Level label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Exposure Level label in Administrative Risk Page", true);
		extentTest.info("Verifyed Risk Exposure Level label in Administrative Risk Page");
	}

	@Test(priority = 15)
	public void selectControlClassLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getSelectControlLabel().isDisplayed(), true,
				"Select Control Class label not provided in New Risk Page");
		Reporter.log("Verifyed Select Control Class label in Administrative Risk Page", true);
		extentTest.info("Verifyed Select Control Class label in Administrative Risk Page");
	}

	@Test(priority = 16)
	public void controlNameLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getControlNameLabel().isDisplayed(), true,
				"Control Name label not provided in New Risk Page");
		Reporter.log("Verifyed Control Name Class label in Administrative Risk Page", true);
		extentTest.info("Verifyed Control Name Class label in Administrative Risk Page");
	}

	@Test(priority = 17)
	public void subControlNameLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getSubControlLabel().isDisplayed(), true,
				"Sub Control Name label not provided in New Risk Page");
		Reporter.log("Verifyed Sub Control Name label in Administrative Risk Page", true);
		extentTest.info("Verifyed Sub Control Name label in Administrative Risk Page");
	}

	@Test(priority = 18)
	public void descriptionLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getDescriptionLabel().isDisplayed(), true,
				"Description label not provided in New Risk Page");
		Reporter.log("Verifyed Description label in Administrative Risk Page", true);
		extentTest.info("Verifyed Description label in Administrative Risk Page");
	}

	@Test(priority = 19)
	public void newControlsLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getNewControlsLabel().isDisplayed(), true,
				"New Controls  label not provided in New Risk Page");
		Reporter.log("Verifyed New Control label in Administrative Risk Page", true);
		extentTest.info("Verifyed New Control label in Administrative Risk Page");
	}

	@Test(priority = 20)
	public void responsibleLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getNewControlsLabel().isDisplayed(), true,
				"Responsible label not provided in New Risk Page");
		Reporter.log("Verifyed Responsible label in Administrative Risk Page", true);
		extentTest.info("Verifyed Responsible label in Administrative Risk Page");
	}

	@Test(priority = 21)
	public void targetDateLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getTargetDateLabel().isDisplayed(), true,
				"Target Date label not provided in New Risk Page");
		Reporter.log("Verifyed Target Date label in Administrative Risk Page", true);
		extentTest.info("Verifyed Target Date label in Administrative Risk Page");
	}

	@Test(priority = 22)
	public void targetQuarterLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getTargetQuarterLabel().isDisplayed(), true,
				"Target Quarter label not provided in New Risk Page");
		Reporter.log("Verifyed Target Quarter label in Administrative Risk Page", true);
		extentTest.info("Verifyed Target Quarter label in Administrative Risk Page");
	}

	@Test(priority = 23)
	public void responsibleDeptLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getResponsibleDeptLabel().isDisplayed(), true,
				"Responsible Dept label not provided in New Risk Page");
		Reporter.log("Verifyed Responsible Dept label in Administrative Risk Page", true);
		extentTest.info("Verifyed Responsible Dept label in Administrative Risk Page");
	}

	@Test(priority = 24)
	public void riskResponseLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getResponsibleDeptLabel().isDisplayed(), true,
				"Risk Response label not provided in New Risk Page");
		Reporter.log("Verifyed Risk Response label in Administrative Risk Page", true);
		extentTest.info("Verifyed Risk Response label in Administrative Risk Page");
	}

	@Test(priority = 25)
	public void statusLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getStatusLabel().isDisplayed(), true, "Status label not provided in New Risk Page");
		Reporter.log("Verifyed Status label in Administrative Risk Page", true);
		extentTest.info("Verifyed Status label in Administrative Risk Page");
	}

	@Test(priority = 26, groups = {"Smoke","Regression"})
	public void closedDateLabelInAdministrativeRisk() {
		// Verifying Department Name Label
		softassert.assertEquals(basePg.getClosedLabel().isDisplayed(), true,
				" Closed Date label not provided in New Risk Page");
		Reporter.log("Verifyed  Closed Date label in Administrative Risk Page", true);
		extentTest.info("Verifyed  Closed Date label in Administrative Risk Page");
	}

}
