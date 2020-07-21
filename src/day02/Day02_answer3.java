package day02;

import java.util.*;

public class Day02_answer3 {	
	/*
	public static void main(String[] args) {
		System.out.print("[����° �����Դϴ�.]\r\n");
		System.out.print("54232���� ������ �ؾ��Ѵ�. \r\n" + 
				"�츮���� ȭ������� �� ȭ������� ��� �ʿ����� ����ؼ� ����ϼ���. \r\n" + 
				"��, ȭ��� 5����, ����, ��õ��, õ��, �����, ���, �ʿ��� ������ ����ϱ�� �Ѵ�. \r\n" + 
				" ��Ʈ ] ��� �����ڸ� ����ؼ� �ذ��ϼ���.\r\n\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ؾ��� �ݾ��� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		int _5m = a / 50000;
		int _1m = a % 50000 / 10000;
		int _5s = a % 50000 % 10000 / 5000;
		int _1s = a % 50000 % 10000 % 5000 / 1000 ;
		int _5h = a % 50000 % 10000 % 5000 % 1000 / 500;
		int _1h = a % 50000 % 10000 % 5000 % 1000 % 500 / 100;
		int _1t = a % 50000 % 10000% 5000 % 1000 % 500 % 100 / 10;
		
	    System.out.println("5 ���� : "+ _5m);
	    System.out.println("��  �� : "+ _1m);
	    System.out.println("��õ�� : "+ _5s);
	    System.out.println("õ  �� : "+ _1s);
	    System.out.println("����� : "+ _5h);	    
	    System.out.println("��  �� : "+ _1h);
	    System.out.println("��  �� : "+ _1t);
	    */
	public static void main(String[] args) {
		int money = 74232;
		int tmp = money;
		
		// 오만원권
		int oman = tmp / 50000; // 오만원을 나눔
		// 오만원을 뺴고 남은 금액
		tmp %= 50000;
		
		// 만원권
		int man = tmp/10000; // 만원권을 나눔
		// 만원권을 빼고 남은 금액
		tmp %= 10000;
		
		//오천원권
		int ochun = tmp / 5000;
		tmp %= 5000;
		
		//천원권
		int chun = tmp / 1000;
		tmp %= 1000;

		//오백원
		int obeak = tmp / 500;
		tmp %= 500;		
		
		// 백원	
		int beak = tmp / 100;
		tmp %= 100;

		// 십원	
		int sip = tmp / 10;
		tmp %= 10;
		
		System.out.printf("금액 %7d원은 \n\t오만원권 %2d장, \n\t만원권 %2d장,"
				+ "\n\t오천권 %2d장,\n\t천원권 %2d장,\n\t오백원권 %2d개,"
				+ "\n\t백원권 %2d개, \n\t십원 %2d개\n를 지불해야합니다.", 
				money, oman, man, ochun, chun, obeak, beak, sip);
		
	    
	}
}
