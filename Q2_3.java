/*
실습문제 3번
문제)
Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 
100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
예)
금액을 입력하시오>>65376
오만원권 1매
만원권 1매
천원권 5매
백원 3개
오십원 1개
십원 1개
일원 6개
 */
import java.util.Scanner;

public class Q2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] moneyName = new String [] {"오만원권", "만원권", "천원권", "오백원", "백원", "오십원", "십원", "일원"}; // 돈 이름 배열
		int [] moneyKind = new int [] {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 돈 단위 배열
		int division; // 몫 담을 변수 생성
		
		System.out.print("금액을 입력하시오>>"); 
		int money = sc.nextInt(); // 총 금액 money 입력받기
		
		for(int i = 0; i < 8; i++) { // 배열 크기만큼 실행
			division = money / moneyKind[i]; // money를 moneyKind[i]로 나눈 몫이 필요한 갯수
			money -= (moneyKind[i] * division); // 필요한 갯수 * moneyKind[i] 만큼 money에서 빼기
			if(division == 0) { // 돈이 필요 없다면 조건 재검사
				continue;
			}
			if(i < 3) { // 지폐라면
				System.out.println(moneyName[i] + " " + division + "매");
			}
			if(i > 2) { // 동전이라면
				System.out.println(moneyName[i] + " " +division + "개");
			}
		}
		 
		sc.close();
	}
}
