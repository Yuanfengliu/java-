import java.util.*;//java�����õ��ģ�������󣬺���ֱ����Arrays.sort(arr2);����
class ShuZu2 
{/***********��������***********************/
	public static void main(String[] args) 
	{
		int[] arr=new int[]{3,1,6,3,5,9,8};
		int[] arr1=new int[]{3,2,6,4,5,9,8,1};
		int[] arr2=new int[]{2,1,4,3,5,9,9,4};
		
		System.out.println("Hello World!");
		printArray(arr);//����ǰ��ӡ
		paixu(arr);//ѡ������
		System.out.println(arr[0]);//�����һ��
		printArray(arr);//ѡ��������ӡ
		bubblesort(arr1);//����ð�ݺ���
		printArray(arr1);//��ð�ݺ��ӡ
		Arrays.sort(arr2);//���������У�һ����������ȽϿ졣���ǳ���ͷ������import java.util.*;
		printArray(arr2);
	}
	public static void paixu(int arr[])//ѡ������
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=x+1;y<arr.length ;y++ )
			{
				if (arr[x]>arr[y])//��С��������Ӵ�С���Ѵ��ںŸĳ�С�ںż���
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
	public static void printArray(int[] arr)//������ӡ����ĺ���
	{	System.out.print("{");
		for (int x=0;x<arr.length ;x++ )
		{	
			if (x!=arr.length-1)//ǰ���ĸ��ж���
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"}");//���һ��û�ж��ţ�
		}
	}
	public static void bubblesort(int[] arr)//ð������
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=0;y<arr.length-x-1 ;y++ )//-X:Ϊ����ÿһ�αȽϵ�Ԫ�ؼ��٣�-1������Ǳ�Խ��
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
	public static void swap(int[] arr,int a,int b)//��������ѡ��������ð�����򣬽���������ͬ����дһ������swap
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}