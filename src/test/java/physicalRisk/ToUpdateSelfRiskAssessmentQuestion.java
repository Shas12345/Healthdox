package physicalRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToUpdateSelfRiskAssessmentQuestion extends BaseClass {
	public String questionData = data.fromExcel("SelfAssessmentQuestrion", 1, 0);

	@Test
	public void addNewSelfRiskAssessmentQuestionInPhysicalRisk() {
		hrmPg.getPhysicalRiskAssessmentText().click();
		// Clicking on System Configuration
		basePg.getSystemConfiguration().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getUpdateSelfRiskAssessmentQuestions()));
		basePg.getUpdateSelfRiskAssessmentQuestions().click();
		explicit.until(ExpectedConditions.elementToBeClickable(selfRiskQuestionPg.getAddQuestionButton()));

		// Clicking on Add Question button
		selfRiskQuestionPg.getAddQuestionButton().click();

		// Verifying the label and entering the data into text box
		softassert.assertEquals(selfRiskQuestionPg.getQuestionLabel().isDisplayed(), true,
				"Question Label is not provided in self assessment page");
		Reporter.log("Verified Question Label in Self Assessment page", true);
		extentTest.info("Verified Question Label in Self Assessment page");
		selfRiskQuestionPg.getQuestionTextBox().sendKeys(questionData);

		// Verifying and Clicking on save Button
		softassert.assertEquals(selfRiskQuestionPg.getSaveButton().isDisplayed(), true,
				"Save Button is not provided in self assessment page");
		Reporter.log("Verified Save Button in Self Assessment page", true);
		extentTest.info("Verified Save Button in Self Assessment page");
		selfRiskQuestionPg.getSaveButton().click();

		for (;;) {
			try {
				String question = driver.findElement(By.xpath("//td[text()='" + questionData + "']/..")).getText();
				Reporter.log("The Captured data after creating question is :" + question, true);
				break;
			} catch (Exception e) {
				basePg.getNextButton().click();
			}
		}
		driver.findElement(
				By.xpath("//td[text()='" + questionData + "']/..//i[@class='ace-icon fa fa-pencil bigger-120']"))
				.click();
		Reporter.log("Clicked on Edit Button", true);
		// softassert.assertEquals(selfRiskQuestionPg.getQuestionTextBox().getAttribute("value"),
		// questionData,
		// "The data is not matching in the edit page");
		selfRiskQuestionPg.getQuestionTextBox().sendKeys(Keys.CONTROL + "a");
		selfRiskQuestionPg.getQuestionTextBox().sendKeys(data.fromExcel("SelfAssessmentQuestrion", 1, 1));
		// softassert.assertEquals(selfRiskQuestionPg.getQuestionTextBox().getAttribute("value"),
		// data.fromExcel("SelfAssessmentQuestrion", 1, 1), "Data is not matching ");
		Reporter.log("Entered a new data into question textbox", true);

		// Clicking on save button
		softassert.assertEquals(selfRiskQuestionPg.getSaveButton().isDisplayed(), true,
				"Save button is not provided in edit popup");
		Reporter.log("Verified save button", true);
		selfRiskQuestionPg.getSaveButton().click();

		// Verifying the pop up
		// softassert.assertEquals(driver.findElement(By.xpath("//div[contains(@id,'ui-id-')]")).getText(),
		// data.fromPropertyFile("successMessageOnSRAQ"), "Failed to verify the success
		// message");
	}

	@Test(dependsOnMethods = "addNewSelfRiskAssessment")
	public void deleteSelfRiskAssessment() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@title='Close'])[2]")).click();
		Thread.sleep(3000);
		try {
			driver.findElement(
					By.xpath("//td[text()='" + questionData + "']/..//i[@class='ace-icon fa fa-trash-o bigger-130']"))
					.click();
		} catch (Exception e) {
			driver.findElement(
					By.xpath("//td[text()='" + questionData + "']/..//i[@class='ace-icon fa fa-trash-o bigger-130']"))
					.click();
		}
		// softassert.assertEquals(driver.findElement(By.xpath("//div[contains(@id,'ui-id-')]")).getText(),
		// data.fromPropertyFile("deletePopupInSRAQ"), "Alert message is not matching");
		// Clicking on Yes Button
		driver.findElement(By.xpath("//span[text()='YES']")).click();
		// softassert.assertEquals(driver.findElement(By.xpath("//div[contains(@id,'ui-id-')]")).getText(),
		// data.fromPropertyFile("deleteSuccessMessageOnSRAQ"), "Alert message is not
		// matching");
		softassert.assertEquals("You cannot delete the existing Self RiskAssessment",
				"Self RiskAssessment Deleted Successfully", "User is not able to delete Self RiskAssessment in Physical Risk");
	}

}
