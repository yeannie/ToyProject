package java_100_coding_0218;

public class variable07 {
	public static void main(String [] args) {
		//수치 연산자를 사용한 연산에서 소숫점 결과가 다르게 나오는 현상에 대한 설명
		/*  int a = 60 , b= 8 ;
		  rst1 =a/b;
		  System.out.pritnln(rst1);
		  System.out.println((double)rst1);
		 */
		
		int a= 60, b = 8;
		int rst1;
		rst1 = a/b;
		System.out.println(rst1); //7.5가 나오지 않고 7이 출력됨.
		System.out.println((double)rst1); // 답이 아니라 형태만 7 -> 7.0으로 바뀜
		
		double rst2,rst3,rst4;
		rst2 = a/b;
		System.out.println(rst2); // 답이 같다. 리턴 받는 변수를 실수형으로 하더라도 원하는 출력 값이 나오질 않음
		//더 큰 타입으로 연산을 한다. :  어느 한 쪽의 값을 실수형으로 변환 시킨다.
		rst2 = (double)a/b;  
		System.out.println(rst2+"<--(double)a/b"); // 7.5 나옴
		rst3 = 10 /(double)3;
		rst4 = 10 /3.0;
		System.out.println(rst3);
		System.out.println(rst4);
		System.out.printf("나눗셈의 값은 %f 입니다.%n",rst3);
		System.out.printf("나눗셈의 값은 %.2f 입니다.",rst3);
		
		
		
		
		}
}
