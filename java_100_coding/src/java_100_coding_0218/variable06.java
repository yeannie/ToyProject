package java_100_coding_0218;

public class variable06 {
	public static void main(String [] args) {
		//수치 연산자  ArihmeticOperators 산술 연산자  
		// [ 이항연산자 ] : 1. 수치 연산자 --> +, -, *, /(몫), %(나머지 연산자)
		int a, b, c, d, e;
		a=100; b=30; c=29; d=5; e=400;
		System.out.println(a+b);
		System.out.println(a+b +"<==a+b");
		System.out.println(a+b-c);
		//우선순위
		System.out.println(a+b*c);
		System.out.println((a+b)*c);
		System.out.println(a+(b*c));
		System.out.println(e/d+"<--e/d"); // 나누기 = 몫
		System.out.println(e%d+"<--e%d"); //나머지 
		//나머지가 0이면 배수 ; 짝수로 나눴을 때 나머지가 1이면 홀수 
		
		//축약된 형태의 연산자 .    a+1=  -> a+=1   =대입한다.
		int z = 0 ;
		int y = 500;
		
		System.out.println(z+"<--z");
		z = z+1; // 0+1 =1
		System.out.println(z +"<-- z+1");
		System.out.println(z+"<--z");
		z+=1; //1+1 = 2
		System.out.println(z+"<-- z+1");
		System.out.println(z+"<--z");
		z-=1;
		System.out.println(z+"<-- z-1");
		y++;
		System.out.println(y);
		y++;
		System.out.println(y);
		y--;
		System.out.println(y);
		
		
	}
}
