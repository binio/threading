
public class MyRunnable implements Runnable{

	private String message;
	
	public MyRunnable(String msg){
		message = msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(message);
		
	}

}
