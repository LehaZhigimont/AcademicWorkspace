package rasing;

public class Auto {
	static final int HORSE_TO_WATT = 730;
	double massaKg;
	double powerWt;
	double maxSpeed;
	double currentSpeed = 0;
	String driverName;
	double distanseM;

	@SuppressWarnings("unused")//отключает подсказку неиспользованых переменных
	public Auto(int massaKg, int powerHorse, double d, String driverName) {
		this.massaKg = massaKg;
		powerWt = powerHorse * HORSE_TO_WATT;
		this.maxSpeed = d;
		this.driverName = driverName;
		// currentSpeed = 1;
		double distanseM = 0;

	}

	void updateStatusPerSecond(int powerUsePersent) {
		distanseM = distanseM + currentSpeed * 1;
		double powerUp = powerWt * (powerUsePersent/100.0);
		
		currentSpeed = currentSpeed + powerUp / (massaKg * (distanseM - currentSpeed));
		
		
		// if(currentSpeed>maxSpeed){currentSpeed = maxSpeed;}
		currentSpeed = (currentSpeed > maxSpeed) ? maxSpeed : currentSpeed;

	}

}

