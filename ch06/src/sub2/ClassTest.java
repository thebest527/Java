package sub2;

/* 
 * ��¥ : 2020/05/07
 * �̸� : �ڼ���
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */
public class ClassTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		// �������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-12-1234", "������", 10000);
		
		// �Ա�, ���, �ܾ���ȸ�ϱ�
		kb.deposit(10000); // �Ա�
		kb.withdraw(5000); // ���
		// kb.money--; // ��ü�� ��������� ĸ��ȭ�� ���� ����ڵ� ����
		kb.info(); // ��ȸ
		
		// �������� ��ü���� �� �ʱ�ȭ
		Account sh = new Account("��������", "121-11-1234", "������", 30000);
		
		// �Ա�, ���, �ܾ���ȸ�ϱ�
		sh.deposit(10000); // �Ա�
		sh.withdraw(8000); // ���
		sh.info(); // ��ȸ
		
	}

}
