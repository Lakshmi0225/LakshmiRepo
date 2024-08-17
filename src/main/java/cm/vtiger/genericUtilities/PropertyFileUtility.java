package cm.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
public String readDataFromPF(String key) throws Throwable {
	FileInputStream fis=new FileInputStream(Iconstantpaths.propertyfilepath);
	Properties p = new Properties();
	p.load(fis);
	return p.getProperty(key);
}
}
