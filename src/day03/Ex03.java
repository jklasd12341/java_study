package day03;
/*
	문제 3]
		정수로된 숫자 세개를 입력 받아서
		제일 큰 수 부터 출력하세요. 
	힌트 
	 삼항연산자도 중첩해서 사용할 수 있다. 
	 (조건식) ? (삼항연산자) : (삼항연산자) ;
 */

import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력문 출력
		System.out.print("첫번째 숫자를 입력하세요. : ");
		// 입력된 숫자를 변수로기억
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요. : ");
		int no2 = sc.nextInt();
		
		System.out.print("세번째 숫자를 입력하세요. : ");
		int no3 = sc.nextInt();
		int re;
		
		// 조건식작성
		re = (no3>no2) ? 
						(
							(no3>no1) 
								? 
							no3 : (no3>no1) ? no3 : no1
						) 
						:
						(	
							(no1<no3) 
								? 
							no2 : (no2>no1) ? no2 : no1 
						);

		// 최종출력문
		System.out.printf("입력된 숫자는 각각 ' %3s ', ' %3s ', ' %3s '입니다.\n", no1, no2, no3);
		System.out.printf("가장 큰 수는 '%3s'입니다.", re);
		/*
		3이 2보다 크고 1보다 크면 max 
		3이 2보다 크고 1보다 작으면 mid
		3이 2보다 작고 1보다 크면 mid
		3이 2보다 작고 1보다 작으면 sma
			
		2가 3보다 크고 1보다 크면 max	
		2가 3보다 크고 1보다 작으으면 mid	
		2가 3보다 크고 1보다 크면 max	
		2가 3보다 크고 1보다 크면 max	
		
		*/
		
	}
	
}
