/*
�ǽ����� 11�� (1)
����)
���ڸ� �Է¹޾� 3~5�� "��", 6~8�� "����", 9~11�� "����", 12~1�� ��� "�ܿ�"��,
�� �� ���ڸ� �Է��� ��� "�߸��Է�"�� ����ϴ� ���α׷��� �ۼ��϶�.
(1) if-else���� �̿��Ͽ� ���α׷��� �ۼ��϶�
(2) switch ���� �̿��Ͽ� ���α׷��� �ۼ��϶�
��)
���� �Է��ϼ���(1~12)>>9
����
 */
import java.util.Scanner;

public class Q2_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = sc.nextInt();
		
		//(1)
		if(month >= 3 && month <= 5) {
			System.out.print("��");
		}else if(month >= 6 && month <= 8) {
			System.out.print("����");
		}else if(month >= 9 && month <= 11) {
			System.out.print("����");
		}else if(month >= 1 && month <= 12) {
			System.out.print("�ܿ�");
		}else {
			System.out.print("�߸��Է�");
		}
		
		sc.close();
	}

}
