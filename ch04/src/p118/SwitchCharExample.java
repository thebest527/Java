package p118;
// char Ÿ���� Switch��
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		// switch ���ĺ� ��ҹ��� �����ϰ� ó����.
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
			
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
			
		default:
			System.out.println("�մ��Դϴ�.");
		}

	}

}
