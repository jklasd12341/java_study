package day02;

public class Test05 {
	public static void main(String[] args) {
		// 1. ���� ���� ������ ������ �����ϰ� �ʱ�ȭ�ϼ���
		boolean bool = true;
		// boolean bool;
		// bool = ture;  
		boolean bool1 = false; // *** ���� �̸����δ� ������ ������ �� ����. 
				
		bool = bool1;
		// ==> bool : false
		// bool1�� bool�� ���� (�����ʿ��� �������� ����) 
		// ���� bool1�� false�� ����� �ּҸ� �����⿡ bool�� falses
		
		// 2. A�� ����� ������ ����� �ʱ�ȭ�ϼ���. 
		char ch = 'A';
		char ch1 = (char) 65;
		System.out.println("ch�� : "+ ch); 
		System.out.println("ch1�� : "+ch1);
		// 0~127���� Ȯ������ 255���� ���ڸ��� ������ ���� �������ִ� (= �ƽ�Ű �ڵ�, Ȯ���� �ƽ�Ű�ڵ�)
		// ch�� �ƽ�Ű �ڵ尪���� ���������. A = 65, a = 97
		// char�� ���������� 2byte��. 65�� ������(int)���� 4byte�̴�. ���� (char) ��ȣ�� �־������� ��������ȯ
		
		char ch2 = (char)(ch1 + 5);
		System.out.println("ch2 : " + ch2);
		
		System.out.println(" 'C' - 'A' : " + (char)('C' - 'A'));
		
		// 3.14 �� ����� flaot Ÿ���� ���� num�� �����ϰ� �ʱ�ȭ�ϼ���.
		float num;
//		num = 3.14F; // ���ͷ� ����ȯ
		num = (float) 3.14; // ���� ����ȯ
		
		// ����
		// ���������Ϳ� .�� ���̸� �Ǽ��� �ȴ�. 
		// �� ] 10. ==> 10.0 ���� �ǹ�(double�� ������)
		
		// "ȫ�浿" �̶�� ���ڿ��� ����� ������ �����ϰ� �ʱ�ȭ�ϼ���. 
		String name;
		name = "ȫ�浿"; // name��� ������ ���ͷ� Ǯ�� ����� �ּҸ� �����´�.
		String irum = new String("ȫ�浿"); // irum�̶�� ������ �Ȱ��� ȫ�浿�̶�� �����͸� ���������� heap�� �ִ� �޸� �ּҸ� ��� 
	
		System.out.println("name : " + name);
		System.out.println("irum : " + irum);
		System.out.println("name == irum : " + (name == irum));
		//���ڿ��� �񱳴� equals() �Լ��� ����ؼ� �����͸� ���ؾ� �Ѵ�. 
		System.out.println("name.equals(irum) : " + name.equals(irum));
		System.out.println("\"ȫ�浿\".equals(name) : " + "ȫ�浿".equals(name));
		
		String tmp = "\"";
		/* 
		 * �̽������� ���ڸ� ǥ���Ҷ� ���
		 * �ٹٲޱ�ȣ \n
		 * �� �����̽� \b
		 * �� \t
		 */
		
		/*
		System.out.print("abcd"); 
		System.out.print("efgh"); // \�� �ٿ��� ����ǥ���� �� �� �ִ�.
		*/
		
		System.out.print("abcd\n"); 
		System.out.print("\tefgh");
	}
}
