package in.multithreading;
class SyncBlock implements Runnable
{
	public void run() {
		try
		{
			for(int i =0; i<3; i++)
			{
				System.out.println(i);
			}
			Thread.sleep(3000);
			synchronized(this)
			{
				for(int i=0; i<3; i++)
				{
					System.out.println((char)(i+65));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Some Interruption");
		}
	}
}
public class LaunchSyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SyncBlock sy = new SyncBlock();
     
     Thread t1 =new Thread(sy);
     Thread t2 =new Thread(sy);
     Thread t3 =new Thread(sy);
     t1.start();
     t2.start();
     t3.start();
	}

}
