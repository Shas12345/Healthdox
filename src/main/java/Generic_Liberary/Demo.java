package Generic_Liberary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Demo {
	FileInputStream fis;
	ReadData data = new ReadData();
	@Test
	public void data() {
		
		Workbook workBook = null;
		try {
			 fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\TestScripts_HIPAA\\TestData\\Dropdown.xlsx");
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
		Sheet sheetInfo = workBook.getSheet("Sheet1");
		int columnCount = sheetInfo.getRow(0).getPhysicalNumberOfCells();
		String data[][] = new String[1][columnCount];

		for (int j = 0; j < columnCount; j++) {
			data[0][j] = sheetInfo.getRow(0).getCell(j).toString();
		}
	}

}
