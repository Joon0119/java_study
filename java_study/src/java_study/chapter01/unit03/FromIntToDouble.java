package java_study.chapter01.unit03;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;

		double num3 = num2;
		num2 = (int) num3;

		int result = num1 - num2;
		System.out.println(result);

		// double: 부호(1비트) + 지수(11비트) + 가수(52비트)
	}
}
