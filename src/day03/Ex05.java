package day03;
/* 
	문제 5]
		알파벳 문자를 임의로 입력한 후
		그 문자가 대문자이면 소문자로 변환하고,
		소문자면 대문자로 변환하고,
		특수문자면 그냥 출력하는 프로그램을 작성하세요. 
		
	참고 ]
		'A' : 65
		'a' : 97
		
		int cha = 'a' - 'A'; 
	참고 ]
		대문자인 경우
			ch >= 'A' &
			ch <= 'Z'
		소문자인 경우
			ch >= 'a' &
			ch <= 'z'
	참고 ]
		nextLine(); 으로 꺼내오면 문자열을 꺼내오게된다.
		이때 문자만 입력하더라고 문자열로 꺼내오게 된다.
		
		문자만 꺼내는 방법
			문자열.charAt(0);
			
			
 */

import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
/*		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력문 출력
		System.out.print("문자를 입력하세요 : ");
		//입력된 정보를 변수로기억
		char ch = sc.charAt(0);
		char ch2;
		//자원반환
		sc.close();
*/		
		// 대문자인지 소문자 인지를 판별
/*		System.out.println("입력한 글자의 첫문자를 추출\n 추출한문자 : " + ch);
		
		ch2 = (char)(ch >= 'A' && ch <= 'Z') ? ((ch+32) :(ch>='a' && ch =<'z') ? ch-32 : ch); 
		
		// 출력
		System.out.println("조건에 의한 결과 : " + ch2);
	*/
		
		// 문제 변경 > 랜덤하게 문자를 밝생시켜서 처리하는 것으로 한다.
		 /*
		  	랜덤한 숫자를 발생시키는 방법
		  	
		  	Math.random() // 0을 포함, 0보다 크거나 1.0이상 나오지 않는 랜덤 함수 
			
			수학식 표현    0 <= Math.random() < 1.0
			
			사용방법 
				랜덤한 정수 발생방법
				
				(int)(Math.random() * (큰수-작은수+1)) + 작은수
				
				1 ~ 10 사이에 정수를 랜덤하게 발생시켜본다. 
				
				(int)(Math.random() * (10 - 1 + 1)) + 1
		  */
		
		char ch = (char)(Math.random() * (127 -0 +1)) ; // 1 부터 256까지의 정수 출력
		
		char result = (ch >= 'A' && ch <= 'Z') 
						?
							(char)(ch + ('a'-'A'))
						:	
							(
									(ch >= 'a' && ch <= 'z') ? (char)(ch - ('a'-'A')) : ch
							);
							
		System.out.printf("랜덤하게 발생한 문자 [ %3c ]는 < %c > 로 변환된다.", ch, result);

		
	}
}
