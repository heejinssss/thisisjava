package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // 11
		y++; // 11
		System.out.println("x=" + x); // 11
		
		System.out.println("=============");
		y--; // 11
		--y; // 9
		System.out.println("y=" + y); // 9
		
		System.out.println("=============");
		z = x++; // 11
		System.out.println("z=" + z); // 11
		System.out.println("x=" + x); // 12
		
		System.out.println("=============");
		z = ++x; // 13
		System.out.println("z=" + z); // 13
		System.out.println("x=" + x); // 13
		
		System.out.println("=============");
		z = ++x + y++; // 14 + 9
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x); // 14
		System.out.println("y=" + y); // 10

	}

}
