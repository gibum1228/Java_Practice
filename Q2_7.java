/*
�ǽ����� 7��
����)
2���� ��鿡�� ���簢���� ���� ��� �𼭸��� ������ �ϴ� �𼭸��� �� ������ ǥ���Ѵ�. 
(100, 100)�� (200, 200)�� �� ������ �̷���� �簢���� ���� ��, Scanner�� �̿��Ͽ� ���� x�� y
���� �Է¹ް� �� (x,y)�� �� ���簢�� �ȿ� �ִ����� �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
��)
�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>150 150
(150,150)�� �簢�� �ȿ� �ֽ��ϴ�.
 */
import java.util.*;

public class Q2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}else {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �����ϴ�.");
		}
		
		sc.close();
	}

}
