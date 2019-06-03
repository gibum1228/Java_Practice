// 예제 7-2
import java.util.*;

public class ArraryListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		// 문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> b = new ArrayList<String>();
		
		// 문자열 3개 입력받기
		for(int i = 0; i < 3; i++) {
			String str = sc.next();
			b.add(str);
		}
		
		// 제대로 입력받았는지 확인
		for(int i = 0; i < b.size(); i++) {
			String str2 = b.get(i); // []허용 안 하기 때문에 get(),set() 이용
			System.out.println(str2);
		}
		
		// 리스트 초기화
		b.clear();
		
		
		
		// 문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = sc.next(); // 키보드로부터 이름을 입력
			a.add(s); // ArrayList 컬렉션에 삽입
		}
		
		// ArrayList에 들어 있는 모든 이름 출력
		for(int i = 0; i < a.size(); i++) {
			String name = a.get(i); // ArrayList의 i번째 문자열 얻어오기
			System.out.print(name + " ");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0; // 현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
		for(int i = 0; i < a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) { // 이름 길이 비교
				longestIndex = i; // i 번째 이름이 더 긴 이름임
			}
		}
		
		System.out.println("\n 가ㅏㅇ 긴 이름은 : " + a.get(longestIndex));
		sc.close();
	}

}
