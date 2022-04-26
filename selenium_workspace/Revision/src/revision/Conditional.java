package revision;

public class Conditional {

	public static void main(String[] args) {
		
		String browser="IE";
		
		if(browser.equalsIgnoreCase("chrome"))
				{
			System.out.println("tc are executed ");
				}
				
		else if(browser.equalsIgnoreCase("firefox"))
		{
	System.out.println("tc are executed ");
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
	System.out.println("tc are executed ");
		}
		else
		{
			System.out.println("kindly provide valid browser");
		}
		
		

	}

}
