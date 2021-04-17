public class Animals {
	
	public static void main(String[] args) {
		// 클래스 객체
		Dog a;
		a = new Dog("강아지", "왈왈", "인절미", 3);
		Animal a2 = new Animal();
		
		a.age = 3;
		a.age++;
		
		a.info();
		a.speak();
		
		// 객체 배열
		Animal[] animals = new Animal [3];
		for(int i = 0; i < animals.length; i++) {
			animals[i] = new Dog(); // 업 캐스팅
		}
		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);
		System.out.println(a2 instanceof Animal);
		System.out.println(a2 instanceof Dog);
	}
}

class Animal {	
	// 필드
	protected String kind; // 대분류
	private String speak; // 짖는 소리
	
	// 생성자
	public Animal() {
		
	}
	public Animal(String kind, String speak) {
		this.kind = kind;
		this.speak = speak;
	}
	
	// 메소드
	// 짖기
	void speak() {
		System.out.println(speak);
	}
	void speak(String s) { // 오버로딩
		System.out.println(s);
	}
}

class Dog extends Animal {
	// 필드
	private String name; // 이름
	int age; // 나이
	
	// 생성자
	public Dog() {
		this("멍멍이", 1); // this() 사용
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Dog(String kind, String speak, String name, int age) {
		super(kind, speak); // 부모 생성자 호
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	// 소개
	void info() {
		System.out.println("저는 " + kind + "이고 이름은 " + name + ", 나이는 " + age + "살 입니다.");
	}
	// 오버라이딩
	void speak() {
		System.out.println("난 안 짖어요");
	}
}