package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnPropertiesfile {

	public static void main(String[] args) throws IOException {
			
		//Setup the filepath
		FileInputStream input=new FileInputStream("src/main/resources/Config.properties");
		
		//instantiate the properties class
		Properties prop =new Properties();
		
		//add the file to the properties class
		prop.load(input);
			//to read the data from the properties file
		System.out.println(prop.getProperty("language"));
		
		
		

	}

}
