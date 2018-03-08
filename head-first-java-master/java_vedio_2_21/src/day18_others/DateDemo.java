package day18_others;
import java.util.*;
import java.text.*;
public class DateDemo {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		//将模式封装到SimpleDateFormat
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 E hh:mm:ss");
//		sdf.format(sdf);
		String time=sdf.format(d);
		System.out.println(time);
	}
}
