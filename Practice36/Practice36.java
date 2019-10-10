//컴퓨터학과 20190975 신효경
public class Practice36 {

	public static void main(String[] args) {
		
		BankAccount p1 = new BankAccount();
		BankAccount p2 = new BankAccount();
		
		p1.name = "김동덕";
		p1.accoutNo = "1234-5678";
		p1.balance = 100;
		p1.rate = 0;
		
		p2.name = "홍길동";
		p2.accoutNo = "9999-2531";
		p2.balance = 2000;
		p2.rate = 2.15;
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: "+p1.name);
		System.out.println("계좌번호: "+p1.accoutNo);
		System.out.println("잔액: "+p1.balance+"원");
		System.out.println("이자율: "+p1.rate+"%");
		System.out.println();
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: "+p2.name);
		System.out.println("계좌번호: "+p2.accoutNo);
		System.out.println("잔액: "+p2.balance+"원");
		System.out.println("이자율: "+p2.rate+"%");
				
	}
}