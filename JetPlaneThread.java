//QUESTION 5
public class JetPlaneThread 
{
	public static void main(String[] args){
		FlyingObjects JetPlane = new FlyingObjects(1000, 120);
		Runnable JetPlaneThread = new FlyingThread(JetPlane);
		Thread JetPlaneWorker = new Thread(JetPlaneThread);
		JetPlaneWorker.setName("JetPlane");
		JetPlaneWorker.start();
		
		
	}
}