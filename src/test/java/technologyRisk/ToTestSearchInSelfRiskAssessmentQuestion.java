package technologyRisk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;
import Generic_Liberary.ReadData;

public class ToTestSearchInSelfRiskAssessmentQuestion extends BaseClass {

	@Test
	public void search() throws InterruptedException {
		hrmPg.getTechnologyRiskAssessmentText().click();
		basePg.getSystemConfiguration().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getUpdateSelfRiskAssessmentQuestions()));
		basePg.getUpdateSelfRiskAssessmentQuestions().click();
		softassert.assertEquals(selfRiskQuestionPg.getSearchLabel().isDisplayed(), true,
				"search label is not provided in self risk assessment question");
		selfRiskQuestionPg.getSearchTextBox().sendKeys(data.fromExcel("SelfAssessmentQuestrion", 1, 2));
		Thread.sleep(2000);
		List<WebElement> searchedData = driver.findElements(By.xpath("//tr[@role='row' and @class]"));
		Reporter.log("The Related Searched  data is :", true);
		for (WebElement data : searchedData) {
			try {
				explicit.until(ExpectedConditions.visibilityOfAllElements(searchedData));
			} catch (Exception e) {
				driver.navigate().refresh();
				selfRiskQuestionPg.getSearchTextBox()
						.sendKeys(((ReadData) data).fromExcel("SelfAssessmentQuestrion", 1, 2));
				Reporter.log(data.getText(), true);
			}
			Reporter.log(data.getText(), true);
		}

	}
}
