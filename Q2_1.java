/*
실습문제 1번
문제:
Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라.
$1 = 1100원으로 가정하고 계산하라
예)
원화를 입력하세요(단위 원)>>3300
3300원은 $3.0입니다.
 */
import java.util.Scanner;

public class Q2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int krMoney = sc.nextInt(); // 원화를 krMoney에 입력받기
		float dollar = (float)krMoney / 1100;
		
		System.out.print(krMoney + "원은 $" + dollar + "입니다."); // 결과값 출력
		 
		sc.close();
	}
}
