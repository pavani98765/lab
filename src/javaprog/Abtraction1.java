package javaprog;
abstract class MotorBike{
	abstract void brake();
	
}
class SportsBike extends MotorBike{
public void brake() {
	System.out.println("Sportsbike brake");
}
}
class MountainBike extends MotorBike{
	public void brake() {
		System.out.println("Mountain Bike");
	}
}


public class Abtraction1 {
	public static void main (String args[]) {
		MountainBike mb=new MountainBike();
		mb.brake();
		SportsBike sb =new SportsBike();
		sb.brake();
	}

}
