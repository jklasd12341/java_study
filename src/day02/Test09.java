package day02;

public class Test09 {
	public static void main(String[] args) {
		int no1=10;
		int no2=11;
		
		System.out.println("no1 :"+no1);
		if( ( no1++ > no2) && (++no1 > --no2)) {
		}
		System.out.println("no1 :"+no1);
		System.out.println("no1-1 :"+no1); // 증감연산자는 1회성으로 적용된다.
		System.out.println("no1-2 :"+no1);
		System.out.println("no2 :"+no2);
	}
}
