abstract class vehicle{
	abstract void drive();
	void applyBreak()
	{
		System.out.println("Applying Break");
	}
}

	class Car extends vehicle
	{
		void drive()
		{
			System.out.println("Driving a car");
		}
		void changeGear()
		{
			System.out.println("Changing Gear");
		}
	}

public class AbstractDemo {
	public static void main(String[] args) {
		vehicle v= new Car();
		v.drive();
		v.applyBreak();
		Car c= new Car();
		c.changeGear();
	}
}
