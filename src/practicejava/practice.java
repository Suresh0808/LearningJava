package practicejava;

public class practice {
	public static void main(String[] args) {
		/*System.out.println("Hello World");
		practice obj1=new practice();
		//practice obj2=new practice();
		obj1.names();
		obj1.age();
		obj1.about();
		System.out.println("My Father's name is Suresh");
		System.out.println("My Mother's is Ganga");
	}
	
	void names()  {
		System.out.println("My name is yogita");
	}
	void age() {
		System.out.println("My age is 2");
	}
	void about() {
		System.out.println("Im a very good girl");*/
		
		String s = "Welcome";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)	{
			char s1 =s.charAt(i);
			rev=rev+s1;
		}
		System.out.println(rev);
	}
}
