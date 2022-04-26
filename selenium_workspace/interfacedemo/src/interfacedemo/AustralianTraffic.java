package interfacedemo;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{
	
	
	public static void main(String[] args)
	{
		ContinentalTraffic a=new AustralianTraffic();
		a.train();
		
		
		CentralTraffic b=new AustralianTraffic();
		b.red();
		b.green();
		b.yellow();
		
		
		AustralianTraffic c=new AustralianTraffic();
		c.ownsymbolforwaking();
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	@Override
	public void train() {
		// TODO Auto-generated method stub
		
		System.out.println("train implemented");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red implemented");

		
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green implemented");

		
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow implemented");

	}
    public void ownsymbolforwaking() 
    {
		System.out.println("our own walking sysmbol implemented");

    }
    
		
	}
	

	

