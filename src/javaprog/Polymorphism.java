package javaprog;
class Polygon{
	public void render() {
		System.out.println("rendering polygon");
	}
}
class Square extends Polygon{
	public void render() {
		System.out.println("Rendering Square");
	}
}
class Circle extends Polygon{
	public void render() {
		System.out.println("circle rendering ");
	}
}

public class Polymorphism {
	public static void main (String args[]) {
		Square s1= new Square();
		s1.render();
		Circle c1=new Circle();
		c1.render();
	}
	

}
