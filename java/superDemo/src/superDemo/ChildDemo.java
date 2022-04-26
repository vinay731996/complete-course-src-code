package superDemo;

public class ChildDemo extends ParentDemo {
	//constructor
	public ChildDemo()
	{
		super();
		System.out.println("i m in child constructor");
	}
	
	//variable
	String name="badboy";
	public void getStringValue()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	//method
	public void getData()
	{
    super.getData();
	System.out.println("i am in child class");
	}
	
	public static void main(String[] args) {
		
		ChildDemo cd=new ChildDemo();
		cd.getStringValue();
		
		cd.getData();

	}

}
