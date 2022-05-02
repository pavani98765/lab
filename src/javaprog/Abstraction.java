package javaprog;
abstract class Animal{
	abstract void makeSound();
	public void eat() {
		System.out.println("it can eat");
		
	}
}
 class Dog extends Animal{

	
	public void makeSound() {
		System.out.println("animal");
		
	
		
	}
	
}

public class Abstraction {
	
	 public static void main (String args[]) {
		 Dog d1=new Dog();
		 d1.makeSound();
		 d1.eat();
	 }

}
