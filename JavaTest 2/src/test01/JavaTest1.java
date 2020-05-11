package test01;

/*
 * 날짜 : 2020/05/07
 * 이름 : 박수령
 * 내용 : 배열 문자 출력하기
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
			
			System.out.print("\n"); // 줄바꿈
		}
	}

}
