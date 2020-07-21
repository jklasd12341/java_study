package day04;
/*
	문제 3]
		정수 세개를 입력받아서
		제일 큰 수부터 출력하세요. 
 */
import java.util.*;
import javax.swing.*;

public class Ex06 {
	public static void main(String[] args) {
		// 정수 입력받기 
//		Scanner sc = new Scanner(System.in);
//		int n1,n2,n3;
//		n1=Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요"));
//		int n1 = sc.nextInt();
//		n2=Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요"));
//		int n2 = sc.nextInt();
//		n3=Integer.parseInt(JOptionPane.showInputDialog("세번째 숫자를 입력하세요"));
//		int n3 = sc.nextInt();
//		sc.close();
		int n1=(int)(Math.random() *10+1);
		int n2=(int)(Math.random() *10+1);
		int n3=(int)(Math.random() *10+1);
		
		int max, mid, sma;
		
		//제일 큰수 구분하기
		if (n1>n2) { // 1이 2보다 큰 경우
			if (n2>n3) { // 2가 3보다 큰 경우
				max = n1; 
				mid = n2;
				sma = n3;
			} else { // 3이 2보다 큰경우
				if (n3<n1) {
					max = n1;
					mid = n3;
					sma = n2;		
				} else {
					max = n3;
					mid = n1;
					sma = n2;
				}
			}
		}else {
			max = n1;
			mid = n2;
			sma = n3;
		}
		JOptionPane.showMessageDialog(null, "입력한 숫자는 ["+ n1 +"] ["+ n2 +"] ["+ n3 +"] 입니다.\n"
				+"순서대로 나열하면 ["+ max +"] ["+ mid +"] ["+ sma +"] 입니다.");
	}
}
	
