package day02;

/*
public class Day02_answer2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("[�ι�° �����Դϴ�.]\r\n");
			System.out.print("�ϳ��� ����(������)�� �Է� ���� ��" + 
					"�� ���ڸ� �̿��ؼ� ���� ���̿� �ѷ��� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.\n ");
			
			System.out.print("\n�������� �Է��ϼ��� : ");
			int a = sc.nextInt();
			
			final double PI = 3.14F;
			float area;
			area = (float)(a*a*PI);
			float arround;
			arround = (float)(2*a*PI);
			
			
			System.out.print("\n�Էµ� �������� ���� ���̴� " + area + " �Դϴ�.");
			System.out.print("\n�Էµ� �������� ���� �ѷ��� " + arround + " �Դϴ�.");
			*/

import java.util.*;
public class Day02_answer2{
	public static void main(String[] args) {
		// 입력받을 준비하고 
		Scanner sc = new Scanner(System.in);
		// 반지름 입력메세지 출력
		System.out.print("반지름을 입력하세요 :");
		int rad = sc.nextInt();
		//더이상 입력받을게 없으므로 자원을 반환
		sc.close();
		
		//둘레를 계산해서 변수에 기억
		double arround= 2 * rad *3.14;
		
		//면적을 계산
		double area = rad * rad * 3.14;
		
		//출력
		System.out.printf("### 반지름이 %3d 인 원 ###\n\t%5s : %6.2f\n\t%5s : %5.2f", 
							rad, "둘레", arround, "넓이",area);
		}
}

