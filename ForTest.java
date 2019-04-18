/*
실습문제 3장 1-3번
목적)
for, while, do-while 반복문 작성 연습
문제)
다음 프로그램에 대해 물음에 답하라?
(1) 무엇을 계산하는 코드이며 실행 결과 출력되는 내용은?
(2) 위의 코드를 main() 메소드로 만들고 WhileTest 클래스로 완성하라
(3) for 문을 이용하여 동일하게 실행되는 ForTest 클래스를 작성하라
(4) do-while 문을 이용하여 동일하게 실행되는 DoWhikeTest 클래스를 작성하라
 */
public class ForTest {

	public static void main(String[] args) {
		int sum=0, i=0;
		for(i=0; i<100; i+=2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
