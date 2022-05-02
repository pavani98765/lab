package javaprog;

public class Ifelse {
	void start(String fruitName) {
		
		if(fruitName=="apple") {
			System.out.println("this is"+fruitName);
			
		}else if(fruitName =="pineapple") {
			System.out.println("this is"+fruitName);
		}else if(fruitName=="mango") {
			
		
		System.out.println("this is"+fruitName);
		
	}else {
		System.out.println(fruitName+" not available");
	}
	}
public static void main(String args[]) {
	Ifelse if1=new Ifelse();
	if1.start("grapes");
}
}
