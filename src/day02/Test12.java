package day02;

import java.util.*; // * ���ϱ�, '��� ���� �����Ѵ�' �� �ǹ�

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner Ÿ�����Ѱ��� ����ϴ� ��Ȱ�� �ϴ� Ŭ����
		System.out.print("ù��° ���ڸ� �Է��ϼ���! : ");
		int no1 = sc.nextInt(); // �Էµ� ���ڸ� ������ ���·� ���
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ���! : ");
		int no2 = sc.nextInt(); 
		
// 		nextDouble �Ǽ� ���·� ��� 
// 		nextFloat 
//		System.out.println("�Էµ� ���� :" + no1);
		// no1�� ���� ���̷� ������ ���簢���� ���̸� ���ؼ� ����ϼ���. 
		// ���� ] ���簢���� ���� = ���Ǳ��� * ���Ǳ���
		int area = no1 * no2;
		// System.out.println("�� ���� ���̰� " + no1 +"�� ���簢���� ���̴�" + area+" �Դϴ�.");
		System.out.println("�Էµ� ���̸� ������ �簢���� ���̴�" + area+" �Դϴ�.");
				
	}
}
