package p130;

import java.util.Scanner; // Scanner Ŭ������ ����ϱ� ���� �ʿ���.

// do-while��

public class DoWhile {

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in); // Scanner ��ü ����
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine(); // Ű����� �Է��ϴ� ���ڿ�
			System.out.println(inputString);
			
			} while( ! inputString.equals("q"));
		
			System.out.println();
			System.out.println("���α׷� ����");

	}

}
