package Main;

import enums.Color;
import garage.Cabriolet;
import garage.Car;
import garage.FamilyCar;
import garage.Garage;
import garage.GarageFullException;
import garage.SportCar;
import garage.VehicleAlreadyInGarageException;
import interfaces.Movable;

public class Opdracht3 {

	public static void main(String[] args) {
	

		

		

		Garage garage = new Garage();

		

		for(int i = 0; i<40;i++) {

			

		

		Movable movable = null;

		movable = Movable.generateRandomCar();



		if(movable instanceof Car) {

			Car car = (Car)movable;

			car.setColor(Color.generateRandomColor());

			car.setSpeed(Movable.generateSpeed());

		}

		

		



		try {



			garage.addVehicle(movable);



		} catch (GarageFullException e) {

			System.out.println();

			System.out.println(e.getMessage());

		} catch (VehicleAlreadyInGarageException e) {

			System.out.println(e.getMessage());

		}

		}

		System.out.println("Size of the garage: " +garage.getSize());

		System.out.println("Number of Car: " +Car.getCount());

		System.out.println("Number of FamilyCar: " +FamilyCar.getCount());

		System.out.println("Number of SportCar: " +SportCar.getCount());

		System.out.println("Number of Cabriolet: " +Cabriolet.getCount());

		garage.printGarage();

	}

	}


