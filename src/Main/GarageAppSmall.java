package Main;

import enums.Color;
import garage.FamilyCar;
import garage.Garage;
import garage.GarageFullException;
import garage.SportCar;
import garage.VehicleAlreadyInGarageException;

public class GarageAppSmall {

	public static void main(String[] args) {
		Garage garage = new Garage();

		FamilyCar familyCar = new FamilyCar(Color.BLUE);

		SportCar sportCar = new SportCar(Color.WHITE);

		familyCar.accelerate(5.0);



		try {

			garage.addVehicle(familyCar);

			garage.addVehicle(sportCar);

			

		} catch (GarageFullException e) {

			System.out.println();

			System.out.println(e.getMessage());

		} catch (VehicleAlreadyInGarageException e) {

			System.out.println(e.getMessage());

		}

		

		System.out.println("garage Size = " + garage.getSize());

		

		garage.printGarage();

		garage.clear();

		System.out.println("garage Size = " + garage.getSize());

	}

}
