package javaCollections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	
	 // can accept duplicate values 
	//ArraList,LinkedList,vector- Implementing List interface
	//array have fixed size where as arraylist can grow dynamicaly 
	//you can access and insert any value in any index 



	public static void main(String[] args) {
		
		
		ArrayList<String> a=new ArrayList<String>();	
		
		a.add("rahul");
		a.add("vinay");      //pushing values into the list
		a.add("rahul");
		a.add("rahul");
		System.out.println(a);
		
		
		a.add(0,"vijay");    //add by particular index with value
		System.out.println(a);
		
		a.remove(4);            //remove
		System.out.println(a);
		
		
		a.remove("rahul");         //remove 
		System.out.println(a);
		
		
	System.out.println(a.contains("testing"));  //values present in list
	System.out.println(a.contains("vinay"));
		
	 
	System.out.println(a.get(0));            // to pull value by index and string 
	System.out.println(a.indexOf("vinay"));
	
	
	System.out.println(a.isEmpty());  //array list is empty or not
	
	System.out.println(a.size());     //size 
		
		
		
		

		

		
		
		
		
		

	}

}
