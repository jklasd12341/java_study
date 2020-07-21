package day03;
/* 
  문제 ]
  	두 수를 입력받아서 각각 변수에 담고
  	첫번째 수가 두번째 수보다 크면 "양수"
  	첫번째 수가 두번째 수보다 작으면 "음수"
  	를 출력하세요.
  	
  	삼항연산자를 사용해서 처리하세요.
 */

import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 첫번째 메세지 출력
		System.out.println("첫번째 숫자를 입력하세요 : ");
		// 입력된 숫자를 변수로 기억
		int no = sc.nextInt();
		
		// 두번째 메세지 출력
		System.out.println("두번째 숫자를 입력하세요 : ");
		// 입력된 숫자를 변수로 기억
		int no2 = sc.nextInt();
		
		// 삼항연산자를 사용한 조건식 생성
		String str = (no>no2) ? "양수" : "음수";
			
		System.out.printf("입력받은 첫번째 숫자는 '%2s'이고,\n\t "
				+ "두번째 숫자는 '%2s'입니다.,\n\t"
				+ " 결과는 '%2s' 입니다.", no, no2, str);
		
		
		
	}

}
