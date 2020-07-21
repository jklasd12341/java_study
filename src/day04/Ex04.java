package day04;
/*
	조건문 문제
	문제 1]
		두 수를 랜덤하게 발생시켜서 각각 변수에 담고
		첫번째 수가 두번째 수보다 크면 "양수"(같은 경우 양수로 처리)
		첫번째 수가 두번째 수보다 작으면 "음수"
		를 출력하세요.
 */
import javax.swing.*;
public class Ex04 {
	public static void main(String[] args) {
		// 두 수를 랜덤하게 발생시키기
		// 변수담기
		int no1 = (int)(Math.random() * (99 - 10+1)+10);
		int no2 = (int)(Math.random() * (99 - 10+1)+10);
		String str = "";
		if (no1>=no2) {
			str = "양수";
		} else if(no1 < no2) {
			str = "음수";
		} 
		JOptionPane.showMessageDialog(null, "답은\n" + str);
		
	}
}
