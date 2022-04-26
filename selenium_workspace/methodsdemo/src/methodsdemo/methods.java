package methodsdemo;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d=getmethod();
		System.out.println(d);
		
		
		Methods2 e=new Methods2();
		String f=e.getmethod2();
		System.out.println(f);

		
		
		
		

		
		

	}
	
	public static  String getmethod() {
		
		System.out.println("hello world");
		return"vinay";
	}
}
