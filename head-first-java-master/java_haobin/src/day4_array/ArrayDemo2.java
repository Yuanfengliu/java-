package day4_array;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] x={1,23,4,4,56,7};
		printArray(x);
	}
	public static void printArray(int[] arr){
		//如何好看的打印数组
		System.out.print("[");
		for(int i=0;i<arr.length;i++){			
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else {
				System.out.println(arr[i]+"]");
			}
		}
	}
}
