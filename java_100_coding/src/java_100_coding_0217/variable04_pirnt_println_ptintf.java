package java_100_coding_0217;

public class variable04_pirnt_println_ptintf {
	public static void main(String [] args) {
		//System.out.print(), println(), printf()
		/*
		 *결과출력
		 * 
		 */
		//print(),println()
		
		System.out.print("<----print");
		System.out.println("<---println");
		System.out.println("<---println2");
		//한 줄 출력 print; 줄 바꿈 출력 println
		
		//2] 지시자 printf
		// %d = 정수
		byte b = 11;
		short a = 8;
		int c = 4;
		float d=25.375F;
		System.out.printf("우리집 강아지의 나이는 11살 입니다.");
		System.out.printf("우리집 강아지의 나이는 11살 입니다.",b);
		System.out.printf("우리집 강아지의 나이는 %d살 입니다.",b);
		//System.out.printf("우리집 강아지의 나이는 %d살 입니다.");
		//%f 소숫점 형식, %c 문자, %s 문자열, %b 부울 , %n 줄바꿈;
		//System.out.printf("강아지나이는 %d살, 우리집식구는 %d식구, 간식은 %d시에, 평균연령은 %d살",b,a,c,d);
		System.out.println();
		System.out.printf("강아지나이는 %d살, 우리집식구는 %d식구, 간식은 %d시에, 평균연령은 %.1f살",b,a,c,d);
		//%n 줄바꿈 , %e 지수 , %o 8진수 , %x 16진수;
		System.out.println();
		System.out.printf("10진수 %d는 8진수로는 %o 이고,%n 16진수로는 %x 이다. ",b,b,b);
		// byte b = 11;
	}
}
