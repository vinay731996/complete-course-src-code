package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashSet {

	public static void main(String[] args) {
		
		//duplicate values not allow
		//items stored in random order
		
		HashSet<String> s=new HashSet<String>();
		
		s.add("vinay");
		s.add("lakshmi");
		s.add("vijay");
		s.add("sai");
		s.add("tulasi");
		s.add("vinay");
		
		System.out.println(s);
		
		s.remove("vinay");
		
		System.out.println(s);
		
		System.out.println(s.size());
		
		System.out.println(s.isEmpty());
		
		
		//iterator
		
Iterator<String> it	= s.iterator();

 while(it.hasNext())
 {  
   System.out.println(it.next());
   
 }		
		
	}

}
