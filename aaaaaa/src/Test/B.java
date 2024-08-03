package Test;

public class B extends A{
	B(){
		this(10, 20);
		System.out.println("Sub class constructor");
	}
	
	B(int a,int b){
		System.out.println("parameterized sub class constructor");
	}
	
	
	public void add(int a,int b) {
		System.out.println("Method over riding");
	}
	
	public void add(int a,int b,int c) {
		System.out.println("Method over riding");
	}
	

public static void main(String args[]) {
	B b=new B();
	
}
}
