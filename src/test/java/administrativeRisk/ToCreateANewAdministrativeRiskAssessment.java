package administrativeRisk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Generic_Liberary.BaseClass;

public class ToCreateANewAdministrativeRiskAssessment extends BaseClass {
	ArrayList<String> expected = new ArrayList<String>();
	ArrayList<String> actual = new ArrayList<String>();

	@DataProvider
	public String[][] getData() {
		String[][] TestData = readDataForForms();
		return TestData;
	}

	@Test(dataProvider = "getData")
	public void newTchnologyRiskAssessment(String info[]) throws InterruptedException {
		for (int i = 0; i < info.length; i++) {
			expected.add(info[i]);
		}
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getAdministrativeRiskAssessmentText()));
		hrmPg.getAdministrativeRiskAssessmentText().click();
		basePg.getRiskAssessmentArrow().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getNewRisk()));
		basePg.getNewRisk().click();
		// Capturing the Risk Id from the TextBox
		String riskId = basePg.getRiskIdTextBox().getAttribute("value");
		Reporter.log("The Risk ID captured is " + riskId, true);
		extentTest.info("The Risk ID captured is " + riskId);
		expected.add(0, riskId);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, adminPg.getRiskAgentDropdown(), info[0]);
		// Entering the Data into DepartmentName
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getDepartmentNameTextBox()));
		basePg.getDepartmentNameTextBox().sendKeys(info[1]);
		// Entering the Data into EntityName TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getAssetNameTextBox()));
		basePg.getAssetNameTextBox().sendKeys(info[2]);
		// Entering the Data into Assessor TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getAssessorTextBox()));
		basePg.getAssessorTextBox().sendKeys(info[3]);
		// Entering the Data into Assessed TextBox
		basePg.getAssessedTextBox().sendKeys(Keys.CONTROL + "a");
		basePg.getAssessedTextBox().sendKeys(info[4]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, basePg.getRiskInputDropdown(), info[5]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, basePg.getThreadSourceDropdown(), info[6]);
		// Entering the Data into Risk Description TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getRiskDescriptionTextBox()));
		basePg.getRiskDescriptionTextBox().sendKeys(info[7]);
		// Entering the Data into Threat Description TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getThreatDescriptionTextBox()));
		basePg.getThreatDescriptionTextBox().sendKeys(info[8]);
		// Entering the Data into Existing Controls TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getExistingControlTextBox()));
		basePg.getExistingControlTextBox().sendKeys(info[9]);
		// Reading the data from excel and selecting the drop down option
		try {
			data.handleDropdownByText(explicit, driver, basePg.getRiskImpactDropdown(), info[10]);
		} catch (Exception e) {
			driver.switchTo().activeElement().sendKeys(info[10], Keys.ENTER);
		}
	//	data.handleDropdownByText(explicit, driver, basePg.getRiskImpactDropdown(), info[10]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, basePg.getProbabilityOfOccuranceDropdown(), info[11]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, basePg.getImpactLevelDropdown(), info[12]);
		// Clicking on Radio Button
		explicit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='lbl'])[" + info[13] + "]")));
		driver.findElement(By.xpath("(//span[@class='lbl'])[" + info[13] + "]")).click();
		// Reading the data from excel and selecting the drop down option
		js.executeScript("arguments[0].scrollIntoView(false)", basePg.getResponsibleDeptLabel());
		data.handleDropdownByText(explicit, driver, basePg.getControlNameDropdown(), info[14]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, basePg.getSubControlNameDropdown(), info[15]);
		// Capturing description from Text Box
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getDescriptionTextBox()));
		Thread.sleep(2000);
		String description = basePg.getDescriptionTextBox().getAttribute("value");
		Reporter.log("The captured description :" + description, true);
		// extentTest.info("The captured description :" + description);
		expected.add(17, description);
		// Entering the Data into New Controls TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getActionProposedTextBox()));
		basePg.getActionProposedTextBox().sendKeys(info[16]);
		// Entering the Data into Responsible TextBox
		basePg.getResponsibleTextBox().sendKeys(info[17]);
		// Entering the Data into Target Date TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getTargetDateTextBox()));
		basePg.getTargetDateTextBox().sendKeys(info[18], Keys.ENTER);
		// Capturing description from Text Box
		explicit.until(ExpectedConditions.visibilityOf(basePg.getActionProposedTextBox()));
		// Reading the data from excel and selecting the dropdown option
		js.executeScript("arguments[0].scrollIntoView(false)", adminPg.getSaveButton());
		data.handleDropdownByText(explicit, driver, basePg.getResponsibleDebtDropdown(), info[19]);
		// capturing the Target Quarter
		String quarter = basePg.getTargetQurterTextBox().getAttribute("value");
		Reporter.log("The Target Quarter is :" + quarter, true);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, basePg.getRiskResponseDropdown(), info[20]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, basePg.getStatusDropdown(), info[21]);
		// Entering the Data into Target Date TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getClosedDateTextBox()));
		basePg.getClosedDateTextBox().sendKeys(info[22]);
		// Clicking on Save Button
		explicit.until(ExpectedConditions.elementToBeClickable(adminPg.getSaveButton()));
		expected.remove(14);
		expected.remove(expected.size() - 1);
		System.out.println(expected.size());
		adminPg.getSaveButton().click();

		explicit.until(ExpectedConditions.visibilityOf(basePg.getSuccessfullPopupHeader()));
		for (;;) {
			try {
				driver.findElement(By.xpath("//span[contains(text(),'" + riskId + "')]/../.."));
				break;
			} catch (Exception e) {
				basePg.getNextButton().click();
			}
		}
		driver.findElement(By
				.xpath("//span[contains(text(),'" + riskId + "')]/../..//i[contains(@class,'ace-icon fa fa-pencil')]"))
				.click();
		Reporter.log("The Data in Edit Administrative Risk Assessment Page is :", true);
		explicit.until(ExpectedConditions.textToBePresentInElementValue(basePg.getRiskIdTextBox(), riskId));
		// Conforming the data entered in edit
		String riskIdOnEditPage = basePg.getRiskIdTextBox().getAttribute("value");
		actual.add(riskIdOnEditPage);
		Reporter.log(riskIdOnEditPage, true);
		String riskAgentDropdownOnEditPage = adminPg.getRiskAgentDropdown().getText();
		Reporter.log(riskAgentDropdownOnEditPage, true);
		actual.add(riskAgentDropdownOnEditPage);
		String departmentNameTextBoxOnEditPage = basePg.getDepartmentNameTextBox().getAttribute("value");
		Reporter.log(departmentNameTextBoxOnEditPage, true);
		actual.add(departmentNameTextBoxOnEditPage);
		String assetNameTextBoxOnEditPage = basePg.getAssetNameTextBox().getAttribute("value");
		Reporter.log(assetNameTextBoxOnEditPage, true);
		actual.add(assetNameTextBoxOnEditPage);
		String assessorTextBoxOnEditPage = basePg.getAssessorTextBox().getAttribute("value");
		Reporter.log(assessorTextBoxOnEditPage, true);
		actual.add(assessorTextBoxOnEditPage);
		String assessedTextBoxOnEditPage = basePg.getAssessedTextBox().getAttribute("value");
		Reporter.log(assessedTextBoxOnEditPage, true);
		actual.add(assessedTextBoxOnEditPage);
		String riskInputDropdownOnEditPage = basePg.getRiskInputDropdown().getText();
		actual.add(riskInputDropdownOnEditPage);
		Reporter.log(riskInputDropdownOnEditPage, true);
		String threadSourceDropdownOnEditPage = basePg.getThreadSourceDropdown().getText();
		actual.add(threadSourceDropdownOnEditPage);
		Reporter.log(threadSourceDropdownOnEditPage, true);
		String riskDescriptionTextBoxOnEditPage = basePg.getRiskDescriptionTextBox().getAttribute("value");
		actual.add(riskDescriptionTextBoxOnEditPage);
		Reporter.log(riskDescriptionTextBoxOnEditPage, true);
		String threatDescriptionTextBoxOnEditPage = basePg.getThreatDescriptionTextBox().getAttribute("value");
		actual.add(threatDescriptionTextBoxOnEditPage);
		Reporter.log(threatDescriptionTextBoxOnEditPage, true);
		String existingControlTextBoxOnEditPage = basePg.getExistingControlTextBox().getAttribute("value");
		actual.add(existingControlTextBoxOnEditPage);
		Reporter.log(existingControlTextBoxOnEditPage, true);
		String riskImpactDropdownOnEditPage = basePg.getRiskImpactDropdown().getText();
		actual.add(riskImpactDropdownOnEditPage);
		Reporter.log(riskImpactDropdownOnEditPage, true);
		String probabilityOfOccuranceDropdownOnEditPage = basePg.getProbabilityOfOccuranceDropdown().getText();
		Reporter.log(probabilityOfOccuranceDropdownOnEditPage, true);
		actual.add(probabilityOfOccuranceDropdownOnEditPage);
		String impactLevelDropdownOnEditPage = basePg.getImpactLevelDropdown().getText();
		actual.add(impactLevelDropdownOnEditPage);
		Reporter.log(impactLevelDropdownOnEditPage, true);
		js.executeScript("arguments[0].scrollIntoView(false)", basePg.getResponsibleDeptLabel());
		String controlNameDropdownOnEditPage = basePg.getControlNameDropdown().getText();
		actual.add(controlNameDropdownOnEditPage);
		Reporter.log(controlNameDropdownOnEditPage, true);
		String subControlNameDropdownOnEditPage = basePg.getSubControlNameDropdown().getText();
		actual.add(subControlNameDropdownOnEditPage);
		Reporter.log(subControlNameDropdownOnEditPage, true);
		String descriptionTextBoxOnEditPage = basePg.getDescriptionTextBox().getAttribute("value");
		actual.add(descriptionTextBoxOnEditPage);
		Reporter.log(descriptionTextBoxOnEditPage, true);
		String actionProposedTextBoxOnEditPage = basePg.getActionProposedTextBox().getAttribute("value");
		Reporter.log(actionProposedTextBoxOnEditPage, true);
		actual.add(actionProposedTextBoxOnEditPage);
		String responsibleTextBoxOnEditPage = basePg.getResponsibleTextBox().getAttribute("value");
		Reporter.log(responsibleTextBoxOnEditPage, true);
		actual.add(responsibleTextBoxOnEditPage);
		String targetDateTextBoxOnEditPage = basePg.getTargetDateTextBox().getAttribute("value");
		Reporter.log(targetDateTextBoxOnEditPage,true);
		actual.add(targetDateTextBoxOnEditPage);
		String targetQurterTextBoxOnEditPage = basePg.getTargetQurterTextBox().getAttribute("value");
		Reporter.log(targetQurterTextBoxOnEditPage, true);
	//	actual.add(targetQurterTextBoxOnEditPage);
		js.executeScript("arguments[0].scrollIntoView(false)", adminPg.getSaveButton());
		String responsibleDebtDropdownOnEditPage = basePg.getResponsibleDebtDropdown().getText();
		actual.add(responsibleDebtDropdownOnEditPage);
		Reporter.log(responsibleDebtDropdownOnEditPage, true);
		String riskResponseDropdownOnEditPage = basePg.getRiskResponseDropdown().getText();
		actual.add(riskResponseDropdownOnEditPage);
		Reporter.log(riskResponseDropdownOnEditPage, true);
		// data.handleDropdownByText(explicit, driver, basePg.getStatusDropdown(),
		// info[23]);
		String statusDropdownOnEditPage = basePg.getStatusDropdown().getText();
		Reporter.log(statusDropdownOnEditPage, true);
		actual.add(statusDropdownOnEditPage);
		String closedDateTextBoxOnEditPage = basePg.getClosedDateTextBox().getText();
		actual.add(closedDateTextBoxOnEditPage);
		Reporter.log(closedDateTextBoxOnEditPage, true);

		System.out.println(actual.size());
		System.out.println("The actual data");
		for (String actualData : actual) {
			System.out.println(actualData);

		}

		for (int i = 0; i < expected.size() - 1; i++) {
			if (expected.get(i).equalsIgnoreCase(actual.get(i))) {
				continue;
			} else {
				Reporter.log("The data is not matching Expected " + expected.get(i) + " but found " + actual.get(i),
						true);
				extentTest.fail("The data is not matching Expected " + expected.get(i) + " but found " + actual.get(i));

			}
		}
		expected.removeAll(expected);
		actual.removeAll(actual);

		adminPg.getSaveButton().click();
		// softassert.assertEquals(basePg.getTextOnSuccessfullPopup(),
		// technoPg.getAdministrativePageTitle(), //
		// "User is not able to save the Edit and save the Administrative Risk Assessment");
		for (int i = 0; i <= 4; i++) {
			driver.navigate().back();
		}

	}

	@DataProvider
	public String[][] readDataForForms() {
		String[][] data = null;
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("./TestData/HIPAA.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workBook.getSheet("NewAdministrativeData");
		DataFormatter formatter = new DataFormatter();

		// Get Administrative number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		// Get Administrative number of cells
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		data = new String[rows - 1][cells];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				String cellData = formatter.formatCellValue(sheet.getRow(i).getCell(j));
				data[i - 1][j] = cellData;
			}

		}
		return data;
	}
}
