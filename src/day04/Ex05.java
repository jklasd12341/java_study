package day04;
/*
	조건문 문제
	
	문제 2]
	
		201~500까지의 세자리 숫자를 랜덤하게 발생시켜서
		그 수가 300보다 크면 "300보다 큰 수"
		작으면 "300보다 작은 수"
		가 출력되게 하세요.
 */
import javax.swing.*;

public class Ex05 {
	public static void main(String [] args) {
		int no;
		no = (int)(Math.random()*(500-201+1)+201);
		String result = "";
		
		if (no>300) {
			result = "300보다 큰 수";
		} else if (no==300) {
			result = " 똑같앵 ";
		} else if (no < 300) {
			result = "300보다 작은 수";
		}
		JOptionPane.showMessageDialog(null, "숫자는 [" + no + "] \n결과는 " + result);
	}
}
