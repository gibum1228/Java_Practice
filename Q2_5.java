/*
실습문제 5번
문제)
Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라.
삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 반드시 커야한다.
예)
정수 3개를 입력하시오>>4 3 5
삼각형이 됩니다
 */
import java.util.*;

public class Q2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오>>"); // 정수 3개 입력받기
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if((side1+side2)>side3 || (side1+side3)>side2 || (side2+side3)>side1) { // 두 변의 합은 한 변보다 무조건 커야한다
			System.out.println("삼각형이 됩니다");
		}else {
			System.out.println("삼각형이 안 됩니다");
		}
		
		sc.close();
	}

}
