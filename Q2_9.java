/*
�ǽ����� 9��
����)
���� �߽��� ��Ÿ���� �� ���� �������� �Ǽ� ������ �Է¹޾ƶ�.
�׸��� �Ǽ� ������ �ٸ� �� (x,y)�� �Է¹޾� �� ���� ���� ���ο� �ִ��� �Ǻ��Ͽ� ����϶�
��)
���� �߽ɰ� ������ �Է�>>10 10 6.5
�� �Է�>>13 13
�� (13.0,13.0)�� �� �ȿ� �ִ�.
 */
import java.util.Scanner;

public class Q2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double circleX = sc.nextDouble();
		double circleY = sc.nextDouble();
		double radius = sc.nextDouble();
		
		System.out.print("�� �Է�>>");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double distance = Math.sqrt((circleX-x)*(circleX-x) + (circleY-y)*(circleY-y));
		
		if(distance < radius) {
			System.out.print("�� (" + x + "," + y + ")�� �� �ȿ� �ִ�.");
		}else {
			System.out.print("�� (" + x + "," + y + ")�� �� �ۿ� �ִ�.");
		}
		
		sc.close();
		
	}

}
