/*
����Ĳ��Ҳ���
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
�۰���ң�����Ҫ��֤����������������顣
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
				return -1;//�������ݲ����ڵĻ�����֪�����������ڸ��������
								//���λ�ã��ͷ���min����return min;
		}
		
		return mid;
	}
/*
�۰�ĵڶ��ַ�ʽ��
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



//�����в��Ҿ������,���幦�ܣ���ȡkey��һ�γ����������е�λ�ã��������ʱ-1����ô�����key�������в����ڡ�
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
