//QUESTION 5
public class MissileThread {
	public static void main(String[] args){
		
		FlyingObjects Missile = new FlyingObjects(2500, 800);
		Runnable MissileThread = new FlyingThread(Missile);
		Thread MissileWorker = new Thread(MissileThread);
		MissileWorker.setName("Missile");
		MissileWorker.start();
		
	}
}