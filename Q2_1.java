/*
�ǽ����� 1��
����:
Scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է¹޾� �޷��� �ٲپ� ���� ���ÿ� ���� ����ϴ� ���α׷��� �ۼ��϶�.
$1 = 1100������ �����ϰ� ����϶�
��)
��ȭ�� �Է��ϼ���(���� ��)>>3300
3300���� $3.0�Դϴ�.
 */
import java.util.Scanner;

public class Q2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int krMoney = sc.nextInt(); // ��ȭ�� krMoney�� �Է¹ޱ�
		float dollar = (float)krMoney / 1100;
		
		System.out.print(krMoney + "���� $" + dollar + "�Դϴ�."); // ����� ���
		 
		sc.close();
	}
}
