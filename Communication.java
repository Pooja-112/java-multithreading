package in.multithreading;

class Producer extends Thread {
	
	StringBuffer sb ;
	
	boolean dataProvider;
	
	public Producer()
	{
		sb = new StringBuffer();
	}
	
	public void run() {
		for(int i=1 ; i<=10;i++) {
			try {
				sb.append(i+":");
				Thread.sleep(100);
				System.out.println("appending");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		dataProvider = true;
	}
}
class Consumer extends Thread {
	
	Producer producer;
	
	public Consumer (Producer producer) {
		this.producer = producer;
	}
	public void run() {
		while(producer.dataProvider == false) {
	try {
		Thread.sleep(10);
	
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	System.out.println(producer.sb);
}
}

public class Communication {

	public static void main(String[] args) {
		Producer obj1 = new Producer();
		Consumer obj2 = new Consumer(obj1);
		
		Thread t1= new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t2.start();
		t1.start();

	}

}
