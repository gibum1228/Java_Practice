/*
실습문제 3장 5번
목적)
배열과 반복문 연습
문제)
양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.
예제)
양의 정수 10개를 입력하시오>>1 5 99 22 345 154 2346 55 32 85
3의 배수는 99 345 2346
 */
import java.util.Scanner;

public class Q3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int [10];
		
		System.out.print("양의 정수 10개를 입력하시오>>");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		
		sc.close();
	}

}
