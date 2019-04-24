/*
실습문제 3장 13번
목적)
반복문과 조건문 연습
문제)
반복문을 이용하여 369게임에서 박수를 쳐야하는 경우를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.
예)
3 박수 짝
6 박수 짝
9 박수 짝
13 박수 짝
16 박수 짝
.........
 */
public class Q3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 100; i++) {
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print(i + " 박수 짝");
				if((i >= 30 && i < 40) || (i >= 60 && i < 70) || (i >= 90 && i < 100)) {
					System.out.print("짝\n");
				}else {
					System.out.println();
				}
			}
		}
	}

}
