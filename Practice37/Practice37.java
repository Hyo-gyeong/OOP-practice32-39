//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();

		System.out.println("��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ ������?");
		m1.title = input.next();
		System.out.print("������?");
		m1.score = input.nextInt();
		System.out.print("������?");
		m1.director = input.next();
		System.out.print("���� �⵵��?");
		m1.year = input.nextInt();
		
		System.out.println();
		
		System.out.println("��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ ������?");
		m2.title = input.next();
		System.out.print("������?");
		m2.score = input.nextInt();
		System.out.print("������?");
		m2.director = input.next();
		System.out.print("���� �⵵��?");
		m2.year = input.nextInt();
		
		System.out.println("�Է��� ��ȭ�����Դϴ�.");
		System.out.println("����: "+m1.title);
		System.out.println("����: "+m1.score+"��");
		System.out.println("����: "+m1.director);
		System.out.println("�����⵵: "+m1.year+"��\n");
		
		System.out.println("�Է��� ��ȭ�����Դϴ�.");
		System.out.println("����: "+m2.title);
		System.out.println("����: "+m2.score+"��");
		System.out.println("����: "+m2.director);
		System.out.println("�����⵵: "+m2.year+"��");
		
		if (m1.score > m2.score) {
			System.out.println("��ȭ "+m1.title+"�� ��ȭ "+m2.title+"���� ������ �� �����ϴ�.");
		}
		else if (m1.score < m2.score) {
			System.out.println("��ȭ "+m1.title+"�� ��ȭ "+m2.title+"���� ������ �� �����ϴ�.");
		}
		else {
			System.out.println("��ȭ "+m1.title+"�� ��ȭ "+m2.title+"���� ������ �����ϴ�.");
		}
		
		if (m1.year > m2.year) {
			System.out.println("��ȭ "+m1.title+"�� ��ȭ "+m2.title+"���� ���߿� �����Ǿ����ϴ�..");
		}
		else if (m1.year < m2.year) {
			System.out.println("��ȭ "+m1.title+"�� ��ȭ "+m2.title+"���� ���� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("��ȭ "+m1.title+"�� ��ȭ "+m2.title+"�� ���� �⵵�� �����Ǿ����ϴ�.");
		}
		
		input.close();
	}

}
