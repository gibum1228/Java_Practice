/*
실습문제 3장 15번
목적)
InputMismatchException 예외 처리
문제) 다음은 2개의 정수를 입력 받아 곱을 구하는 Multiply 클래스이다.
.....
다음과 같이 실행할 때 프로그램은 10과 5를 곱해 50을 잘 출력한다.
예)
곱하고자 하는 두 수 입력>>10 5
10x5=50
문제)
하지만, 다음과 같이 실수를 입력하였을 때, 예외가 발생한다.
예)
곱하고자 하는 두 수 입력>>2.5 4
.......
문제)
다음과 같이 실수가 입력되면 정수를 다시 입력하도록 하여 예외 없이 정상적으로 처리되도록 예외 처리 코드를 삽입하여 Multiply 클래스를 수정하라.
예)
곱하고자 하는 두 수 입력>>2.5 4
실수는 입력하면 안됩니다.
곱하고자 하는 두 수 입력>>4 3
4x3=12
힌트)
InputMismatchException 예외를 처리할 try-catch 코드를 작성하고, catch 블록에서 Scanner에 이미 입력된 키를 모두 제거하기 위해 Scanner의 nextLine()을 호출하라.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				
				System.out.printf("%dx%d=%d", n1, n2, n1*n2);
				sc.close();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수를 입력하면 안됩니다.");
				sc.nextLine();
			}
		}
	}

}
