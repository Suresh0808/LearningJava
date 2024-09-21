package practicejava;

public class Iptdayone27 {

	/*//Static block
	static {
		System.out.println("Static 1");
	}

	// Instance block
	{
		System.out.println("Instance 1");
	}
	Iptdayone27() 
	{
		System.out.println("Constructor1");
	}
	void method1() {
		System.out.println("method");
	}*/

	

	public static void main(String[] args) {
		Iptdayone27 abc = new Iptdayone27();
		abc.method1();
		//int c = 5;
		//System.out.println();
	}	
	void method1()	{
		String a ="abcde";
		String b ="Suresh";
		System.out.println(b.replaceFirst(b, a));
	}
}

