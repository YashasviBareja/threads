package threads;

class Share{
	public synchronized void getdata(String threadname)
	{
		for(int i=0;i<10;i++)
			System.out.println(threadname+" ::"+i);
	}
}
class Mythread extends Thread{
	
	
		private Share share;
		public Mythread(Share shareobject, String pThreadName)
		{
			super(pThreadName);
			this.share=shareobject;
			
		}
		public void run()
		{
			share.getdata(Thread.currentThread().getName());
	}
}

public class Threadds7 {

	public static void main(String[] args) {
		
		Share shareobject=new Share();
		Mythread obj1=new Mythread(shareobject,"Thread A");
		obj1.start();
		Mythread obj2=new Mythread(shareobject,"Thread B");
		obj2.start();

	}

}
