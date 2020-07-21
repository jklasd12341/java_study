package day02;

import java.util.*;

public class Day02_answer4 {
/*
	public static void main(String[] args) {
		System.out.print("[�׹�° �����Դϴ�.]\r\n");
		System.out.print("1���� 365.2426���̴�. \r\n" + 
				"�� ��ġ�� ����, ��ð�, ���, �������� ����ؼ� ����ϼ���.\r\n" + 
				" ��Ʈ ] 0.5���� 12�ð��̴�. \r\n\n ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ��¥�� �Է��ϼ��� : ");
		double a = sc.nextDouble();
		
		double day = a ;
		double hour = a * 24; 
		double minute = a * 1440;
		double second = a * 86400 ;
		
		System.out.print("  " + day + "��\n");
		System.out.print("  " + hour + "�ð�\n");
		System.out.print("  " + minute + "��\n");
		System.out.print("  " + second + "��\n");
		*/
	public static void main(String[] args) {
		//실수형 데이터
		double data = 365.2426;
		double tmp = data;
		
		//날수
		int days = (int)data;
		tmp -= days; // tmp = tmp - days;
		
		// tmp를 초 단위로 변환시킨다. 
		int total = (int)(tmp * 24 * 3600);
		
		// 시간
		int hour = total / 3600;
		total %= 3600;
		
		// 분
		int min = total / 60;
		total %= 60;
		
		// 초
		int sec = total;
		
		System.out.printf("일년 %7.4f일은 \n\t%3d일,"
				+ "%2d시간, %2d분, %2d초 입니다.", 
				data, days, hour, min, sec);
	}
}
