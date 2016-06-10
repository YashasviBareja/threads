package threads;

class Yahoo extends Thread{
	
	public Yahoo(String value)
	{
		super(value);
	}

	public void run(){
		
		System.out.println("gm");
	}
	
}

public class Threadds1 {

	public static void main(String[] args) {
		System.out.println("MyThread :: gm>>1");
		
		Yahoo obj=new Yahoo("my thread");
		obj.start();
		
		System.out.println("Mythread :: gm>>2");

	}

}
