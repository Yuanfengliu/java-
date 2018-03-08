package day18_others;
import java.lang.*;
import java.util.*;
public class MathDemo {
	public static void main(String[] args) {
/*		double d=Math.ceil(-23.14);
		double d1=Math.floor(12.34);
		System.out.println(d1);*/
		Random r=new Random();
		
		for(int i=0;i<10;i++)
		{
			int d=r.nextInt(10);
			System.out.println(d);
		}
		
	}
}
