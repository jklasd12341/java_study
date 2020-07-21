package day02;

/*
 	밑변이 10이고 높이가 5인 삼각형의 넓이를 기억할 변수를 만들고 초기화하세요. 
 	밑변과 높이의 변수도 선언하고 초기화 하세요. 
 	
 	공식 ]
 		삼각형의 넓이 = 밑변 * 높이 * 1/2
 */
public class Test07 {
	public static void main(String[] args) {
		
/*		
		int down = 10;
		int high = 5;
		float ban = (float) 1/2;
		float tarea = down * high * ban; 
		
		System.out.println("밑변 : " + down + "\n높이 : " + high + "\n삼각형의 넓이 :" + tarea);
		*/
	
		
		int d;
		int h;
		d = 10;
		h = 5;
		float t;
		t = (d*h)/2;
		System.out.println("밑변 : " + d + "\n높이 : " + h +  "\n삼각형의 넓이 : " + t );
		
		/* 해답
		 
		 int w = 10 ;
		 int h = 5;
		 
		 double area = w * h * (1. / 2);
		 
		 1/2 ==> 0 : 정수와 정수의 연산 결과는 정수가 되기 때문에 
		 1. ==> 1.0 : double 타입의 데이터 
		 */
		
	}
}
