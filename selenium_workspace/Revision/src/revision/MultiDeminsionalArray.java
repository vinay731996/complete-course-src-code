package revision;

public class MultiDeminsionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,4,5},{3,4,7},{5,2,1}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
		

	}

}
