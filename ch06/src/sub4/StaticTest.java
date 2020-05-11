package sub4;

/*
 * 날짜 : 2020/05/11
 * 이름 : 박수령
 * 내용 : 교재 p236 클래스 변수 (정책변수), 클래스메서드(정책메서드) 실습하기
 */

public class StaticTest {

	public static void main(String[] args) {
		
		// 고정할당영역(Method Area)에 이미 Increment의 add() 메서드가 
		// 정의 되어 있기 때문에 객체 생성없이 바로 호출 가능
		Increment.add();
		
		Increment inc1 = new Increment() ;
		Increment inc2 = new Increment() ;
		Increment inc3 = new Increment() ;
		
		
		// 싱글톤 객체 얻어오기
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c1.minus(1, 2);
		int r3 = c2.multi(2, 3);
		int r4 = c2.div(4, 2);
		
		System.out.println("r1: "+r1);
		System.out.println("r2: "+r2);
		System.out.println("r3: "+r3);
		System.out.println("r4: "+r4);

	}

}
