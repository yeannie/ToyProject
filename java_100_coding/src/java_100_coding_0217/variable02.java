package java_100_coding_0217;

public class variable02 {
	public static void main(String [] args) {
	int a;
		int b ; int c = 90; //이렇게 변수 나란히 쓰는건 크게 오류가 나지 않는다. ( 보기엔 어려움)
		double d;
		char e; 
		
		a=10;
		//b 변수를 선언만 되어 있고 초기화 되지 않음.   *초기화*  선언 후 값을 셋팅  * 
		b=5;
		//d=10;
		d=10.1;   //double은 실수형
		//e="A";
		e='ㅇ'; //'문자'
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
		//System.out.println(e);

		int x,y,z=900; // z만 초기화 되고 x,y는 초기화 안됨.
		//System.out.println(x+"-"+y+"-"+z);
		//같은 값으로 초기화
		String str1,str2,str3;
		str1 = str2 =str3 = "korea";
		//no str1,str2,str3="korea";
		//System.out.println(str1+"-"+str2+"-"+str3);

		//기본형 타입의 초기화 방법에 대해서, 
		byte by =100;	 
		System.out.println("기본형  byte의 범위는 "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		short s =10000;
		System.out.println("기본형  short의 범위는 "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		int i = 2111110;
		System.out.println("기본형  int의 범위는 "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		long l = 722222222L;
		System.out.println("기본형  long의 범위는 "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
		float f =7.8F;
		System.out.println("기본형  float의 범위는 "+Float.MIN_VALUE+" ~ "+Float.MAX_VALUE);
		double dou= 3.14;
		System.out.println("기본형  double의 범위는 "+Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);
		char ch = 'C';
		System.out.println("기본형  Character의 범위는 "+(int)Character.MIN_VALUE+" ~ "+(int)Character.MAX_VALUE);
		boolean bl = true;
		//정수형 : byte(1) short(2) int(4) long(8)
			//정수형 : 정수형은 소수점이 없는 숫자 
			 
		//실수형 : float(4) -소숫점 이하 6자리  double(8) - 소숫점이하 15자리
			//실수형 : 실수형은 소수점이나 지수를 가진 수
			//f 고정소숫점  e 부동소숫점 : float f/e ; double lf/le;
		//문자형 : char(2) : 문자한개
		//논리형 : boolean (1) : true / false
		
		

		
		
	}
}
