/*
�ǽ����� 11�� (2)
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

public class Q2_11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = sc.nextInt();
		
		//(2)
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.print("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.print("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("����");
			break;
		default:
			System.out.print("�߸��Է�");
		}
		
		sc.close();
	}

}
