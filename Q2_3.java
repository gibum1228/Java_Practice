/*
�ǽ����� 3��
����)
Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¹޾� ���� ����, �� ����, õ ����, 500��¥�� ����, 
100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� ���� �� �� ���� ��ȯ�Ǵ��� ����϶�.
��)
�ݾ��� �Է��Ͻÿ�>>65376
�������� 1��
������ 1��
õ���� 5��
��� 3��
���ʿ� 1��
�ʿ� 1��
�Ͽ� 6��
 */
import java.util.Scanner;

public class Q2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] moneyName = new String [] {"��������", "������", "õ����", "�����", "���", "���ʿ�", "�ʿ�", "�Ͽ�"}; // �� �̸� �迭
		int [] moneyKind = new int [] {50000, 10000, 1000, 500, 100, 50, 10, 1}; // �� ���� �迭
		int division; // �� ���� ���� ����
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>"); 
		int money = sc.nextInt(); // �� �ݾ� money �Է¹ޱ�
		
		for(int i = 0; i < 8; i++) { // �迭 ũ�⸸ŭ ����
			division = money / moneyKind[i]; // money�� moneyKind[i]�� ���� ���� �ʿ��� ����
			money -= (moneyKind[i] * division); // �ʿ��� ���� * moneyKind[i] ��ŭ money���� ����
			if(division == 0) { // ���� �ʿ� ���ٸ� ���� ��˻�
				continue;
			}
			if(i < 3) { // ������
				System.out.println(moneyName[i] + " " + division + "��");
			}
			if(i > 2) { // �����̶��
				System.out.println(moneyName[i] + " " +division + "��");
			}
		}
		 
		sc.close();
	}
}
