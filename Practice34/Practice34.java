//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle obj = new Rectangle();

		System.out.print("가로 입력 : ");
		obj.width = input.nextInt();
		System.out.print("세로 입력 : ");
		obj.height = input.nextInt();
		
		System.out.println("면적은 "+(obj.width * obj.height)+"입니다.");
		System.out.println("둘레는 "+(2*(obj.width + obj.height))+"입니다.");
		
		input.close();
		
	}

}
