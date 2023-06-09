package technologyRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyHRMPageComponents extends BaseClass {
	@Test(priority = 1)
	public void technologyRiskAssessment() {
		String expectedTitle = data.fromPropertyFile("HRMSTitle");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "HRM Page title is not matching with the expected title");
		Reporter.log("Successfully navigated to HRM Page on clicking on HIPAA on home page", true);
		// Verifying and Clicking Technology Risk Assessment Text and Image
		Assert.assertEquals(hrmPg.getTechnologyRiskAssessmentText().isDisplayed(), true,
				"Technology Risk Assessment Text is not provided in HRM page");
		hrmPg.getTechnologyRiskAssessmentText().click();
		Assert.assertEquals(data.fromPropertyFile("TechnologyRiskPageTitle"),
				technoPg.getTechnologyPageTitle().getText(),
				"Technology Risks Page is not matching with the Expected Title");
		Reporter.log(
				"Successfully navigated to Technology Risk Assessment Page upon clicking on Technology Risk Assessment Text in HRM Page",
				true);
		driver.navigate().back();
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getTraImage()));
		Assert.assertEquals(hrmPg.getTraImage().isDisplayed(), true,
				"Technology Risk Assessment Image is not provided in HRM page");
		hrmPg.getTraImage().click();
		Assert.assertEquals(data.fromPropertyFile("TechnologyRiskPageTitle"),
				technoPg.getTechnologyPageTitle().getText(),
				"Technology Risks Page is not matching with the Expected Title");
		Reporter.log(
				"Successfully navigated to Technology Risk Assessment Page upon clicking on Technology Risk Assessment Image in HRM Page",
				true);
		driver.navigate().back();
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getAdministrativeRiskAssessmentText()));
	}

	@Test(priority = 2)
	public void administrativeRiskAssessment() {
		// Verifying and Clicking Administrative Risk Assessment Text and Image
		Assert.assertEquals(hrmPg.getAdministrativeRiskAssessmentText().isDisplayed(), true,
				"Administrative Risk Assessment Text is not provided in HRM page");
		hrmPg.getAdministrativeRiskAssessmentText().click();
		Assert.assertEquals(data.fromPropertyFile("AdministrativeRiskPageTitle"),
				adminPg.getAdministrativePageTitle().getText(),
				"Administrative Risks Page is not matching with the Expected Title");
		Reporter.log(
				"Successfully navigated to Administrative Risk Assessment Page upon clicking on Administrative Risk Assessment Text in HRM Page",
				true);
		driver.navigate().back();
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getAraImage()));
		Assert.assertEquals(hrmPg.getAraImage().isDisplayed(), true,
				"Administrative Risk Assessment Image is not provided in HRM page");
		hrmPg.getAraImage().click();
		Assert.assertEquals(data.fromPropertyFile("AdministrativeRiskPageTitle"),
				adminPg.getAdministrativePageTitle().getText(),
				"Administrative Risks Page is not matching with the Expected Title");
		Reporter.log(
				"Successfully navigated to Administrative Risk Assessment Page upon clicking on Administrative Risk Assessment Image in HRM Page",
				true);
		driver.navigate().back();
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getPhysicalRiskAssessmentText()));
	}

	@Test(priority = 3)
	public void physicalRiskAssessment() {
		// Verifying and Clicking Physical Risk Assessment Text and Image
		Assert.assertEquals(hrmPg.getPhysicalRiskAssessmentText().isDisplayed(), true,
				"Physical Risk Assessment Text is not provided in HRM page");
		hrmPg.getPhysicalRiskAssessmentText().click();
		Assert.assertEquals(data.fromPropertyFile("PhysicalRiskPageTitle"), physicalPg.getPhysicalPageTitle().getText(),
				"Physical Risks Page is not matching with the Expected Title");
		Reporter.log(
				"Successfully navigated to Physical Risk Assessment Page upon clicking on Physical Risk Assessment Text in HRM Page",
				true);
		driver.navigate().back();
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getPraImage()));
		Assert.assertEquals(hrmPg.getPraImage().isDisplayed(), true,
				"Physical Risk Assessment Image is not provided in HRM page");
		hrmPg.getPraImage().click();
		Assert.assertEquals(data.fromPropertyFile("PhysicalRiskPageTitle"), physicalPg.getPhysicalPageTitle().getText(),
				"Physical Risks Page is not matching with the Expected Title");
		Reporter.log(
				"Successfully navigated to Physical Risk Assessment Page upon clicking on Physical Risk Assessment Image in HRM Page",
				true);
		driver.navigate().back();
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getRiskReviewBoardText()));
	}

	@Test(priority = 4)
	public void riskReviewBoard() {
		// Verifying and Clicking Risk Review Board Text and Image
		Assert.assertEquals(hrmPg.getRiskReviewBoardText().isDisplayed(), true,
				"Risk Review Board Text is not provided in HRM page");
		hrmPg.getRiskReviewBoardText().click();
		Assert.assertEquals(data.fromPropertyFile("RiskReviewBoardPageTitle"),
				riskReviewPg.getRiskReviewBoardPageTitle().getText(),
				"Risk Review Board Page is not matching with the Expected Title");
		Reporter.log(
				"Successfully navigated to Risk Review Board Page upon clicking on Risk Review Board Text in HRM Page",
				true);
		driver.navigate().back();
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getRrbImage()));
		Assert.assertEquals(hrmPg.getRrbImage().isDisplayed(), true,
				"Risk Review Board Image is not provided in HRM page");
		hrmPg.getRrbImage().click();
		Assert.assertEquals(data.fromPropertyFile("RiskReviewBoardPageTitle"),
				riskReviewPg.getRiskReviewBoardPageTitle().getText(),
				"Risk Review Board Page is not matching with the Expected Title");
		Reporter.log(
				"Successfully navigated to Risk Review Board Page upon clicking on Risk Review Board Image in HRM Page",
				true);
		driver.navigate().back();
		explicit.until(ExpectedConditions.visibilityOf(hrmPg.getHrmHeaderText()));
	}

}
