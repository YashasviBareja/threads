package threads;

class Happy implements Runnable{
	
	private static int count;
	

	public void run(){
		
		for(int i=0;i<10000;i++)
			count++;
	}
	
}
public class Threadds4{
	private static int count=0;
	public static void main(String args[])
	{
		Thread obj1=new Thread(new Happy());
		obj1.start();
		Thread obj2=new Thread(new Happy());
		obj2.start();
		System.out.println(count);
		
		
	}
}