import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {

	    Date d=new Date();
		System.out.println(d.toString());
		
		//formate date
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/YYYY");
		System.out.println(sdf.format(d)); 
		
		SimpleDateFormat sd=new SimpleDateFormat("M/d/YYYY  hh:mm:ss");
		System.out.println(sd.format(d));
		
		
		
		
		
	}

}
