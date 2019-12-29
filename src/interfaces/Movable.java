package interfaces;

import java.util.Random;

import garage.Cabriolet;
import garage.FamilyCar;
import garage.SportCar;

public interface Movable {
	/**

	 * 

	 * @param value

	 */

	void accelerate(double value);

	void slowDown(double value);

	double getSpeed();

	

	/**

	 * This static method generate randomly any kind of Movable object

	 *

	 */

	public static Movable generateRandomCar() {

		Movable movable = null;

		Random ran = new Random();

		int pos = ran.nextInt(3)+1;

		switch(pos) {

		case 1:

			movable = new FamilyCar();

			break;

		case 2:

			movable = new SportCar();

			break;

		case 3:

			movable = new Cabriolet();

			break;		

		

		}

		return movable;

	}

	

	public static double generateSpeed() {

		double speed;

		Random ran = new Random();

		speed= ran.nextInt(50)+200;

				

		

		

		return speed;

	}
}
