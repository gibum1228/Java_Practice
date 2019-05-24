import java.util.Scanner;

public class nonBreakSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		char grade = 'F';
		
		switch(grade) {
		case 'A':
			sum += 100;
		case 'B':
			sum += 50;
		case 'C':
			sum += 30;
		case 'D':
			sum += 10;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
