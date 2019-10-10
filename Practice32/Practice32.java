//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date obj = new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		obj.year = input.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		obj.month  = input.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		obj.day = input.nextInt();
		
		System.out.println("당신의 생일은 "+obj.year+"년 "+obj.month+"월 "+obj.day+"일 입니다.");
		
		input.close();

	}

}
