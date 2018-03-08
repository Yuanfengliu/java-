/*
数组的查找操作
*/
class ShuZu3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[] arr=new int[]{3,1,6,3,5,9,8};
		int[] arr1=new int[]{1,2,6,13,15,19,28};
		int index=getIndex(arr,1);
		System.out.println("Index="+index);
		int index1=halfSearch2(arr1,15);
		System.out.println("Index1="+index1);
	}

/*
折半查找，必须要保证该数组是有序的数组。
*/
	public static int halfSearch(int[] arr,int key)
	{
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(max+min)/2;
		while (arr[mid]!=key)
		{
			if (key>arr[mid])
				min=mid+1;
			else if (key<arr[mid])
				max=mid-1;
			mid=(max+min)/2;
			if(min>max)
				return -1;//若该数据不存在的话，想知道该数据能在该有序的数
								//组的位置，就返回min，即return min;
		}
		
		return mid;
	}
/*
折半的第二种方式。
*/
	public static int halfSearch2(int[] arr,int key)
	{
		int min=0,max=arr.length-1,mid;
		while (min<=max)
		{
			mid=(max+min)>>1;
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			else
				return mid;
		}
			return -1;
	}



//函数中查找具体的数,定义功能，获取key第一次出现在数组中的位置，如果返回时-1，那么代表该key在数组中不存在。
	public static int getIndex(int[] arr,int key)
	{
		for (int x=0;x<arr.length ;x++ )
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
}
