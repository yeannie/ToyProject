package java_100_coding_0303;

public class java001_switch {
	public static void main(String [] args) {
		//switch 조건문의 사용법을 예제로 설명하시오. 
		//사용자가 자신의 연령대를 입력하면 해당 연령대에 맞는 책을 추천하는 코드를 만들어 보시오
		// 변수 조건은 정수형이어야한다. : byte,short,int -> 그러나 long 타입은 x -> 그러나 char 타입은 o
		// break,default빼먹지 않도록 주의!
		
		/*switch 조건문 사용법
		1 변수 선언 
			int 변수 = 변수에 대입되는 값;
		
		2 switch조건문  :  변수 조건은 정수형.
			switch(변수) {
				case 10:
					System.out.println(age+"대 입니다. 추천 코너는 A구역입니다.");
					break;
				default: (조건에 해당하지 않는 변수가 들어왔을 경우)	
					System.out.println("70대 이상입니다. 추천코너는 G구역입니다");
		*/	
		
		int age = 27 ; 
		// 옵션 1 )입력을 14, 38 나잇대가 아닌 경우를 입력시에 재 입력을 유도
		if (age>10 && age < 20 ) { //11~19
			System.out.println("10대로 입력해 주세요.");
			System.exit(0);
		}
		
		// 옵션 2) 입력을 나잇대가 아닌 경우 입력시에 해당 나잇대로 진입하기 
		if (age> 20 && age < 30) {//21~29
			age = 20 ;
		}
		
		
		
		
		switch(age) {
			case 10:
				System.out.println(age+"대 입니다. 추천 코너는 A구역입니다.");
				break;
			case 20:
				System.out.println(age+"대 입니다. 추천 코너는 B구역입니다.");
				break;
			case 30:
				System.out.println(age+"대 입니다. 추천 코너는 C구역입니다.");
				break;
			case 40:
				System.out.println(age+"대 입니다. 추천 코너는 D구역입니다.");
				break;
			case 50:
				System.out.println(age+"대 입니다. 추천 코너는 E구역입니다.");
				break;
			case 60:
				System.out.println(age+"대 입니다. 추천 코너는 F구역입니다.");
				break;
			default :
				System.out.println("70대 이상입니다. 추천 코너는 G 구역입니다.");
				break;
		}
		
		
	}
}
