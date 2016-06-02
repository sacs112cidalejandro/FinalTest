//QUESTION 1
public class FlyingObjects {
	private double airSpeedMilesPerMinute;
	private int elevationPerMinute;
	private int totalAltitude = 0;
	private double totalDistance = 0;
	
	public FlyingObjects(){
		this.airSpeedMilesPerMinute = 0;
		this.elevationPerMinute = 0;
	}
	public FlyingObjects(int airSpeedMPH, int elevationPerMinute){
		this.airSpeedMilesPerMinute = (double)airSpeedMPH / 60;
		this.elevationPerMinute = elevationPerMinute;
	}
	public void SetAirSpeed(int airSpeedMPH){
		this.airSpeedMilesPerMinute = (double)airSpeedMPH / 60;
	}
	public void SetAltimeter(int elevationPerMinute){
		this.elevationPerMinute = elevationPerMinute;
	}
	public void Fly(){
		this.totalAltitude = this.totalAltitude + this.elevationPerMinute;
		this.totalDistance = this.totalDistance + this.airSpeedMilesPerMinute;
	}
	public String toString(){
		return "Distance Flown: " + this.totalDistance + "; Current Altitude: " + this.totalAltitude;
	}
}