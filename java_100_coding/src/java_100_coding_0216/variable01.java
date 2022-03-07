package java_100_coding_0216;

public class variable01 {
	public static void main(String[]args) {
	/*  문제 :  Primitive Data Type 크기를 출력하는 코드를 구현하시오.
		정수형 타입과 문자형 타입에 대해서만 구현한다.
		각 타입의 최대값과 최소값도 같이 구현하여 출력하시오. */
		
		//1.정수형 - byte ; short ; int ; double;  
		
		//2.문자형 - char ;
		//1-1 byte
		/*System.out.println(Byte.BYTES);
		System.out.println(Byte.SIZE);
		//1-2 short
		System.out.println(Short.BYTES);
		System.out.println(Short.SIZE);
		//1-3 int
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		//1-4 double
		System.out.println(Double.BYTES);
		System.out.println(Double.SIZE);
		//2 char
		System.out.println(Character.BYTES);
		System.out.println(Character.SIZE);*/
		
		//1-1 byte
		System.out.println(Byte.BYTES+"byte"+"--->"+Byte.SIZE+"bit");
		System.out.println(Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		
		//1-2 short
		System.out.println(Short.BYTES+"byte"+"--->"+Short.SIZE+"bit");
		System.out.println(Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		//1-3 int
		System.out.println(Integer.BYTES+"byte"+"--->"+Integer.SIZE+"bit");
		System.out.println(Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		//1-4 double
		System.out.println(Double.BYTES+"byte"+"--->"+Double.SIZE+"bit");
		System.out.println(Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);
		//2 char
		System.out.println(Character.BYTES+"byte"+"--->"+Character.SIZE+"bit");
		System.out.println(Character.MIN_VALUE+" ~ "+Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE+" ~ "+(int)Character.MAX_VALUE);
	}
}
