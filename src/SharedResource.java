
public class SharedResource {

	private int count = 0;
	
	public synchronized int getCount(){
		//System.out.println("COUNT: " + count);
		return count;
	}
	
	public synchronized void addToCount(int a){
		count = count + a;
	}

}
