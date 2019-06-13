// 예제 8-10
import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Window10\\img1.jpg");
		
		File dest = new File("c:\\Temp\\copyimg.jpg");
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); // 파일 입력 바이트 스트릠 생성
			FileOutputStream fo = new FileOutputStream(dest); // 파일 출력 바이트 스트림 생성
			
			while(((c = fi.read()) != -1)) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		}catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
