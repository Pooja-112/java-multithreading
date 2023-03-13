package in.multithreading;

class Alpha extends Thread
{
	synchronized public void run()
	{
		String t = Thread.currentThread().getName();
		if(t.equals("Bank"))
		{
			Banking();
		}
		else if(t.equals("Print"))
		{
			Printing();
		}
		else
		{
			Calculating();
		}
	}
	public void Banking()
	{
		System.out.println("Banking task is started");
		for(int i =0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Banking....");
		}
		System.out.println("Banking completed");
	}
	public void Printing()
	{
		System.out.println("Printing task is started");
		for(int i =0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Printing....");
		}
		System.out.println("Printing completed");
	}
	public void Calculating()
	{
		System.out.println("Calculating task is started");
		for(int i =0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("calculating....");
		}
		System.out.println("Calculating completed");
	}
}
public class LaunchSR {

	public static void main(String[] args) {
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		
		a1.setName("Bank");
		a2.setName("Print");
		a3.setName("Calculating");
		
		a1.start();
		a2.start();
		a3.start();
	}

}
