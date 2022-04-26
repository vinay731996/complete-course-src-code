package section19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Globalenvironmental {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop=new Properties();
		
		//read file
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\section19\\src\\section19\\data.properties");
	    prop.load(fis);
	    System.out.println(prop.getProperty("browser"));
	    System.out.println(prop.getProperty("url"));
	    
	    //give values in runtime
	    prop.setProperty("browser","firefox");
	    System.out.println( prop.getProperty("browser"));
	    
		//update or write data.properties file
	    
		FileOutputStream fos=new FileOutputStream("C:\\Users\\USER\\eclipse-workspace\\section19\\src\\section19\\data.properties");
        prop.store(fos, null);         
	}

}
