/*
StringBuffer 是字符串缓冲区。是一个容器，

1. 而且长度是可变化的。  
2. 可以操作多个数据类型。  
3. 最终会通过toString方法变成字符串
   C（create）U（update）R（read）D（delete）  
   1.存储  
	 StringBuffer append（）：将指定的数据作为参数添加到到已有数据的结尾处.(返回还是原来对象)
	 StringBuffer insert（index，数据）：可以将数据 插入到数据指定index位置。  
   2.删除   
		StringBuffer delete(start,end):删除缓冲区中的数据，包含start，不包含end。
		StringBuffer deleteCharAt(index):删除指定位置的字符。
   3.获取  
		char charAt(int index)
		int indexOf(String str)
		int lastIndexOf(String str)
		int length()
		String substring(int start ,int end)
   4.修改
		StringBuffer replace(start,end,string);
		void setCharAt(int index,char ch);
	5.反转。
		StringBuffer reverse();
	
	6. 将缓冲区中指定数据存储到指定字符数组中，而可以从可以从指定位置开始存储
		void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)

JDK1.5 版本之后出现了StringBuilder

StringBuffer是线程同步
StringBuilder是线程不同步

java升级的三个因素：
1.提高效率  
2.简化书写  
3.安全性  

以后开发，建议使用StringBuilder  **************
*/

class StringBufferDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
