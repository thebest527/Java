package test01;

/*
 * ��¥ : 2020/05/07
 * �̸� : �ڼ���
 * ���� : �迭 ���� ����ϱ�
 */

public class JavaTest1 {
	private static final String I = null;

	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U'};
		int row, col;
		
		for(row = 1; row < 10; row++) {
			
			for(col = 0; col <= row; col++) {
				
				System.out.print(str[col]);
			}
			
			System.out.print("\n"); // �ٹٲ�
		}
	}

}
