package threads;
class Myclass extends Thread {
	
	
	public void run(){
		
		
	try{
		for(int i=0;i<10;i++)
		{
			
		System.out.println(Thread.currentThread().getId()+" ::"+i);
		 Thread.sleep(5000);
		}
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	
}
}
public class THdemo {

	public static void main(String[] args) {
		
		Myclass myclass1=new Myclass();
		myclass1.start();
		
		Myclass myclass2=new Myclass();
		myclass2.start();
	}
}

	