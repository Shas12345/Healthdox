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
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToCreateNewSoftwareAsset extends BaseClass{
	ArrayList<String> expected = new ArrayList<String>();
	@DataProvider
	public String[][] getData() {
		String[][] TestData = readDataForForms();
		return TestData;
	}
	@Test(dataProvider = "getData")
	public void newSoftwareAsset(String info[]) {
		for (int i = 0; i < info.length; i++) {
			expected.add(info[i]);
		}
		Iterator<String> it = expected.iterator();
		//Navigating to Software Asset Page
		hrmPg.getTechnologyRiskAssessmentText().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getAssetInventorytLeftNavBar()));
		basePg.getAssetInventorytLeftNavBar().click();
		explicit.until(ExpectedConditions.elementToBeClickable(basePg.getSoftwareAsset()));
		basePg.getSoftwareAsset().click();
		softwarePg.getNewAssetButton().click();
		explicit.until(ExpectedConditions.visibilityOf(softwarePg.getAssetIdLabel()));
		// Capturing the Asset Id from the TextBox
				String assetId = softwarePg.getAssetIdTextBox().getAttribute("value");
				Reporter.log("The Risk ID captured is " + assetId, true);
				extentTest.info("The Risk ID captured is " + assetId);
				// Reading the data from excel and selecting the drop down option
				data.handleDropdownByText(explicit, driver, softwarePg.getAssetClassDropdown(), info[0]);
				// Entering the Data into Name of Application
				softwarePg.getApplicationNameTextBox().sendKeys(info[1]);
				// Reading the data from excel and selecting the drop down option
				data.handleDropdownByText(explicit, driver, softwarePg.getOperatingSystemDropdown(), info[2]);
				// Entering the Data into Description Text Box
				softwarePg.getDescriptionTextBox().sendKeys(info[3]);
				//Selecting Radio Button
				driver.findElement(By.xpath("//input[@value='"+info[4]+"']")).click();
				// Reading the data from excel and selecting the drop down option
				data.handleDropdownByText(explicit, driver, softwarePg.getApplicationCriticalityDropdown(), info[5]);
				// Reading the data from excel and selecting the drop down option
				data.handleDropdownByText(explicit, driver, softwarePg.getDataClassificationDropdown(), info[6]);
				// Reading the data from excel and selecting the drop down option
				data.handleDropdownByText(explicit, driver, softwarePg.getRiskAssessFreqDropdown(), info[7]);
				// Reading the data from excel and selecting the drop down option
				data.handleDropdownByText(explicit, driver, softwarePg.getBusinessFunctionDropdown(), info[8]);
				// Entering the Data into System Owner Text Box
				softwarePg.getBusinessOwnerNameTextBox().sendKeys(info[9]);
				// Reading the data from excel and selecting the drop down option
				data.handleDropdownByText(explicit, driver, softwarePg.getDepartmentDropdown(), info[10]);
				//Clicking on Save Button.
				softwarePg.getSaveButton().click();
				extentTest.pass("Successfully created New Software Asset");
				
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
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workBook.getSheet("NewSoftwareData");
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
