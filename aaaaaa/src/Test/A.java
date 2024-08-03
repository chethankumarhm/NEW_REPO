package Test;

public class A {

	A(){
		System.out.println("I am super class constructor");
	}
	
	A(int a,int b){
		System.out.println("I am super class parameterized step group");
	}
	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public static String name(String name) {
		String fullName=name.concat("kumar HM");
		return fullName;
	}
	
	{
		System.out.println("I am Non-Static block");
	}
	
	static {
		System.out.println("I am an static block");
	}
}
