package java_100_coding_0303;

public class java002_ThreeOperator{
	public static void main(String [] args) {
		/*************************************************************
		 삼항 연산자를 이용하여 12시 보다 작으면 오전, 크면 오후를 출력하도록 구현해보시오.
		 이 문제는 삼항 연산자의 사용법에 대해서 아는지를 묻는 문제이다.
		[ 소스코드 ]
		---------------------------------------------------------------
		 [2] : 삼항 연산자 테스트 --> 10보다 작거나 같으면 100을 곱하시오.
		int test = hour <= 10 _______________________________;
		System.out.println( "[2]" + test )
		 [3] : 삼항 연산자를 이용하여 12시 보다 작으면 오전, 크면 오후 출력
		String ampm = hour < 12 _________________________________;
		System.out.println( "[3]" + ampm )
		**************************************************************/
				
		
		//1 변수선언
		int hour = 10;
		
		//2 삼항 연산자 조건?참:거짓;
		int test = hour <=  10 ? hour * 100 : hour;
		System.out.println("[2]"+test);
		// hour = hour 로 쓴다면 반환되는 값도 정수형이므로 정수형변수에 저장 되는게 문제 될 것은 없다.
		
		//3 12시 보다 작으면 오전, 크면 오후 출력
		String ampm = hour<12?"오전":"오후";
		System.out.println("[3]"+ampm);
		//  hour = hour 로 쓴다면 정수형 변수에 반환되는 값이 문자열이므로 에러가 난다 : 별도의  String str 변수 만들어야 한다.
		
		String str1 = "오전";
		String str2 = "오후";
		int hours = 20;
		String ampm2 = hours <12? str1 :str2;
		System.out.println("[변수]"+ampm2);
		// 조건식 대신 값을 써도 가능 
	}
}