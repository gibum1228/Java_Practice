import java.io.*;

public class IOStreamEX {

	public static void main(String[] args) throws IOException {
		// 버퍼 입출력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 파일 입출력 스트림
		File file = new File("test.txt");
		if(!file.exists()) // 파일이 없으면
			file.createNewFile(); // 파일 생성
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter(file);

		// TEST
		System.out.print("버퍼에 넣을 내용 입력>> ");
		String strBuffer = br.readLine();
		System.out.print("파일에 넣을 내용 입력>> ");
		String strFile = br.readLine();
		System.out.println("기본 출력>> " + strBuffer);
		bw.write("버퍼 내용 출력>> " + strBuffer + "\n");
		bw.flush();
		
		fw.write(strFile); // 파일에 출력
		fw.flush();
		
		System.out.print("파일 내용 출력>> ");
		int c;
		while((c = fr.read()) != -1) {
			System.out.print((char)c);
		}

		br.close();
		fr.close();
	}

}
