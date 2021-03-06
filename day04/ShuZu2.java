import java.util.*;//java开发用到的，有这个后，后面直接用Arrays.sort(arr2);即可
class ShuZu2 
{/***********数组排序***********************/
	public static void main(String[] args) 
	{
		int[] arr=new int[]{3,1,6,3,5,9,8};
		int[] arr1=new int[]{3,2,6,4,5,9,8,1};
		int[] arr2=new int[]{2,1,4,3,5,9,9,4};
		
		System.out.println("Hello World!");
		printArray(arr);//排序前打印
		paixu(arr);//选择排序
		System.out.println(arr[0]);//输出第一个
		printArray(arr);//选择排序后打印
		bubblesort(arr1);//调用冒泡函数
		printArray(arr1);//，冒泡后打印
		Arrays.sort(arr2);//开发过程中，一般用这个，比较快。但是程序开头必须有import java.util.*;
		printArray(arr2);
	}
	public static void paixu(int arr[])//选择排序法
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=x+1;y<arr.length ;y++ )
			{
				if (arr[x]>arr[y])//从小到大，若想从大到小，把大于号改成小于号即可
				{
					/* int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
					*/
					swap(arr,x,y);
				}
			}
		}
	}
	public static void printArray(int[] arr)//创建打印数组的函数
	{	System.out.print("{");
		for (int x=0;x<arr.length ;x++ )
		{	
			if (x!=arr.length-1)//前面四个有逗号
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"}");//最后一个没有逗号！
		}
	}
	public static void bubblesort(int[] arr)//冒泡排序法
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=0;y<arr.length-x-1 ;y++ )//-X:为了让每一次比较的元素减少；-1：避免角标越界
			{
				if (arr[y]>arr[y+1])
				{
					/*int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp; */
					swap(arr,y,y+1);
				}
			}
		}
	}
	public static void swap(int[] arr,int a,int b)//发现无论选择排序还是冒泡排序，交换部分相同，故写一个函数swap
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
