package ch06.sec07.exam05;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car("자가용");
		System.out.println("car1.company: " + car1.company);
		System.out.println("car1.model: " + car1.model);
		System.out.println("car1.color: " + car1.color);
		System.out.println("car1.maxSpeed: " + car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("자가용", "보라");
		System.out.println("car1.company: " + car2.company);
		System.out.println("car1.model: " + car2.model);
		System.out.println("car1.color: " + car2.color);
		System.out.println("car1.maxSpeed: " + car2.maxSpeed);
		System.out.println();

		Car carCommon = new Car("자가용", "보라", 240);
		System.out.println("carCommon.company: " + carCommon.company);
		System.out.println("carCommon.model: " + carCommon.model);
		System.out.println("carCommon.color: " + carCommon.color);
		System.out.println("carCommon.maxSpeed: " + carCommon.maxSpeed);

	}

}
