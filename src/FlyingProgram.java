//QUESTION 2
public class FlyingProgram {
	public static void main(String[] args){
		FlyingObjects Bird = new FlyingObjects(10, 3);
		FlyingObjects Airplane = new FlyingObjects(450, 50);
		FlyingObjects JetPlane = new FlyingObjects(1000, 120);
		FlyingObjects Missile = new FlyingObjects(2500, 800);
		FlyingObjects Superman = new FlyingObjects(3500, 500);
			
		Runnable BirdThread = new FlyingThread(Bird);
		Runnable AirplaneThread = new FlyingThread(Airplane);
		Runnable JetPlaneThread = new FlyingThread(JetPlane);
		Runnable MissileThread = new FlyingThread(Missile);
		Runnable SupermanThread = new FlyingThread(Superman);
		
		Thread BirdWorker = new Thread(BirdThread);
		Thread AirplaneWorker = new Thread(AirplaneThread);
		Thread JetPlaneWorker = new Thread(JetPlaneThread);
		Thread MissileWorker = new Thread(MissileThread);
		Thread SupermanWorker = new Thread(SupermanThread);
		
		BirdWorker.setName("Bird");
		AirplaneWorker.setName("Airplane");
		JetPlaneWorker.setName("JetPlane");
		MissileWorker.setName("Missile");
		SupermanWorker.setName("Superman");
		
		BirdWorker.start();
		AirplaneWorker.start();
		JetPlaneWorker.start();
		MissileWorker.start();
		SupermanWorker.start();
		
	}
}