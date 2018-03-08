package day6;
/*静态的应用
 每一个程序中都有共性 的功能，可以将这些程序进行封装
 
 接下来，将ArrayTool.class 文件发送给其他人，其他人只要将该文件设置到
 开始制作java的说明书 java的说明书通过文档注释来完成*/
/**
 这是一个可以对数组进行操作的工具类，该类中提供了获取最值，排序的功能
 @author mianhk
 @version V1.1
  
*/
public class ArrayTool {
	/**
	空参数构造函数*/
	private ArrayTool(){}
	/**
	 获取一个整形数组中的最大值
	 @param arr 接收一个int类型的数组
	 @return 会返回一个该数组中的最大值
	*/
	public static int getMax(int[] arr){
		int max=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	/**
	 获取一个整形数组中的最小值
	 @param arr 接收一个int类型的数组
	 @return 会返回一个该数组中的最小值
	 */
	public static int getMin(int[] arr){
		int min=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
	}
	/**
	给数组进行选择排序
	 @param arr 接收一个int类型的数组
	*/
	public void selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for (int y=x+1;y<arr.length;y++){
				if (arr[x]>arr[y]){
					swap(arr, x, y);
				}
			}
		}
	}
	/**
	 给数组进行冒泡排序
	 @param arr 接收一个int类型的数组
	 */
	public static void bubbleSort(int[] arr){
		for(int x=0;x<=arr.length-1;x++){
			for(int y=0;y<arr.length-x-1;y++){
				if(arr[y]>arr[y+1]){swap(arr, y, y+1);}
			}
		}
	}
	/**
	 *给数组进行位置置换
	 *@param arr 接收一个int类型的数组
	 *@param  a 要置换的位置
	 *@param  b 要置换的位置
	 * */
	private static void swap(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	 用于打印数组中的元素，打印形式是：[e1,e2...]
	 * */
	private void printArray(int[] arr){
		System.out.print("[");
		for (int x=0;x<arr.length;x++){
			if(x!=arr.length-1)
			System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
			
		}
	}

};

/*
 * 一个类中默认会有一个空参数的构造函数
 * 这个默认的构造函数的权限和所属的类一致
 * 如果这个类没有public修饰，那么默认的构造函数，那么构造函数也没有public修饰*/
 