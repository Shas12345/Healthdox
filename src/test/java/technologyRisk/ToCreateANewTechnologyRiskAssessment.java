package technologyRisk;

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

public class ToCreateANewTechnologyRiskAssessment extends BaseClass {
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
		Iterator<String> it = expected.iterator();
		explicit.until(ExpectedConditions.elementToBeClickable(hrmPg.getTechnologyRiskAssessmentText()));
		hrmPg.getTechnologyRiskAssessmentText().click();
		basePg.getRiskAssessmentArrow().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getNewRisk()));
		basePg.getNewRisk().click();
		// Capturing the Risk Id from the TextBox
		String riskId = basePg.getRiskIdTextBox().getAttribute("value");
		Reporter.log("The Risk ID captured is " + riskId, true);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, basePg.getRiskAssetDropdown(), info[0]);
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
		// Reading the data from excel and selecting the dropdown option
		data.handleDropdownByText(explicit, driver, basePg.getRiskInputDropdown(), info[5]);
		// Reading the data from excel and selecting the dropdown option
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
		data.handleDropdownByText(explicit, driver, basePg.getRiskImpactDropdown(), info[10]);
		// Reading the data from excel and selecting the dropdown option
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
		js.executeScript("arguments[0].scrollIntoView(false)", basePg.getSaveButton());
		data.handleDropdownByText(explicit, driver, basePg.getResponsibleDebtDropdown(), info[19]);
		//capturing the Target Quarter
		String quarter = basePg.getTargetQurterTextBox().getAttribute("value");
		Reporter.log("The Target Quarter is :" + quarter, true);
		// Reading the data from excel and selecting the dropdown option
		data.handleDropdownByText(explicit, driver, basePg.getRiskResponseDropdown(), info[20]);
		// Reading the data from excel and selecting the dropdown option
		data.handleDropdownByText(explicit, driver, basePg.getStatusDropdown(), info[21]);
		// Entering the Data into Target Date TextBox
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getClosedDateTextBox()));
		basePg.getClosedDateTextBox().sendKeys(info[22]);
		// Clicking on Save Button
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getSaveButton()));
		basePg.getSaveButton().click();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getSuccessfullPopupHeader()));
		for (;;) {
			try {
				driver.findElement(By.xpath("//span[contains(text(),'" + riskId + "')]/../.."));
				break;
			} catch (Exception e) {
				basePg.getNextButton().click();
			}
		}
		/*
		 * String[] value = driver.findElement(By.xpath("//span[contains(text(),'" +
		 * riskId + "')]/../..")).getText() .s
		 *///plit(" ");
		/*
		 * for (int i = 0; i < value.length; i++) { System.out.println(value[i]); }
		 */
		driver.findElement(By
				.xpath("//span[contains(text(),'" + riskId + "')]/../..//i[contains(@class,'ace-icon fa fa-pencil')]"))
				.click();
		Reporter.log("The Data in Edit Technology Risk Assessment Page is :", true);
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getRiskIdTextBox()));
		// Conforming the data entered in edit
		String riskIdOnEditPage = basePg.getRiskIdTextBox().getAttribute("value");
		Reporter.log(riskIdOnEditPage, true);
		String departmentNameTextBoxOnEditPage = basePg.getDepartmentNameTextBox().getAttribute("value");
		Reporter.log(departmentNameTextBoxOnEditPage, true);
		String assetNameTextBoxOnEditPage = basePg.getAssetNameTextBox().getAttribute("value");
		Reporter.log(assetNameTextBoxOnEditPage, true);
		String assessorTextBoxOnEditPage = basePg.getAssessorTextBox().getAttribute("value");
		Reporter.log(assessorTextBoxOnEditPage, true);
		String riskInputDropdownOnEditPage = basePg.getRiskInputDropdown().getText();
		Reporter.log(riskInputDropdownOnEditPage, true);
		String threadSourceDropdownOnEditPage = basePg.getThreadSourceDropdown().getText();
		Reporter.log(threadSourceDropdownOnEditPage, true);
		String riskDescriptionTextBoxOnEditPage = basePg.getRiskDescriptionTextBox().getAttribute("value");
		Reporter.log(riskDescriptionTextBoxOnEditPage, true);
		String threatDescriptionTextBoxOnEditPage = basePg.getThreatDescriptionTextBox().getAttribute("value");
		Reporter.log(threatDescriptionTextBoxOnEditPage, true);
		String existingControlTextBoxOnEditPage = basePg.getExistingControlTextBox().getAttribute("value");
		Reporter.log(existingControlTextBoxOnEditPage, true);
		String riskImpactDropdownOnEditPage = basePg.getRiskImpactDropdown().getText();
		Reporter.log(riskImpactDropdownOnEditPage, true);
		String impactLevelDropdownOnEditPage = basePg.getImpactLevelDropdown().getText();
		Reporter.log(impactLevelDropdownOnEditPage, true);
		js.executeScript("arguments[0].scrollIntoView(false)", basePg.getResponsibleDeptLabel());
		String controlNameDropdownOnEditPage = basePg.getControlNameDropdown().getText();
		Reporter.log(controlNameDropdownOnEditPage, true);
		
		String subControlNameDropdownOnEditPage = basePg.getSubControlNameDropdown().getText();
		Reporter.log(subControlNameDropdownOnEditPage, true);
		String descriptionTextBoxOnEditPage = basePg.getDescriptionTextBox().getAttribute("value");
		Reporter.log(descriptionTextBoxOnEditPage, true);
		String targetQurterTextBoxOnEditPage = basePg.getTargetQurterTextBox().getAttribute("value");
		Reporter.log(targetQurterTextBoxOnEditPage, true);
		js.executeScript("arguments[0].scrollIntoView(false)", basePg.getSaveButton());
		String responsibleDebtDropdownOnEditPage = basePg.getResponsibleDebtDropdown().getText();
		Reporter.log(responsibleDebtDropdownOnEditPage, true);
		String riskResponseDropdownOnEditPage = basePg.getRiskResponseDropdown().getText();
		Reporter.log(riskResponseDropdownOnEditPage, true);
		data.handleDropdownByText(explicit, driver, basePg.getStatusDropdown(), info[23]);
		String statusDropdownOnEditPage = basePg.getStatusDropdown().getText();
		Reporter.log(statusDropdownOnEditPage, true);
		String closedDateTextBoxOnEditPage = basePg.getClosedDateTextBox().getAttribute("value");
		Reporter.log(closedDateTextBoxOnEditPage, true);
		basePg.getSaveButton().click();
		// Assert.assertEquals(basePg.getTextOnSuccessfullPopup(),
		// technoPg.getTechnologyPageTitle(),
		// "User is not able to save the Edit and save the Technology Risk Assessment");
		for (int i = 0; i <= 4; i++) {
			driver.navigate().back();
		}
		/*
		 * for (int i = 0; i < value.length; i++) { if (i == 0 &&
		 * value[i].equals(riskId)) Reporter.
		 * log("The Creasted New Technology exists in Edit Risk Page with Risk Id " +
		 * riskId, true); else if (i == 1 && value[i].equals(info[0])) Reporter.
		 * log("The Created New Technology exists in Edit Risk Page with Risk Asset Class "
		 * + info[0], true); else if (i == 2 && value[i].equals(info[2])) Reporter.
		 * log("The Created New Technology exists in Edit Risk Page with Asset Name " +
		 * info[2], true); else if (i == 3 && value[i].equals(info[4])) Reporter.
		 * log("The Created New Technology exists in Edit Risk Page with Assessed date "
		 * + info[4], true); else if (i == 4 && value[i].equals(info[7])) Reporter.
		 * log("The Created New Technology exists in Edit Risk Page with Risk description "
		 * + info[7], true); else
		 * Reporter.log("The Created New Technology not exists in the Edit Risk Page",
		 * true); }
		 */
		// Reporter.log(value, true);

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
		Sheet sheet = workBook.getSheet("NewTechnologyData");
		DataFormatter formatter = new DataFormatter();

		// Get physical number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		// Get Physical number of cells
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		data = new String[rows - 1][cells];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				String cellData = formatter.formatCellValue(sheet.getRow(i).getCell(j));
				;
				data[i - 1][j] = cellData;
			}

		}
		return data;
	}
}
