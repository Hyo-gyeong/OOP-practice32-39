//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle obj = new Rectangle();

		System.out.print("���� �Է� : ");
		obj.width = input.nextInt();
		System.out.print("���� �Է� : ");
		obj.height = input.nextInt();
		
		System.out.println("������ "+(obj.width * obj.height)+"�Դϴ�.");
		System.out.println("�ѷ��� "+(2*(obj.width + obj.height))+"�Դϴ�.");
		
		input.close();
		
	}

}
