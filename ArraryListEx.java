// ���� 7-2
import java.util.*;

public class ArraryListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // Scanner ��ü ����
		// ���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> b = new ArrayList<String>();
		
		// ���ڿ� 3�� �Է¹ޱ�
		for(int i = 0; i < 3; i++) {
			String str = sc.next();
			b.add(str);
		}
		
		// ����� �Է¹޾Ҵ��� Ȯ��
		for(int i = 0; i < b.size(); i++) {
			String str2 = b.get(i); // []��� �� �ϱ� ������ get(),set() �̿�
			System.out.println(str2);
		}
		
		// ����Ʈ �ʱ�ȭ
		b.clear();
		
		
		
		// ���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> a = new ArrayList<String>();
		
		// Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ����
		for(int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ���>>");
			String s = sc.next(); // Ű����κ��� �̸��� �Է�
			a.add(s); // ArrayList �÷��ǿ� ����
		}
		
		// ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i = 0; i < a.size(); i++) {
			String name = a.get(i); // ArrayList�� i��° ���ڿ� ������
			System.out.print(name + " ");
		}
		
		// ���� �� �̸� ���
		int longestIndex = 0; // ���� ���� �� �̸��� �ִ� ArrayList ���� �ε���
		for(int i = 0; i < a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) { // �̸� ���� ��
				longestIndex = i; // i ��° �̸��� �� �� �̸���
			}
		}
		
		System.out.println("\n ������ �� �̸��� : " + a.get(longestIndex));
		sc.close();
	}

}
