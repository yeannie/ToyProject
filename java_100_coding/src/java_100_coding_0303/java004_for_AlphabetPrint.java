package java_100_coding_0303;

public class java004_for_AlphabetPrint {
	public static void main(String []args) {
		/********************************************************************
		  문제
		알파벳 26개 문자를 대문자로 출력하는 반복문을 구현하시오.
		 이 문제는 알파벳 문자중 대문자 아스키 코드에 대해서 알고 반복문으로 출력할 수 있는지를 묻는 문제이다.
		[ 결과 출력 ]
		--------------------------------------------------------
		A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		*******************************************************************/
		//for(int i =65; )????   아스키코드를 표현하기?
		
		//1) A의 번호 알아보기.
		//System.out.println((int)'A');
		//알파벳 26자  :  65+25 = Z  char'A' -> int 형변환
		
		for (int i = 65; i<=90; i++) {
			//System.out.print(i+(char)i+" "); 
				//   int i (65) + (char) i (65) = 130 되어버림..
			
			//System.out.print("[1]"+i+(char)i+" "); // int i -> char 형변환
			
			//System.out.print("[2]"+i+((char)i)+" ");
				// 똑같은 형식으로 나옴.
			
			//System.out.print("[3]"+i);
			System.out.print((char)i+" ");
		
		}
		// System.out.println();
	}
}
