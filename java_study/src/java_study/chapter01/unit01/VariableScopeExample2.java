package java_study.chapter01.unit01;

public class VariableScopeExample2 {
	public static void main(String[] args) {
		int var1 = 15;
		if (var1 > 10) {
			int var2;
			var2 = var1 - 10;
		}
		
		// int var3 = var1 + var2 + 5;
		// var2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	}
}
