package threads;

class Share1 {
	public synchronized void getData(String threadName) {
		for (int i = 1; i <= 5; i++) {
			/*try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println(threadName + " :: " + i);
		}
	}
}

class MyThread1 extends Thread {
	private Share1 share;

	public MyThread1(Share1 shareObj, String pThreadName) {
		super(pThreadName);
		this.share = shareObj;
	}

	public void run() {
		share.getData(Thread.currentThread().getName());
	}
}

public class Vinay {

	public static void main(String[] args) {
		Share1 shareObject = new Share1();
		MyThread1 obj1 = new MyThread1(shareObject, "Thread-A");
		obj1.start();

		MyThread1 obj2 = new MyThread1(shareObject, "Thread-B");
		obj2.start();
	}
}

