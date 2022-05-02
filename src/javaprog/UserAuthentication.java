package javaprog;

public class UserAuthentication {
	String uName="ram";
	String pd="123";
	void login(String uName,String pd) {
		if(uName==this.uName) {
			if(pd==this.pd) {
				System.out.println("successfully logined");
			}else {
				System.out.println("pd is wrong");
			}
		}else {
				System.out.println("user name is wrong");
			}
		}
	public static void main(String args[]) {
		UserAuthentication u1=new UserAuthentication();
		u1.login("pav", "123");
	}
	}


