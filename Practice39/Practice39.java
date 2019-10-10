//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice39 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Person p1 = new Person();
		p1.name = "김동덕";
		p1.address = "서울";	
		System.out.print(p1.name+" 나이는? ");
		p1.age = input.nextInt();
		
		Person p2 = new Person();
		p2.name = "홍길동";
		p2.address = "경북";	
		System.out.print(p2.name+" 나이는? ");
		p2.age = input.nextInt();
		
		Person p3 = new Person();
		p3.name = "성춘향";
		p3.address = "전남";	
		System.out.print(p3.name+" 나이는? ");
		p3.age = input.nextInt();
		
		System.out.println("\n객체별 정보입니다.");
		System.out.println(p1.name+" : "+p1.age+"세, " +p1.address);
		System.out.println(p2.name+" : "+p2.age+"세, " +p2.address);
		System.out.println(p3.name+" : "+p3.age+"세, " +p3.address);
		
		System.out.println();
		
		if (p1.age > p2.age && p1.age > p3.age) {
			if (p2.age > p3.age) {
				System.out.println("나이가 중간인 사람은 "+p2.name+"입니다.");
			}
			else {
				System.out.println("나이가 중간인 사람은 "+p3.name+"입니다.");
			}
		}
		else if (p2.age > p1.age && p2.age > p3.age) {
			if  (p1.age > p3.age){
				System.out.println("나이가 중간인 사람은 "+p1.name+"입니다.");
			}
			else {
				System.out.println("나이가 중간인 사람은 "+p3.name+"입니다.");
			}
		}
		else if (p3.age > p1.age && p3.age > p2.age) {
			if  (p1.age > p2.age){
				System.out.println("나이가 중간인 사람은 "+p1.name+"입니다.");
			}
			else {
				System.out.println("나이가 중간인 사람은 "+p2.name+"입니다.");
			}
		}
		
		
		input.close();
	}

}
