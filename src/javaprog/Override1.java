package javaprog;
class ABC{
	public void display() {
		System.out.println("disp() method of parent class");
	}
}

public class Override1 extends ABC{
	public void display() {
		System.out.println("disp() method of child class");
	}
	public void newMethod() {
		System.out.println("new method child class");
	}
	public static void main (String args[]) {
		ABC obj=new ABC();
		obj.display();
		ABC obj2=new Override1();
		obj2.display();
	}
	

}
