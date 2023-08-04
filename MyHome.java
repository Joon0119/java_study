package java_study.chapter02;

public class MyHome {
	// 파일이름은 대문자로 시작해서, 낙타표기법으로!
	// MyHome:연결되는 당어의 첫글자는 대문자!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 100;
		String myTel = "011";
		String ssn = "880101";
		final String COMPANY = "메가더조은"; // 상수
		// COMPANY = "메가"; // 상수는 재할당 불가
		// final => 수정불가

		System.out.println("나의 나이는 " + 100 + "살 입니다.");
		System.out.println("줄을\t바꾸고 싶어요.\n다음줄에 \"나와요.\" "); // \n 줄바꿈 문자, 개행문자

	}

}
