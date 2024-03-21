package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("x 값 입력: ");
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
//		
//		System.out.println("y 값 입력: ");
//		String strY = scanner.nextLine();
//		int y = Integer.parseInt(strY);
//		System.out.println("입력된 x값은 " + x + ", 입력된 y값은 " + y);

		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}
}