package threads;

class Yahooo extends Thread{
	
	public Yahooo(String value)
	{
		super(value);
	}
	
	public void run()
	{
		try{
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread()+"::"+ i);
				Thread.sleep(5000);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}	
	}	
}
public class Threadds2 {

	public static void main(String[] args) {
		
		Yahooo obj1=new Yahooo("Thread A");
		obj1.start();
		Yahooo obj2=new Yahooo("Thread B");
		obj2.start();
		System.out.println("hi there");
	}
}
