package day02;

import java.util.*;

public class Day02_answer1 {
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[첫번째문제입니다.]\n");
		System.out.print("두개의 숫자를 입력받은 후" + 
				" 두 수를 이용해서 \n사각형, 삼각형의 "
				+ "넓이를 구하는 프로그램을 작성하시오.n\n");
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int b = sc.nextInt();
		sc.close();
		
		int sarea = a * b;
		int tarea = (a * b)/2;
		
		System.out.println("사각형의 넓이는 : " + sarea + 
							"삼각형의 넓이는" + tarea + "입니다.");	
		*/
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 첫번째 숫자를 입력받을 메세지 출력하고
		System.out.print("첫번째 숫자를 입력하세요 : ");
		// 입력받아서 변수에 기억시키고
		int num1 = sc.nextInt();
		
		// 두번째 숫자를 입력받을 메세지 출력하고
		System.out.print("두번째 숫자를 입력하세요 : ");
		// 입력받아서 변수에 기억시키고
		int num2 = sc.nextInt();
		
		// 계산할 도형 입력받을 메세지 출력하고
		System.out.print("삼각형은 3, 사각형은 4를 입력하세요! : ");
		// 입력값 변수를 기억시키고
		
		int type = sc.nextInt();
		
		double calc = num1*num2;
		
		if(type == 3) {
			System.out.printf("입력받은 %3s 의 \n\t밑변은 %3d 이고 높이는 %3d 이고 \n"
					+ "\n\t넓이는 %3d 입니다", num1, num2, calc/2);

		if(type == 4) {
			System.out.printf("입력받은 %3s 의 밑변은 %3d 이고 높이는 %3d 이고 \n"
					+ "넓이는 %6.3f 입니다", num1, num2, calc);
		}
		}
	}
}
