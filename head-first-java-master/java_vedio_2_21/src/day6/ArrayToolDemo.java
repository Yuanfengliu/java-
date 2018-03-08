package day6;

public class ArrayToolDemo {
	public static void main(String[] args) {
		int[] arr={3,1,87,32,8};
		int max=ArrayTool.getMax(arr);
		System.out.println(max);
		/*ArrayTool tool=new ArrayTool();
		int max=tool.getMax(arr);
		System.out.println(max);
		int min=tool.getMin(arr);
		System.out.println(min);
		tool.printArray(arr);
		tool.bubbleSort(arr);
		tool.selectSort(arr);*/
	}
}
