class ShuZu5 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		toHex(60);
		System.out.println("");//����
		toHex2(60);
	}
	/*
	0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F	==ʮ�����Ƶ�Ԫ��
	0 1 2 3 4 5 6 7 8 9 10 11 12 12 13 15
	������������е�Ԫ����ʱ�洢������������Ӧ��ϵ��
	ÿһ��&15���ֵ��Ϊ����ȥ�齨���õı����Ϳ����ҵ���Ӧ��Ԫ�ء�
	������  -10+��a'�򵥵Ķࡣ

	�������ô������?
	����ͨ�����ݵ���ʽ�����塣

	�������ڳ�����ˣ������Ƿ��ŵ���Ҫ�������أ�����ͨ��StringBuffer reverse������ɡ�
	��������������ǻ�û��ѧϰ��

	���Կ���ʹ����ѧ������������������ɴ洢��
	
	*/
	public static void toHex(int num)
	{
		//����һ����ʱ����
		char[] arr=new char[8];
		char[] chs={'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		for (int x=0;x<8 ;x++ )
		{
			int temp=num&15;
			//System.out.println(chs[temp]);
			arr[x]=chs[temp];
			num=num>>>4;
		}
		//�洢���ݵ�ARR���ݱ�����
		for (int x=arr.length-1;x>=0 ;x-- )
		{
			System.out.print(arr[x]+",");
		}
	}


/*����ӡ��߶����0*/
	public static void toHex2(int num)
	{
		//����һ����ʱ����
		char[] arr=new char[8];
		int pos=0;//����һ��ָ�룬ָ��洢������λ�á�
		char[] chs={'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		while(num!=0)
		{
			int temp= num & 15;
			//System.out.println(chs[temp]);
			arr[pos++]=chs[temp];
			//pos++;
			num = num >>> 4;
		}
		//�洢���ݵ�ARR���ݱ�����
		for (int x=pos-1;x>=0 ;x-- )
		{
			System.out.print(arr[x]+",");
		}
		
	}
}