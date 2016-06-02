public class FlyingThread implements Runnable {
	private FlyingObjects flyer;
	public FlyingThread(FlyingObjects flyer) {
		this.flyer = flyer;
	}
	@Override
	public void run() {
		int i = 0;
		while(i < 30){
			this.flyer.Fly();
			if(i % 5 == 0){
				System.out.println(Thread.currentThread().getName() + ": " + this.flyer.toString());
			}
			i++;
		}
	}
	
}