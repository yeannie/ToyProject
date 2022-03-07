package java_100_coding_0218;

public class switch01 {
	public static void main(String [] args) {
		//자신의 연령대를 입력하면 해당 연령대에 맞는 책을 추천하는 코드
		// 변수 조건은 정수형이어야 한다  -> byte, short, int ->그러나 long 타입은 x -> char타입은 o
		//break, default 빼먹지 않게 주의
		
		//1)변수 선언
		int age = 14 ;
	
		//1.5) 사용자 입력 예외 처리
		if (age > 10 && age <20) {
			age = 10;
			//System.out.println("최소단위는 10입니다 10으로 입력해 주세요.");
			//System.exit(0);
		}
		else if (age >20 && age <30) {
			System.out.println("연령대를 입력해야 합니다.  20으로 입력해 주세요.");
			System.exit(0);
		}
		else if (age >30 && age <40) {
			System.out.println("연령대를 입력해야 합니다.  30으로 입력해 주세요.");
			System.exit(0);
		}
		else if (age >40 && age <50) {
			System.out.println("연령대를 입력해야 합니다.  40으로 입력해 주세요.");
			System.exit(0);
		}
		else {
			if(age<10) {
				System.out.println("최소 연령대는 10대 입니다.  10으로 입력해주세요.");
			}
		}
		
		//2) switch  조건문 - 변수 조건은 정수형이어야 한다.
		switch(age) {
			case 10:
				System.out.println(age + "대 입니다. 추천 코너는  A 구역입니다");
				break;
			case 20:
				System.out.println(age + "대 입니다. 추천 코너는 B구역입니다.");
				break;
			case 30:
				System.out.println(age+ "대 입니다. 추천 코너는 C 구역입니다.");
				break;
			case 40:
				System.out.println(age+"대 입니다. 추천 코너는 D 구역입니다");
				break;
			default:
				System.out.println("50대 이상입니다. 추천 코너는  E 구역입니다");
				break;
		}
	
	}
}
