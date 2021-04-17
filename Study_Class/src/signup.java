import java.util.Scanner;

public class signup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student me = new Student();
		int op = 0;
		String id, pwd, snum, name, major; 
		String sInfo = "무엇을 하시겠습니까 ?\n"
				+ "========== 메뉴 ==========\n"
				+ "= 1.로그인\n"
				+ "= 2.회원가입\n"
				+ "= 3.종료";
		
		while(op != 4) {
			System.out.println(sInfo);
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("========== 로그인 화면 ==========");
					System.out.print("아이디: ");
					id = sc.next();
					System.out.print("비밀번호: ");
					pwd = sc.next();
					
					if(me.login(id, pwd)) {
						op = 4;
					}
					break;
				case 2:
					System.out.println("========== 회원가입 화면 ==========");
					System.out.println("(아이디, 비밀번호, 학번, 이름, 전공)순으로 입력 {띄어쓰기로 구분}>>");
					id = sc.next();
					pwd = sc.next();
					snum = sc.next();
					name = sc.next();
					major = sc.next();
					
					me = new Student(id, pwd, snum, name, major);
					
					break;
				case 3:
					System.out.println("힝 속았징 ?\n");
					
					break;
			}
		}
		
		me.info();
		sc.close();
	}
}

//인터페이스
interface User {
	String userId = null;
	String password = null;

	boolean login(String id, String pwd);
	void info();
}
// 추상 클래스 버전
abstract class ABSUser {
	String userId;
	String password;

	abstract boolean login(String id, String pwd);
	abstract void info();
}

// 다중 상속 가능
interface Admin extends User {
	String authority = "admin";
}

// 인터페이스 상속 -> implements 사용
class Student extends ABSUser {
	// 필드
	String snum;
	String name;
	String major;

	// 생성자
	public Student() {
	}

	public Student(String id, String pwd, String snum, String name, String major) {
		this.userId = id;
		this.password = pwd;
		this.snum = snum;
		this.name = name;
		this.major = major;
		
		System.out.println(">> 회원 가입 완료\n");
	}

	boolean login(String id, String pwd) {
		if((this.userId == null) && (this.password == null)) {
			System.out.println(">> 회원정보가 없습니다.\n");
			
			return false;
		}else if((this.userId.compareTo(id) == 0) && (this.password.compareTo(pwd) == 0)) {
			System.out.println(">> 로그인 성공\n");
			
			return true;
		}else {
			System.out.println(">> 로그인 실패\n");
			
			return false;
		}
	}
	void info() {
		System.out.println("========== 나의 정보 ==========\n"
				+ "아이디: " + this.userId + "\n"
				+ "소속: " + this.major + "\n"
				+ "학번: " + this.snum + "\n"
				+ "이름: " + this.name + "\n프로그램 종료.");
	}
}