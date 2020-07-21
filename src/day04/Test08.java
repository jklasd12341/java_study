package day04;
/*
	예제 4}
		년도를 입력하고
		그 해가 윤년인지 아닌지 판별해서 출력하세요. 
		
		해결은 다중 조건문으로 처리하세요. 
	
	참고 ]
	 윤년 : 4로 나누어 떨어지고 100으로 나누어 떨어지면 안되고
	 		400으로 나누어 떨어지는 해는 윤년이다. 
	 1300년 : 평년
	 1200년 : 윤년
 */
import javax.swing.*;
public class Test08 {
	public static void main(String[] args) {
		String snum = JOptionPane.showInputDialog("년도를 입력하슈");
		int year = Integer.parseInt(snum);
		
		String str = "평년";
		if (year % 400 == 0 ) {	
			str = "윤년";
		} else if (year % 100 == 0) {
			str = "평년";
		} else if (year % 4 == 0 ) {
			str = "윤년";
		} else {
			str = "평년";
			}
				
		JOptionPane.showMessageDialog(null,"\t입력 \n"+snum+"\t년은\n" +str+ "\t임");
	}
}
