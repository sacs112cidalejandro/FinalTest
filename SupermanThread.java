//QUESTION 5
public class SupermanThread {
	public static void main(String[] args){
		FlyingObjects Superman = new FlyingObjects(3500, 500);
		Runnable SupermanThread = new FlyingThread(Superman);
		Thread SupermanWorker = new Thread(SupermanThread);
		SupermanWorker.setName("Superman");
		SupermanWorker.start();
		
	}
}