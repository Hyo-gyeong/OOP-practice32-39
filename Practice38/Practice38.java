//컴퓨터학과 20190975 신효경
public class Practice38 {

	public static void main(String[] args) {
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println("식별번호: 0편");
		System.out.println("모델: 모름");
		System.out.println("승객수: 0명\n");
		
		Plane Jeju = new Plane();
		Jeju.id = 1030615;
		Jeju.model = "보잉 737";
		Jeju.capacity = 75;
		
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println("식별번호: "+Jeju.id+"편");
		System.out.println("모델: "+Jeju.model);
		System.out.println("승객수: "+Jeju.capacity+"명\n");
		
		Plane Seoul = new Plane();
		Seoul.id =  2464737;
		Seoul.model = "보잉 747";
		Seoul.capacity = 150;
				
		
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println("식별번호: "+Seoul.id+"편");
		System.out.println("모델: "+Seoul.model);
		System.out.println("승객수: "+Seoul.capacity+"명\n");
	}

}
