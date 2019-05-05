import java.util.Random;
import java.util.Scanner;


// temp�� �̿��� ����
public class Sudoku {
	public static void main(String[] args) {
        int size = 0;
        int rand;
        Random random = new Random(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("���ڸ� �Է��ϼ���(2�̻�)");
            size = sc.nextInt();
            if (size < 2) {
                System.out.println("2�̻� ���ڸ� �Է����ּ���");
            } else {
                break;
            }
        }


        //2���� �迭 sizeũ��� ����
        int result[][] = new int[size][size];

        //0���� �ʱ�ȭ
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = 0;
            }
        }
        //������� size��ŭ �ڿ�����������
        rand = random.nextInt(size) + 1;
        int a;
        int b;
        int row;
        int col;
        boolean isSame = true;
        int loopCount = 0;

        Loop2: while (true) {
            loopCount=0;//�ʱ�ȭ

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    row = j; // ���� j
                    col = i;    // ���� i
                    
                    Loop1:
                    while (true) {
                        rand = random.nextInt(size) + 1;
                        result[i][j] = rand;

                        //���� ���ʰ��� ��ġ�����˻�
                        for (a = row - 1; a >= 0; a--) {
                            while (isSame == true) {

                                if (result[i][j] == result[i][a]) {
                                    isSame = true;
                                    continue Loop1;
                                } else {
                                    isSame = false;
                                }
                            }
                            isSame = true;//���������� �ٽ� �ʱ�ȭ
                        }

                        //���� ���ʰ��� ��ġ�����˻�
                        for (b = col - 1; b >= 0; b--) {
                            while (isSame == true) {
                                if (result[i][j] == result[b][j]) {
                                        loopCount++;
                                        if (loopCount > 700) { //�������� ����� ���� ���� ���� ���ļ� ���ѷ����� ���� ��찡 �߻��ϴµ� 300���̻� ������ ���� ó������ ������ ¥���Ѵ�.
                                            continue Loop2;
                                        }
                                    isSame = true;
                                    continue Loop1;
                                } else {
                                    isSame = false;
                                }
                            }
                            isSame = true;//���������� �ٽ� �ʱ�ȭ
                        }
                        break;
                    }
                }
            }
            
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(String.valueOf(result[i][j]).length() == 1) {
                        System.out.print("  "+result[i][j]+" ");
                    }else{
                        System.out.print("  "+result[i][j]);
                    }
                }
                System.out.println();
            }
            break;
        }
    sc.close();
	}
}
