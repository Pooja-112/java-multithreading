package in.multithreading;
class demo1 extends Thread
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
class demo2 extends Thread
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
class demo3 extends Thread
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
public class LaunchM {

	public static void main(String[] args) {
	
       demo1 d1 = new demo1();
       demo2 d2 = new demo2();
       demo3 d3 = new demo3();
       
       d1.start();
       d2.start();
       d3.start();
       
	}

}
