/*
실습문제 3장 9번
목적)
2차원 배열과 반복문 연습
문제)
4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
예제)
6	10	1	8
1	3	7	2
8	4	5	1
1	8	4	4
 */
public class Q3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int [4][4];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10 + 1);
				System.out.printf("%-4d", array[i][j]);
			}
			System.out.println("");
		}
	}

}
