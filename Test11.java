package in.multithreading;
/*class Demo12 extends Thread
{
	public void run() {
		for(int i =0; i<=2 ;i++) {
			try {
				System.out.println("child Thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Demo13 implements Runnable{
	public void run() {
		for(int i =0; i<=2 ;i++) {
			try {
				System.out.println("child Thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
public class Test1 {

	public static void main(String[] args) {
		Demo13 d = new Demo13();
		Thread t = new Thread(d);
		t.start();
		
			for(int i =0; i<=2 ;i++) {
				try {
					System.out.println("Main Thread");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
				
		}
*/
public class Test11 {

	public static void main(String[] args) {
    Thread t1 = new Thread((
    		)->{
			for(int i =0; i<=2 ;i++) {
	 			try {
	 				System.out.println("child Thread");
	 				Thread.sleep(1000);
	 			} catch (InterruptedException e) {
	 				// TODO Auto-generated catch block
	 				e.printStackTrace();
	 			}
	 		}
   });
t1.start();
     for(int i =0; i<=2 ;i++) {
			try {
				System.out.println("Main Thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
     }
}
	