package ex;

import java.util.ArrayList;

public class EX {
	public static void main(String[] args) {
		Queue<String> q = new Queue<>();
		q.push("가");
		q.push("나");
		q.push("다");
		q.push("라");
		
		System.out.println("===== 큐 =====");
		q.print();
		System.out.println(q.pop());
		System.out.println(q.pop());
		q.print();
		// ==========================================
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println("===== 스택 =====");
		s.print();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.print();
		
		q.clear();
		s.clear();
	}
}

class Queue<T> {
	private ArrayList<T> q = new ArrayList<>();
	
	/*
	Class명: Queue<T>
	
	필드
		ArrayList 객체 1개
	
	메소드
		push(): 리스트에 객체 삽입
		pop(): 리스트 가장 앞에 있는 요소를 return 후에 삭제
		clear(): 리스트 초기화
		print(): 리스트 요소 출력
			ex) "1 2 3 4 5 6 7 8 9"
	*/
	
	public void push(T a) {
		q.add(q.size(), a);
	}
	
	public T pop() {
		return q.remove(0);
	}
	
	public void clear() {
		q.clear();
	}
	
	public void print() {
		String result = "";
		
		for(int i = 0; i < q.size(); i++) {
			result += q.get(i) + " ";
		}
		
		System.out.println(result);
	}
}

class Stack<T> {
	private ArrayList<T> s = new ArrayList<>();
	
	/*
	Class명: Stack<T>
	
	필드
		ArrayList 객체 1개
	
	메소드
		push(): 리스트에 객체 삽입
		pop(): 리스트 가장 먼저 들어온 요소를 return 후에 삭제
		clear(): 리스트 초기화
		print(): 리스트 요소 출력
			ex) "1 2 3 4 5 6 7 8 9"
	*/
	
	public void push(T a) {
		s.add(0, a);
	}
	
	public T pop() {
		return s.remove(0);
	}
	
	public void clear() {
		s.clear();
	}
	
	public void print() {
		String result = "";
		
		for(int i = 0; i < s.size(); i++) {
			result += s.get(i) + " ";
		}
		
		System.out.println(result);
	}
}