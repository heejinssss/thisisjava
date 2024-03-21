package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		int score = 95;

		if(score >= 90) {
			System.out.println("점수가 90점보다 높습니다.");
			System.out.println("등급은 A입니다.");
		}

		if(score < 90) // 중괄호를 생략하여 버그 발생
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); // if 문과 상관 없는 실행문
	}
}