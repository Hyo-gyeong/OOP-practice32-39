//��ǻ���а� 20190975 ��ȿ��
public class Practice36 {

	public static void main(String[] args) {
		
		BankAccount p1 = new BankAccount();
		BankAccount p2 = new BankAccount();
		
		p1.name = "�赿��";
		p1.accoutNo = "1234-5678";
		p1.balance = 100;
		p1.rate = 0;
		
		p2.name = "ȫ�浿";
		p2.accoutNo = "9999-2531";
		p2.balance = 2000;
		p2.rate = 2.15;
		
		System.out.println("ù ��° ���� ������ �����Դϴ�.");
		System.out.println("�̸�: "+p1.name);
		System.out.println("���¹�ȣ: "+p1.accoutNo);
		System.out.println("�ܾ�: "+p1.balance+"��");
		System.out.println("������: "+p1.rate+"%");
		System.out.println();
		System.out.println("�� ��° ���� ������ �����Դϴ�.");
		System.out.println("�̸�: "+p2.name);
		System.out.println("���¹�ȣ: "+p2.accoutNo);
		System.out.println("�ܾ�: "+p2.balance+"��");
		System.out.println("������: "+p2.rate+"%");
				
	}
}