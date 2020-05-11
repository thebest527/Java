package p130;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 필요함.

// do-while문

public class DoWhile {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine(); // 키보드로 입력하는 문자열
			System.out.println(inputString);
			
			} while( ! inputString.equals("q"));
		
			System.out.println();
			System.out.println("프로그램 종료");

	}

}
