//��ǻ���а� 2190975 ��ȿ��
import java.util.Scanner;
public class Practice35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Rectanlge first = new Rectanlge();
		Rectanlge second = new Rectanlge();

		System.out.println("ù��° �簢���� ������ �Է��ϼ���");
		System.out.print("���� �Է� : ");
		first.width = input.nextInt();
		System.out.print("���� �Է� : ");
		first.height = input.nextInt();
		
		System.out.println("�ι�° �簢���� ������ �Է��ϼ���");
		System.out.print("���� �Է� : ");
		second.width = input.nextInt();
		System.out.print("���� �Է� : ");
		second.height = input.nextInt();
		
		System.out.println("\nù��° �簢���� ������ "+(first.width * first.height)+"�Դϴ�.");
		System.out.println("ù��° �簢���� �ѷ��� "+(2*(first.width + first.height))+"�Դϴ�.");
		System.out.println("�ι�° �簢���� ������ "+(second.width * second.height)+"�Դϴ�.");
		System.out.println("�ι�° �簢���� �ѷ��� "+(2*(second.width + second.height))+"�Դϴ�.");
		
		input.close();
		
	}

}
