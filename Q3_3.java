/*
�ǽ����� 3�� 3��
����)
2�� ��ø �ݺ��� ����
����)
Scanner�� �̿��Ͽ� ������ �Է¹ް� ������ ���� *�� ����ϴ� ���α׷��� �ۼ��϶�. ������ 5�� �Է¹޾��� ����̴�.
����)
������ �Է��Ͻÿ�>>5
*****
****
***
**
*
 */
import java.util.Scanner;

public class Q3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>>");
		int len = sc.nextInt();
		
		for(int i = len;i > 0;i--) {
			for(int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
