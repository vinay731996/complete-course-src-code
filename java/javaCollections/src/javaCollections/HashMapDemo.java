package javaCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(26, "vinay");
		hm.put(29, "vijay");
		hm.put(25, "Lakshmi");
		hm.put(38, "tulasi");
		hm.put(42, "sai");
		
		
	System.out.println(	hm.get(26));
	System.out.println(	hm.get(81));
	
	hm.remove(26);
	
	  Set  sn=hm.entrySet(); //hashtable-pass to set collections
	  
	 Iterator it=sn.iterator();
	 
	 while(it.hasNext())
	 {
		 Map.Entry mp=(Map.Entry)it.next();
		System.out.print(mp.getKey()+" ");
		
		System.out.print(mp.getValue()+"\n");
		 
	 }


	}

}
