//QUESTION 5
public class AirplaneThread {
	public static void main(String[] args){
		
		FlyingObjects Airplane = new FlyingObjects(450, 50);
		Runnable AirplaneThread = new FlyingThread(Airplane);
		Thread AirplaneWorker = new Thread(AirplaneThread);
		AirplaneWorker.setName("Airplane");
		AirplaneWorker.start();
		
		
	}
}