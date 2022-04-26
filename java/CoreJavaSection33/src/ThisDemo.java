
public class ThisDemo {
	
	
	
	int a=3;

	public void data()
	{
		int a=5;
		System.out.println(a);
		System.out.println(this.a);//this refers to current object-object scope lie in class level
	}


	public static void main(String[] args) {
	
		ThisDemo d=new ThisDemo();
		d.data();


	}

}
