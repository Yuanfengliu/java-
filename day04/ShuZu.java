class  ShuZu
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//int[] arr=new int[2];//Ҳ�������� int arr[]=new int[2];
		//int[] arr=new int[]{3,2,4,5,6};//ע��[]�ڳ��ȾͲ�Ҫд��
		int[] arr={3,2,4,5,6};//������ȷ������£������֡�7,8��һ����
		System.out.println(arr[2]);
		//ʹ����������һ�����Կ���ֱ�ӻ�ȡ������Ԫ�صĸ�����length
		//ʹ�÷�ʽ����������.length=
		System.out.println("length:"+arr.length);
		for (int x=0;x<5 ;x++ )
		{
			System.out.println("arr["+x+"]="+arr[x]+";");
		}
		printArray(arr);
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
}