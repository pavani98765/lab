package javaprog;

public class Excptionhandling {
	public static void main(String args[]) {
		try {
			int a=10;
			int b=3;
			int c=a/b;
			int divisiblebyZero =5/0;
			System.out.println(c);
			System.out.println(divisiblebyZero);
		}
		catch(ArithmeticException e){
			System.out.println("Arthamatic Exception="+e.getMessage());
			
			
		}finally {
			System.out.println("this is finally block");
		}
	}

}
