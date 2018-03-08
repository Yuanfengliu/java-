/*

|--Set：元素是无序的，不能重复。
	|--HashSet：底层数据结构是哈希表。
		HashSet是如何保证元素的唯一性的呢？
		是通过元素的两个方法。hashCode和equals来完成。
		如果元素的HashCode值相同，才会判断equals是否为true，
		如果元素的hashCode不同，不会判断equals。 

		注意：对于判断元素是否存在，以及删除等操作，依赖的方法是元素的hashcode和equals方法。
		
Set集合的功能和collection是一致的

 



*/

class  HashSetDemo8
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
