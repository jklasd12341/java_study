package day02;

public class Test05 {
	public static void main(String[] args) {
		// 1. 논리값 참을 저장할 변수를 선언하고 초기화하세요
		boolean bool = true;
		// boolean bool;
		// bool = ture;  
		boolean bool1 = false; // *** 같은 이름으로는 변수를 선언할 수 없다. 
				
		bool = bool1;
		// ==> bool : false
		// bool1을 bool에 대입 (오른쪽에서 왼쪽으로 대입) 
		// 따라서 bool1이 false로 저장된 주소를 가지기에 bool은 falses
		
		// 2. A를 기억할 변수를 만들고 초기화하세요. 
		char ch = 'A';
		char ch1 = (char) 65;
		System.out.println("ch는 : "+ ch); 
		System.out.println("ch1는 : "+ch1);
		// 0~127까지 확장형은 255까지 문자마다 고유의 값이 정해져있다 (= 아스키 코드, 확장형 아스키코드)
		// ch는 아스키 코드값으로 만들어졌다. A = 65, a = 97
		// char은 문자형으로 2byte다. 65는 정수형(int)으로 4byte이다. 따라서 (char) 괄호를 넣어줌으로 강제형변환
		
		char ch2 = (char)(ch1 + 5);
		System.out.println("ch2 : " + ch2);
		
		System.out.println(" 'C' - 'A' : " + (char)('C' - 'A'));
		
		// 3.14 를 기억할 flaot 타입의 변수 num을 선언하고 초기화하세요.
		float num;
//		num = 3.14F; // 리터럴 형변환
		num = (float) 3.14; // 강제 형변환
		
		// 참고
		// 정수데이터에 .을 붙이면 실수가 된다. 
		// 예 ] 10. ==> 10.0 같은 의미(double형 데이터)
		
		// "홍길동" 이라는 문자열을 기억할 변수를 선언하고 초기화하세요. 
		String name;
		name = "홍길동"; // name라는 변수는 리터럴 풀에 저장된 주소를 가져온다.
		String irum = new String("홍길동"); // irum이라는 변수는 똑같은 홍길동이라는 데이터를 저장하지만 heap에 있는 메모리 주소를 기억 
	
		System.out.println("name : " + name);
		System.out.println("irum : " + irum);
		System.out.println("name == irum : " + (name == irum));
		//문자열의 비교는 equals() 함수를 사용해서 데이터를 비교해야 한다. 
		System.out.println("name.equals(irum) : " + name.equals(irum));
		System.out.println("\"홍길동\".equals(name) : " + "홍길동".equals(name));
		
		String tmp = "\"";
		/* 
		 * 이스케이프 문자를 표현할때 사용
		 * 줄바꿈기호 \n
		 * 백 스페이스 \b
		 * 탭 \t
		 */
		
		/*
		System.out.print("abcd"); 
		System.out.print("efgh"); // \를 붙여서 문자표현을 할 수 있다.
		*/
		
		System.out.print("abcd\n"); 
		System.out.print("\tefgh");
	}
}
