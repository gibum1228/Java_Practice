/*
�ǽ����� 5��
����)
Scanner�� �̿��Ͽ� �ﰢ���� ���� ���̸� ��Ÿ���� ������ 3�� �Է¹ް� �� 3���� ���� �ﰢ���� ���� �� �ִ��� �Ǻ��϶�.
�ﰢ���� �Ƿ��� �� ���� ���� �ٸ� �� ���� �պ��� �ݵ�� Ŀ���Ѵ�.
��)
���� 3���� �Է��Ͻÿ�>>4 3 5
�ﰢ���� �˴ϴ�
 */
import java.util.*;

public class Q2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��Ͻÿ�>>"); // ���� 3�� �Է¹ޱ�
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if((side1+side2)>side3 || (side1+side3)>side2 || (side2+side3)>side1) { // �� ���� ���� �� ������ ������ Ŀ���Ѵ�
			System.out.println("�ﰢ���� �˴ϴ�");
		}else {
			System.out.println("�ﰢ���� �� �˴ϴ�");
		}
		
		sc.close();
	}

}
