/*
실습문제 3장 11번
목적)
main()의 매개변수 처리와 Integer.parseInt()
문제)
다음과 같이 작동하는 Average.java를 작성하라. 명령행 인자는 모두 정수만 사용되며 정수들의 평균을 출력한다. 다음 화면은 컴파일된 Average.class 파일을
c:\Temp 디렉터리에 복사한 뒤 실행한 경우이다. 원본 Average.class 파일은 이클립스의 프로젝트 폴더 밑에 bin 폴더에 있다.
예)
C:\Temp>java Average 2 3 4
3 // 2 3 4의 평균
힌트)
문자열을 정수로 변환할 때 다음 코드를 이용하라.
int i = Integer.parseInt("10") // i는 10
 */
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("명령행 인자가 없습니다.");
			return;
		}
		
		int sum=0;
		for (int i=0; i<args.length; i++) {
			sum = sum + Integer.parseInt(args[i]); // 인자를 정수로 변환하여 합산
		}
		System.out.println(sum/args.length); // 평균 출력
	}

}
