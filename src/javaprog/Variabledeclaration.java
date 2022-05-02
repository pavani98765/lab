package javaprog;

public class Variabledeclaration {
	static int x=10;
	int y=15;
	static void A() {
		 
		System.out.println(" static method");
		
	}
void B() {
	final int z=10;
	System.out.println("non static method");
	
}
public static void main(String args[]) {
	Variabledeclaration v=new Variabledeclaration();
	A();
	Variabledeclaration.A();
	v.B();
	System.out.println(x);
	System.out.println(v.y);
}
}
