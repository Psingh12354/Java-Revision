public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main.method();
	}
		static void method(){
		    System.out.println("Static block");
		}
	static {
	    System.out.println("static block 2");
	    Main.method();
	}
}
