/*
실습문제 11번 (2)
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

public class Q2_11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		
		//(2)
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.print("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.print("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("가을");
			break;
		default:
			System.out.print("잘못입력");
		}
		
		sc.close();
	}

}
