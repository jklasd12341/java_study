package day02;

public class Test11 {
	public static void main(String[] args) {
		int no1=10;
		no1 +=10; // no1=no1 + 10;
		System.out.println("no1 : " + no1);

		no1 -=2; // no1=no1 - 2;
		System.out.println("no1 : " + no1);
		
		no1 /= 3; // no1= no1 / 3;
		System.out.println("no1 : " + no1);

		no1 *= 2; // no1= no1 * 2;
		System.out.println("no1 : " + no1);

		no1 %= 5; // no1= no1 % 5 ; 5로 나누고 남은 나머지를 출력
		System.out.println("no1 : " + no1);

	}
}
