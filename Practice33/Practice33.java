//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		birthday.year = input.nextInt();
		adultday.year = birthday.year + 20;
		
		System.out.print("�¾ ���� �Է��ϼ���: ");
		birthday.month  = input.nextInt();
		adultday.month = birthday.month;
		
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		birthday.day = input.nextInt();
		adultday.day = birthday.day;
		
		System.out.println("����� ������ "+birthday.year+"�� "+birthday.month+"�� "+birthday.day+"�� �Դϴ�."); 
		System.out.println("����� �������� "+adultday.year+"�� "+adultday.month+"�� "+adultday.day+"�� �Դϴ�.");
		System.out.println("����� ������ "+birthday.year+"�� "+birthday.month+"�� "+birthday.day+"�� �Դϴ�.");
		
		input.close();

	}

}
