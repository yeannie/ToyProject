package java_100_coding_0218;

public class if_basic02 {
	public static void main(String []args) {
		//1) 변수선언
		int k =7 , e = 7,  m=5;
		int total;
		total = k+e+m; 
		
		//2) if ~ else if~ else조건문
		
		if (total >= 27) {
			System.out.println("1) 모든 합은"+total+"입니다. <-- total>=27 ");
		}
		else if (total >= 24) {
			System.out.println("2) 모든 합은 "+ total + "입니다. <-- total >=24");
		}
		else if (total >=21) {
			System.out.println("3) 모든 합은 "+total + "입니다  <-- total >= 21");
		}
		else {
			System.out.println("1)도 아니고 2)도  3)도 아닌 합은 "+total+"입니다. < -- total=k+e+m");
		}

		System.out.printf("%n%n%n 괄호 없엔 조건문 사용 %n");
		if (total >= 27)
			System.out.println("1) 모든 합은"+total+"입니다. <-- total>=27 ");
		else if (total >= 24) 
			System.out.println("2) 모든 합은 "+ total + "입니다. <-- total >=24");
		else if (total >=21) 
			System.out.println("3) 모든 합은 "+total + "입니다  <-- total >= 21");
		else 
			if (m >6)
			System.out.println("m의 값은 "+m+":기준 초과 입니다.");
			else 
				System.out.println("m의 값은 "+m+": 기준 미달입니다.");
		
	}
}
