//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();

		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화 제목은?");
		m1.title = input.next();
		System.out.print("평점은?");
		m1.score = input.nextInt();
		System.out.print("감독은?");
		m1.director = input.next();
		System.out.print("개봉 년도는?");
		m1.year = input.nextInt();
		
		System.out.println();
		
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화 제목은?");
		m2.title = input.next();
		System.out.print("평점은?");
		m2.score = input.nextInt();
		System.out.print("감독은?");
		m2.director = input.next();
		System.out.print("개봉 년도는?");
		m2.year = input.nextInt();
		
		System.out.println("입력한 영화정보입니다.");
		System.out.println("제목: "+m1.title);
		System.out.println("평점: "+m1.score+"점");
		System.out.println("감독: "+m1.director);
		System.out.println("개봉년도: "+m1.year+"년\n");
		
		System.out.println("입력한 영화정보입니다.");
		System.out.println("제목: "+m2.title);
		System.out.println("평점: "+m2.score+"점");
		System.out.println("감독: "+m2.director);
		System.out.println("개봉년도: "+m2.year+"년");
		
		if (m1.score > m2.score) {
			System.out.println("영화 "+m1.title+"이 영화 "+m2.title+"보다 평점이 더 높습니다.");
		}
		else if (m1.score < m2.score) {
			System.out.println("영화 "+m1.title+"이 영화 "+m2.title+"보다 평점이 더 낮습니다.");
		}
		else {
			System.out.println("영화 "+m1.title+"이 영화 "+m2.title+"보다 평점이 같습니다.");
		}
		
		if (m1.year > m2.year) {
			System.out.println("영화 "+m1.title+"이 영화 "+m2.title+"보다 나중에 개봉되었습니다..");
		}
		else if (m1.year < m2.year) {
			System.out.println("영화 "+m1.title+"이 영화 "+m2.title+"보다 먼저 개봉되었습니다.");
		}
		else {
			System.out.println("영화 "+m1.title+"이 영화 "+m2.title+"와 같은 년도에 개봉되었습니다.");
		}
		
		input.close();
	}

}
