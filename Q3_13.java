/*
�ǽ����� 3�� 13��
����)
�ݺ����� ���ǹ� ����
����)
�ݺ����� �̿��Ͽ� 369���ӿ��� �ڼ��� �ľ��ϴ� ��츦 ������� ȭ�鿡 ����غ���. 1���� �����ϸ� 99������ �Ѵ�. ���� ��ʴ� ������ ����.
��)
3 �ڼ� ¦
6 �ڼ� ¦
9 �ڼ� ¦
13 �ڼ� ¦
16 �ڼ� ¦
.........
 */
public class Q3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 100; i++) {
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print(i + " �ڼ� ¦");
				if((i >= 30 && i < 40) || (i >= 60 && i < 70) || (i >= 90 && i < 100)) {
					System.out.print("¦\n");
				}else {
					System.out.println();
				}
			}
		}
	}

}
