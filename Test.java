package in.multithreading;
class Demo extends Thread
{
	int total = 0;
	public void run() {
		for(int i = 1; i<=1000 ; i++)
		{
			total = total+i;
		}
	}
}
public class Test {

	public static void main(String[] args) {
		
     Demo d = new Demo();
     d.start();
     try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     System.out.println(d.total);
	}

}
