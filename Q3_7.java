/*
실습문제 3장 7번
목적)
배열과 반복문 연습
문제)
정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라
예제)
랜덤한 정수들 : 10 5 2 9 1 4 1 5 1 5
평균은 4.3
힌트)
1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라
int i = (int)(Math.random()*10 + 1)
 */

public class Q3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int sum = 0;
		
		System.out.print("랜덤한 정수들 : ");
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10 + 1);
			System.out.print(array[i] + " ");
		}
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println();
		System.out.print("평균은 " + sum / 10.0);
	}

}
