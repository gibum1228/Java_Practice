import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Collections { // 컬렉션 프레임워크란 자료구조이다

	public static void main(String[] args) {
		int testArr[] = new int [10];
		// List -> 가변 배열, 파이썬 List와 똑같이 작동하지만 타입 선언해줘야 함
		ArrayList<Integer> testAL = new ArrayList<>(10);
		Vector<Integer> testVector = new Vector<>(10);
		
		// SET -> 가변 배열인데 중복이 안 됨
		Set<Integer> testSet = new HashSet<>();
		
		// MAP -> 파이썬 딕셔너리와 같고, key-value 형태
		Map<String, String> testMap = new HashMap<>();
		
		// LIST
		if(testAL.isEmpty()) { // 비어 있으면 True 리턴
			for(int i = 0; i < testAL.size(); i++) {
				testAL.add(i); // arr[i] = 0
			}
		}
		if(testVector.isEmpty()) {
			for(int i = 0; i < testVector.capacity(); i++) {
				testVector.add(i);
			}
		}
		System.out.println("=======LIST======");
		System.out.println(testAL); // []
		System.out.println(testVector); // [0 ... 9]
		testVector.remove(0); // 원하는 index 객체 삭제, 자동으로 리스트 정렬해줌
		System.out.println();
		System.out.println(testVector.get(0)); // 0이 아닌 1이 출력됨
		System.out.println(testVector); // [1 ... 9]
		testVector.add(0, 0); // (index, value)
		
		// SET
		if(testSet.isEmpty()) {
			for(int i = 0; i < 3; i++) {
				for(int j = 1; j < 5; j++) {
					testSet.add(i);
				}
			}
		}
		System.out.println("=======SET=======");
		System.out.println(testSet); // [0, 1, 2] -> 중복 저장 X
		// testSet[0] || testSet.get(0) -> 에러
		// 왜냐하면 순서가 없기 때문에 주소로 호출 불가능
		System.out.println();
		Iterator iter = testSet.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		// MAP - key-value 형태를 가짐
		System.out.println("=======MAP=======");
		testMap.put("멘토", "김기범");
		testMap.put("멘티1", "강명주");
		testMap.put("멘티2", "김하은");
		testMap.put("멘티3", "이지윤");
		testMap.put("멘티4", "박진희");
		System.out.println(testMap.keySet());
		System.out.println(testMap.values());
		System.out.println(testMap.get("멘토")); // 맵 또한 순서가 없음 -> 딕셔너리라고도 함
		
		// 모두 초기화
		testAL.clear();
		testVector.clear();
		testSet.clear();
		testMap.clear();
	}

}
