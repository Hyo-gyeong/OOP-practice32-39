//��ǻ���а� 20190975 ��ȿ��
public class Practice38 {

	public static void main(String[] args) {
		
		System.out.println("����Ʈ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ: 0��");
		System.out.println("��: ��");
		System.out.println("�°���: 0��\n");
		
		Plane Jeju = new Plane();
		Jeju.id = 1030615;
		Jeju.model = "���� 737";
		Jeju.capacity = 75;
		
		System.out.println("������ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ: "+Jeju.id+"��");
		System.out.println("��: "+Jeju.model);
		System.out.println("�°���: "+Jeju.capacity+"��\n");
		
		Plane Seoul = new Plane();
		Seoul.id =  2464737;
		Seoul.model = "���� 747";
		Seoul.capacity = 150;
				
		
		System.out.println("������ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ: "+Seoul.id+"��");
		System.out.println("��: "+Seoul.model);
		System.out.println("�°���: "+Seoul.capacity+"��\n");
	}

}
