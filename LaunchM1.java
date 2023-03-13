package in.multithreading;
class MakeupRoom implements Runnable
{
	synchronized public void run() {
		try {
			
			System.out.println(Thread.currentThread().getName() + " had entered the Room");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " is using the Room");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " exited the Room");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
public class LaunchM1 {

	public static void main(String[] args)  {
		MakeupRoom m = new MakeupRoom();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Other");
		
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		t2.start();
		/*try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		t3.start();
	}

}
