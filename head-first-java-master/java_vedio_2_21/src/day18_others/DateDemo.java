package day18_others;
import java.util.*;
import java.text.*;
public class DateDemo {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		//��ģʽ��װ��SimpleDateFormat
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� E hh:mm:ss");
//		sdf.format(sdf);
		String time=sdf.format(d);
		System.out.println(time);
	}
}
