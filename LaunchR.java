package in.multithreading;
class demo4 implements Runnable
{
	public void run() {
		System.out.println("Banking task started");
		for(int i =0; i<3;i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Banking.....");
		}
		System.out.println("Banking task completed");
	}
}
class demo5 implements Runnable
{
	public void run() {
		System.out.println("Printing task started");
		for(int i =0; i<3;i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Printing.....");
		}
		System.out.println("Printing task completed");
	}
}
class demo6 implements Runnable
{
	public void run() {
		System.out.println("Calculating task started");
		for(int i =0; i<3;i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Calculating.....");
		}
		System.out.println("Calculating task completed");
	}
}
public class LaunchR {

	public static void main(String[] args) 
	{
	  System.out.println("Main Thread is starting");
      demo4 d1 = new demo4();
      demo5 d2 = new demo5();
      demo6 d3 = new demo6();
      
      
      Thread t1 = new Thread(d1);
      System.out.println(t1.isAlive());
      Thread t2 = new Thread(d2);
      Thread t3 = new Thread(d3);
      
      t1.start();
      System.out.println(t1.isAlive());
      t2.start();
      t3.start();
      
      try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
		t3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println("Main Thread is completing");
      
	}

}
