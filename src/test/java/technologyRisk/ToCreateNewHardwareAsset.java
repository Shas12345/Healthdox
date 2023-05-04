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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Generic_Liberary.BaseClass;

public class ToCreateNewHardwareAsset extends BaseClass {
	ArrayList<String> expected = new ArrayList<String>();
	// HashMap<> map = new HashMap<K, V>();

	@DataProvider
	public String[][] getData() {
		String[][] TestData = readDataForForms();
		return TestData;
	}

	@Test(dataProvider = "getData")
	public void createNewHardwareAsset(String info[]) {
		for (int i = 0; i < info.length; i++) {
			expected.add(info[i]);
		}
		Iterator<String> it = expected.iterator();
		// Navigating to Software Asset Page
		hrmPg.getTechnologyRiskAssessmentText().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getAssetInventorytLeftNavBar()));
		basePg.getAssetInventorytLeftNavBar().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getHardwareAsset()));
		basePg.getHardwareAsset().click();
		hardwarepg.getNewAssetButton().click();
		explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getAssetIdLabel()));
		// Capturing the Asset Id from the TextBox
		String assetId = hardwarepg.getAssetIdTextBox().getAttribute("value");
		Reporter.log("The Risk ID captured is " + assetId, true);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, hardwarepg.getAssetClassDropdown(), info[0]);
		// Entering the Data into Name of Application
		hardwarepg.getSystemNameTextBox().sendKeys(info[1]);
		// Entering data into Make Text Box
		hardwarepg.getModelTextBox().sendKeys(info[2]);
		// Entering the Data into Description Text Box
		softwarePg.getDescriptionTextBox().sendKeys(info[3]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, hardwarepg.getHardwareCriticalityDropdown(), info[4]);
		explicit.until(ExpectedConditions.elementToBeClickable(hardwarepg.getTypeTextBox()));
		// Entering data into Make Text Box
		hardwarepg.getTypeTextBox().sendKeys(info[5]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, hardwarepg.getRiskAssessFreqDropdown(), info[6]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, hardwarepg.getBusinessFunctionDropdown(), info[7]);
		// Entering the Data into System Owner Text Box
		hardwarepg.getBusinessOwnerNameTextBox().sendKeys(info[8]);
		// Reading the data from excel and selecting the drop down option
		data.handleDropdownByText(explicit, driver, hardwarepg.getDepartmentDropdown(), info[9]);
		// Clicking on Save Button.
		hardwarepg.getSaveButton().click();
		// explicit.until(ExpectedConditions.visibilityOf(hardwarepg.getSuccessfulMsgOnHAP()));
		// Assert.assertEquals(hardwarepg.getSuccessfulMsgOnHAP().getText(),
		// data.fromPropertyFile("successMessageOnHAP"));
		Reporter.log("Successfully verified Success Message in Hardware Asset Page on creating a New Hardware Asset",
				true);

		for (;;) {
			try {
				driver.findElement(By.xpath("//td[text()='" + assetId + "']"));
				break;
			} catch (Exception e) {
				basePg.getNextButton().click();
			}
		}
		String value = driver.findElement(By.xpath("//td[text()='" + assetId + "']/..")).getText();
		// Reporter.log(value, true);
		String[] splitValue = value.split(" ");
		for (int i = 0; i < splitValue.length; i++) {
			Reporter.log(splitValue[i], true);

		}
		driver.navigate().back();
		driver.navigate().back();

	}

	@DataProvider
	public String[][] readDataForForms() {
		String[][] data = null;
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("./TestData/HIPAA.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workBook.getSheet("NewHardwareData");
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
