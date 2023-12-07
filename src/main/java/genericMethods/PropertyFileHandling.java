package genericMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHandling {

	public static String readDataPropFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(FrameWorkConstants.PROP_FILE_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		String value= (String) prop.get(key);
		return value;
	}
	
}
