package mkcodes.java21.lesson1;

public class MarsApplication {

	public static void main(String[] args) {
		MarsRobot spirit = new MarsRobot();
		spirit.status = "exploring";
		spirit.speed = 2;
		spirit.temperature = -60;

		spirit.showAttributes();
		System.out.println("Increasing speed to 3.");
		spirit.speed = 3;
		spirit.showAttributes();
		System.out.println("Changing temperature to -90.");
		spirit.temperature = -90;
		spirit.showAttributes();
		System.out.println("Checking the temperature.");
		spirit.checkTemperature();
		spirit.showAttributes();

		MarsRobot opportunity = new MarsRobot();
		opportunity.status = "dead on Mars";
		opportunity.speed = 2;
		opportunity.temperature = -90;
		opportunity.showAttributes();
	}
}
