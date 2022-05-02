package javaprog;

public class Overload {
	private static void display(int a) {
		System.out.println("Got integer data");
	}
	private static void display(String a) {
		System.out.println("Got string object");
	}
	public static void main(String args[]) {
		display(1);
		display("hello");
	}

}
