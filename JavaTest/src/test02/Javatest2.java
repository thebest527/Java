package test02;
import java.util.Scanner;

/* ��¥ : 2020/05/01
 * �̸� : �ڼ���
 * ���� : �ڹ� �⺻ ����� ��������
 */

public class Javatest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("input �� �Է� : ");
		
		input = sc.nextInt() ;
		int result = (1 + 2) * input;
		
		System.out.println("(1 + 2) x input = "+result);
		
		String name;
		System.out.println("name �� �Է� : ");
		
		name = sc.next();
		String hello = "�ȳ�! "+name+"�� �ݰ����ϴ�." ;
		
		System.out.println(hello);
		
		
	}

}
