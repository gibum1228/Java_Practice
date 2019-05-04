/*
 * �ҿ� �ڹ� ���͵� ����
 * ���ϴ� ũ���� ���� *�� ����ϱ�
 */
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		
		for (int i = 0; i <= n * 2; i++) {
            for (int j = 0; j <= n * 2; j++) {
                //���� �߽���ǥ(n,n)�κ��� (i,j)������ �Ÿ��� ����
                int d = (int)sqrt((i - n) * (i - n) + (j - n) * (j - n));
                //(i,j)��ǥ�� (n,n)������ �Ÿ��� �������Ǳ��� �����϶�  ��ǥ�� ��´�.
                if (d <= n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		
		sc.close();
	}

}
