import java.util.ArrayList;
import java.util.stream.Stream;

public class PrintUniquenumberinarray {

	public static void main(String[] args) {

		
		
		
		//Stream.of(1,4,5, 7,3,6,2,4,5,6,2,8).distinct().sorted().forEach(s->System.out.println(s));
		
		//refer section14-selenium java streams
		//assignment
		
		
		int a[] ={ 4,5,5,5,4,6,6,9,4}; 
		// Print unique number from the list- Amazon  
		//print the string in reverse
		ArrayList<Integer> ab =new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{ 
			int k=0;
			if(!ab.contains(a[i])) 
			{
				ab.add(a[i]); 
				k++; 
				for(int j=i+1;j<a.length;j++) 
				{
					if(a[i]==a[j])
					{
						k++; 
					}
					} 
				//System.out.println(a[i]); //System.out.println(k); 
				if(k==1) 
					System.out.println(a[i]+"is unique number"); 
			}
		}
	}

}
