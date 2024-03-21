package ch06.sec14;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setSpeed(-50);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		
		// 현재 자동차가 정지 상태가 아니라면
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도: " + myCar.getSpeed());
	}
}