import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// prompt the user for how many cars they want to enter
		System.out.println("How many cars do you want to enter?");

		// get user input and store in variable
		int numOfCars = scan.nextInt();
		scan.nextLine();
		int carYear;
		double carPrice;
		String carMake;
		String carModel;
		ArrayList<Car> carLot = new ArrayList<>();

		// for loop to take input for the details
		// prompt for make, model, year, and price
		// get input from scanner " "
		for (int i = 0; i < numOfCars; i++) {
			System.out.println("Enter the make of the car: ");
			carMake = scan.nextLine();

			System.out.println("Enter the model of the car: ");
			carModel = scan.nextLine();

			System.out.println("Enter the year of the car: ");
			carYear = scan.nextInt();

			System.out.println("Enter the price of the car: ");
			carPrice = scan.nextDouble();

			Car car = new Car(carMake, carModel, carYear, carPrice); // the blank in the parenthesis is a constructor

			carLot.add(car); // array list

		}

		// each iteration will prompt then get input for all details
		// print out table of cars
		System.out.println(carLot.get(0));

	}

	
}
