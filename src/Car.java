/**
 * 
 */

/**
 * @author nikkishah
 *
 */
public class Car {
	

	
// instance variables for the class
	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;
	
	public Car () { //no return types in constructors --default
	carMake = "";
	carModel = "";
	carYear = 0;
	carPrice = 0.0;
			
	}
	
	public Car(String carMake, String carModel, int carYear, double carPrice) {
	this.carMake = carMake;	
	this.carModel = carModel;
	this.carYear = carYear;
	this.carPrice = carPrice;
	
//	// or you can use ex: setCarPrice(carPrice);
	
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	 
	public String toString() {
			return String.format("%1$-15s %2$-15s %3$-15d $%4$-15.2f \n", carMake, carModel, carYear, carPrice);
			
	}
}
