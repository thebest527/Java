package shb2;

/* 날짜 : 2020/05/01
 * 이름 : 박수령
 * 내용 : 반복문 For 실습하기
 */
public class ForTest {

	public static void main(String[] args, String sum) {
		
		// For
		for(int i=1 ; i<=3 ; i++) {
			System.out.println("Hello java!");
		}
		
		// 1부터 10까지 합
		for(int k=1 ; k<=10 ; k++) {
			sum += k;
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		//1부터 10까지 짝수합
		int eSum = 0;
		
		for(int k=1 ; k<=10; k++) {
			
			if (k % 2 == 0) {
				eSum += k;
			}
		System.out.println("1부터 10까지 짝수합 : "+eSum);
		
		// 이중문 for문
		for(int a=1 ; a<=3 ; a++) {
			
			System.out.println("a : "+a);
		}
		
	}
		
		// 구구단
		for(int x=2 ; x<=9 ; x++) {
			
			System.out.println(x+"단");
			
			for(int y=1 ; y<=9 ; y++ ) {
				
				int z = x * y;
				System.out.println(x+" x"+y+" = "+z);
			}
				
		}
		
		// 별 삼각형 I
		for(int start=10; start>=0 ; start--) {
			
			for(int end=1 ; end <= start ; end++) {
				
				System.out.println("☆");
				
			}
			
			System.out.println("n");
			
		}
		
		// 별 삼각형 II
		for(int a=1 ; a<=5 ; a++) {
			
			for(int b=1 ; b<=5-a ; b++) {
				System.out.println("☆");
			}
			
			for(int c=1 ; c<=5-a ; c++) {
				System.out.println("★");
			}
			
			System.out.println("n");
			
			}
		
			
		}
	
}

