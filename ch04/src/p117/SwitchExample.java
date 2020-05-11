package p117;
// Switch문
public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break; // 다음 case를 실행하지 말고 switch문을 빠져나가기 위함.
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:   // 불이행
			System.out.println("6번이 나왔습니다.");
			break; // break가 없으면 다음 case가 연달아 실행됨.
		}

	}

}
