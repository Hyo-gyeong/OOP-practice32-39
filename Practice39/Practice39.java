//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice39 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Person p1 = new Person();
		p1.name = "�赿��";
		p1.address = "����";	
		System.out.print(p1.name+" ���̴�? ");
		p1.age = input.nextInt();
		
		Person p2 = new Person();
		p2.name = "ȫ�浿";
		p2.address = "���";	
		System.out.print(p2.name+" ���̴�? ");
		p2.age = input.nextInt();
		
		Person p3 = new Person();
		p3.name = "������";
		p3.address = "����";	
		System.out.print(p3.name+" ���̴�? ");
		p3.age = input.nextInt();
		
		System.out.println("\n��ü�� �����Դϴ�.");
		System.out.println(p1.name+" : "+p1.age+"��, " +p1.address);
		System.out.println(p2.name+" : "+p2.age+"��, " +p2.address);
		System.out.println(p3.name+" : "+p3.age+"��, " +p3.address);
		
		System.out.println();
		
		if (p1.age > p2.age && p1.age > p3.age) {
			if (p2.age > p3.age) {
				System.out.println("���̰� �߰��� ����� "+p2.name+"�Դϴ�.");
			}
			else {
				System.out.println("���̰� �߰��� ����� "+p3.name+"�Դϴ�.");
			}
		}
		else if (p2.age > p1.age && p2.age > p3.age) {
			if  (p1.age > p3.age){
				System.out.println("���̰� �߰��� ����� "+p1.name+"�Դϴ�.");
			}
			else {
				System.out.println("���̰� �߰��� ����� "+p3.name+"�Դϴ�.");
			}
		}
		else if (p3.age > p1.age && p3.age > p2.age) {
			if  (p1.age > p2.age){
				System.out.println("���̰� �߰��� ����� "+p1.name+"�Դϴ�.");
			}
			else {
				System.out.println("���̰� �߰��� ����� "+p2.name+"�Դϴ�.");
			}
		}
		
		
		input.close();
	}

}
