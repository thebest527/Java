package test09;

/*
 * ��¥ : 2020/05/01
 * �̸� : �ڼ���
 * ���� : �ڹ� �� �Ƕ�̵� ��������
 */
public class JavaTest9 {

	public static void main(String[] args) {
		
		int n = 1;
		
		for(int i = 0 ; i < n ; i++) {
			
			for(int j = n-1 ; j > i ; j--) {
				System.out.println(" ");
			}
			
			for(int j = 0 ; j < 2 * i + 1 ; j++) {
				System.out.println("*");
			}
			
			System.out.println("");
		}
	}

}
