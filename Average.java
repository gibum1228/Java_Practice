/*
�ǽ����� 3�� 11��
����)
main()�� �Ű����� ó���� Integer.parseInt()
����)
������ ���� �۵��ϴ� Average.java�� �ۼ��϶�. ����� ���ڴ� ��� ������ ���Ǹ� �������� ����� ����Ѵ�. ���� ȭ���� �����ϵ� Average.class ������
c:\Temp ���͸��� ������ �� ������ ����̴�. ���� Average.class ������ ��Ŭ������ ������Ʈ ���� �ؿ� bin ������ �ִ�.
��)
C:\Temp>java Average 2 3 4
3 // 2 3 4�� ���
��Ʈ)
���ڿ��� ������ ��ȯ�� �� ���� �ڵ带 �̿��϶�.
int i = Integer.parseInt("10") // i�� 10
 */
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("����� ���ڰ� �����ϴ�.");
			return;
		}
		
		int sum=0;
		for (int i=0; i<args.length; i++) {
			sum = sum + Integer.parseInt(args[i]); // ���ڸ� ������ ��ȯ�Ͽ� �ջ�
		}
		System.out.println(sum/args.length); // ��� ���
	}

}
