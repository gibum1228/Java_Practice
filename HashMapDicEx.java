// ���� 7-5
import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>(); // �ؽø� ����
		
		// 3���� (key, value) ���� dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		// ����ڷκ��� ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�, "exit" �Է¹����� ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			// �ؽøʿ��� 'Ű' eng�� '��' kor �˻�
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
			}else {
				System.out.println(kor);
			}
		}	
		sc.close();		
	}
}