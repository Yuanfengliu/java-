/*��ǰ�漸���ļ��з��֣�����ת���й������֣���д��һ����������*/

class ShuZu7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		toBin(-6);
		System.out.println("");
		toHex(60);
		System.out.println("");
		toBa(60);

	}
	/*ʮ����ת������*/
	public static void toBin(int num)
	{
		trans(num,1,1);
	}
	/*ʮ����ת�˽���*/
	public static void toBa(int num)
	{
		trans(num,7,3);
	}
	/*ʮ����תʮ������*/
	public static void toHex(int num)
	{
		trans(num,15,4);
	}	
	public static void trans(int num,int base,int offset)
	{//base���������С����������1��ʮ��������15����offset�����Ƽ�λ��
		if (num==0)
		{
			System.out.println(0);
			return;
		}
		char[] chs={'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		char[] arr =new char[32];
		int pos=arr.length;
		while (num!=0)
		{
			int temp = num&base;
			arr[--pos]=chs[temp];
			num=num>>>offset;
		}
		for (int x=pos;x<arr.length ;x++ )
		{
			System.out.print(arr[x]);			
		}
	}
}