package day5;
//����δ���
class Person3{
	private String name;
	private int age;
	
	Person3(int age ) {
		this.age=age;
	}

	Person3(String name){ //���������û�����壬�ɶ��Էǳ���
		this.name=name;//�ֲ������ͳ�Ա����һ���ˣ��ֲ����о��ھֲ���ʹ�ã�û�еĻ����ڳ�Ա��������,���ֲ���ֵ������Ա������������this�ؼ���
		//this:����ȥ�����������־ֲ������ͳ�Ա����ͬ�������
		/*this���״������ʲô
		this���ʹ�����Ķ��󣬵��״�����һ���أ�
		this���������ں������ڶ��������
		��˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����*/
		/*this��Ӧ�ã����������еĹ���ʱ���ú����ڲ�Ҫ�õ����øú����Ķ���ʱ����ʱ��this��ʾ�������
		 */
		
	}
	Person3(String name,int age){
		this.name=name;
		this.age=age;
	}
	void speak(){
		System.out.println("name="+this.name+",age="+this.age);
		this.show();
	}
	void show(){
		System.out.println(this.name);
	}
	/*���󣺸��˶���һ���Ƚ������Ƿ���ͬ�Ĺ��ܣ�Ҳ�����Ƿ���ͬ����
	 �������๦������*/
	public boolean compare(Person3 p){//�����������Ķ��󴫽���
		return this.age==p.getAge();
		
	}
	public int getAge(){
		return this.age;
	}
}
public class PersonDemo3 {
	public static void main(String[] args) {
		/*Person3 p1=new Person3("Lisi",24);
		Person3 p2=new Person3("Lisi",2);
		p1.speak();
		p2.speak();*/
		Person3 p1=new Person3(20);
		Person3 p2=new Person3(25);
		
		boolean b=p1.compare(p2);
		System.out.println(b);
}
}
