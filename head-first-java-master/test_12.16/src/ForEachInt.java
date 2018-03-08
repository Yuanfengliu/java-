import java.awt.font.NumericShaper.Range.*;

public class ForEachInt {
	public static void main(String[] args){
		for (int i:Range(10)) //0..9
			System.out.println(i+"  ");
		System.out.println();
		for (int i:Range(5,10))
			System.out.println(i+"  ");
	}
}
