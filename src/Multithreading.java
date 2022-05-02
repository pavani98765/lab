
public class Multithreading implements Runnable {
	public static void main(String args[]) {
		Thread gThread1=new Thread("g1");
		Thread gThread2=new Thread("g2");
		gThread1.start();
		gThread2.start();
		System.out.println("Thread names are following:");
		System.out.println(gThread1.getName());
		System.out.println(gThread2.getName());
	}
	@Override
	public void run() {
		
	}

}
