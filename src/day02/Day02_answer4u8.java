package day02;

import java.util.*;

public class Day02_answer4 {
	public static void main(String[] args) {
		System.out.print("[네번째 문제입니다.]\r\n");
		System.out.print("1년은 365.2426일이다. \r\n" + 
				"이 수치는 몇일, 몇시간, 몇분, 몇초인지 계산해서 출력하세요.\r\n" + 
				" 힌트 ] 0.5일은 12시간이다. \r\n\n ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계산할 날짜를 입력하세요 : ");
		double a = sc.nextDouble();
		
		double day = a ;
		double hour = a * 24; 
		double minute = a * 1440;
		double second = a * 86400 ;
		
		System.out.print("  " + day + "일\n");
		System.out.print("  " + hour + "시간\n");
		System.out.print("  " + minute + "분\n");
		System.out.print("  " + second + "초\n");
	}
}
