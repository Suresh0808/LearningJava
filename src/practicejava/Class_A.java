package practicejava;
	
	public class Class_A extends Class_C {
	
		//static block
		static	{
			System.out.println("static1");
		}
		//Instance block
		{
			System.out.println("Instance 1");
		}
		void method1() {
			System.out.println("method1");
		}
		// Constructor
		Class_A() {
			System.out.println("Constructor 1");
		}
		public static void main(String[] args) {
			Class_A sample = new Class_A();
			sample.method1();
			sample.method3();
			//sample.method2(); s3s1i3c3i1c1m1m3
		}
	}
	class Class_B	{
		void method2() {
			System.out.println("method2");
		}
		static	{
			System.out.println("static 2");
		}
		{
			System.out.println("Instance 2");
		}
		Class_B()	{
			System.out.println("Constructor 2");
		}
	}
	class Class_C	{
		static	{
			System.out.println("static3");
		}
		{
			System.out.println("Instance3");
		}
		void method3()	{
			System.out.println("method3");
		}
		Class_C()	{
			System.out.println("Constructor3");
	}
}