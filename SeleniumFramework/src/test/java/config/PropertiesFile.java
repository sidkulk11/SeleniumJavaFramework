package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() throws Exception
	{
		
		Properties prop= new Properties();
		
		String projectpath = System.getProperty("user.dir");
		
		InputStream input = new FileInputStream(projectpath+  "/src/test/java/config/config.properties");
		
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
	}
	
	public static void setProperties() throws Exception
	{
		Properties prop= new Properties();
		
		String projectpath = System.getProperty("user.dir");
		
		OutputStream output = new FileOutputStream(projectpath+  "/src/test/java/config/config.properties");
		
		prop.setProperty("browser", "chrome");
		prop.store(output, null);
	}

}
