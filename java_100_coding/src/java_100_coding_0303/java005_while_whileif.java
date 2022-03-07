package java_100_coding_0303;

public class java005_while_whileif {

	public static void main (String [] args) {
		
		/********************************
		 문제
		 홀수, 짝수 구하기 문제를 while 반복문을 사용하여 구현해보시오.
		 이 문제는 while 반복문과 그 안에서 조건문을 사용할 수 있는지를 묻는 문제이다.
		[ 결과 출력 ]
		---------------------------------------------------
		2 4 6 8 10 12 14 16 18 20 22 24 26 28
		*************************************/
		
		
		// 1) 변수 선언
		int number = 1;
		//2) 반복문을 돌면서 홀수, 짝수 체크 : while
		//while(조건식){ 조건이 참인 경우 반복을 돌면서 짝수인지 홀수인지 체크 ---. 출력   
		//				 반복문을 빠져나오기 위해서는 number값을 반복 때마다 증가 number++; }
		while(number<30) {
			//System.out.println(number);
			//짝수면 출력
			if(number%2 == 0) //%2 != 0 홀수 
				System.out.print(number+" ");
			number++;
		}
		
		
		
		
		
		
		
		
		
	}
}
