package javaprog;
class One{
	protected int x;
	public void Setx(int x) {
		this.x=x;
	
	}
	public int Getx() {
		return x;
		
	}
	
}
class Two extends One{
	protected int y;
	public void Sety(int y) {
		this.y=y;
	}
		public int Gety()
		{
		return y;	
		}
	
}	
class Three extends Two{
	protected int z;
	public void Setz(int i) {
		z=i;
	}
	public int Getz() {
		return z;
	}
	public void Showall() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
		
}
}


public class MLI {
	
	 
	 	

	
	public static void main(String args[]) {
	
	Three three=new Three();
		three.Setx(100);
		three.Sety(200);
		three.Setz(300);
		three.Showall();
	}
	
}




