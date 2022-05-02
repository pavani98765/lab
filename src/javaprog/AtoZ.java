package javaprog;



public class AtoZ {
	void A() {
		char c;
		for(c='A';c<='Z';c++) {
			System.out.println(c+" ");
		}
	}
	void B() {
		int num=2;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d= %d \n",num ,i, num*i);
		
		}
	
	}
	void C() {
		char a;
		for(a='a';a<='z';a++) {
			System.out.println(a+ " ");
		}
	}
	public static void main(String args[]) {
		AtoZ a1=new AtoZ();
		a1.A();
		a1.B();
		a1.C();
	}

}
