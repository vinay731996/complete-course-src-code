package demo;

public class Democlass {

	public static void main(String[] args) {
		
		
		
		String website="vinay is god boy";
		

	 boolean mystatus =true;
	 boolean a;
	 a=false;
	 
	 System.out.println("first my status " +mystatus);
	 System.out.println("update my status " +a);
	 
	 int b=10;
	 char c=65;
	 double d=60.59;
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println(d);
	 System.out.println("my string "+website);

	 
    int[] arr=new int[5];
	 
	 arr[0]=1;
	 arr[1]=2;
	 arr[2]=3;
	 arr[3]=4;
	 arr[4]=5;
	 
	 for(int s:arr)
	 {
	 System.out.print(s );
	 }
	 
	 
 for(int i=0;i<arr.length;i++)
	 {
	 System.out.println(arr[i]);
	 }
	 

	 int[] arr2= {1,2,3,4,5,6,7,8,9,10,11};

	 for(int i=0;i<arr2.length;i++)
	 {
	 System.out.println(arr2[i]);
	 }
	 
	 String[] list= {"vinay","vijay","lakshmi","sai","tulasi"};
	 for(int i=0;i<list.length;i++)
	 {
		 System.out.println(list[i]);
	 }
	 
	 for(String s : list)
	 {
		 System.out.println(s);
	 }
	}

}
