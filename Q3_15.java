/*
�ǽ����� 3�� 15��
����)
InputMismatchException ���� ó��
����) ������ 2���� ������ �Է� �޾� ���� ���ϴ� Multiply Ŭ�����̴�.
.....
������ ���� ������ �� ���α׷��� 10�� 5�� ���� 50�� �� ����Ѵ�.
��)
���ϰ��� �ϴ� �� �� �Է�>>10 5
10x5=50
����)
������, ������ ���� �Ǽ��� �Է��Ͽ��� ��, ���ܰ� �߻��Ѵ�.
��)
���ϰ��� �ϴ� �� �� �Է�>>2.5 4
.......
����)
������ ���� �Ǽ��� �ԷµǸ� ������ �ٽ� �Է��ϵ��� �Ͽ� ���� ���� ���������� ó���ǵ��� ���� ó�� �ڵ带 �����Ͽ� Multiply Ŭ������ �����϶�.
��)
���ϰ��� �ϴ� �� �� �Է�>>2.5 4
�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.
���ϰ��� �ϴ� �� �� �Է�>>4 3
4x3=12
��Ʈ)
InputMismatchException ���ܸ� ó���� try-catch �ڵ带 �ۼ��ϰ�, catch ��Ͽ��� Scanner�� �̹� �Էµ� Ű�� ��� �����ϱ� ���� Scanner�� nextLine()�� ȣ���϶�.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				
				System.out.printf("%dx%d=%d", n1, n2, n1*n2);
				sc.close();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				sc.nextLine();
			}
		}
	}

}
