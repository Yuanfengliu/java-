class ShuZu6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//toHex(60);
		toHex(60);
		System.out.println("");//����
		toBin(6);
	}
/*ʮ����ת������*/
	public static void toBin(int num)
	{
		//����һ�������Ƶı�
		char[] chs={'0','1'};

		//����һ����ʱ�洢��
		char[] arr =new char[32];

		//����һ�����������ָ��
		int pos=arr.length;

		while (num!=0)
		{
			int temp=num&1;
			arr[--pos]=chs[temp];
			num=num>>>1;
		}
		for (int x=pos;x<arr.length ;x++ )
		{
			System.out.print(arr[x]);			
		}
	}

/*����ӡ��߶����0��ʮ������*/
	public static void toHex(int num)
	{
		
		//����һ����ʱ����
		char[] arr=new char[8];
		int pos=arr.length-1;//����һ��ָ�룬ָ��洢������λ�á�
		char[] chs={'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		while(num>0)
		{
			int temp= num & 15;
			//System.out.println(chs[temp]);
			arr[pos]=chs[temp];
			pos--;
			num = num >>> 4;			
		}
		//�洢���ݵ�ARR���ݱ�����
		System.out.println(arr.length-1);
		System.out.println("pos="+pos);
		for (int x=pos+1;x<arr.length ;x++ )
		{
			System.out.print(arr[x]+",");			
		}		
	}
}