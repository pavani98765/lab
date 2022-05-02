package javaprog;
class EncapsTest{
	private int ssn;
	private String empName;
	private int empAge;
	public int getEmpSSN() {
		return ssn;
		
	}
	public String getEmpName() {
		return empName;
		
	}
	public int getEmpAge() {
		return empAge;
		
	}
	public void setEmpAge(int newValue) {
		empAge=newValue;
		
	}
	public void setEmpName(String newValue) {
		empName=newValue;
		
	}
	public void setEmpSSN(int newValue) {
		ssn=newValue;
		
	}
	}

public class Encapsulation {
	public static void main (String args[]) {
		EncapsTest et=new EncapsTest();
	   et.setEmpName("raj");
	   et.setEmpAge(25);
	   et.setEmpSSN(112233);
	   System.out.println("employee name:"+et.getEmpName());
	   System.out.println("employee ssn:"+et.getEmpSSN());
	   System.out.println("employee age:"+et.getEmpAge());
	}
	
}
