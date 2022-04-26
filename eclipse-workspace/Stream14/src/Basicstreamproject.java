import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Basicstreamproject {

	public static void main(String[] args) {
		
		//count the no. of name starting first letter with A
//		
//		ArrayList<String> names=new ArrayList<String>();
//		names.add("Abajiet");
//		names.add("Don");
//		names.add("Abhi");
//		names.add("Abmanyam");
//		names.add("Ram");
//		int count=0;
//		
//		for(int i=0;i<names.size();i++)
//		{
//		System.out.println(names.get(i));
//
//			if(names.get(i).startsWith("A"))
//					{
//					count++;
//					}
//		
//		}
//      System.out.println(count);
//      
     //by using streams
		
		//one ways
		
//  	ArrayList<String> names=new ArrayList<String>();
//	names.add("Abajiet");
//	names.add("Don");
//	names.add("Abhi");
//	names.add("Abmanyam");
//	names.add("Ram");
//	
//	Long a=names.stream().filter(s->s.startsWith("A")).count();
//	System.out.println(a);
	
		//second way
		
//	
//     Long c= Stream.of("Abajiet","Don","Abhai","Abmanyam","Ram").filter(s->
//     {
//    	s.startsWith("A");
//    	return true;
//     }).count();	
//		System.out.println(c);

     //print all the names in arrylist
      
//  	ArrayList<String> names=new ArrayList<String>();
//	names.add("Abajiet");
//	names.add("Don");
//	names.add("Abhi");
//	names.add("Abmanyam");
//	names.add("Ram");
 //  names.stream().forEach(s->System.out.println(s));

//     names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
    // limit
//     names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

      
		
		//stream map-to modify current stream
//		
//		 Stream.of("Abajiet","Don","Abhai","Abmanyama","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//				              .forEach(s->System.out.println(s));
//		
   
		
		//sorted terminal
		
		     //convert arrys to list 
//		List<String> names=Arrays.asList("Abajiet","Don","Abhai","Abmanyam","Ram","Adam");
//		names.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
//		
        //merging two streams 
//		ArrayList<String> names=new ArrayList<String>();
//		names.add("vinay");
//		names.add("Don");
//		names.add("vijay");
//		
//		//names.stream().forEach(s->System.out.println(s));
//		
//		List<String> names1=Arrays.asList("Abajiet","Don","Abhai","Abmanyam","Ram","Adam");
//		
//		//names1.stream().forEach(s->System.out.println(s));
//
//		
//		Stream<String> newStream=Stream.concat(names.stream(),names1.stream()) ;  //merged now u can apply normal stream methods to newStream
//		
//		newStream.sorted().forEach(s->System.out.println(s));
//				
		//matching 
//	Stream<String> newStream1=Stream.concat(names.stream(),names1.stream()) ;
//		
//	boolean flag=newStream1.anyMatch(s->s.equalsIgnoreCase("adam"));
//	
//	System.out.println(flag);
//	
//	Assert.assertTrue(flag);
		
		
		//collectstream
		
//	List<String>  ls =Stream.of("Abajiet","Don","Abhai","Abmanyama","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//        .collect(Collectors.toList());//.toList //.tomap //.toset
//	System.out.println(ls.get(0));
//	  
//	  
       //Assignment
//		
//     List<Integer> names1=Arrays.asList(9,8,1,2,3,3,4,5,3,5,6);
//      //print unique number
//     //sorted
//     
//     //sorted 
//     
//     names1.stream().sorted().forEach(s->System.out.print("\t"+s));
//     
//     //unique,sorted and print index 3
//     System.out.println("\n");
//    
//    names1.stream().distinct().forEach(s->System.out.print("\t"+s));
//     
//   List<Integer> unqNo  =names1.stream().distinct().sorted().collect(Collectors.toList());
//   
//    System.out.println("\n"+unqNo.get(3));
//	
	
	}

}
