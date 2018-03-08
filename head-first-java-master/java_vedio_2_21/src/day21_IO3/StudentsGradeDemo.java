import java.io.*;
import java.util.*;
/*
�����ѧ����ÿ��ѧ�������ɼ����Ӽ������룬������
1.����ѧ������
2.����һ�����Բ���ѧ������Ĺ�����

˼�룺
1.ͨ������¼��һ�����ݣ����������е���Ϣȡ����װ��ѧ������
2.��Ϊѧ�������кܶ࣬��ô����Ҫ�洢��ʹ�õ����ϣ���ΪҪ��ѧ���ֽܷ�����������
	����ʹ��TreeSet��
3.�������е���Ϣд�뵽�ļ���
*/
class Student implements Comparable<Student>
{
	private String name;
	private int ma,cn,en;
	private int sum;
	public Student(String name,int ma,int cn,int en)
	{
		this.name=name;
		this.ma=ma;
		this.cn=cn;
		this.en=en;
		sum=ma+cn+en;
	}
	public int getSum()
	{
		return sum;
	}
	public int HashCode()
	{
		return name.hashCode()+sum*78;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("���Ͳ�ƥ��");
		Student s=(Student)obj;
		return this.name.equals(s.name) && this.sum==s.sum;
	}
	public int compareTo(Student s)
	{
		int num=new Integer(this.sum).compareTo(new Integer(s.sum));
		if(num==1)
			return this.name.compareTo(s.name);
		return num;
	}
	public String toString()
	{
		return "Student["+name+", "+ma+", "+cn+", "+en+"]";
	}
	
}
class StudentInfoTool
{
	public static Set<Student> getStudent() throws IOException
	{
		return getStudent(null);
	}

	public static Set<Student> getStudent(Comparator<Student> cmp) throws IOException
	{
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		Set<Student> stus=null;
		if(cmp==null)
			stus=new TreeSet<Student>();
		else
			stus=new TreeSet<Student>(cmp);
		String line=null;
		
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			String[] info=line.split(",");
			Student stu=new Student(info[0],Integer.parseInt(info[1]),
			Integer.parseInt(info[2]),Integer.parseInt(info[3]));
			stus.add(stu);
		}
		bufr.close();
		return stus;
	}
	public static void write2File(Set<Student> stus)throws IOException
	{
		BufferedWriter bufw=new BufferedWriter(new FileWriter("student.txt"));
		for(Student stu:stus)
		{
			bufw.write(stu.toString()+"\t");
			bufw.write(stu.getSum()+"");
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
	}
}
class StudentsGradeDemo
{
	public static void main(String[] args)throws IOException
	{
		Comparator<Student> cmp=Collections.reverseOrder();
		Set<Student> stus=StudentInfoTool.getStudent(cmp);
		StudentInfoTool.write2File(stus);
	}
}