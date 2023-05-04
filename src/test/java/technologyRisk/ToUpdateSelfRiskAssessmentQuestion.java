package technologyRisk;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Liberary.BaseClass;

public class ToUpdateSelfRiskAssessmentQuestion extends BaseClass {
	public String questionData = data.fromExcel("SelfAssessmentQuestrion", 1, 0);

	@Test
	public void addNewSelfRiskAssessment() {
		hrmPg.getTechnologyRiskAssessmentText().click();
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
		selfRiskQuestionPg.getQuestionTextBox().sendKeys(questionData);

		// Verifying and Clicking on save Button
		softassert.assertEquals(selfRiskQuestionPg.getSaveButton().isDisplayed(), true,
				"Save Button is not provided in self assessment page");
		Reporter.log("Verified Save Button in Self Assessment page", true);
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
		softassert.assertEquals(selfRiskQuestionPg.getQuestionTextBox().getText(), questionData,
				"The data is not matching in the edit page");
		selfRiskQuestionPg.getQuestionTextBox().sendKeys(Keys.CONTROL + "a");
		selfRiskQuestionPg.getQuestionTextBox().sendKeys(data.fromExcel("SelfAssessmentQuestrion", 1, 1));
		softassert.assertEquals(selfRiskQuestionPg.getQuestionTextBox().getText(),
				data.fromExcel("SelfAssessmentQuestrion", 1, 1), "Data is not matching ");
		Reporter.log("Entered a new data into question textbox", true);

		// Clicking on save button
		softassert.assertEquals(selfRiskQuestionPg.getSaveButton().isDisplayed(), true,
				"Save button is not provided in edit popup");
		Reporter.log("Verified save button", true);
		selfRiskQuestionPg.getSaveButton().click();

		// Verifying the pop up
		softassert.assertEquals(selfRiskQuestionPg.getFailureMessage().getText(),
				data.fromPropertyFile("successMessageOnSRAQ"), "Failed to verify the success message");
	}

	@Test(dependsOnMethods = "addNewSelfRiskAssessment")
	public void delete() {
		driver.findElement(
				By.xpath("//td[text()='" + questionData + "']/..//i[@class='ace-icon fa fa-trash-o bigger-130']"))
				.click();
		Alert alert = driver.switchTo().alert();
		softassert.assertEquals(alert.getText(), data.fromPropertyFile("deletePopupInSRAQ"),
				"Alert message is not matching");
		alert.accept();
		softassert.assertEquals(selfRiskQuestionPg.getFailureMessage().getText(),
				data.fromPropertyFile("deleteSuccessMessageOnSRAQ"), "Alert message is not matching");
	}

	

}
