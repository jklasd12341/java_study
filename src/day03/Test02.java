package day03;
// 사용할 라이브러리 불러오기
import java.util.*;

public class Test02 {
	public static void main(String[] args) { //입력받을 준비하고
		Scanner sc = new Scanner(System.in); 
		//입력메세지 출력
		System.out.print("이름을 입력하세요! : "); //입력받은 이름 변수에 기억하고
		String name = sc.nextLine(); 
		//나이 입력받을 메세지 출력하고
		System.out.print("나이를 입력하세요! : ");//입력받은 나이 변수에 기억
		int age = sc.nextInt(); //출력
		sc.close(); // Scanner 닫고
		System.out.printf("입력된 사람은 [ %3s ] : %2d", name, age);
		/* 
		  참고
		   Scanner 클래스도 시스템의 자원을 사용하는 클래스이므로
		   더이상 사용하지 않으면 닫아주는 것이 원칙
		   
		   닫는 방법 
		   sc.close();
		 */
		
		
	}
}
