/*
�ǽ����� 3�� 7��
����)
�迭�� �ݺ��� ����
����)
������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�
����)
������ ������ : 10 5 2 9 1 4 1 5 1 5
����� 4.3
��Ʈ)
1���� 10���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�
int i = (int)(Math.random()*10 + 1)
 */

public class Q3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int sum = 0;
		
		System.out.print("������ ������ : ");
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10 + 1);
			System.out.print(array[i] + " ");
		}
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println();
		System.out.print("����� " + sum / 10.0);
	}

}
