/*
실습문제 11번 (1)
문제)
숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 12~1의 경우 "겨울"을,
그 외 숫자를 입력한 경우 "잘못입력"을 출력하는 프로그램을 작성하라.
(1) if-else문을 이용하여 프로그램을 작성하라
(2) switch 문을 이용하여 프로그램을 작성하라
예)
달을 입력하세요(1~12)>>9
가을
 */
import java.util.Scanner;

public class Q2_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		
		//(1)
		if(month >= 3 && month <= 5) {
			System.out.print("봄");
		}else if(month >= 6 && month <= 8) {
			System.out.print("여름");
		}else if(month >= 9 && month <= 11) {
			System.out.print("가을");
		}else if(month >= 1 && month <= 12) {
			System.out.print("겨울");
		}else {
			System.out.print("잘못입력");
		}
		
		sc.close();
	}

}
