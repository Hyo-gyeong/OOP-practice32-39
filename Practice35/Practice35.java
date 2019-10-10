//컴퓨터학과 2190975 신효경
import java.util.Scanner;
public class Practice35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Rectanlge first = new Rectanlge();
		Rectanlge second = new Rectanlge();

		System.out.println("첫번째 사각형의 정보를 입력하세요");
		System.out.print("가로 입력 : ");
		first.width = input.nextInt();
		System.out.print("세로 입력 : ");
		first.height = input.nextInt();
		
		System.out.println("두번째 사각형의 정보를 입력하세요");
		System.out.print("가로 입력 : ");
		second.width = input.nextInt();
		System.out.print("세로 입력 : ");
		second.height = input.nextInt();
		
		System.out.println("\n첫번째 사각형의 면적은 "+(first.width * first.height)+"입니다.");
		System.out.println("첫번째 사각형의 둘레는 "+(2*(first.width + first.height))+"입니다.");
		System.out.println("두번째 사각형의 면적은 "+(second.width * second.height)+"입니다.");
		System.out.println("두번째 사각형의 둘레는 "+(2*(second.width + second.height))+"입니다.");
		
		input.close();
		
	}

}
