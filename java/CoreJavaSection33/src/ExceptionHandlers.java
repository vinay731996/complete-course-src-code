
public class ExceptionHandlers {

	public static void main(String[] args) {
		
		
		
		try {
			
            String a = null; //null value
            System.out.println(a.charAt(0));
            
        }
		
//		catch(ArithmeticException e)
//		{
//			System.out.println("Airthemetic Exception");
//		}
//		
//		catch(NullPointerException e) {
//            System.out.println("NullPointerException..");
//        }
//		catch (Exception e) {
//			
//			System.out.println("Exception in the code");
//
//		}
//		
          
		finally
		{
			System.out.println("cookies cleared");
		}
		
		
		
	}

}
