/*
�ǽ����� 3�� 1-2��
����)
for, while, do-while �ݺ��� �ۼ� ����
����)
���� ���α׷��� ���� ������ ���϶�?
(1) ������ ����ϴ� �ڵ��̸� ���� ��� ��µǴ� ������?
(2) ���� �ڵ带 main() �޼ҵ�� ����� WhileTest Ŭ������ �ϼ��϶�
(3) for ���� �̿��Ͽ� �����ϰ� ����Ǵ� ForTest Ŭ������ �ۼ��϶�
(4) do-while ���� �̿��Ͽ� �����ϰ� ����Ǵ� DoWhikeTest Ŭ������ �ۼ��϶�
 */
public class WhileTest {

	public static void main(String[] args) {
		int sum=0, i=0;
		while (i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
}
