package javaprog;
class Human{
	public void eat() {
		System.out.println("Human is eating");
	}
}


public class Override extends Human{
	public void eat() {
		System.out.println("Boy is eating");
		
	}
	public static void main(String args[]) {
		Override o1=new Override();
		o1.eat();
	}
	

}
