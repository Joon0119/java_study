package java_study.chapter01.unit03;

public class FormIntToFlaoat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
	
		System.out.println(num1);
		System.out.println(num2);
		
		int result = num1 - num2;
		System.out.println(result);
		
		float num4 = 123456780;
		System.out.println(num4);
		// float: 부호(1비트) + 지수(8비트) + 가수(23비트)
	}
}
