package cm.vtiger.genericUtilities;

public class Main {
	public static void main(String[] args) {
        try {
            PropertyFileUtility propertyFileUtility = new PropertyFileUtility();
            String propertyValue = propertyFileUtility.readDataFromPF("un"); // Replace "yourKey"
            System.out.println("Property value: " + propertyValue);
            
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            ExcelFileUtility excelFileUtility = new ExcelFileUtility();
            String excelValue = excelFileUtility.readStringDataFromExcel("Sheet1", 3, 0); // Replace with actual values
            System.out.println("Excel cell value: " + excelValue);
            
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
