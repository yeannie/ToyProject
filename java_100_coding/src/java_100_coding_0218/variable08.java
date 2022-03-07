package java_100_coding_0218;

public class variable08 {
		public static void main(String [] args) {
			//관계연산자 : == , != , > , >=, < , <=
			//     => 참/거짓의 결과로 나옴  => 그 결과를 받는 타입은  boolean,
			int k= 70, e = 40, m = 70;
			boolean result1 , result2, result3, result4, result5;
			
			result1 = k == e; //false
			result2 = k != e; //true
			result3 = k == m; //true
			result4 = k >= m; //true
			result5 = k <= m; //true
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
			System.out.println(result5);
			
			// && (and)   || (or)  ! (not)
			//A && B = A와 B 둘다 참일 경우 참 ; A || B = 둘 중에 하나만 참일 경우 참;  
			// => 결과로 참/ 거짓이 나오므로 그 결과를 받는 타입은boolean
					
			String title = "poerator_LogicalOperators";
			System.out.printf("title%n%n%n "+ title+"%n%n");
			
			int a =10 , b =10 , c=50;
			boolean rst1 = a<c && c>b;
			System.out.println(rst1+"<--a<c && c>b;");
			boolean rst2 = a<b || c>b;
			System.out.println(rst2+"<--a<b || c>b;");
			boolean rst3= a<b || b!=c;
			System.out.println(rst3+"<-- a<b || b!=c;");
			boolean rst4 = !rst3;
			System.out.println(rst4); // !(rst3=ture) =>false
			System.out.println(!rst4); // !(rst4 =false) =>!false
			
			
			
			
		}
}
