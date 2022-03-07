package java_100_coding_0218;

public class variable05 {
	public static void main(String[]args) {
		//정수형(int)을 문자열(String)으로 변환하여 정수의 자릿수를 구하는 코드 구현
		//1) 정수선언
		int a = 12345;
		System.out.println(a + "a");
		String str = "123";
		System.out.println(str + "str");
		//System.out.println(a.length());  : 문자열 타입이 아니기 때문에 length메서드의 대상이 아님.
		
		System.out.println(str.length()+"<--str의 자리값");
		//2) 정수 -> 문자열변환 -> 길이 구하기
		String stra = String.valueOf(a);
		System.out.println(stra.length()+"<--stra의 자리값");
		
		//3) 문자열 + 정수형 = 
		System.out.println(12345+1+"<---정수+정수");
		System.out.println(str+1 + "<---str123 + 정수형1");
		//4) 문자열 ->  정수형 번환
		int b = Integer.valueOf(str);
		System.out.println(str + "<--str");
		System.out.println(b+"<--b");
		System.out.println("[4]--->"+b+1);  //"[4]--->" 라는 문자열 결합으로 인해 정수형으로 변환되지 않음.
		System.out.println("[4]--->"+(b+1)); //  문자열 +(괄호사용으로) 정수형 값 변환시킴
		
	}
}
