package java_100_coding_0218;

public class if_basic001 {
	public static void main(String []args) {
		//1) 변수선언
		int k = 80, e=90, m=100;
		//2) if 조건문만 사용하기
		System.out.printf("%n%n<if조건문> %n");
		if ( k>=80 ) {
			System.out.println("1) k는 B등급입니다. : k>=80");
		}
		System.out.println("1-2) 결과값이 나오지 않은 경우는 해당 조건이 맞지 않았기 때문입니다");
		
		//{}를 생략하면 출력이 가능 할 수도 있다.
		if ( k>80 ) 
			System.out.println("2 ) k는 B등급입니다.");
		System.out.println("2-2) 결과값이 나오지 않은 경우는 해당 조건이 맞지 않았기 때문입니다");
		// if 문의 실행문은 바로 아래 한 줄 이기 때문에, 실행문이 2줄 이상이 될 경우에는 중괄호를 써야 한다. 
		System.out.printf("%n%n<if~ else조건문> %n");
		
		if (e > 90) {
			System.out.println("1) A등급입니다");
			System.out.println("1)의 조건은 e > 90 입니다.");
		}else {
			System.out.println("2) 1)의 조건에 해당되지 않았습니다.");
		}
	}
}
