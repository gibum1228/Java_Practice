/*
 * �ҿ� �ڹ� ���͵� ����
 * ���ϴ� ũ���� ������ *�� ����ϱ�
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
				System.out.println("¦�� ������ ������� ���� �� �����ϴ�.");
				continue;
			}
			break;
		}
		
		int upLine = (1+size) / 2;
		int underLine = size / 2;
		
		for(int i = 0; i < upLine; i++){ // ������ ������ ���
			for(int j = 0; j < upLine - i; j++){
				System.out.print(" "); 
			}
			for(int j = 0; j < 2 * i + 1; j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		
		for(int i = underLine; i > 0; i--){ // ������ ������ ���
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
