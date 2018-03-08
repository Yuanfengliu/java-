import java.io.*;
import java.util.*;
/*
有五个学生，每个学生三个成绩，从键盘输入，并排序
1.描述学生对象
2.定义一个可以操作学生对象的工具类

思想：
1.通过键盘录入一行数据，并将该行中的信息取出封装成学生对象
2.因为学生对象有很多，那么就需要存储。使用到集合，因为要对学生总分进行排序。所以
	可以使用TreeSet。
3.将集合中的信息写入到文件中
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
			throw new ClassCastException("类型不匹配");
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