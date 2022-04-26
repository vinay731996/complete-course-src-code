package methodsdemo;

public class FunctionOverloading {
	
	
	public void payment(int a)
	{
		System.out.println(a);
	}
	public void payment(int a, int b)
	{
		System.out.println("a is "+a+" and b is "+b);
	}
	public void payment(String a)
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading fol=new FunctionOverloading();
		fol.payment(100);
		fol.payment("payment success");
		fol.payment(1, 100);
		

	}

}
