package shb2;

/* ��¥ : 2020/05/01
 * �̸� : �ڼ���
 * ���� : �ݺ��� For �ǽ��ϱ�
 */
public class ForTest {

	public static void main(String[] args, String sum) {
		
		// For
		for(int i=1 ; i<=3 ; i++) {
			System.out.println("Hello java!");
		}
		
		// 1���� 10���� ��
		for(int k=1 ; k<=10 ; k++) {
			sum += k;
		}
		
		System.out.println("1���� 10���� �� : "+sum);
		
		//1���� 10���� ¦����
		int eSum = 0;
		
		for(int k=1 ; k<=10; k++) {
			
			if (k % 2 == 0) {
				eSum += k;
			}
		System.out.println("1���� 10���� ¦���� : "+eSum);
		
		// ���߹� for��
		for(int a=1 ; a<=3 ; a++) {
			
			System.out.println("a : "+a);
		}
		
	}
		
		// ������
		for(int x=2 ; x<=9 ; x++) {
			
			System.out.println(x+"��");
			
			for(int y=1 ; y<=9 ; y++ ) {
				
				int z = x * y;
				System.out.println(x+" x"+y+" = "+z);
			}
				
		}
		
		// �� �ﰢ�� I
		for(int start=10; start>=0 ; start--) {
			
			for(int end=1 ; end <= start ; end++) {
				
				System.out.println("��");
				
			}
			
			System.out.println("n");
			
		}
		
		// �� �ﰢ�� II
		for(int a=1 ; a<=5 ; a++) {
			
			for(int b=1 ; b<=5-a ; b++) {
				System.out.println("��");
			}
			
			for(int c=1 ; c<=5-a ; c++) {
				System.out.println("��");
			}
			
			System.out.println("n");
			
			}
		
			
		}
	
}

