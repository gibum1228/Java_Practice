/*
�ǽ����� 3�� 1-3��
����)
for, while, do-while �ݺ��� �ۼ� ����
����)
���� ���α׷��� ���� ������ ���϶�?
(1) ������ ����ϴ� �ڵ��̸� ���� ��� ��µǴ� ������?
(2) ���� �ڵ带 main() �޼ҵ�� ����� WhileTest Ŭ������ �ϼ��϶�
(3) for ���� �̿��Ͽ� �����ϰ� ����Ǵ� ForTest Ŭ������ �ۼ��϶�
(4) do-while ���� �̿��Ͽ� �����ϰ� ����Ǵ� DoWhikeTest Ŭ������ �ۼ��϶�
 */
public class ForTest {

	public static void main(String[] args) {
		int sum=0, i=0;
		for(i=0; i<100; i+=2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
