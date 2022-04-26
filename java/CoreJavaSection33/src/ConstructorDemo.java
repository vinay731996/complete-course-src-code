
public class ConstructorDemo {
	
	//constructor will not return any value
	//constructor name as same as the class name
	//methods and constructor called by create object
	  //compile wiil call implictconstructor if you are have not defind constructor

	
	
	public ConstructorDemo()
	{
		System.out.println("I am the constructor");
	}
	
	
	
	public ConstructorDemo(int i) {
		 System.out.println("i m in int constructor");
	}



	public ConstructorDemo(String string) {
		
		System.out.println("i m in string constructor");
	}



	public ConstructorDemo(int i, String string) {
		
		System.out.println("i m in int and string constructor");
	}



	public void getMethod()
	{
		System.out.println("I am the method");
	}
	
	

		public static void main(String[] args) {
			
			
			ConstructorDemo cd=new ConstructorDemo();
			ConstructorDemo d=new ConstructorDemo(5);
			ConstructorDemo sd=new ConstructorDemo("vinay");
			ConstructorDemo f=new ConstructorDemo(5,"vinay");


			
	
	}

}
