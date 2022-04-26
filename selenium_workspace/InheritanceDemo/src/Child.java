
public class Child extends Parent{
	
	public void Engine()
	{
		System.out.println("new generation engine implemented");
	}
	public void colour() 
	{
	 System.out.println("car colour is "+colour);
	}
	

	public static void main(String[] args) {
		
		System.out.println("new generation car specifications:");
		
		System.out.println(" ");
		Child c=new Child();
		
		c.colour();
		c.Engine();
		c.breaks();
		c.audioSystem();
		c.Gear();
		
		
		

	}

}
