package day03;
/*
 	비교연산자
 		두개의 데이터를 비교할 때 사용하는 연산자
 		> 크다
 		>= 크거나 같다
 		< 작다
 		<= 작거나 같다
 		== 같다
 		!= 같지않다
 		
 	주의
 		수학에서는 하나의 식에서 두가지 비교가능
 		컴퓨터에서는 한번에 하나의 비교만 가능
 		
 		a =10; b=20; c=15;
 		
 		a < b < c (x)
 		a < b & b < c (o) 
 		
 	참고 ]
 		비교연산자의 결과값은 논리값이다. (true, false)
 */

public class Test04 {
	public static void main(String[] args) {
		System.out.println(1 < 2);
		System.out.println(!true); // 참의 반전
		System.out.println(true == (1 > 2)); // 오른쪽의 결과가 참과 같으냐?
		System.out.println(true != (1 > 2)); // 오른쪽의 결과가 참과 같지않냐?
		System.out.println(!(1 > 2)); // 뒤의 값을 반전
	}
}
