package ch5_cleanup;

public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int j;
	long l;
	float f;
	double d;
	InitialValues reference;//���ݳ�Ա
	void printInitialValues(){
		System.out.println("Data type     Initial value");
		System.out.println("boolean      "+t);
		System.out.println("char         "+c);
		System.out.println("byte         "+b);
		System.out.println("short        "+s);
		System.out.println("int          "+j);
		System.out.println("long         "+l);
		System.out.println("float        "+f);
		System.out.println("double       "+d);
		System.out.println("reference    "+reference);
	}
	
	public static void main(String[] args) {
		InitialValues iv=new InitialValues();
		iv.printInitialValues();
	}
}
