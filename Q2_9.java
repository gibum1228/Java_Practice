/*
실습문제 9번
문제)
원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라.
그리고 실수 값으로 다른 점 (x,y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라
예)
원의 중심과 반지름 입력>>10 10 6.5
점 입력>>13 13
점 (13.0,13.0)는 원 안에 있다.
 */
import java.util.Scanner;

public class Q2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double circleX = sc.nextDouble();
		double circleY = sc.nextDouble();
		double radius = sc.nextDouble();
		
		System.out.print("점 입력>>");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double distance = Math.sqrt((circleX-x)*(circleX-x) + (circleY-y)*(circleY-y));
		
		if(distance < radius) {
			System.out.print("점 (" + x + "," + y + ")는 원 안에 있다.");
		}else {
			System.out.print("점 (" + x + "," + y + ")는 원 밖에 있다.");
		}
		
		sc.close();
		
	}

}
