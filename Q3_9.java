/*
�ǽ����� 3�� 9��
����)
2���� �迭�� �ݺ��� ����
����)
4x4�� 2���� �迭�� ����� �̰��� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� ���� 16���� �迭�� �����ϰ�, 2���� �迭�� ȭ�鿡 ����϶�.
����)
6	10	1	8
1	3	7	2
8	4	5	1
1	8	4	4
 */
public class Q3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int [4][4];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10 + 1);
				System.out.printf("%-4d", array[i][j]);
			}
			System.out.println("");
		}
	}

}
