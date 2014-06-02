
public class Main {

	public static void main(String[] args){
		System.out.println("Start");
		
		Thread t1 = new Thread(new MyRunnable("hello 1"),"a");
		Thread t2 = new Thread(new MyRunnable("hello 2"),"b");
		t1.start();
		t2.start();
		
		final SharedResource sr = new SharedResource();
		
		for(int i=0; i < 1000; i++){
			new Thread(""+i){
				public void run(){
					System.out.println("Thread: " + getName() + " running");
					sr.addToCount(1);
						
					
				}
			}.start();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Count: " + sr.getCount());
	}
}
