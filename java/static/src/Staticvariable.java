
public class Staticvariable {
	
	String name;    //
	String address;  // instance variable
	static String city="hyderabad";// class variable
	
	static int i=0;
	   //int i=0;
	
	
	Staticvariable(String name,String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	
	public void getaddress()
	{
		System.out.println(address+""+city);
	}
	
	
	public static void getCity()
	{
		System.out.println(city);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Staticvariable obj=new Staticvariable("vinay","kamlanagar");
		Staticvariable obj1=new Staticvariable("vijay","shardhangar");
        obj.getaddress();
        obj1.getaddress();
        
        Staticvariable.getCity();
        
        Staticvariable.i=5;
        
        System.out.println(i);
        
        
		
		
		
		
	}
	

	

}
