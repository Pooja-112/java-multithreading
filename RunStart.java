package in.multithreading;
class multi extends Thread {
	public void run() {
		for(int i =0; i<=5 ;i++)
		{ try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println(i);
		}
	}
}
public class RunStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       multi m1 = new multi();
       multi m2 = new multi();
       
       m1.run();
       m2.run();
	}

}
