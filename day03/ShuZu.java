class ShuZu
{
	public static void main(String[] args) 
	{
		int[]x=new int[3];
		System.out.println(x[1]);
		int[]y=x;//��ʱx��yͬʱָ������ĵ�ַ��x��y����ջ�п��ٿռ�
		y[1]=89;
		System.out.println(x[1]);

	}
}
/*���� int[] x= new int[3];
x��ջ�У�����x����ʧ�ˣ�
int[3]�ڶ��У���ʵ�ʵĵ�ַ��ʵ�壩��3��������ÿ����������һ����ַ��
�Ѷ��еĵ�ַ��ֵ��ջ��x����xָ���Ӧ�ѵĵ�ַ��λ�ã���

*/