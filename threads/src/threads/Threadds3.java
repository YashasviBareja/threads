package threads;

class Yahoo2 implements Runnable{
	
	public void run(){
		
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread()+"::"+i);
				Thread.sleep(5000);
			}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	
public class Threadds3 {

	public static void main(String[] args) {
		Thread object1=new Thread(new Yahoo2());
		object1.setName("Thread A");
		object1.start();
		Thread object2=new Thread(new Yahoo2());
		object2.setName("Thread B");
		object2.start();
		
		System.out.println("ji");
	}

}
