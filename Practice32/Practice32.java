//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date obj = new Date();
		
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		obj.year = input.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		obj.month  = input.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		obj.day = input.nextInt();
		
		System.out.println("����� ������ "+obj.year+"�� "+obj.month+"�� "+obj.day+"�� �Դϴ�.");
		
		input.close();

	}

}
