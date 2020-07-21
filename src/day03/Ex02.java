package day03;
/*
	문제 2]
		세자리 숫자를 입력받아서
		그 수가 300보다 크거나 같으면 "300보다 크거나 같은 수"
		작으면 "300보다 작은 수"가 출력되게 하세요.
		
		삼항연산자를 사용
 */

import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		//입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력문 출력
		System.out.print("세자리의 숫자를 입력하세요. : ");
		// 입력받은 숫자를 변수로 기억
		int num = sc.nextInt();

/*		// 조건식 입력
		String str = (num>=300) ? "300보다 크거나 같은 수" : "300보다 작은 수";

		//출력문 
		System.out.printf("입력한 숫자는 %3s입니다.\n"+ "결과는 '%8s'입니다.", num, str);
	*/
		String msg = (num == 300) ? "과" : "보다";
		String str = (num > 300) ? "큰 수" : ((num == 300) ? "같은 수" : "작은 수") ;
		
		System.out.printf("입력한 숫자 %3d 은(는) 300%2s %4s 입니다.", num, msg, str);
		
	}
}
