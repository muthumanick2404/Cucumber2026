package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
	public static Properties pobj;
	static {
		String env = System.getProperty("env","qa");
		pobj= new Properties();
		try {
			pobj.load(new FileInputStream(new File("src/test/resources/config/"+env+".properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static String getProperty(String key) {
		String value=pobj.getProperty(key);
		return value;
	
	}
}
