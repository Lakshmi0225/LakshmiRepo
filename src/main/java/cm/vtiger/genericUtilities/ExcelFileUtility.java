package cm.vtiger.genericUtilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
public String readStringDataFromExcel(String sheetname, int rownum,int cellnum) throws Throwable {
	FileInputStream fise = new FileInputStream(Iconstantpaths.excelpath);
	Workbook wb=WorkbookFactory.create(fise);
	//it's just return the value but it's not printing the actual data
	return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
}
}
