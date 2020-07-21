package day04;
/*
	랜덤하게 두자리 숫자를 발생시키고
	키보드로 두자리 숫자를 입력하면 
	발생된 숫자보다 입력한 숫자가 큰 수 인지 아닌지 판별하는 프로그램을 작성
	
	심화 ]
	 	입력한 수와 차는 얼마인지 같이 출력하도록 하세요.
 */
import java.util.*;
import javax.swing.*;
public class Ex01 {
	public static void main(String[] args) {
/*		// 랜덤하게 두자리 숫자를 발생
		int num1 = (int)(Math.random() * (99 - 10 + 1 ) + 10);
		
		// 키보드로 두자리 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("두자리의 숫자를 입력하슈 : ");
		int num2 = sc.nextInt();
		sc.close();
		
		int num3 = num1-num2;
		// 발생된 숫자보다 입력한 숫자가 큰 수인지 아닌지 판별
		String result = (num1 > num2) ? "크다." : "작다.";
		System.out.printf("랜덤숫자 %3d 가 입력숫자 %3d보다 %3s"
				+ " 두 숫자의 차이는 %3d 이다.", num1, num2, result, num3);
*/
		int no1 = (int)(Math.random() * (99-10+1)+10);
		String snum = JOptionPane.showInputDialog("두자리 숫자를 입력하세요!");
		// 정수로 변환시키기
		int no2 = Integer.parseInt(snum);
		
		// 2. 두 수를 비교해서 큰 수에서 작은 수를 뺀 차를 구한다. 
		String str = (no1>no2)
						?
							(no1+"과"+no2+" 중 큰 수는"+no1+"이고 차는"+(no1-no2)+" 입니다.")
						: 
							(no1+"과"+no2+" 중 큰 수는"+no1+"이고 차는"+(no1-no2)+" 입니다.");
		JOptionPane.showMessageDialog(null, str);
	
	}
}
