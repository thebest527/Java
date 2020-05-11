package p118;
// char 타입의 Switch문
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		// switch 알파벳 대소문자 동일하게 처리함.
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
			
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			
		default:
			System.out.println("손님입니다.");
		}

	}

}
