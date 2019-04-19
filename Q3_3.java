/*
실습문제 3장 3번
목적)
2중 중첩 반복문 연습
문제)
Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라. 다음은 5를 입력받았을 경우이다.
에제)
정수를 입력하시오>>5
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
		
		System.out.print("정수를 입력하시오>>");
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
