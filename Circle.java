/*
 * 소울 자바 스터디 과제
 * 원하는 크기의 원을 *로 출력하기
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
                //원의 중심좌표(n,n)로부터 (i,j)사이의 거리를 구함
                int d = (int)sqrt((i - n) * (i - n) + (j - n) * (j - n));
                //(i,j)좌표가 (n,n)사이의 거리가 반지름의길이 이하일때  좌표를 찍는다.
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
