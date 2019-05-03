/*
 * 소울 자바 스터디 과제
 * 원하는 크기의 마름모를 *로 출력하기
 */
import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		while(true) {
			size = sc.nextInt();
			if(size % 2 == 0) {
				System.out.println("짝수 높이의 마름모는 만들 수 없습니다.");
				continue;
			}
			break;
		}
		
		int upLine = (1+size) / 2;
		int underLine = size / 2;
		
		for(int i = 0; i < upLine; i++){ // 마름모 윗라인 출력
			for(int j = 0; j < upLine - i; j++){
				System.out.print(" "); 
			}
			for(int j = 0; j < 2 * i + 1; j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		
		for(int i = underLine; i > 0; i--){ // 마름모 윗라인 출력
			for(int j = upLine - i; j >= 0; j--){
				System.out.print(" "); 
			}
			for(int j = upLine + i; j > upLine - i + 1; j--){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
