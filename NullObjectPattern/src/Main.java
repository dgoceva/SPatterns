
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car suv = new SUV();
		Car sedan = new Sedan();
		Car nullCar = new NullCar();

		CarRentalService rentalService1 = new CarRentalService(suv);
		CarRentalService rentalService2 = new CarRentalService(sedan);
		CarRentalService rentalService3 = new CarRentalService(nullCar);

		rentalService1.rentCar(); // Output: Driving an SUV, Stopping an SUV
		rentalService2.rentCar(); // Output: Driving a Sedan, Stopping a Sedan
		rentalService3.rentCar(); // No output

	}

}
