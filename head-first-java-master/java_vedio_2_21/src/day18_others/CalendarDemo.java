package day18_others;
import java.util.*;
import java.text.*;
//import java.lang.*;
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"��"+c.get(Calendar.MONTH+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
		/*Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��");
		String year=sdf.format(d);
		System.out.println(year);*/
		
	}
}
